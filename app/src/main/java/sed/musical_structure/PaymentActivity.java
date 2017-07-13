package sed.musical_structure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Sed on 08/07/2017.
 */

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_payment);

        // Set the onClickListeners for each icon in the navigation bar
        ImageView NP = (ImageView) findViewById(R.id.NPB);
        NP.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent NPIntent = new Intent(PaymentActivity.this, NowActivity.class);
                startActivity(NPIntent);
            }
        });

        ImageView AR = (ImageView) findViewById(R.id.ARB);
        AR.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ARIntent = new Intent(PaymentActivity.this, ArtistActivity.class);
                startActivity(ARIntent);
            }
        });

        ImageView AL = (ImageView) findViewById(R.id.MAB);
        AL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent ALIntent = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(ALIntent);
            }
        });
        ImageView SO = (ImageView) findViewById(R.id.SOB);
        SO.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent SOIntent = new Intent(PaymentActivity.this, SongsActivity.class);
                startActivity(SOIntent);
            }
        });
        ImageView PL = (ImageView) findViewById(R.id.ALB);
        PL.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view) {
                Intent PLIntent = new Intent(PaymentActivity.this, AlbumActivity.class);
                startActivity(PLIntent);
            }
        });
    }
}