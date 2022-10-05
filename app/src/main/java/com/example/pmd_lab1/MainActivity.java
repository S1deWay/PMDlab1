package com.example.pmd_lab1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *
     * @param a integer number
     * @param b integer number
     * @return Minimum between a and b
     */

    public static int Min(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b;
    }

    /**
     *
     * @param a integer number
     * @param b integer number
     * @return Maximum between a and b
     */

    public static int Max(int a, int b)
    {
        if (a < b)
            return b;
        else
            return a;
    }
}