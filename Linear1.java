
public class Linear1 LinearOpMode {
    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor frontLeft;
    DcMotor frontRight;
    //ColorSensor color1;
    //DistanceSensor distance1;
    //BNO055IMU imu;

@Override
    public void runOpMode() {
      motorLeft = hardwareMap.get(DcMotor.class, "motorLeft");
      motorRight = hardwareMap.get(DcMotor.class, "motorRight");
      frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
      frontRight = hardwareMap.get(DcMotor.class, "frontRight");
     
      motorLeft.setDirection(DcMotor.Direction.REVERSE);
      waitForStart();
      //while (opModeIsActive()){
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(600);

         
          frontLeft.setPower(-0.7);
          frontRight.setPower(-0.7);
          motorLeft.setPower(-0.7);
          motorRight.setPower(-0.7);
          sleep(500);
         
          
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(-0.7);
          motorRight.setPower(0.7);
          sleep(600);
         //STARTS MOVING DOWN THE EDGE
          
          frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(2000);
         
      //REACHES THE END WALL
          
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(600);
         
       //TURNS
          
          frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(600);
        
        //DRIVES DOWN THE END WALL 
         
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(600);
         
         //TURNS
          
          frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(2000);
          
          //DRIVES DOWN THE OTHER SIDE WALL
          
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0.7);
          motorRight.setPower(-0.7);
          sleep(600);
          
          //TURNS
          
          frontLeft.setPower(0.7);
          frontRight.setPower(0.7);
          motorLeft.setPower(0.7);
          motorRight.setPower(0.7);
          sleep(600);
          
          //DRIVES DOWN THE OTHER END
         
          frontLeft.setPower(0);
          frontRight.setPower(0);
          motorLeft.setPower(0);
          motorRight.setPower(0);
          
          
          
      //}
    }
}
