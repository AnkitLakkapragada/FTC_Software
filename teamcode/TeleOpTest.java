
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.util.Hardware;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp

public class TeleOpTest extends LinearOpMode {
    
    public HardwareRobot r = new HardwareRobot();
    
    public void runOpMode() throws InterruptedException
    {
        double drive, turn, left, right, liftUp, servoCW, servoCCW;
        
        boolean move = true;
        
        r.init(hardwareMap);
        
        int power = 1;
        waitForStart();
       
        while (opModeIsActive())
        {
            drive = -gamepad1.left_stick_y; 
            turn = gamepad1.left_stick_x;
            
            liftUp = -gamepad2.left_stick_y;
            
            servoCW = gamepad2.left_trigger;
            servoCCW = gamepad2.right_trigger;
            
            left = Range.clip(drive + turn, -1.0, 1.0);
            right = Range.clip(drive - turn, -1.0, 1.0);
            
            r.leftDrive(left);
            r.rightDrive(right);

            r.lift.setPower(liftUp);
            r.comp.setPower(liftUp);
            
            if ( move = true)
            {
                // r.servo1.setPower(1);
                // r.servo2.setPower(-1);
            }
            else{
                // r.servo1.setPower(-1);
                // r.servo2.setPower(1);
            }
            
            if ( gamepad1.a )
            {
                move = !move;
            }
            
            
        }
    }
}

