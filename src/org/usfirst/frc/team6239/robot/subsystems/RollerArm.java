package org.usfirst.frc.team6239.robot.subsystems;

import org.usfirst.frc.team6239.robot.Robot;

import edu.wpi.first.wpilibj.command.Subsystem;

public class RollerArm extends Subsystem{

	
	
	public void spinForward(){
		
		Robot.robotmap.RollerArmController.set(1);
	}
	
	public void spinBackward(){
		
		 Robot.robotmap.RollerArmController.set(-1);
	}
	
	
	
	
	
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		///setDefaultCommand();
		
	}
	
	
	
	
	

}
