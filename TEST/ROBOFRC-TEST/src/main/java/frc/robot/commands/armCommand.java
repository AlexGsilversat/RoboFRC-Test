package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;


public class armCommand extends CommandBase {
    public spinMotorSlow() {
        Tread tread = new Tread();
        tread.motor1ks = 1; //whatever value to make it "slow"
        tread.motor1v = 1; 
        SoftwareArmRoller armRoller = new SoftwareArmRoller();
        armRoller.storeBall();
    }
    
    @Override
    public void initialize() {
        spinMotorSlow();
    }


}

public class armCommandFast extends CommandBase { 
    public spinMotorFast() {
        Tread tread = new Tread();
        tread.motor1ks = 2; //whatever value to make it "fast"
        tread.motor1v = 2; 
        SoftwareArmRoller armRoller = new SoftwareArmRoller();
        armRoller.intakeBall();
    }
}
    

