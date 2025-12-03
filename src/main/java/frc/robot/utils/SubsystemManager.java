package frc.robot.utils;

import frc.robot.subsystems.ButterClawSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.subsystems.VisionSubsystem;

public class SubsystemManager {
    private final DriveTrainSubsystem driveSubsystem = new DriveTrainSubsystem();
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
    private final ButterClawSubsystem butterClawSubsystem = new ButterClawSubsystem();
    // private final VisionSubsystem visionSubsystem = new VisionSubsystem();
    public SubsystemManager() {

    }

    public DriveTrainSubsystem getDriveTrainSubsystem(){
        return driveSubsystem;
    }

    public IntakeSubsystem getIntakeSubsystem(){
        return intakeSubsystem;
    }

    public ShooterSubsystem getShooterSubsystem(){
        return shooterSubsystem;
    }

    public ButterClawSubsystem getButterClawSubsystem(){
        return butterClawSubsystem;
    }

    // public VisionSubsystem getVisionSubsystem(){
    //     return visionSubsystem;
    // }
}
