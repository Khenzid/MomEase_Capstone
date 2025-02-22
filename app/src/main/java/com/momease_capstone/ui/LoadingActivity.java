package com.momease_capstone.ui.loading;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.momease_capstone.MainActivity;
import com.momease_capstone.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading_page);

        findViewById(R.id.get_started_button).setOnClickListener(v -> {
            Intent intent = new Intent(LoadingActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Closes the loading screen so it doesn't stay in the back stack
        });
    }
}
