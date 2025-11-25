package frc.robot.utils;

import static edu.wpi.first.units.Units.Newton;

import frc.robot.commands.ButterIntakeCommand;
import frc.robot.commands.ButterOuttakeCommand;
import frc.robot.commands.ButterTiltCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ReverseDrivecommand;
import frc.robot.commands.ShooterCommand;

public class CommandFactory {
    private final DriveCommand driveCommand = new DriveCommand(null, null);
    private final ReverseDrivecommand reverseDrivecommand = new ReverseDrivecommand();
    private final IntakeCommand intakeCommand = new IntakeCommand(null);
    private final ShooterCommand shooterCommand = new ShooterCommand(null);
    private final ButterIntakeCommand butterIntakeCommand = new ButterIntakeCommand(null);
    private final ButterOuttakeCommand butterOuttakeCommand = new ButterOuttakeCommand(null);
    private final ButterTiltCommand butterTiltCommand = new ButterTiltCommand(null);

    public CommandFactory(){

    }

    public DriveCommand getDriveCommand(){
       return driveCommand;
    }

    public ReverseDrivecommand getReverseDrivecommand(){
       return reverseDrivecommand;
    }

    public IntakeCommand getIntakeCommand(){
        return intakeCommand;
    }

    public ShooterCommand getShooterCommand(){
        return shooterCommand;
    }

    public ButterIntakeCommand getButterIntakeCommand(){
        return butterIntakeCommand;
    }

    public ButterOuttakeCommand getButterOuttakeCommand(){
        return butterOuttakeCommand;
    }

    public ButterTiltCommand getButterTiltCommand(){
        return butterTiltCommand;
    }
}
