package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {

    @Override
    public void init() {

        // basic Java variables
        int teamNumber = 3774;
        int motorAngle = 65;
        double motorSpeed = 0.75;
        boolean clawClosed = true;
        String teamName = "Hive Voltage";
        // Adds data and displays what they are on the control hub

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Angle", motorAngle);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw Closed", clawClosed);
        telemetry.addData("Team Name", teamName);
    }

    @Override
    public void loop(){

    }
}
