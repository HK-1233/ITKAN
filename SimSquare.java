
/***********************************************************************
*                                                                      *
* OnbotJava Editor is still : beta! Please inform us of any bugs       |
* on our discord channel! https://discord.gg/e7nVjMM                   *
* Only BLOCKS code is submitted when in Arena                          *
*                                                                      *
***********************************************************************/


public class SimSquare.java extends LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    ColorSensor color1;
    DistanceSensor distance1;
    BNO055IMU imu;

@Override
    public void runOpMode() {
      motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
      motorRight = hardwareMap.get(DcMotor.class, "motorRight");
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
      color1 = hardwareMap.get(ColorSensor.class, "color1");
      //distance1 = hardwareMap.get(DistanceSensor.class, "distance1");
      //imu = hardwareMap.get(BNO055IMU.class, "imu");
      
      motorLeft.setDirection(DcMotor.Direction.REVERSE);
      waitForStart();
      // Put run blocks here
      
        
        for(int i=0; i<4; i++){
        frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(1700);
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(620);
        }
        frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0);
          motorRight.setPower(0);
        idle();
        
     
    }
    
}

