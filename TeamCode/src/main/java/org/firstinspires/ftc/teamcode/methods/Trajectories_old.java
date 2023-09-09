package org.firstinspires.ftc.teamcode.methods;

import com.qualcomm.hardware.bosch.BNO055IMU;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.VoltageSensor;

import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.openftc.easyopencv.OpenCvWebcam;

public class Trajectories_old {
    Methods methods = new Methods();
    Methods_move move = new Methods_move();
    public DcMotor leftF, rightF, leftB, rightB, pod, drin;
    public CRServo zaxvat, pisun, big;
    public BNO055IMU imu;
    public DigitalChannel knopka;
    public Orientation angles;
    public VoltageSensor sensor;
    public double speed;
    public OpenCvWebcam phoneCam;

    //private DistanceSensor sensorRange;

    private static int valLeft = -1;
    private static int valRight = -1;
    private static float rectHeight = 0.7f / 8f;
    private static float rectWidth = 0.7f / 8f;
    private static float rectHeight1 = 0.7f / 8f;
    private static float rectWidth1 = 0.7f / 8f;

    private static float offsetX = 0f / 8f;//changing this moves the three rects and the three circles left or right, range : (-2, 2) not inclusive
    private static float offsetY = 0f / 8f;//changing this moves the three rects and circles up or down, range: (-4, 4) not inclusive

    private static float[] leftPos = {5.5f / 8f + offsetX, 4f / 8f + offsetY};
    private static float[] rightPos = {6.5f / 8f + offsetX, 4f / 8f + offsetY};

    private final int rows = 640;
    private final int cols = 480;

    public void high_sin(){
            zaxvat.setPower(0.18);
            pisun.setPower(0.25);
            move.vpered(1400, 0.4);
            methods.sleep(1000);
            move.nazad(190, 0.25);
            methods.sleep(1000);
            move.razvarot(220, 0.25);
            move.vpered(250, 0.25);
            methods.pod_castom(2600);
            move.nazad(40,0.25);
            methods.sleep(750);
            pod.setPower(0.1);
            big.setPower(-0.77);
            methods.sleep(1000);
            pisun.setPower(-0.15);
            methods.sleep(1500);
            pod.setPower(0.1);
            big.setPower(0.8);
            methods.sleep(500);
    }
    public void midlle_krasn(){
        zaxvat.setPower(0.18);
        pisun.setPower(0.25);
        move.vpered(650, 0.4);
        methods.sleep(1000);
        move.nazad(150, 0.25);
        methods.sleep(1000);
        move.razvarot(-167, 0.25);
        move.vpered(250, 0.25);
        methods.pod_castom(1750);
        move.nazad(50,0.25);
        methods.sleep(750);
        pod.setPower(0.1);
        big.setPower(-0.77);
        methods.sleep(1000);
        pisun.setPower(-0.15);
        methods.sleep(1500);
        pod.setPower(0.1);
        big.setPower(0.8);
        methods.sleep(500);
    }
    public void high_krasn(){
        zaxvat.setPower(0.18);
        pisun.setPower(0.25);
        move.vpered(1300, 0.4);
        methods.sleep(1000);
        move.nazad(100, 0.5);
        methods.sleep(1000);
        move.razvarot(-130, 0.25);
        move.vpered(150, 0.5);
        methods.pod_castom(2600);
        move.nazad(50,0.25);
        methods.sleep(750);
        pod.setPower(0.1);
        big.setPower(-0.77);
        methods.sleep(1000);
        pisun.setPower(-0.15);
        methods.sleep(1500);
        pod.setPower(0.1);
        big.setPower(0.8);
        methods.sleep(500);
    }
    public void high_krasn_V51(){
        methods.sleep(5000);
        zaxvat.setPower(0.18);
        pisun.setPower(0.25);
        move.vpered(1300, 0.4);
        methods.sleep(1000);
        move.nazad(100, 0.5);
        methods.sleep(1000);
        move.razvarot(-130, 0.25);
        move.vpered(150, 0.5);
        methods.pod_castom(2600);
        move.nazad(50,0.25);
        methods.sleep(750);
        pod.setPower(0.1);
        big.setPower(-0.77);
        methods.sleep(1000);
        pisun.setPower(-0.15);
        methods.sleep(1500);
        pod.setPower(0.1);
        big.setPower(0.8);
        methods.sleep(500);
    }
    public void high_krasn_V52(){
        zaxvat.setPower(0.18);
        pisun.setPower(0.25);
        move.vpered(1300, 0.4);
        methods.sleep(1000);
        move.nazad(100, 0.5);
        methods.sleep(1000);
        move.razvarot(-130, 0.25);
        move.vpered(150, 0.5);
        methods.pod_castom(2600);
        move.nazad(50,0.25);
        methods.sleep(750);
        pod.setPower(0.1);
        big.setPower(-0.77);
        methods.sleep(10000);
        pisun.setPower(-0.15);
        methods.sleep(1500);
        pod.setPower(0.1);
        big.setPower(0.8);
        methods.sleep(500);
    }
    public void middle_sin(){
        zaxvat.setPower(0.18);
        pisun.setPower(0.25);
        move.vpered(550, 0.4);
        methods.sleep(1000);
        move.nazad(150, 0.25);
        methods.sleep(1000);
        move.razvarot(232, 0.25);
        move.vpered(350, 0.25);
        methods.pod_castom(1700);
        move.nazad(70,0.25);
        methods.sleep(750);
        pod.setPower(0.1);
        big.setPower(-0.77);
        methods.sleep(1000);
        pisun.setPower(-0.15);
        methods.sleep(1500);
        pod.setPower(0.1);
        big.setPower(0.8);
        methods.sleep(500);
    }
    }
