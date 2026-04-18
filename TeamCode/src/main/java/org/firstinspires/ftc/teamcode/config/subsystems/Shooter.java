package org.firstinspires.ftc.teamcode.config.subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.opmodes.test.FlywheelTune;

public class Shooter {
    public enum ShooterState {
        IDLE, SPINNING_UP, READY, FEEDING
    }
    private ShooterState state = ShooterState.IDLE;
    private final DcMotorEx flywheelMotorLeft;
    private final DcMotorEx flywheelMotorRight;
    private final Servo gate;

    public Shooter(HardwareMap hardwareMap) {

    }
}
