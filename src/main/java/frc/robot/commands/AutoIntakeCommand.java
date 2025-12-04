package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;

public class AutoIntakeCommand extends Command{
    private final IntakeSubsystem intake_subsystem;
    private final double time;
    private final Timer timer = new Timer();

  public AutoIntakeCommand(IntakeSubsystem intake, double m_time) {
    intake_subsystem = intake;
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
    
    intake_subsystem.intakePopcorn(1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    timer.stop();
    intake_subsystem.intakePopcorn(0);
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
