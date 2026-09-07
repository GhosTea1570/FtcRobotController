package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled // Disables the program from reaching the Control Station. Keep Old Code with New Code without effecting New Code
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        // runs 50x# a second
        double speedForward = -gamepad1.left_stick_y / 2.0;
        double differenceXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        // Gamepad Movement details
        telemetry.addData("left x", gamepad1.left_stick_x);
        telemetry.addData("left y", gamepad1.left_stick_y);
        telemetry.addData("y", speedForward); // Now caps the max movement to -0.5
        telemetry.addData("a button", gamepad1.a);
        telemetry.addData("b button", gamepad1.b);
        telemetry.addData("right x", gamepad1.right_stick_x);
        telemetry.addData("right y", gamepad1.right_stick_y);
        telemetry.addData("X Joysticks Difference", differenceXJoysticks);
        telemetry.addData("Sum of Triggers", sumTriggers);

    }
}