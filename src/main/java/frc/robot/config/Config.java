package frc.robot.config;

public class Config {

  // List of subsystem names:
  // Autonomous
  // BallManagement
  // Climber
  // Drive
  // Intake
  // Shooter
  // Spinnyboi
  // Turret
  // Vision

  //////////////////////////////////////////////////////////////////////////////
  // Subsystem Enablers
  public boolean enableBallManagementSubsytem = true;
  public boolean enableClimberSubsytem = true;
  public boolean enableDriveSubsytem = true;
  public boolean enableIntakeSubsytem = true;
  public boolean enableShooterSubsytem = true;
  public boolean enableSpinnyboiSubsytem = true;
  public boolean enableTurretSubsytem = true;
  public boolean enableVisionSubsytem = true;

  //////////////////////////////////////////////////////////////////////////////
  // Motor IDs

  // BallManagement Subsystem
  public int BALL_MANAGEMENT_MOTOR_ID = 14;

  // Climber Subsystem
  public int LEFT_ARM_MOTOR_ID = 12;
  public int RIGHT_ARM_MOTOR_ID = 8;

  // Drive Subsystem
  public int RIGHT_DRIVE_LEADER_ID = 1;
  public int LEFT_DRIVE_LEADER_ID = 2;
  public int RIGHT_DRIVE_FOLLOWER_ID = 3;
  public int LEFT_DRIVE_FOLLOWER_ID = 4;

  // Intake Subsystem
  public int INTAKE_MOTOR_ID = 10;

  // Shooter Subsystem
  public int FEEDER_MOTOR_ID = 15;
  public int SHOOTER_MOTOR_ID = 9;

  // Spinnyboi Subsystem
  public int SPINNYBOI_MOTOR_ID = 11;

  // Turret Subsystem
  public int AZIMUTH_MOTOR_ID = 7;
  public int ELEVATION_MOTOR_ID = 6;

  //////////////////////////////////////////////////////////////////////////////
  // Subsystem Configs

  // Autonomous Config
  public class AutonomousConfig {

  }

  // BallManagement Config
  public class BallManagementConfig {

  }

  // Climber Config
  public class ClimberConfig {
    public double MOTOR_SPEED = 0.1;
  }

  // Drive Config
  public class DriveConfig {

  }

  // Intake Config
  public class IntakeConfig {

  }

  // Shooter Config
  public class ShooterConfig {

  }

  // Spinnyboi Config
  public class SpinnyboiConfig {

  }

  // Turret Config
  public class TurretConfig {
    public double AZIMUTH_GEAR_RATIO = 28.0 / 130.0;
    public double ELEVATION_GEAR_RATIO = 40.0 / 70.0;
    public double TICKS_PER_REVOLUTION = 8192.0;
  }

  public AutonomousConfig autonomousConfig;
  public BallManagementConfig ballManagementConfig;
  public ClimberConfig climberConfig;
  public DriveConfig driveConfig;
  public IntakeConfig intakeConfig;
  public ShooterConfig shooterConfig;
  public SpinnyboiConfig spinnyboiConfig;
  public TurretConfig turretConfig;

  public Config() {
    autonomousConfig = new AutonomousConfig();
    ballManagementConfig = new BallManagementConfig();
    climberConfig = new ClimberConfig();
    driveConfig = new DriveConfig();
    intakeConfig = new IntakeConfig();
    shooterConfig = new ShooterConfig();
    spinnyboiConfig = new SpinnyboiConfig();
    turretConfig = new TurretConfig();
  }
}
