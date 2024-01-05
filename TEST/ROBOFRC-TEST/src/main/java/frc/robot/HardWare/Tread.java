package frc.robot.HardWare;
import com.revrobotics.CANSparkMax;


import edu.wpi.first.math.MathUtil;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;


import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;






//goal: to allow the robot motors to spin
public class Tread {
    //Setting the Motor ID's
    private final CANSparkMax Motor1 = new CANSparkMax(0, MotorType.kBrushless);
    private final CANSparkMax Motor2 = new CANSparkMax(1, MotorType.kBrushless);
    public void setMotorSpeed(double motorSpeed) {
        Motor1.follow(Motor2);
        Motor2.set(motorSpeed);
   






    }
    public double motor1ks = 0;
    public double motor1kv = 0;


    //change values to make voltage low constantly




    private final static double DRIVE_MOTOR_MAX_VOLTAGE = 12; //stole value from bunnybots
    private final static double DRIVE_MOTOR_MIN_VOLTAGE = 0;  //stole value from common sense




    //checked off by Gilli :)
    private final SimpleMotorFeedforward feedForwardMotor1 = new SimpleMotorFeedforward(motor1ks, motor1kv);
    public void feedForwardMotorSpeed(double motorSpeed) {
        double voltage = feedForwardMotor1.calculate(motorSpeed);


        voltage = MathUtil.clamp(voltage,DRIVE_MOTOR_MIN_VOLTAGE, DRIVE_MOTOR_MAX_VOLTAGE);


        Motor1.follow(Motor2);
        Motor2.setVoltage(voltage);
    }
}