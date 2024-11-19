// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkLowLevel;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Motors extends SubsystemBase {
  
  private final CANSparkMax motorL1, motorL2, motorR1, motorR2;

  public Motors() {
    motorL1 = new CANSparkMax(0, CANSparkLowLevel.MotorType.kBrushless);
    motorL2 = new CANSparkMax(1, CANSparkLowLevel.MotorType.kBrushless);  
    motorR1 = new CANSparkMax(2, CANSparkLowLevel.MotorType.kBrushless);
    motorR2 = new CANSparkMax(3, CANSparkLowLevel.MotorType.kBrushless);
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }

    /* 
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here
        });
  }
  */

  }
