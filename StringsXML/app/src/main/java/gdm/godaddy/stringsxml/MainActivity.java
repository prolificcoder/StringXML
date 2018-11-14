package gdm.godaddy.stringsxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String string_One = getString(R.string.one_string);
                Toast.makeText(v.getContext(), getString(R.string.eight_string0), Toast.LENGTH_LONG).show();
            }
        });
    }
}
