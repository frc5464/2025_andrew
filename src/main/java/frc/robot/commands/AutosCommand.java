// Copyright (c) FIRST and other WPILib contributors.garbage
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public final class AutosCommand {
  /** Example static factory for an autonomous command. */
  public static Command exampleAuto(ExampleSubsystem subsystem) {
    return Commands.sequence(
      subsystem.exampleMethodCommand(),
      new ExampleCommand(subsystem));
  }

  public static Command autonomojohnathon(DriveTrainSubsystem drivetrain){
    return Commands.sequence(
      new DriveForwardCommand(drivetrain, 5)

    );
  }

  private AutosCommand() {
    throw new UnsupportedOperationException("This is a utility class!");
  }
}
