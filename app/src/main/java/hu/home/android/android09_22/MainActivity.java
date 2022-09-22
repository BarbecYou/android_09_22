package hu.home.android.android09_22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText beirEditText;
    private Button gomb1;
    private Button gomb2;
    private Button gomb3;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init(){
        beirEditText = findViewById(R.id.beirEditText);

        gomb1 = findViewById(R.id.gomb1);
        gomb2 = findViewById(R.id.gomb2);
        gomb3 = findViewById(R.id.gomb3);

        resultTextView = findViewById(R.id.resultTextView);

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(beirEditText.getText().toString().toUpperCase());
            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(beirEditText.getText().toString().toUpperCase());
            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(beirEditText.getText().toString().toUpperCase());
            }
        });
    }
}