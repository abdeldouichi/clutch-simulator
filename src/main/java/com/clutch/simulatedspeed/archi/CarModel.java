package com.clutch.simulatedspeed.archi;

public class CarModel {

    static void gearbox(int gearPosition, double clutchPosition, double roadTorque) {

        double ratio;
        switch (gearPosition) {
            case 1:
                ratio = 0.16;
                break;
            case 2:
                ratio = 0.32;
                break;
            case 3:
                ratio = 0.64;
                break;
            case 4:
                ratio = 1.28;
                break;
            case 5:
                ratio = 2.56;
                break;
            default:
                ratio = 1;
                break;

        }

        double inputTorque = roadTorque / ratio;
        // resultant_torque=
    }

}
