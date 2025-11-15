

package frc.robot;

import frc.robot.commands.ButterIntakeCommand;
import frc.robot.commands.ButterOuttakeCommand;
import frc.robot.commands.ButterTiltCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ButterClawSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.utils.CommandFactory;
import frc.robot.utils.SubsystemManager;

//Move forward
//shoot popcorn
//rotate to melter
//vomit butter
//Backup
public class Autos{
    
    public Autos(SubsystemManager subsystemManager, CommandFactory commandFactory){
        //Subsystems
        final IntakeSubsystem intake = subsystemManager.getIntakeSubsystem();
        final ShooterSubsystem shooter = subsystemManager.getShooterSubsystem();
        final ButterClawSubsystem butterClaw = subsystemManager.getButterClawSubsystem();
        final DriveTrainSubsystem driveTrain = subsystemManager.getDriveTrainSubsystem();
        
        //Commands
        final DriveCommand driveCommand = commandFactory.getDriveCommand();
        final IntakeCommand intakeCommand = commandFactory.getIntakeCommand();
        final ShooterCommand shooterCommand = commandFactory.getShooterCommand();
        final ButterIntakeCommand butterIntakeCommand = commandFactory.getButterIntakeCommand();
        final ButterOuttakeCommand butterOuttakeCommand = commandFactory.getButterOuttakeCommand();
        final ButterTiltCommand butterTiltCommand = commandFactory.getButterTiltCommand();
    }

    







}