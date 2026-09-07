package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        double motorSpeed = gamepad1.left_stick_y
        boolean aButton = gamepad1.a; // press TRUE, depress FALSE
        double leftY = gamepad1.left_stick_y;

        if(!aButton) {
            motorSpeed *= 0.5;
        }
        telemetry.addData("Left Stick value", motorSpeed);

        if (aButton) {
            telemetry.addData("A Button", "Pressed!");
        }
        else {
            telemetry.addData("A Button", "NOT Pressed");
        }
        telemetry.addData("A Button State", aButton);

        if (leftY < 0) {
            telemetry.addData("Left Stick", "is Negative");
        }
        else if (leftY > 0.5) {
            telemetry.addData("Left Stick", "is greater than 50%");
        }
        else if (leftY > 0) {
            telemetry.addData("Left Stick", "is greater than 0");
        }
        else {
            telemetry.addData("Left Stick", "is Zero");
        }
        telemetry.addData("Left Y", leftY);


    }
}

/*

AND && if (leftY < 0.5 && leftY > 0) {}
OR || if (leftY < 0 || rightY < 0) {}
NOT ! if (!clawClosed) {}
 */