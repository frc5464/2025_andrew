package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ButterClawSubsystem;

public class ButterIntakeCommand extends Command{
    private final ButterClawSubsystem butterClaw_subsystem;

    public ButterIntakeCommand(ButterClawSubsystem butterclaw){
        butterClaw_subsystem = butterclaw;
    }
    @Override
    public void initialize() {
  
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
      butterClaw_subsystem.butterIntake(true);
    }
  
    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
      butterClaw_subsystem.butterIntake(false);
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }
  }
  
