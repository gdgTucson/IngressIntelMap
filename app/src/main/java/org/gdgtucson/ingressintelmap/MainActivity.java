package org.gdgtucson.ingressintelmap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Launch a browser to open the mobile version of the Ingress Intel Map.
     */
    public void startIngressWebApp(View view) {
        Uri ingressUri = Uri.parse(getString(R.string.ingress_uri));
        Intent webIntent = new Intent(Intent.ACTION_VIEW, ingressUri);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }
}
