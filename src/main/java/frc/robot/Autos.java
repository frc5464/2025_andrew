

package frc.robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.ButterIntakeCommand;
import frc.robot.commands.ButterOuttakeCommand;
import frc.robot.commands.ButterTiltCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.commands.ShooterCommand;
import frc.robot.subsystems.ButterClawSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import frc.robot.utils.CommandFactory;
import frc.robot.utils.SubsystemManager;

//Move forward
//shoot popcorn
//rotate to melter
//vomit butter
//Backup
public class Autos{
    private static final String kDefaultAuto = "Default";
    private static final String kCustomAuto = "My Auto";
    private String m_autoSelected;
    private final SendableChooser<String> m_chooser = new SendableChooser<>();

    Timer autoTimer = new Timer();
    Timer intakeTimer = new Timer();
    Timer wait = new Timer();
    
    Integer Abutton = 1;
  Integer Bbutton = 2;
  Integer Xbutton = 3;
  Integer Ybutton = 4;
  Integer Lbumper = 5;
  Integer Rbumper = 6;
  Integer BackButton = 7;
  Integer StartButton = 8;
  Integer LStickClick = 9;
  Integer RStickClick = 10;
  Integer LStickLeftRightAxis = 0;
  Integer LStickFwdBackAxis = 1;
  Integer LtriggerAxis = 2;
  Integer RtriggerAxis = 3;
  Integer RStickLeftRightAxis = 4;
  Integer RStickFwdBackAxis = 5;

  double TargetYaw = 0;
  public int autoStep = 0;

    public Autos(SubsystemManager subsystemManager, CommandFactory commandFactory){
        //Subsystems
        final IntakeSubsystem intake = subsystemManager.getIntakeSubsystem();
        final ShooterSubsystem shooter = subsystemManager.getShooterSubsystem();
        final ButterClawSubsystem butterClaw = subsystemManager.getButterClawSubsystem();
        final DriveTrainSubsystem driveTrain = subsystemManager.getDriveTrainSubsystem();
        //Commands
        final DriveCommand driveCommand = commandFactory.getDriveCommand();
        final IntakeCommand intakeCommand = commandFactory.getIntakeCommand();
        final ShooterCommand shooterCommand = commandFactory.getShooterCommand();
        final ButterIntakeCommand butterIntakeCommand = commandFactory.getButterIntakeCommand();
        final ButterOuttakeCommand butterOuttakeCommand = commandFactory.getButterOuttakeCommand();
        final ButterTiltCommand butterTiltCommand = commandFactory.getButterTiltCommand();
    }
  private static final String kMelterScore = "Melter";

  private static final String kKettleScore = "Kettle";

  private static final String kButterPickup = "ButterPickup";
  private static final String kPopcornPickup = "PopcornPickup";

  private String scorePresetSelected;
  private String autoDirectionSelected;
  private final SendableChooser<String> scorePresetChooser = new SendableChooser<>();

  boolean ButterPickupEncoder = false;
  boolean Fieldoriented = false;
  
  public void robotInit(){

    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);
    m_chooser.addOption("My Auto", kCustomAuto);
    SmartDashboard.putData("Auto choices", m_chooser);

    m_chooser.setDefaultOption("Default Auto", kDefaultAuto);

    m_chooser.addOption("ButterPickup", kButterPickup);

    SmartDashboard.putData("Auto choices", m_chooser);

