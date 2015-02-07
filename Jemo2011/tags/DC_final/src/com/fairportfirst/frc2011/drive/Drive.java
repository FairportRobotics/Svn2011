package com.fairportfirst.frc2011.drive;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 * This class includes methods to be used in order to make
 * calls that drive the robot's Jaguars and motors.
 * @author Charles
 */
public class Drive
{

    /**
     * Various objects are made here.
     */
    private RobotDrive robotDrive;
    Jaguar frontLeftMotor;
    Jaguar backLeftMotor;
    Jaguar frontRightMotor;
    Jaguar backRightMotor;

    /**
     * Constructor that sets the four Jaguar objects.
     * @param newfrontLeftMotor Represents the front left Jaguar.
     * @param newbackLeftMotor Represents the back left Jaguar.
     * @param newfrontRightMotor Represents the front right Jaguar.
     * @param newbackRightMotor Represents the back right Jaguar.
     */
    public Drive(Jaguar newfrontLeftMotor, Jaguar newbackLeftMotor, Jaguar newfrontRightMotor, Jaguar newbackRightMotor)
    {
        frontLeftMotor =newfrontLeftMotor;
        backLeftMotor = newbackLeftMotor;
        frontRightMotor = newfrontRightMotor;
        backRightMotor = newbackRightMotor;
        robotDrive = new RobotDrive(frontLeftMotor, backLeftMotor, frontRightMotor, backRightMotor);
        
    }

    /**
     * This method allows you to manually control the robot.
     * @param x The speed that the robot should drive in the X direction. [-1.0..1.0]
     * @param y The speed that the robot should drive in the Y direction.
     * @param rotation The rate of rotation for the robot that is completely independent of
     * the translation. [-1.0..1.0]
     */
    public void manualControl(double x, double y, double rotation)
    {
//        robotDrive.mecanumDrive_Polar(x, y, rotation);
        robotDrive.mecanumDrive_Cartesian(x, y, rotation, 0);
    }

    /**
     * This method makes the robot strafe in a leftward direction.
     * @param magnitude The value sent to the Jaguar to determine its speed.
     */
    public void strafeLeft(double magnitude)
    {
        robotDrive.mecanumDrive_Polar(magnitude, 270, 0);
    }

    /**
     * This method makes the robot strafe in a rightward direction.
     * @param magnitude The value sent to the Jaguar to determine its speed.
     */
    public void strafeRight(double magnitude)
    {
        robotDrive.mecanumDrive_Polar(magnitude, 90, 0);
    }

    /**
     * This method makes the robot strafe in a forward direction.
     * @param magnitude The value sent to the Jaguar to determine its speed.
     */
    public void strafeForward(double magnitude)
    {
        robotDrive.mecanumDrive_Polar(magnitude, 0, 0);
    }

    /**
     * This method makes the robot strafe in a backward direction.
     * @param magnitude The value sent to the Jaguar to determine its speed.
     */
    public void strafeBackward(double magnitude)
    {
        robotDrive.mecanumDrive_Polar(magnitude, 180, 0);
    }

    /**
     * This method makes the robot strafe towards a direction based on an angle.
     * @param magnitude The value sent to the Jaguar to determine its speed.
     * @param direction The angle of direction at which the robot strafes on.
     */
    public void strafeOnAngle(double magnitude, double direction)
    {
        robotDrive.mecanumDrive_Polar(magnitude, direction, 0);
    }

    public void strafePolar(double magnitude, double direction, double rotation)
    {
        robotDrive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    /**
     * This method sets the two front Jaguars to a value determined by 'speed'.
     * @param speed The speed set to the front Jaguars.
     */
    public void rev(double speed)
    {
        frontLeftMotor.set(speed);
        frontRightMotor.set(speed);
    }
}
