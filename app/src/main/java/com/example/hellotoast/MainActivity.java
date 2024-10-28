package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonToast; // Button to show message
    private Button buttonCount; // Button to decrement count
    private TextView textCount; // TextView to show the current count
    private int count = 1; // Start count at 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToast = findViewById(R.id.button_toast); // Reference to the Toast button
        buttonCount = findViewById(R.id.button_count); // Reference to the count button
        textCount = findViewById(R.id.show_count); // Reference to the TextView for count display

        // Set the initial count in the TextView
        textCount.setText(String.valueOf(count));

        // Button listener for showing the completion message on the Toast button
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    buttonToast.setText("Process Completed!"); // Change button text when count is 0
                }
            }
        });

        // Button listener for decrementing the count
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count > 0) {
                    count--; // Decrement count
                    textCount.setText(String.valueOf(count)); // Update the TextView with the new count
                }

                // If count reaches 0, update the Toast button text
                if (count == 0) {
                    buttonToast.setText("Process Completed!");
                }
            }
        });
    }
}
