package sg.edu.rp.c346.practicalquizp12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn;
    WebView wv;

    ArrayList<String> alWeb;
    ArrayAdapter<String> aaWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = findViewById(R.id.spinner2);
        wv = findViewById(R.id.webView);

        wv.setWebViewClient(new WebViewClient());

//        alWeb = new ArrayList<>();
//
//        aaWeb = new ArrayAdapter<String>(this,
//                android.R.layout.simple_spinner_dropdown_item, alWeb);

//        String[] strCat = getResources().getStringArray(R.array.web);
//        alWeb.addAll(Arrays.asList(strCat));

//        spn1.setAdapter(aaWeb);


        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        String url = "https://www.google.com.sg";
                        wv.loadUrl(url);
                        break;
                    case 1:
                        String url2 = "https://www.rp.edu.sg";
                        wv.loadUrl(url2);
                        break;
                }
                //aaWeb.notifyDataSetChanged();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}

