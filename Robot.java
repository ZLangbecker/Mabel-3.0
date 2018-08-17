
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.kauailabs.navx.frc.AHRS;

import org.usfirst.frc.team4043.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {
	public static DriveTrain driveTrain;
	public static AHRS ahrs;
	public static AnalogInput ai;
	public static OI m_oi;
	
	public static boolean keepState = true;
	public static double initTime = 0;
	int state = 1;
	double currentUltrasonic = 0;
	public static boolean toggleKeep = false;
	String gameData;
	String autoChoice = "";
	double time = Timer.getFPGATimestamp();
	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */	
	public void robotInit() {
		driveTrain = new DriveTrain();
		ahrs = new AHRS(SPI.Port.kMXP);
		ai = new AnalogInput(0);
		m_oi = new OI();
		// chooser.addObject("My Auto", new MyAutoCommand());
		SmartDashboard.putData("Auto mode", m_chooser);
	}

	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
}