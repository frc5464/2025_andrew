package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ButterClawSubsystem extends SubsystemBase{
    
    // private SparkMax Butter1 = new SparkMax(6, MotorType.kBrushless);
    // private SparkMax Butter2 = new SparkMax(10, MotorType.kBrushless);
    // private SparkMax Tilt = new SparkMax(11, MotorType.kBrushless);

    public void butterIntake(boolean button5){

        if(button5){
            // Butter1.set(1);
            // Butter2.set(-1);
        }
        else{
            // Butter2.set(0);
            // Butter1.set(0);
        }
    }
     public void butterOuttake(boolean button6){
        if(button6){
            // Butter2.set(1);
            // Butter1.set(-1);
     }   
     else{
        // Butter2.set(0);
        // Butter1.set(0);
     }
    }
    

    public void tilting(double rightStick2){
        // Tilt.set(rightStick2);
    }
}
