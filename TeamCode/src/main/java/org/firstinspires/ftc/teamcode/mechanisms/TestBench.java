package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class TestBench {

    private DigitalChannel touchSensor; // All hardware should be privated
        // Should be more descriptive based on location on bot

    public void init(HardwareMap hwMap) {
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor" /* Should match the exact name of the part in the control hub */ );
        touchSensor.setMode(DigitalChannel.Mode.INPUT);
    }

    // DigitalChannel returns a boolean type
    public boolean IsTouchSensorPressed() { // Gets the state of the Touch Sesnor
        return !touchSensor.getState(); // flips the true and false
    }

    public boolean IsTouchSensorReleased() {
        return touchSensor.getState();
    }
}
