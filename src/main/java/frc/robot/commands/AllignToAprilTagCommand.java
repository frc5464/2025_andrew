package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.VisionSubsystem;

public class AllignToAprilTagCommand extends Command{
    private final VisionSubsystem eyes;
    private final DriveTrainSubsystem wheelchair;
    public AllignToAprilTagCommand(VisionSubsystem vision, DriveTrainSubsystem drive){
        eyes = vision;
        wheelchair = drive;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        
            if(eyes.butterVisible == true && eyes.butterYaweDoBeUsin < 0){
                wheelchair.drive(.5, 0);
            } else if(eyes.butterYaweDoBeUsin > 0){
                wheelchair.drive(0, .5);
            } else {
                wheelchair.drive(0, 0);
            }
        
    }

    @Override
    public void end(boolean interrupted){
        
    }

    @Override
    public boolean isFinished(){
        return false;
    }
}
