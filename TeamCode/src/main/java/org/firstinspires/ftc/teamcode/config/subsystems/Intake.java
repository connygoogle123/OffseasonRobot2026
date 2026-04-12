package org.firstinspires.ftc.teamcode.config.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.navigation.CurrentUnit;

public class Intake {

    public enum IntakeState {
        INTAKE, STOP, REVERSE
    }
    private IntakeState state = IntakeState.STOP;
    private final DcMotorEx intake;

    public Intake(HardwareMap hardwareMap) {
        intake = hardwareMap.get(DcMotorEx.class, "intake");
        intake.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        intake.setDirection(DcMotor.Direction.REVERSE);
    }

    public double getCurrent() {
        return intake.getCurrent(CurrentUnit.AMPS);
    }

    public void update() {
        switch (state) {
            case INTAKE:
                intake.setPower(1.0);
                break;
            case STOP:
                intake.setPower(0.0);
                break;
            case REVERSE:
                intake.setPower(-1.0);
                break;
        }
    }

    public void setIntakeState(IntakeState state) {
        this.state = state;
    }

    public IntakeState getState() {
        return state;
    }

    public void intake() {
        setIntakeState(IntakeState.INTAKE);
    }

    public void stop() {
        setIntakeState(IntakeState.STOP);
    }

    public void reverse() {
        setIntakeState(IntakeState.REVERSE);
    }

}
