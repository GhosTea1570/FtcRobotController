package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@Disabled
public class RobotLocationPractice {

    double angle;
    double x;
    double y;



    public RobotLocationPractice(double angle) { // Constructor Method
        this.angle = angle;
    }

    public double getHeading() { // Getter Method
        // this method normalizes robot heading between -180 and 180
        // useful for turn angles when crossing 0 - 360 boundary
        double angle = this.angle;
        while (angle > 180) {
            angle -= 360; // subtract until in target range
        }
        while (angle <= 180) {
            angle += 360; // add until in target range
        }
        return angle; // return normalized value
    }

    public void setAngle(double angle) { // Setter Method
        this.angle = angle;
    }

    public void turnRobot(double angleChange) {
        angle -= angleChange;
    }

    public double getAngle(){
        return this.angle;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double xChange) {
        this.x = xChange;
    }
    public void changeX(double changeAmount) {
        this.x += changeAmount;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double yChange) {
        this.y = yChange;
    }
    public void changeY(double changeAmount) {
        this.y += changeAmount;
    }


}