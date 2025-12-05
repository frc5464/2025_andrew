package frc.robot.commands;


import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;

public class DriveBackwardCommand extends Command {
    private final DriveTrainSubsystem drivetrain;
    private final double time;
    private final Timer timer = new Timer();

    public DriveBackwardCommand(DriveTrainSubsystem m_drivetrain, double m_time){
        drivetrain = m_drivetrain;
        time = m_time;
    }

      // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    timer.restart();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.driveTeleop(.5, .5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    timer.stop();
    drivetrain.stop();
  }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        if(timer.get() >= time){
            return true;
        }
        return false;
    }
}
