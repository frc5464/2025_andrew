package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.DriveTrainSubsystem;

public class DriveCommand extends Command{
    DriveTrainSubsystem driveTrain_subsystem;
    CommandJoystick joytick1;

    public DriveCommand(DriveTrainSubsystem drive, CommandJoystick jostick2){
        driveTrain_subsystem = drive;
        joytick1 = jostick2;
        addRequirements(drive);
    }
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      double leftDrive = joytick1.getRawAxis(1);
      double rightDrive = joytick1.getRawAxis(5);
      // if(Math.abs(leftDrive) < 0.2){leftDrive = 0;}
      // if(Math.abs(rightDrive) < 0.2){rightDrive = 0;}
      driveTrain_subsystem.drive(leftDrive, rightDrive);
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
