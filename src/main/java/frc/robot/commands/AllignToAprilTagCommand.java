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

        // Jake example:
            // if(eyes.butterVisible){
            //     // Scale to make the drive slower
            //     double yawScale = 100;               
            //     // Larger yawScale = slower homing. Big yaw?? Go fast!
            //     // As we approach zero, it slows down.
            //     // Negative yaw means we need to turn left (Right positive, left negative)
            //     wheelchair.driveTeleopPeriodic(eyes.butterYaweDoBeUsin/yawScale,
            //                                    -eyes.butterYaweDoBeUsin/yawScale);

            //     /* Yaw = -10
            //      * We need to turn left!
            //      * Drive command needs to give ()
            //      * 
            //      */
            // }
            
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
