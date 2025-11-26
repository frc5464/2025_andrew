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
                wheelchair.driveTeleop(.5, -0.5);
            } else if(eyes.butterYaweDoBeUsin > 0){
                wheelchair.driveTeleop(-0.5, .5);
            } else {
                wheelchair.stop();
            }
            
            if(eyes.popcornVisible == true && eyes.popcornYaw < 0){
                wheelchair.driveTeleop(.5, -0.5);
            } else if(eyes.popcornYaw > 0){
                wheelchair.driveTeleop(-0.5, 0.5);
            } else {
                wheelchair.stop();
            }

            if(eyes.storeroomVisible == true && eyes.storeroomYaw < 0){
                wheelchair.driveTeleop(.5, -0.5);
            } else if(eyes.storeroomYaw > 0){
                wheelchair.driveTeleop(-0.5, 0.5);
            } else {
                wheelchair.stop();
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
