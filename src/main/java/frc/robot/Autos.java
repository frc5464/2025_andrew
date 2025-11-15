

package frc.robot;

import frc.robot.subsystems.ButterClawSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.utils.SubsystemManager;

//Move forward
//shoot popcorn
//rotate to melter
//vomit butter
//Backup
public class Autos{
    
    public Autos(SubsystemManager subsystemManager){
        final IntakeSubsystem intake = subsystemManager.getIntakeSubsystem();
        final ShooterSubsystem shooter = subsystemManager.getShooterSubsystem();
        final ButterClawSubsystem butterClaw = subsystemManager.getButterClawSubsystem();
        final DriveTrainSubsystem driveTrain = subsystemManager.getDriveTrainSubsystem();

    }







}