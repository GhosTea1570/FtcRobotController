package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

// In the future, this program will be connected onto the control hub and be a device that has access to the program

// @TeleOp and @Autonomous are needed to decipher between the two types of sessions and commands
@Disabled
@TeleOp // Need this or code doesn't work
public class RandoCode extends OpMode { //  extends OpMode adds more for the program

    @Override // Overrides the initialization method to create a new initialization
    public void init() { // Said initialization
        telemetry.addData("Hello", "Your Name"); // Adds Data into the screen of the Driver Station

    }

    @Override
    public void loop() { // Need both init() and loop() for FTC | REQUIRED

    }
}
