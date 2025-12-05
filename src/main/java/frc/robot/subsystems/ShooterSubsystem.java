package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj.RobotState;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{
    private SparkMax backShot = new SparkMax(4, MotorType.kBrushless);
    private SparkMax frontShot = new SparkMax(3, MotorType.kBrushless);

    public void shootPopcorn(double rightTrigger){
        if(RobotState.isTeleop()){
            if(rightTrigger > 0.5){
                backShot.set(-0.7);
                frontShot.set(0.7);
            } else {
                backShot.set(0);
                frontShot.set(0);}
        } 
        else if (RobotState.isAutonomous()){
            if(rightTrigger > 0.5){
                backShot.set(-0.6);
                frontShot.set(0.6);
            }
            else{
                backShot.set(0);
                frontShot.set(0);
            }
    }

}
}