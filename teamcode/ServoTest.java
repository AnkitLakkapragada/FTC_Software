package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class ServoTest extends OpMode {
    
    public HardwareRobot robot = new HardwareRobot();
    
    public void init()
    {
        robot.init(hardwareMap);
    }
    
    public void loop()
    {
        // robot.servo1.setPosition(1);
    }
    
}

