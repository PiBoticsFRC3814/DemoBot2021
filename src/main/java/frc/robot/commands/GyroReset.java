// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.analog.adis16470.frc.ADIS16470_IMU;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class GyroReset extends CommandBase {
  /** Creates a new GyroReset. */
  ADIS16470_IMU gyro;
  public GyroReset(ADIS16470_IMU gyros) {
    // Use addRequirements() here to declare subsystem dependencies.
    gyro = gyros;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    gyro.reset();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
