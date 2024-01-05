package frc.robot.SoftWare;

import frc.robot.HardWare.ArmRoller;

class SoftWareArmRoller{
    ArmRoller hardwareArmRoller = new ArmRoller();

    public void intakeBall(){
        hardwareArmRoller.startMotors(+0.2);
    }

    public void storeBall(){
        hardwareArmRoller.startMotors(+0.01);
    }

    public void shootBall(){
        hardwareArmRoller.startMotors(+0.0);
    }
}