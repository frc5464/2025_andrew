package frc.robot.subsystems;

import frc.robot.Constants;

import java.util.List;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class VisionSubsystem {

    PhotonCamera aprilTagCamera = new PhotonCamera("AprilTagCamera");
    
    public void periodic(){
        var results = aprilTagCamera.getAllUnreadResults();
        boolean butterVisible = false;
        double  butterYaw = 0.0;
        double  butterPitch = 0.0;
        boolean popcornVisible = false;
        double popcornYaw = 0.0;
        double popcornPitch = 0.0;
        boolean storeroomVisible = false;
        double storeroomYaw = 0.0;
        double storeroomPitch = 0.0;
        if(!results.isEmpty()){
            var result = results.get(results.size() - 1);
            if(result.hasTargets()) {
                for (var target : result.getTargets()){
                    // Butter Apriltags
                    if(target.getFiducialId() == 3 || target.getFiducialId() == 8) {
                        
                        butterYaw = target.getYaw();
                        butterPitch = target.getPitch();
                        butterVisible = true;
                    } 
                    // Popcorn Apriltags
                    if(target.getFiducialId() == 7 || target.getFiducialId() == 4 ) {
                        
                        popcornYaw = target.getYaw();
                        popcornPitch = target.getPitch();
                        popcornVisible = true;
                    }
                    // Storeroom Apriltags
                    if(target.getFiducialId() == 1 || target.getFiducialId() == 2){

                        storeroomYaw = target.getYaw();
                        storeroomPitch = target.getPitch();
                        storeroomVisible = true;
                    }
                                        
                }
            } 
        }

    }
}
