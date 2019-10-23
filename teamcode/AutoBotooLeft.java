package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class AutoBotooLeft extends LinearOpMode {

    HardwareRobot r = new HardwareRobot();

    public void runOpMode() throws InterruptedException {
        
        r.init(hardwareMap);
        waitForStart();
        
            r.leftDrive(-1);
            r.rightDrive(-1);
            Thread.sleep(400);
            
            r.leftDrive(-1);
            r.rightDrive(1);
            Thread.sleep(500);
            
            r.leftDrive(-1);
            r.rightDrive(-1);
            Thread.sleep(1500);
        
    }
}