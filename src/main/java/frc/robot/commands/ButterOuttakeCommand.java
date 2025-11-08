package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ButterClawSubsystem;

public class ButterOuttakeCommand extends Command{
    private final ButterClawSubsystem butterClaw_subsystem;

    public ButterOuttakeCommand(ButterClawSubsystem butterClaw){
        butterClaw_subsystem = butterClaw;
    }
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      butterClaw_subsystem.butterOuttake(true);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      butterClaw_subsystem.butterOuttake(false);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }

}
