package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {
    // private SparkFlex popcornIntake = new SparkFlex(8, MotorType.kBrushless);

    public void intakePopcorn(double leftTrigger){
        if (leftTrigger > 0.5) {
            // popcornIntake.set(1);
        }
        else{
            // popcornIntake.set(0);
        }
    }
}
