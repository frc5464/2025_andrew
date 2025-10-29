package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Intake {
    private SparkFlex popcornIntake = new SparkFlex(8, MotorType.kBrushless);

    public void intakePopcorn(boolean button1){
        if (button1) {
            popcornIntake.set(1);
        }
        else{
            popcornIntake.set(0);
        }
    }
}
