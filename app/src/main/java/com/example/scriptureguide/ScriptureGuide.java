package com.example.scriptureguide;

import java.util.ArrayList;
import java.util.List;

public class ScriptureGuide {
    List<String> getScriptures(String hurdle) {
        List<String> scriptures = new ArrayList<>();
        if(hurdle.equals("Sorrow/Grief")){
            scriptures.add("2 Corinthians 1:3-4");
            scriptures.add("Psalms 23");
        } else if(hurdle.equals("Stress")){
            scriptures.add("Psalms 27:5");
            scriptures.add("Psalms 30:5");
        } else if(hurdle.equals("Suicide")){
            scriptures.add("Psalms 143:7-11");
            scriptures.add("Psalms 23");
        } else if(hurdle.equals("Temptation")){
            scriptures.add("1 Corinthias 10:12");
            scriptures.add("1 Timothy 6:11");
        } else if(hurdle.equals("Trouble")){
            scriptures.add("Psalm 20:1,2");
            scriptures.add("Psalm 23");
        }
        return scriptures;
    }
}
