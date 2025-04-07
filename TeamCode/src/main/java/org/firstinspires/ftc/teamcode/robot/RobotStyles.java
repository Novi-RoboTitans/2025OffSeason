package org.firstinspires.ftc.teamcode.robot;

import android.util.Log;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;

public class RobotStyles extends SampleMecanumDrive {
  public static final String TAG = "RobotStyles";

  public RobotStyles(@NonNull LinearOpMode op) {
    super(op.hardwareMap);
  }

  public void initialize() {
    Log.d(TAG, "Initializing RobotStyles");
  }
}
