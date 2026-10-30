package frc.robot;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Robot extends TimedRobot {

    XboxController robotController = new XboxController(constants.DifferentialDrive.joy_Port);

    
    SparkMax leftmotor1 
        = new SparkMax(constants.DifferentialDrive.leftmotor1, MotorType.kBrushless);
    SparkMax leftmotor2 
        = new SparkMax(constants.DifferentialDrive.leftmotor2, MotorType.kBrushless);
    SparkMax rightmotor1 
        = new SparkMax(constants.DifferentialDrive.rightmotor1, MotorType.kBrushless);
    SparkMax rightmotor2 
        = new SparkMax(constants.DifferentialDrive.rightmotor2, MotorType.kBrushless);
    

    

    DifferentialDrive Drive = new DifferentialDrive(leftmotor1, rightmotor1);

    SparkMaxConfig globalConfig = new SparkMaxConfig();
    SparkMaxConfig leftLeadConfig = new SparkMaxConfig();
    SparkMaxConfig leftFollowerConfig = new SparkMaxConfig();
    SparkMaxConfig rightleadConfig = new SparkMaxConfig();
    SparkMaxConfig rightFollowerConfig = new SparkMaxConfig();

    /** Called once at the beginning of the robot program. */
    public Robot() {}

    @Override 
        public void robotInit(){
            leftLeadConfig.inverted(true);
            rightleadConfig.inverted(false);
            leftFollowerConfig.follow(leftmotor1);
            rightFollowerConfig.follow(rightmotor1);

            leftmotor1.configure(leftLeadConfig, ResetMode.kResetSafeParameters, 
                PersistMode.kNoPersistParameters);
            leftmotor2.configure(leftFollowerConfig, ResetMode.kResetSafeParameters,
                PersistMode.kNoPersistParameters);
            rightmotor1.configure(rightleadConfig, ResetMode.kResetSafeParameters,
                PersistMode.kNoPersistParameters);
            rightmotor2.configure(rightFollowerConfig, ResetMode.kResetSafeParameters,
                PersistMode.kNoPersistParameters);
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
        Drive.tankDrive(robotController.getLeftY(), robotController.getRightY());
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
