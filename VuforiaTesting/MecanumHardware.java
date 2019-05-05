package VuforiaTesting;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class MecanumHardware {
    public DcMotor backRight = null;
    public DcMotor backLeft = null;
    public DcMotor frontRight = null;
    public DcMotor frontLeft = null;

    public MecanumHardware() {
    }

    public void init(HardwareMap ahwMap) {
        // Define and Initialize Motors
        backLeft = ahwMap.get(DcMotor.class, "back_left");
        backRight = ahwMap.get(DcMotor.class, "back_right");
        frontLeft = ahwMap.get(DcMotor.class, "front_left");
        frontRight = ahwMap.get(DcMotor.class, "front_right");

        //Init motor directions
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        backRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        frontRight.setDirection(DcMotor.Direction.REVERSE);

        // Set all motors to zero power
        backLeft.setPower(0);
        backRight.setPower(0);
        frontLeft.setPower(0);
        frontRight.setPower(0);

        // Set motor run modes - using encoders since all motors have encoder wires
        backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Set the zero power position for all motors to BRAKE (hold position)
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);


    }
}
