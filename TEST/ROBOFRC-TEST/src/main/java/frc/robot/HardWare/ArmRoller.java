package frc.robot.HardWare;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ArmRoller {
    private final CANSparkMax Motor1 = new CANSparkMax(3, MotorType.kBrushless);
    private final CANSparkMax Motor2 = new CANSparkMax(4, MotorType.kBrushless);

    public void startMotors(double motorSpeed){
        Motor2.follow(Motor1);
        Motor1.set(motorSpeed);

    }


}
