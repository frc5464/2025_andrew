package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandJoystick;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.utils.Universals;

public class ReverseDriveModecommand extends Command{
    @Override
    public void initialize() {
        Universals.reverseMode = true;
    }
    
    @Override
    public void execute() {
  
    }
  
    @Override
    public void end(boolean interrupted) {
      Universals.reverseMode = false;
      System.out.println("reverseDriveModeCommand_finished");

    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return false;
    }

    @Override
    public boolean runsWhenDisabled(){
      return true;
    }
}

