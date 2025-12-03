package frc.robot.OI;

import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.commands.ButterIntakeCommand;
import frc.robot.commands.ButterOuttakeCommand;
import frc.robot.commands.ButterTiltCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ReverseDriveCommand;
import frc.robot.commands.ReverseDriveModeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ButterClawSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.utils.CommandFactory;
import frc.robot.utils.SubsystemManager;

public class OperatorInterface {
    private static final CommandJoystick driver = new CommandJoystick(0);
    private static final CommandJoystick butterer = new CommandJoystick(1);

    /**
     * 
     * 
     * 
     * @param subsystemManager
     * */
    public static void create(SubsystemManager subsystemManager, CommandFactory commandFactory){
        final IntakeSubsystem intake = subsystemManager.getIntakeSubsystem();
        final ShooterSubsystem shooter = subsystemManager.getShooterSubsystem();
        final ButterClawSubsystem butter = subsystemManager.getButterClawSubsystem();
        final DriveTrainSubsystem drive = subsystemManager.getDriveTrainSubsystem();
        
        //driver controller
        
        driver.axisGreaterThan(2,0.2).whileTrue(new IntakeCommand(intake));
        driver.axisGreaterThan(3, 0.2).whileTrue(new ShooterCommand(shooter));
        // driver.button(2).onTrue(new ReverseDriveModeCommand());
        // drive.setDefaultCommand(new ReverseDriveCommand(drive, driver));
        drive.setDefaultCommand(new DriveCommand(drive, driver));
    
        //butter controller
        butterer.button(5).onTrue(new ButterIntakeCommand(butter));
        butterer.button(6).onTrue(new ButterOuttakeCommand(butter));
        butterer.axisGreaterThan(5, 0.2).whileTrue(new ButterTiltCommand(butter));
        
    }
    // m_driverController.b().whileTrue(m_exampleSubsystem.exampleMethodCommand());

        private OperatorInterface(){}
    }
