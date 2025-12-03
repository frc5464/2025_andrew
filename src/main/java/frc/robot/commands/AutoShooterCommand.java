package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class AutoShooterCommand extends Command{
     private final ShooterSubsystem shooter_subsystem;
     private final double time;
    private final Timer timer = new Timer();

    public AutoShooterCommand(ShooterSubsystem shoot, double m_time){
        shooter_subsystem = shoot;
        time = m_time;
    }

    @Override
    public void initialize(){

    }

    @Override
    public void execute(){
        shooter_subsystem.shootPopcorn(1);
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
