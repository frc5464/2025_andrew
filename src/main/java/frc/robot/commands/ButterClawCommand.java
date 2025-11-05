package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ButterClawSubsystem;

public class ButterClawCommand extends Command{
    private final ButterClawSubsystem butterClaw_Subsystem;
    
    public ButterClawCommand(ButterClawSubsystem butt){
        butterClaw_Subsystem = butt;
    }
    @Override
    public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    butterClaw_Subsystem.buttering(0.5);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    butterClaw_Subsystem.buttering(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }

}
