package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class ButterClaw {
    
    private SparkFlex Butter1 = new SparkFlex(6, MotorType.kBrushless);
    private SparkFlex Butter2 = new SparkFlex(10, MotorType.kBrushless);
    private SparkFlex Tilt = new SparkFlex(1111, MotorType.kBrushless);

    public void buttering(boolean button6, boolean button5){

        if(button6){
            Butter1.set(1);
            Butter2.set(-1);
        }
        else if(button5){
            Butter2.set(1);
            Butter1.set(-1);
        }
        else{
            Butter2.set(0);
            Butter1.set(0);
        }
    }

    public void tilting(double rightStick2){
        Tilt.set(rightStick2);
    }
}
