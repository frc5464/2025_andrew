package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.Universals;

public class ReverseDriveCommand extends Command {
    private DriveTrainSubsystem drive;

    public ReverseDriveCommand(DriveTrainSubsystem drive){
        this.drive = drive;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        if(Universals.reverseMode == true){
            drive.reverseDrive(0, 0);
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
