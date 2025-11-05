package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCommand extends Command{
    private final ShooterSubsystem shooter_subsystem;

    public ShooterCommand(ShooterSubsystem shoot){
        shooter_subsystem = shoot;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        shooter_subsystem.shootPopcorn(.5);
    }

    @Override
    public void end(boolean interrupted){
        shooter_subsystem.shootPopcorn(0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}
