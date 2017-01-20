package dev.flash.houseapp;

import dev.flash.houseapp.Display.DisplayManager;
import org.lwjgl.opengl.Display;

/**
 * Created by Flash on 19/01/2017.
 */

public class Launcher {
    public static void main(String[] args) {
        DisplayManager.createDisplay();
        while (! Display.isCloseRequested()) {
            Display.setTitle(Float.toString(1000 / DisplayManager.getFrameTimeMillis()));

            ////UPDATE////


            ////RENDER////


            //Push to Screen
            DisplayManager.updateDisplay();
        }

        DisplayManager.closeDisplay();
    }
}
