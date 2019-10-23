package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class HardwareRobot {

    final static double COUNTS_PER_MOTOR_REV = 1750;
    final static double DRIVE_GEAR_REDUCTION = 1;
    final static double WHEEL_DIAMETER_INCHES = 4;
    public final static double COUNTS_PER_INCH = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
            (WHEEL_DIAMETER_INCHES * 3.1415);
            
    public DcMotor leftDriveF = null, leftDriveB = null, 
        rightDriveF = null, rightDriveB = null;
    public CRServo servo1 = null, servo2 = null;
    public DcMotor lift = null;
    public DcMotor comp = null;

    private HardwareMap map = null;

    public HardwareRobot()
    {
        
    }

    public void init(HardwareMap hMap)
    {
        map = hMap;

        servo1 = map.crservo.get("s1");
        servo2 = map.crservo.get("s2");
        lift = map.dcMotor.get("m5");
        comp = map.dcMotor.get("m6");
        
        leftDriveF = map.dcMotor.get("m1");
        leftDriveB = map.dcMotor.get("m2");
        rightDriveF = map.dcMotor.get("m3");
        rightDriveB = map.dcMotor.get("m4");
        
        leftDriveF.setDirection(DcMotor.Direction.REVERSE);
        leftDriveB.setDirection(DcMotor.Direction.REVERSE);
        rightDriveF.setDirection(DcMotor.Direction.FORWARD);
        rightDriveB.setDirection(DcMotor.Direction.FORWARD);
        
        lift.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        
    }
    
    public void leftDrive(double p )
    {
        leftDriveF.setPower(p);
        leftDriveB.setPower(p);
    }
    public void rightDrive(double p)
    {
        rightDriveF.setPower(p);
        rightDriveB.setPower(p);
    }
    
    public void runWithEncoders( boolean a )
    {
        if ( a )
        {
            leftDriveF.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
            leftDriveB.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
            rightDriveF.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
            rightDriveB.setMode(DcMotor.RunMode.RUN_USING_ENCODERS);
        }
        else{
            leftDriveF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODERS);
            leftDriveB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODERS);
            rightDriveF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODERS);
            rightDriveB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODERS);
        }
        
    }
}
