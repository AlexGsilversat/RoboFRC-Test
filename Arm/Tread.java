package frc.robot.Arm;
import com.revrobotics.CANSparkMax;
import edu.wpi.first.math.controller.PIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;




public class Tread {
    //Setting the Motor ID's
    private final CANSparkMax Motor1 = new CANSparkMax(0, MotorType.kBrushless);
    private final CANSparkMax Motor2 = new CANSparkMax(1, MotorType.kBrushless);
    public void setMotorSpeed(double motorSpeed) {
        Motor1.follow(Motor2);
        Motor2.set(motorSpeed)
    



    }
    private final double motor1ks = 0.0378;
    private final double motor1kv = 2.7479;



    private final SimpleMotorFeedForward feedForwardMotor1 = new SimpleMotorFeedForward(motor1ks, motor1kv)
    public void feedForwardMotorSpeed(motorSpeed) {
        double voltage = feedForwardMotor1.calculate(motorSpeed);

        voltage = MathUtil.clamp(rightVoltage, -DRIVE_MOTOR_MAX_VOLTAGE, DRIVE_MOTOR_MAX_VOLTAGE);

        Motor1.follow(Motor2);
        Motor2.setVoltage(voltage);
    }

    }