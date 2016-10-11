package com.cherniauski.trening.task3;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andre on 10.10.2016.
 */
public class BeginnerSet {
    public static final Map<Stationery,Integer> BEGINNER_SET=new HashMap<>();
    static {
        BEGINNER_SET.put(new AutomaticBallPen("Automatic Pen \"Joy\"", 1.3), 1);
        BEGINNER_SET.put(new Eraser("Eraser \"KE 30\"", 0.5), 1);
        BEGINNER_SET.put(new Marker("Marker \"Maxiflo\"", 1.8), 1);
        BEGINNER_SET.put(new Notebook("Notebook А5 \"Виннер/Наппа\"", 2.3), 1);
        BEGINNER_SET.put(new PaperTray("Paper Tray \"Loop\"", 3.3), 1);
        BEGINNER_SET.put(new Pencil("Pencil \"Festival\"", 0.2), 1);
        BEGINNER_SET.put(new Stapler("Stapler \"PRO 210\"", 5.1), 1);
        BEGINNER_SET.put(new Sticker("Stickers \"Q-connect\"", 0.35), 1);
    }

}
