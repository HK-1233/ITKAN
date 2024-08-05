


public class ReverseSquare-FTCSIM extends LinearOpMode {
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
      
        //moving along 3 sides
        for(int i=0; i<3; i++){
          frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(1650);
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(630);
        }
        //turning and moving a shorter distance to the yellow circle
        frontLeft.setPower(0);
        frontRight.setPower(0);
        motorLeft.setPower(0.7);
        motorRight.setPower(-0.7);
        sleep(60);
        frontLeft.setPower(0.7);
        frontRight.setPower(0.7);
        motorLeft.setPower(0.7);
        motorRight.setPower(0.7);
        sleep(800);
        //stopping to see the code clearly
        frontLeft.setPower(0);
        frontRight.setPower(0);
        motorLeft.setPower(0);
        motorRight.setPower(0);
        sleep(2000);
        //moving the short distance backwards to the wall and turning
        frontLeft.setPower(-0.7);
        frontRight.setPower(-0.7);
        motorLeft.setPower(-0.7);
        motorRight.setPower(-0.7);
        sleep(800);
        frontLeft.setPower(0);
        frontRight.setPower(0);
        motorLeft.setPower(-0.7);
        motorRight.setPower(0.7);
        sleep(660);
        //moving backwards along the 3 sides perfectly but turns at the end  
        for(int i=0; i<4; i++){
          frontLeft.setPower(-0.7);
          frontRight.setPower(-0.7);
          motorLeft.setPower(-0.7);
          motorRight.setPower(-0.7);
          sleep(1650);
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(-0.7);
          motorRight.setPower(0.7);
          sleep(620);
        }
        
        //stops completely
        frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0);
          motorRight.setPower(0);
        idle();
        
     
    }
    
}

