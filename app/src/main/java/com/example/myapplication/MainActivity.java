package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editShape;
    private EditText editColor;
    private Button button;
    private TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        editShape = findViewById(R.id.editShape);
        editColor = findViewById(R.id.editColor);
        button = findViewById(R.id.button);
        information = findViewById(R.id.information);

        // Set click listener for the button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get shape type and color input from EditText fields
                String shapeType = editShape.getText().toString().trim();
                String color = editColor.getText().toString().trim();

                // Create a shape and color based on user input
                Shape shape = createShape(shapeType);
                Color shapeColor = createColor(color);

                if (shape != null && shapeColor != null) {
                    // Build the information string
                    String infoText = String.format("Name: %s\nArea: %.2f\nPerimeter: %.2f\nColor: %s",
                            shape.name, shape.area(), shape.perimeter(), shapeColor.getName());

                    // Display the information in the TextView
                    information.setText(infoText);
                } else {
                    information.setText("Invalid input");
                }
            }
        });
    }

    // Helper method to create a Shape object based on input
    private Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle("Circle", 5.0); // Example radius, replace with user input
            case "square":
                return new Square("Square", 4.0); // Example side length, replace with user input
            case "triangle":
                return new Triangle("Triangle", 3.0, 4.0, 5.0); // Example sides, replace with user input
            default:
                return null;
        }
    }

    // Helper method to create a Color object based on input
    private Color createColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return new Red();
            case "blue":
                return new Blue();
            case "green":
                return new Green();
            default:
                return null;
        }
    }
}