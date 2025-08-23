// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.configs.TalonFXConfigurator;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ExampleSubsystem extends SubsystemBase implements Reportable{
  /** Creates a new ExampleSubsystem. */
  private final TalonFX examplemotor = new TalonFX(0);
  boolean enabled = true;
  private final TalonFXConfigurator example;

  public ExampleSubsystem() {
    
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  //methods
  public void setEnabled() {

  }
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  @Override
  public void reportToSmartDashboard(LOG_LEVEL priority) {
    switch (priority) {
      case OFF:
        break;
      case ALL:

      case MEDIUM:

      case MINIMAL:

    }
}

  @Override
  public void initShuffleboard(LOG_LEVEL priority) {

}

}




