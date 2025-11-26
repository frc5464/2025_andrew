package frc.robot.subsystems;

import frc.robot.Constants;

import java.util.List;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;

import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.apriltag.AprilTagFields;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class VisionSubsystem extends SubsystemBase{

    Pose2d pose2d = new Pose2d();
    public static final AprilTagFieldLayout fieldLayout = AprilTagFieldLayout.loadField(
    AprilTagFields.k2025ReefscapeAndyMark);

    PhotonCamera aprilTagCamera = new PhotonCamera("AprilTagCamera");
    public boolean butterVisible = false;
    public double  butterYaweDoBeUsin = 0.0;
    public double  butterPitch = 0.0;
    public boolean popcornVisible = false;
    public double popcornYaw = 0.0;
    public double popcornPitch = 0.0;
    public boolean storeroomVisible = false;
    public double storeroomYaw = 0.0;
    public double storeroomPitch = 0.0;
    public void periodic(){
        var results = aprilTagCamera.getAllUnreadResults();
        
        if(!results.isEmpty()){
            var result = results.get(results.size() - 1);
            if(result.hasTargets()) {
                for (var target : result.getTargets()){
                    // Butter Apriltags
                    if(target.getFiducialId() == 3 || target.getFiducialId() == 8) {
                        
                        butterYaweDoBeUsin = target.getYaw();
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
