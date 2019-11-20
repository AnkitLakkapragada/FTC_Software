package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class Go extends LinearOpMode {
    
    HardwareRobot r = new HardwareRobot();

    public void runOpMode() throws InterruptedException {
        
        r.init(hardwareMap);
        waitForStart();
        while(true){
            r.leftDrive(10);
            r.rightDrive(10);
        }
    }
}
