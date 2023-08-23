package belgrays.android_app.sipnsavor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import belgrays.android_app.sipnsavor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}