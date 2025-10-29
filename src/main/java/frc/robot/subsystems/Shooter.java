package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Shooter {
    private SparkFlex shootPopcorn = new SparkFlex(9, MotorType.kBrushless);

    public void shootPopcorn(boolean button9){
        if(button9){
            shootPopcorn.set(1);
        }
        else{
            shootPopcorn.set(0);
        }
    }

}
