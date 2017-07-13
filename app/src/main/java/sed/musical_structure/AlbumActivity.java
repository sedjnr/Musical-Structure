package sed.musical_structure;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by Sed on 30/05/2017.
 */

public class AlbumActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_album);

        // Set the onClickListeners for each icon in the navigation bar
        ImageView NP = (ImageView) findViewById(R.id.NPB);
        NP.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent NPIntent = new Intent(AlbumActivity.this, NowActivity.class);
                startActivity(NPIntent);
            }
        });

        ImageView AR = (ImageView) findViewById(R.id.ARB);
        AR.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ARIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(ARIntent);
            }
        });

        ImageView AL = (ImageView) findViewById(R.id.MAB);
        AL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ALIntent = new Intent(AlbumActivity.this, MainActivity.class);
                startActivity(ALIntent);
            }
        });
        ImageView SO = (ImageView) findViewById(R.id.SOB);
        SO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent SOIntent = new Intent(AlbumActivity.this, SongsActivity.class);
                startActivity(SOIntent);
            }
        });
        ImageView PL = (ImageView) findViewById(R.id.PLB);
        PL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent PLIntent = new Intent(AlbumActivity.this, PaymentActivity.class);
                startActivity(PLIntent);
            }
        });
    }
}
