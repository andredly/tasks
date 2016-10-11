package com.cherniauski.trening.task4;

import com.cherniauski.trening.task3.*;
import com.cherniauski.trening.task3.BeginnerSet;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Andre on 10.10.2016.
 */
public class BeginnerSetSorted {
        public static final TreeMap<Stationery, Integer> SORTED_BEGINER_SET=new TreeMap<>();

        static {
                SORTED_BEGINER_SET.put(new AutomaticBallPen("Automatic Pen \"Joy\"", 1.3), 1);
                SORTED_BEGINER_SET.put(new Eraser("Eraser \"KE 30\"", 0.5), 1);
                SORTED_BEGINER_SET.put(new Marker("Marker \"Maxiflo\"", 1.8), 1);
                SORTED_BEGINER_SET.put(new Notebook("Notebook А5 \"Виннер/Наппа\"", 2.3), 1);
                SORTED_BEGINER_SET.put(new PaperTray("Paper Tray \"Loop\"", 3.3), 1);
                SORTED_BEGINER_SET.put(new Pencil("Pencil \"Festival\"", 0.2), 1);
                SORTED_BEGINER_SET.put(new Stapler("Stapler \"PRO 210\"", 5.1), 1);
                SORTED_BEGINER_SET.put(new Sticker("Stickers \"Q-connect\"", 0.35), 1);
        }
}
