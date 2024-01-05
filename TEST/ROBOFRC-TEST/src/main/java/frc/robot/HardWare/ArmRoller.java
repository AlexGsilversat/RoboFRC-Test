package frc.robot.HardWare;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
//import ;

public class ArmRoller {
    CANSparkMax Motor1 = new CANSparkMax(3, MotorType.kBrushless);
    CANSparkMax Motor2 = new CANSparkMax(4, MotorType.kBrushless);

    public void startMotors(double motorSpeed){
        Motor1.set(motorSpeed);
        Motor2.follow(Motor1);

    }


}
