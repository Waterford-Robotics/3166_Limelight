package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Talon;
import frc.robot.Constants;

public final class SpeakerTop {
    private Talon m_shootMotor = new Talon(Constants.kShootmotorID);
    public void shoot (){
        m_shootMotor.set(Constants.kShootSpeed);
    }
    public void stop (){
        m_shootMotor.set(0);
    }
}
