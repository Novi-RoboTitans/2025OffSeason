package org.firstinspires.ftc.teamcode.sergei;

import com.acmerobotics.roadrunner.trajectory.Trajectory;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.robot.RobotStyles;

@Autonomous(name="Move Forward", group="Auton")
public class MinMoveForwardAuto extends LinearOpMode {
  @Override
  public void runOpMode() throws InterruptedException {
    RobotStyles robot = new RobotStyles(this);
    robot.initialize();

    waitForStart();

    Trajectory trajectory = robot.trajectoryBuilder(robot.getPoseEstimate())
        .forward(10)
        .build();
    robot.followTrajectory(trajectory);
  }
}
