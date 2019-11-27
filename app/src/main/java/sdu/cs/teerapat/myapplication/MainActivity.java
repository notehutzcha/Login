package sdu.cs.teerapat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;
    String username, password, z;
    int x, y;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username = editText1.getText().toString();
                password = editText2.getText().toString();
                x = username.length();
                y = password.length();
                z = "1234";
                if (x == 0 || y == 0) {
                    Toast.makeText(getApplicationContext(), "กรุณากรอกข้อมูลให้ครบทุกช่อง", Toast.LENGTH_SHORT).show();
                } else {
                    if(password.equals(z))
                    {
                        Intent startIntent = new Intent(MainActivity.this,LoginActivity.class);
                        startIntent.putExtra("Name",username);
                        startActivity(startIntent);
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"password ไม่ถูกต้อง",Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });
    }
}
