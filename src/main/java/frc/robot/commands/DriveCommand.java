package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.Universals;

public class DriveCommand extends Command{
    DriveTrainSubsystem driveTrain;
    CommandJoystick joytick1;
    // Boolean autonomous = false;

    public DriveCommand(DriveTrainSubsystem driveTrain, CommandJoystick joytick1){
        this.driveTrain = driveTrain;
        this.joytick1 = joytick1;
        addRequirements(driveTrain);
    }
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      double leftDrive = joytick1.getRawAxis(1);
      double rightDrive = joytick1.getRawAxis(5);
      

      if(Universals.reverseMode == false){
        driveTrain.driveTeleop(leftDrive, rightDrive);
      }
      else{driveTrain.driveTeleop(-leftDrive, -rightDrive);}
      // double speed = -joytick1.getRawAxis(1) * 0.6;
      // double turn = joytick1.getRawAxis(4) * 0.3;
      // double left = speed + turn;
      // double right = speed - turn;
      // double rightDrive = joytick1.getRawAxis(5);
      // if(Math.abs(leftDrive) < 0.2){leftDrive = 0;}
      // if(Math.abs(rightDrive) < 0.2){rightDrive = 0;}
      // if (Universals.autonomousActive == true) {
      //   driveTrain_subsystem.driveTeleopPeriodic(0.4, 0);
      // } else {
      // driveTrain_subsystem.driveTeleopPeriodic(speed, turn);
      // }
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      // driveTrain_subsystem.stop();
     

    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
