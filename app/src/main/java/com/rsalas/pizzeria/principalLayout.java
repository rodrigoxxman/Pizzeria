package com.rsalas.pizzeria;

        import android.content.Intent;
        import android.net.Uri;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.MediaController;
        import android.widget.VideoView;
        import android.app.Activity;
        import android.view.View.OnClickListener;

public class principalLayout extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal_layout);

        videoView = (VideoView) findViewById(R.id.videoview);
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.pizza));
        videoView.start();

        Button button = (Button)findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(principalLayout.this, FormActivity.class);
                startActivity(i);
            }
        });
    }
}

