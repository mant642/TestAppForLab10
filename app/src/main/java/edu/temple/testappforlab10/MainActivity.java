package edu.temple.testappforlab10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Browser Tester");
        }
        android.widget.Button button = new android.widget.Button(this);
        button.setText("Click Here to open Temple's website!");
        button.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                // Original
                // startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://www.temple.edu")));
                startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse("https://www.wikipedia.org")));

                /*
                Intent sendIntent = new Intent(Intent.ACTION_VIEW, android.net.Uri.parse("https://www.wikipedia.org"));
                String title = "Open this URL with:";
                Intent chooser = Intent.createChooser(sendIntent, title);
                if (sendIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(chooser);
                }
                 */
            }
        });
        setContentView(button);
    }
}