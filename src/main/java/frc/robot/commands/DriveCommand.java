package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;

public class DriveCommand extends Command{
    private final DriveTrainSubsystem driveTrain_subsystem;

    public DriveCommand(DriveTrainSubsystem drive){
        driveTrain_subsystem = drive;
    }
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      driveTrain_subsystem.drive(0.5, 0.5);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      driveTrain_subsystem.stop();
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
}
