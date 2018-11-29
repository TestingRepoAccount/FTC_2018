package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class MyFIRSTJavaOpMode extends LinearOpMode {
//    private Gyroscope imu;
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor linearSlide;
    private DcMotor linearRetract;
//    private DigitalChannel digitalTouch;
//    private DistanceSensor sensorColorRange;
//    private Servo servoTest;

    @Override
    public void runOpMode() {
//        imu = hardwareMap.get(Gyroscope.class, "imu");
        leftMotor = hardwareMap.get(DcMotor.class, "left_motor");
        rightMotor = hardwareMap.get(DcMotor.class, "right_motor");
        linearSlide = hardwareMap.get(DcMotor.class, "linearSlide");
        linearRetract = hardwareMap.get(DcMotor.class, "linearRetract");

//        digitalTouch = hardwareMap.get(DigitalChannel.class, "digitalTouch");
//        sensorColorRange = hardwareMap.get(DistanceSensor.class, "sensorColorRange");
//        servoTest = hardwareMap.get(Servo.class, "servoTest");
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        // Wait for the game to start (driver presses PLAY)
        waitForStart();
        // run until the end of the match (driver presses STOP)
        double tgtPower = 0;
        boolean tgtPower2 = false;

        while (opModeIsActive()) {
            //left motor
            tgtPower = -this.gamepad1.left_stick_y;
            leftMotor.setPower(tgtPower);

            //right motor
            tgtPower = this.gamepad1.right_stick_y;
            rightMotor.setPower(tgtPower);

//            //move up linear slide RT
//            tgtPower = this.gamepad1.right_trigger;
//            linearSlide.setPower(tgtPower);
//
//            //move up linear slide LT
//            tgtPower = this.gamepad1.left_trigger;
//            linearRetract.setPower(tgtPower);

//            //move down linear slide
//            if (this.gamepad1.left_bumper && this.gamepad1.right_bumper){
//                telemetry.addData("Status", "in if statement");
//                telemetry.update();
//
//                //move up linear slide RT
//                tgtPower = -this.gamepad1.right_trigger;
//                linearSlide.setPower(tgtPower);
//                telemetry.addData("Status", "RT");
//                telemetry.update();
//
//                //move up linear slide LT
//                tgtPower = -this.gamepad1.left_trigger;
//                linearRetract.setPower(tgtPower);
//                telemetry.addData("Status", "LT");
//                telemetry.update();
//
//                //move up linear slide RT
//                tgtPower = this.gamepad1.right_trigger;
//                linearSlide.setPower(tgtPower);
//
//                //move up linear slide LT
//                tgtPower = this.gamepad1.left_trigger;
//                linearRetract.setPower(tgtPower);
//            }


            telemetry.addData("Status", "Running");
            telemetry.update();
        }
    }
}
