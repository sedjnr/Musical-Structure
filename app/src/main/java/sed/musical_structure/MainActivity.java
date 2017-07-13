package sed.musical_structure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static sed.musical_structure.R.id.AL;
import static sed.musical_structure.R.id.AR;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Set the onClickListeners for each icon in the navigation bar
        TextView nP = (TextView) findViewById(R.id.NP);
        nP.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent NPIntent = new Intent(MainActivity.this, NowActivity.class);
                startActivity(NPIntent);
            }
        });

        TextView aR = (TextView) findViewById(AR);
        aR.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ARIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(ARIntent);
            }
        });

        TextView aL = (TextView) findViewById(AL);
        aL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ALIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(ALIntent);
            }
        });
        TextView sO = (TextView) findViewById(R.id.SO);
        sO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent SOIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(SOIntent);
            }
        });
        TextView pL = (TextView) findViewById(R.id.PL);
        pL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent PLIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(PLIntent);
            }
        });

        // Set the onClickListeners for each icon in the navigation bar
        ImageView NP = (ImageView) findViewById(R.id.NPB);
        NP.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent NPIntent = new Intent(MainActivity.this, NowActivity.class);
                startActivity(NPIntent);
            }
        });

        ImageView AL = (ImageView) findViewById(R.id.ALB);
        AL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ARIntent = new Intent(MainActivity.this, AlbumActivity.class);
                startActivity(ARIntent);
            }
        });

        ImageView AR = (ImageView) findViewById(R.id.ARB);
        AR.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ALIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(ALIntent);
            }
        });
        ImageView SO = (ImageView) findViewById(R.id.SOB);
        SO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent SOIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(SOIntent);
            }
        });
        ImageView PL = (ImageView) findViewById(R.id.PLB);
        PL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent PLIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(PLIntent);
            }
        });
    }



}
