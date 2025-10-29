package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;

public class DriveTrainSubsystem {
    
private SparkMax frontRight = new SparkMax(2, MotorType.kBrushless); 
private SparkMax frontLeft = new SparkMax(3, MotorType.kBrushless); 
private SparkMax backRight = new SparkMax(4, MotorType.kBrushless); 
private SparkMax backLeft = new SparkMax(5, MotorType.kBrushless); 

public void drive(double leftStick, double rightStick){
    frontRight.set(rightStick/2);
    frontLeft.set(leftStick/2);
    backRight.set(rightStick/2);
    backLeft.set(leftStick/2);
}
}
