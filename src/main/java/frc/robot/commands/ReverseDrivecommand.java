package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.Universals;

public class ReverseDriveCommand extends Command {
    private DriveTrainSubsystem drive;
    private CommandJoystick joystick;

    public ReverseDriveCommand(DriveTrainSubsystem drive, CommandJoystick joystick){
        this.drive = drive;
        this.joystick = joystick;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        double revleftDrive = joystick.getRawAxis(1);
        double revrightDrive = joystick.getRawAxis(5);
        if(Universals.reverseMode == true){
            drive.reverseDrive(revleftDrive, revrightDrive);
        }
    }

    @Override
    public void end(boolean interrupted){
        drive.stop();
    }

    @Override
    public boolean isFinished(){
        return false;
    }

    @Override
    public boolean runsWhenDisabled(){
        return true;
    }



}
