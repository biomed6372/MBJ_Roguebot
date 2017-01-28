package org.usfirst.frc.team6239.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6239.robot.Robot;


public class TeleopDriveCommand extends Command {

	public TeleopDriveCommand(){
		requires(Robot.DRIVE_SUB);
		
	}
	
		protected void initialize() {
		
	}

protected void execute() {
	
double LeftJoystickspeed = Robot.oi.gamepad.getRawAxis(0);
double RightJoystickspeed = Robot.oi.gamepad.getRawAxis(1);

Robot.DRIVE_SUB.DriveRobot(LeftJoystickspeed,RightJoystickspeed);

  }

protected boolean isFinished() {
	return false;
}

protected void end() {
}

protected void interrupted() {
	}
}


