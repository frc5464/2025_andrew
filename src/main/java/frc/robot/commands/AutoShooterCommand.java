package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class AutoShooterCommand extends Command{
    private final ShooterSubsystem shooter_subsystem;
    private final DriveTrainSubsystem driveTrain;
    private final double time;
    private final Timer timer = new Timer();

    public AutoShooterCommand(DriveTrainSubsystem drive, ShooterSubsystem shoot, double m_time){
        driveTrain = drive;
        shooter_subsystem = shoot;
        time = m_time;
    }

    @Override
    public void initialize(){
        timer.restart();
    }

    @Override
    public void execute(){
        shooter_subsystem.shootPopcorn(1);
        // driveTrain.driveTeleop(1, 1);
        // driveTrain.driveTeleop(-1, -1);
    }

    @Override
    public void end(boolean interrupted){
        timer.stop();
        shooter_subsystem.shootPopcorn(0);
    }

    @Override
    public boolean isFinished() {
        if(timer.get() >= time){
            return true;
        }
        return false;
    }

}
