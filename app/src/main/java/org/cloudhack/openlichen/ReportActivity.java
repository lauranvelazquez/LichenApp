package org.cloudhack.openlichen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReportActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
    }

    public void openCamera(View view) {
        Toast.makeText(this, "Opening camera ...", Toast.LENGTH_SHORT)
                .show();
    }

    public void sendToServer(View view) {
        Toast.makeText(this, "Contributing to the world .... :)", Toast.LENGTH_LONG)
                .show();
    }

    public void closeActivity(View view) {
        finish();
    }
}
