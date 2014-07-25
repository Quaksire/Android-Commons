package com.quaksire.android.commons.hardware;

import android.hardware.Camera;

/**
 *
 * @author julio
 */
public class CameraUtil {

    public static boolean isCameraPresent() {
        int numCameras = Camera.getNumberOfCameras();
        return numCameras > 0;
    }
    
}
