package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.TestBench;

@TeleOp
public class TouchSensorPractice extends OpMode {
    TestBench bench = new TestBench();


    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (bench.IsTouchSensorPressed()) {
            telemetry.addData("Touch Sensor Pressed", "Pressed!");
        } else {
            telemetry.addData("Touch Sensor Pressed", "Not Pressed!");
        }
        // Normally will always display true until touched, then false

        telemetry.addData("Touch Sensor Released", bench.IsTouchSensorReleased());
    }
}
