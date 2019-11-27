package sdu.cs.teerapat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    String getusername;
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getusername = getIntent().getStringExtra("Name");
        textView1 = findViewById(R.id.textView2);
        textView1.setText("ยินดีต้อนรับ "+getusername);
    }
}