    SmartDashboard.putData("Score Preset Choices", scorePresetChooser);
  }

  public void robotPeriodic(){
    SmartDashboard.putNumber("autostep", autoStep);
    SmartDashboard.putNumber("autoTimer", autoTimer.get());
  }

  public void scorePrep(){
    autoStep++;
    autoTimer.start();
  }

  public void EscapePrep(){
    autoStep++;
  }

  public void sButterEl(){
    switch (scorePresetSelected) {
        case kButterPickup:
            
            break;
    
        default:
            break;
    }
  }

  public void Score(){
    switch(scorePresetSelected){
        case kKettleScore:

        break;
    }
  }

  public void StartautoTimer(){
    autoTimer.reset();
    autoTimer.start();
    autoStep++;
  }

  public void Spin180Gyro() {
    double yawWeDoBeUsing;

    if (gyro.Yaw > 0) {
      yawWeDoBeUsing = gyro.Yaw;
    } else {
      yawWeDoBeUsing = gyro.Yaw + 360;
    }

    double rotate = drivetrain.SnapToAngle(yawWeDoBeUsing, 180);
    if (autoTimer.get() < 3) {
      drivetrain.Move(0, 0, rotate * 0.5);
      elevator.setElevatorPosition("Drive");
    } else if (autoTimer.get() > 3) {
      drivetrain.Move(0, 0, 0);
      autoTimer.stop();
      autoTimer.reset();
      autoTimer.start();
      autoStep++;
    }
  }

  public void Wait(){
    autoStep++;
  }

  public void spinToButter(){
    switch (autoDirectionSelected) {
        case kLeft:
        double rotate = drivetrain.SnapToAngle(gyro.Yaw, -177);
        if (autoTimer.get() < 2) {
          drive.Move(0, 0, rotate * 0.4);
        } else if (autoTimer.get() > 2) {
          drivetrain.Move(0, 0, 0);
          autoTimer.stop();
          autoTimer.reset();
          autoStep++;
        }
        break;
      case kRight:
        double roll = drivetrain.SnapToAngle(gyro.Yaw, 177);
        if (autoTimer.get() < 2) {
          drivetrain.Move(0, 0, roll * 0.3);
        } else if (autoTimer.get() > 2) {
          drivetrain.Move(0, 0, 0);
          autoTimer.stop();
          autoTimer.reset();
          autoTimer.start();
          autoStep++;
        }
        break;  
    }
  }

  public void ButterDetect(){
    autoStep++;
  }

  public void IntakeRun(){
    if (autoTimer.get() < 0.3) {
      drivetrain.Move(0.3, 0, 0);
    }
  }

  public void OneSecDelay() {
    // if(autoTimer.get() < 1){
    // drivetrain.Move(0, 0, 0);
    // }
    // else if(autoTimer.get() > 1){
    // autoTimer.stop();
    // autoTimer.reset();
    // autoTimer.start();
    // autoStep++;
    // }
    autoStep++;
  }

  public void Spin0Gyro() {
    elevator.setElevatorPosition("Drive");
    double rotate = drivetrain.SnapToAngle(gyro.Yaw, 0);
    if (autoTimer.get() < 1) {
      drivetrain.Move(0, 0, rotate);
    } else if (autoTimer.get() > 1) {
      drivetrain.Move(0, 0, 0);
      autoTimer.stop();
      autoTimer.reset();
      autoTimer.start();
      autoStep++;
    }
  }

  public void ScoreButter() {
    if (autoTimer.get() < 1) {
      intake.InConeOutCubeRun();
    } else {
      autoTimer.stop();
      autoTimer.reset();
      autoTimer.start();
      autoStep++;
    }
  }

  public void Generic_Backup() {
    drivetrain.Move(-0.3, 0, 0);
    if (drivetrain.frontleftrotations < -68.0) {
      TargetYaw = gyro.Yaw;
      autoStep++;
    }
  }

  // This autonomous routine starts in the right position, scores a cone,
  // backs up past the charge station, strafes right, and drives back on it
  public void AutoTokyoDrift() {
    switch (autoStep) {
      case 0:
        sButterEl();
        break;
      case 1:
        scorePrep();
        break;
      case 2:
        Score();
        break;
      case 3:
        EscapePrep();
        break;
      case 4:
        TokyoEscape();
        break;
      case 5:
        TokyoDrift();
        break;
      case 6:
        Arrival();
        break;
      case 7:
        Gunit();
        break;
      case 8:
        Balance();
        break;
      case 9:
        break;
      default:
        drivetrain.Move(0, 0, 0);
    }
  }

  // This autonomous routine starts anywhere in front of a cone scoring location
  // It drives forward, scores, backs out of community
  public void AutoDefault() {
    switch (autoStep) {
      case 0:
        sButterEl();
        break;
      case 1:
        scorePrep();
        break;
      case 2:
        Score();
        break;
      case 3:
        Generic_Backup();
        break;
      case 4:
        break;
    }
  }

  public void AutoScoreOnly() {
    switch (autoStep) {
      case 0:
        sButterEl();
        break;
      case 1:
        scorePrep();
        break;
      case 2:
        Score();
        break;
      case 4:
        break;
    }
  }

  public void AutoScorePickup(){
    switch(autoStep){
      case 0:
        sButterEl();
        break;
      case 1:
        scorePrep();
        break;
      case 2:
        Score();
        break;
      case 3:
        PickupEscape();
        break;
      case 4:
        StartautoTimer();
        break;
      case 5:
        spinToButter();
        break;
      case 6:
        StartautoTimer();
        break;
      case 7:
        // SweeptheHouse();
        autoStep++;
        break;
      case 8:
        // SweepSnap();
        autoStep++;
        break;
      case 9:
        AutoSetCube();
        break;
      case 10:
        IntakeRun();
        break;
      case 11:
        Spin0Gyro();
        break;
      case 12:
        break;      
    }
  }

  public void autonomousInit(){
    m_autoSelected = m_chooser.getSelected();
    System.out.println("Auto selected: " + m_autoSelected);
    System.out.println("Preset selected: " + scorePresetSelected);
    
    autoTimer.stop();
    autoTimer.reset();

    intakeTimer.stop();
    intakeTimer.reset();

    wait.stop();
    wait.reset();

    autoStep = 0;
  }

  public void automousPeriodic(){
    System.out.println(autoStep);

    switch (m_autoSelected) {

        case kTokyoDrift:
          AutoTokyoDrift();
          break;
  
        case kHitchRoute:
          AutoHitchRoute();
          break;
  
        case kSideScore:
          AutoSideScore();
          break;
  
        case kMiddleScore:
          AutoMiddleScore();
          break;
  
        // case kDefaultAuto:
        // AutoDefault();
        // break;
  
        case kScoreOnly:
          AutoScoreOnly();
          break;
        
        case kScorePickup:
          AutoScorePickup();
          break;
  
        default:
          AutoDefault();
          break;
      }
  }









}