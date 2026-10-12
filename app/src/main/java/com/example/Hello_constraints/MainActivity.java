package com.example.Hello_constraints;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hello_constraits.R;

public class MainActivity extends AppCompatActivity {

    private TextView showCount;
    private View zeroButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showCount = findViewById(R.id.show_count);
        zeroButton = findViewById(R.id.button_zero);
        showCount.setText(String.valueOf(count));
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {
        count++;
        showCount.setText(String.valueOf(count));

        int color = (count % 2 == 0) ? Color.GREEN : Color.RED;
        view.setBackgroundTintList(ColorStateList.valueOf(color));

        zeroButton.setBackgroundTintList(ColorStateList.valueOf(Color.YELLOW));
    }

    public void zero(View view) {
        count = 0;
        showCount.setText(String.valueOf(count));
        view.setBackgroundTintList(ColorStateList.valueOf(Color.GRAY));
    }
}