package com.example.scriptureguide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends Activity {
    private ScriptureGuide scripture = new ScriptureGuide();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGetScripture(View view){
        TextView scriptures= (TextView) findViewById(R.id.scripture);
        Spinner circumstance= (Spinner) findViewById(R.id.circumstance);

        String hurdle = String.valueOf(circumstance.getSelectedItem());

        List<String> scriptureList = scripture.getScriptures(hurdle);
        StringBuilder scriptureFormatted = new StringBuilder();

        for(String script: scriptureList){
            scriptureFormatted.append(script).append('\n');
        }

        scriptures.setText(scriptureFormatted);

    }
}
