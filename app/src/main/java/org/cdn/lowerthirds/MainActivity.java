package org.cdn.lowerthirds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    public void goPTZ(View view) {
        Intent intent = new Intent(this, ptz_control.class);
        startActivity(intent);
    }

    public void goSingular(View view) {
        Intent intent = new Intent(this, lower_thirds.class);
        startActivity(intent);
    }

    public void goStreamDeck(View view) {
        Intent intent = new Intent(this, stream_deck.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}