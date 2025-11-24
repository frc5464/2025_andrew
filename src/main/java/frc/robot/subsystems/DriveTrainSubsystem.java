package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.OI.OperatorInterface;

public class DriveTrainSubsystem extends SubsystemBase{
    // private DifferentialDrive tank;
    PIDController drivePID;
    
    private SparkMax frontRight = new SparkMax(2, MotorType.kBrushless); 
    private SparkMax frontLeft = new SparkMax(3, MotorType.kBrushless); 
    private SparkMax backLeft = new SparkMax(4, MotorType.kBrushless); 
    private SparkMax backRight = new SparkMax(9, MotorType.kBrushless); 
    
    @Override
    public void periodic(){

    }
    //Drive Train
    // DifferentialDrive drivetrain = new DifferentialDrive(frontLeft, frontRight);

    double kp = 0.04;
    double ki = 10e-3;
    double kd = 0.00;
    PIDController angleSnapPidController = new PIDController(kp, ki, kd);

    RelativeEncoder leftRelativeEncoder;
    RelativeEncoder rightRelativeEncoder;
    double maxPower = 0.5;
    double targetAngle = 0.0;

    // public double leftEncoder;
    // public double rightEncoder;
    RelativeEncoder frontlefRelativeEncoder;
    RelativeEncoder frontrightRelativeEncoder;
    RelativeEncoder backlefRelativeEncoder;
    RelativeEncoder backrightRelativeEncoder;

    public double frontleftrotations;

    //maximum drive sspeed (0 to 1.0)
    double maxspeed = 1;
    double rampRate = 0.2;



    Joystick joy1 = new Joystick(0);

    public DriveTrainSubsystem(){
    // drivePID = new PIDController(kp, ki, kd);
    // leftRelativeEncoder = frontLeft.getEncoder();
    // rightRelativeEncoder = frontRight.getEncoder();
    
    }

    // public void drivePeriodic(){
    //     // frontLeft.set((drivePID.calculate(leftRelativeEncoder * 11.7, targetAngle)) * maxPower);
    // }

    public void driveTeleopPeriodic(double driveStick, double turnStick){
        // double speed;
        // double turn;
        frontLeft.set(driveStick/*/2*/);
        backLeft.set(driveStick/*/2*/);
        frontRight.set(-turnStick/*/2*/);
        backRight.set(-turnStick/*/2*/);
    }
    public void stop(){
        frontRight.set(0);
        frontLeft.set(0);
        backRight.set(0);
        backLeft.set(0);
    }

    // public void MoveFieldOriented(double x,double y,double rot, Rotation2d gyroAngle){

    //     // drivetrain.arcadeDrive(x, rot);
        
    // }
    
    // public double SnapToAngle(double currentAngle, double targetAngle){
    //     // Calculates the output of the PID algorithm based on the sensor reading
    //     // and sends it to the drivetrain
    //     double turnVal = angleSnapPidController.calculate(currentAngle, targetAngle);
        
    //     return turnVal;
    // }

    public void Init(){
    // put one-time setup steps here
    // frontLeft.setOpenLoopRampRate(rampRate);
    // frontRight.setOpenLoopRampRate(rampRate);
    // backLeft.setOpenLoopRampRate(rampRate);
    // backRight.setOpenLoopRampRate(rampRate);      
    
    // frontlefRelativeEncoder = frontLeft.getEncoder();
    // frontrightRelativeEncoder = frontRight.getEncoder();
    // backlefRelativeEncoder = backLeft.getEncoder();
    // backrightRelativeEncoder = backRight.getEncoder();
    // SmartDashboard.putNumber("gyro P Gain", kp);
    // SmartDashboard.putNumber("gyro I Gain", ki);
    // SmartDashboard.putNumber("gyro D Gain", kd);
    }

    // public void PIDgyro(){
    //     double p = SmartDashboard.getNumber("gyro P Gain", 0);
    //     double i = SmartDashboard.getNumber("gyro I Gain", 0);
    //     double d = SmartDashboard.getNumber("gyro D Gain", 0);
    //     if((p != kp)) { angleSnapPidController.setP(p); kp = p; }
    //     if((i != ki)) { angleSnapPidController.setI(i); ki = i; }
    //     if((d != kd)) { angleSnapPidController.setD(d); kd = d; } 
    // }
}
