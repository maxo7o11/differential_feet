package frc.robot;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {

    XboxController controller = new XboxController(0);

    SparkMax leftmotor1 = new SparkMax(0, MotorType.kBrushless);
    SparkMax leftmotor2 = new SparkMax(0, MotorType.kBrushless);
    SparkMax rightmotor1 = new SparkMax(0, MotorType.kBrushless);
    SparkMax rightmotor2 = new SparkMax(0, MotorType.kBrushless);

    Constaints.DriveConstraints.kDriveControllerPort;

    DifferentialDrive Drive = new DifferentialDrive(leftmotor1,rightmotor1);


    /** Called once at the beginning of the robot program. */
    public Robot() {

    }

    /** This function is run once each time the robot enters autonomous mode. */
    @Override
    public void autonomousInit() {

    }

    /** This function is called periodically during autonomous. */
    @Override
    public void autonomousPeriodic() {

    }

    /** This function is called once each time the robot enters teleoperated mode. */
    @Override
    public void teleopInit() {

    }

    /** This function is called periodically during teleoperated mode. */
    @Override
    public void teleopPeriodic() {

    }

    /** This function is called once each time the robot enters test mode. */
    @Override
    public void testInit() {

    }

    /** This function is called periodically during test mode. */
    @Override
    public void testPeriodic() {
        
    }
}
