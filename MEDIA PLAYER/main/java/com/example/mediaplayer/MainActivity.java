package com.example.mediaplayer;

        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ImageButton;
        import android.widget.Toast;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int startTime = 0 ; // startime is 0s
    int stopTime = 0; // stoptime is 0s by default
    int forwardTime = 5000 ; // 5s for forward
    int backwardTime = 5000 ; // 5s for backwardtime
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.song1);
        Button bt1=findViewById(R.id.play);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing Song",Toast.LENGTH_LONG).show();
                mediaPlayer.start();
            }
        });
        Button bt2=findViewById(R.id.pause);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing Song",Toast.LENGTH_LONG).show();
                mediaPlayer.pause();
            }
        });
        Button forward=findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardTime) <= (stopTime =
                        mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardTime);
                }
            }
        });
        Button rewind=findViewById(R.id.rewind);
        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardTime) <= (stopTime =
                        mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardTime);
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });
    }
}