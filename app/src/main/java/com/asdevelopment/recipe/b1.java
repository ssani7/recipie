package com.asdevelopment.recipe;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;


public class b1 extends AppCompatActivity {

    WebView textView;
    private AdView adView;
    InterstitialAd interstitialAd = null;

    protected void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.recipie);

        adView = findViewById(R.id.adView);
        MobileAds.initialize(getApplicationContext(), getString(R.string.banner_ad));
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd= new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen));
        interstitialAd.loadAd(adRequest);


        WebView webView = (WebView) findViewById(R.id.webView);
        this.textView = webView;
        webView.setBackgroundColor(getResources().getColor(R.color.dark));
        this.textView.getSettings().setLoadsImagesAutomatically(true);
        this.textView.getSettings().setDomStorageEnabled(true);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
            showRecipe(bundle.getString("name"));
    }

    private void showRecipe(String paramString) {
        if (paramString.equals("b1")) {
            String str = getString(R.string.b1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #1");
        }
        if (paramString.equals("b2")) {
            String str = getString(R.string.b2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #2");
        }
        if (paramString.equals("b3")) {
            String str = getString(R.string.b3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #3");
        }
        if (paramString.equals("b4")) {
            String str = getString(R.string.b4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #4");
        }
        if (paramString.equals("b5")) {
            String str = getString(R.string.b5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #5");
        }
        if (paramString.equals("b6")) {
            String str = getString(R.string.b6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #6");
        }
        if (paramString.equals("b7")) {
            String str = getString(R.string.b7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #7");
        }
        if (paramString.equals("b8")) {
            String str = getString(R.string.b8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #8");
        }
        if (paramString.equals("b9")) {
            String str = getString(R.string.b9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #9");
        }
        if (paramString.equals("b10")) {
            String str = getString(R.string.b10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #10");
        }

        if (paramString.equals("b11")) {
            String str = getString(R.string.b11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #11");
        }
        if (paramString.equals("b12")) {
            String str = getString(R.string.b12);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #12");
        }
        if (paramString.equals("b13")) {
            String str = getString(R.string.b13);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #13");
        }
        if (paramString.equals("b14")) {
            String str = getString(R.string.b14);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #14");
        }
        if (paramString.equals("b15")) {
            String str = getString(R.string.b15);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Burger #15");
        }

        //cf
        if (paramString.equals("cf1")) {
            String str = getString(R.string.cf1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #1");
        }
        if (paramString.equals("cf2")) {
            String str = getString(R.string.cf2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #2");
        }
        if (paramString.equals("cf3")) {
            String str = getString(R.string.cf3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #3");
        }
        if (paramString.equals("cf4")) {
            String str = getString(R.string.cf4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #4");
        }
        if (paramString.equals("cf5")) {
            String str = getString(R.string.cf5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #5");
        }
        if (paramString.equals("cf6")) {
            String str = getString(R.string.cf6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #6");
        }
        if (paramString.equals("cf7")) {
            String str = getString(R.string.cf7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #7");
        }
        if (paramString.equals("cf8")) {
            String str = getString(R.string.cf8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #8");
        }
        if (paramString.equals("cf9")) {
            String str = getString(R.string.cf9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #9");
        }
        if (paramString.equals("cf10")) {
            String str = getString(R.string.cf10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Chicken Fry #10");
        }

        //fr
        if (paramString.equals("fr1")) {
            String str = getString(R.string.fr1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #1");
        }
        if (paramString.equals("fr2")) {
            String str = getString(R.string.fr2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #2");
        }
        if (paramString.equals("fr3")) {
            String str = getString(R.string.fr3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #3");
        }
        if (paramString.equals("fr4")) {
            String str = getString(R.string.fr4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #4");
        }
        if (paramString.equals("fr5")) {
            String str = getString(R.string.fr5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #5");
        }
        if (paramString.equals("fr6")) {
            String str = getString(R.string.fr6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #6");
        }
        if (paramString.equals("fr7")) {
            String str = getString(R.string.fr7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #7");
        }
        if (paramString.equals("fr8")) {
            String str = getString(R.string.fr8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #8");
        }
        if (paramString.equals("fr9")) {
            String str = getString(R.string.fr9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #9");
        }
        if (paramString.equals("fr10")) {
            String str = getString(R.string.fr10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #10");
        }
        if (paramString.equals("fr11")) {
            String str = getString(R.string.fr11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fried Rice #11");
        }

        //fries
        if (paramString.equals("f1")) {
            String str = getString(R.string.f1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #1");
        }
        if (paramString.equals("f2")) {
            String str = getString(R.string.f2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #2");
        }
        if (paramString.equals("f3")) {
            String str = getString(R.string.f3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #3");
        }
        if (paramString.equals("f4")) {
            String str = getString(R.string.f4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #4");
        }
        if (paramString.equals("f5")) {
            String str = getString(R.string.f5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #5");
        }
        if (paramString.equals("f6")) {
            String str = getString(R.string.f6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #6");
        }
        if (paramString.equals("f7")) {
            String str = getString(R.string.f7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #7");
        }
        if (paramString.equals("f8")) {
            String str = getString(R.string.f8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #8");
        }
        if (paramString.equals("f9")) {
            String str = getString(R.string.f9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #9");
        }
        if (paramString.equals("f10")) {
            String str = getString(R.string.f10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #10");
        }
        if (paramString.equals("f11")) {
            String str = getString(R.string.f11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Fries #11");
        }

        //pasta
        if (paramString.equals("ps1")) {
            String str = getString(R.string.ps1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #1");
        }
        if (paramString.equals("ps2")) {
            String str = getString(R.string.ps2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #2");
        }
        if (paramString.equals("ps3")) {
            String str = getString(R.string.ps3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #3");
        }
        if (paramString.equals("ps4")) {
            String str = getString(R.string.ps4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #4");
        }
        if (paramString.equals("ps5")) {
            String str = getString(R.string.ps5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #5");
        }
        if (paramString.equals("ps6")) {
            String str = getString(R.string.ps6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #6");
        }
        if (paramString.equals("ps7")) {
            String str = getString(R.string.ps7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #7");
        }
        if (paramString.equals("ps8")) {
            String str = getString(R.string.ps8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #8");
        }
        if (paramString.equals("ps9")) {
            String str = getString(R.string.ps9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #9");
        }
        if (paramString.equals("ps10")) {
            String str = getString(R.string.ps10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #10");
        }

        if (paramString.equals("ps11")) {
            String str = getString(R.string.ps11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #11");
        }
        if (paramString.equals("ps12")) {
            String str = getString(R.string.ps12);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #12");
        }
        if (paramString.equals("ps13")) {
            String str = getString(R.string.ps13);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #13");
        }
        if (paramString.equals("ps14")) {
            String str = getString(R.string.ps14);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #14");
        }
        if (paramString.equals("ps15")) {
            String str = getString(R.string.ps15);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pasta #15");
        }

        //pizza
        if (paramString.equals("pz1")) {
            String str = getString(R.string.pz1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #1");
        }
        if (paramString.equals("pz2")) {
            String str = getString(R.string.pz2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #2");
        }
        if (paramString.equals("pz3")) {
            String str = getString(R.string.pz3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #3");
        }
        if (paramString.equals("pz4")) {
            String str = getString(R.string.pz4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #4");
        }
        if (paramString.equals("pz5")) {
            String str = getString(R.string.pz5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #5");
        }
        if (paramString.equals("pz6")) {
            String str = getString(R.string.pz6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #6");
        }
        if (paramString.equals("pz7")) {
            String str = getString(R.string.pz7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #7");
        }
        if (paramString.equals("pz8")) {
            String str = getString(R.string.pz8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #8");
        }
        if (paramString.equals("pz9")) {
            String str = getString(R.string.pz9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #9");
        }
        if (paramString.equals("pz10")) {
            String str = getString(R.string.pz10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #10");
        }

        if (paramString.equals("pz11")) {
            String str = getString(R.string.pz11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #11");
        }
        if (paramString.equals("pz12")) {
            String str = getString(R.string.pz12);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #12");
        }
        if (paramString.equals("pz13")) {
            String str = getString(R.string.pz13);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #13");
        }
        if (paramString.equals("pz14")) {
            String str = getString(R.string.pz14);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #14");
        }
        if (paramString.equals("pz15")) {
            String str = getString(R.string.pz15);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Pizza #15");
        }

        //sandwich
        if (paramString.equals("sn1")) {
            String str = getString(R.string.sn1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #1");
        }
        if (paramString.equals("sn2")) {
            String str = getString(R.string.sn2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #2");
        }
        if (paramString.equals("sn3")) {
            String str = getString(R.string.sn3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #3");
        }
        if (paramString.equals("sn4")) {
            String str = getString(R.string.sn4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #4");
        }
        if (paramString.equals("sn5")) {
            String str = getString(R.string.sn5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #5");
        }
        if (paramString.equals("sn6")) {
            String str = getString(R.string.sn6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #6");
        }
        if (paramString.equals("sn7")) {
            String str = getString(R.string.sn7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #7");
        }
        if (paramString.equals("sn8")) {
            String str = getString(R.string.sn8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #8");
        }
        if (paramString.equals("sn9")) {
            String str = getString(R.string.sn9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #9");
        }
        if (paramString.equals("sn10")) {
            String str = getString(R.string.sn10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #10");
        }

        if (paramString.equals("sn11")) {
            String str = getString(R.string.sn11);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sandwich #11");
        }

        //tacos

        if (paramString.equals("t1")) {
            String str = getString(R.string.t1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #1");
        }
        if (paramString.equals("t2")) {
            String str = getString(R.string.t2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #2");
        }
        if (paramString.equals("t3")) {
            String str = getString(R.string.t3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #3");
        }
        if (paramString.equals("t4")) {
            String str = getString(R.string.t4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #4");
        }
        if (paramString.equals("t5")) {
            String str = getString(R.string.t5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #5");
        }
        if (paramString.equals("t6")) {
            String str = getString(R.string.t6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #6");
        }
        if (paramString.equals("t7")) {
            String str = getString(R.string.t7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #7");
        }
        if (paramString.equals("t8")) {
            String str = getString(R.string.t8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #8");
        }
        if (paramString.equals("t9")) {
            String str = getString(R.string.t9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #9");
        }
        if (paramString.equals("t10")) {
            String str = getString(R.string.t10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Tacos #10");
        }

        //shawarma
        if (paramString.equals("sh1")) {
            String str = getString(R.string.sh1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #1");
        }
        if (paramString.equals("sh2")) {
            String str = getString(R.string.sh2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #2");
        }
        if (paramString.equals("sh3")) {
            String str = getString(R.string.sh3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #3");
        }
        if (paramString.equals("sh4")) {
            String str = getString(R.string.sh4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #4");
        }
        if (paramString.equals("sh5")) {
            String str = getString(R.string.sh5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #5");
        }
        if (paramString.equals("sh6")) {
            String str = getString(R.string.sh6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #6");
        }
        if (paramString.equals("sh7")) {
            String str = getString(R.string.sh7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #7");
        }
        if (paramString.equals("sh8")) {
            String str = getString(R.string.sh8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #8");
        }
        if (paramString.equals("sh9")) {
            String str = getString(R.string.sh9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #9");
        }
        if (paramString.equals("sh10")) {
            String str = getString(R.string.sh10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Shawarma #10");
        }

        //subway
        if (paramString.equals("sub1")) {
            String str = getString(R.string.sub1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #1");
        }
        if (paramString.equals("sub2")) {
            String str = getString(R.string.sub2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #2");
        }
        if (paramString.equals("sub3")) {
            String str = getString(R.string.sub3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #3");
        }
        if (paramString.equals("sub4")) {
            String str = getString(R.string.sub4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #4");
        }
        if (paramString.equals("sub5")) {
            String str = getString(R.string.sub5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #5");
        }
        if (paramString.equals("sub6")) {
            String str = getString(R.string.sub6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #6");
        }
        if (paramString.equals("sub7")) {
            String str = getString(R.string.sub7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #7");
        }
        if (paramString.equals("sub8")) {
            String str = getString(R.string.sub8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #8");
        }
        if (paramString.equals("sub9")) {
            String str = getString(R.string.sub9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #9");
        }
        if (paramString.equals("sub10")) {
            String str = getString(R.string.sub10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Sub Sandwich #10");
        }

        //nachos
        if (paramString.equals("nc1")) {
            String str = getString(R.string.nc1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #1");
        }
        if (paramString.equals("nc2")) {
            String str = getString(R.string.nc2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #2");
        }
        if (paramString.equals("nc3")) {
            String str = getString(R.string.nc3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #3");
        }
        if (paramString.equals("nc4")) {
            String str = getString(R.string.nc4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #4");
        }
        if (paramString.equals("nc5")) {
            String str = getString(R.string.nc5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #5");
        }
        if (paramString.equals("nc6")) {
            String str = getString(R.string.nc6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #6");
        }
        if (paramString.equals("nc7")) {
            String str = getString(R.string.nc7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #7");
        }
        if (paramString.equals("nc8")) {
            String str = getString(R.string.nc8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #8");
        }
        if (paramString.equals("nc9")) {
            String str = getString(R.string.nc9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #9");
        }
        if (paramString.equals("nc10")) {
            String str = getString(R.string.nc10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Nachos #10");
        }
        //drinks
        if (paramString.equals("dr1")) {
            String str = getString(R.string.dr1);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #1");
        }
        if (paramString.equals("dr2")) {
            String str = getString(R.string.dr2);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #2");
        }
        if (paramString.equals("dr3")) {
            String str = getString(R.string.dr3);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #3");
        }
        if (paramString.equals("dr4")) {
            String str = getString(R.string.dr4);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #4");
        }
        if (paramString.equals("dr5")) {
            String str = getString(R.string.dr5);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #5");
        }
        if (paramString.equals("dr6")) {
            String str = getString(R.string.dr6);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #6");
        }
        if (paramString.equals("dr7")) {
            String str = getString(R.string.dr7);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #7");
        }
        if (paramString.equals("dr8")) {
            String str = getString(R.string.dr8);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #8");
        }
        if (paramString.equals("dr9")) {
            String str = getString(R.string.dr9);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #9");
        }
        if (paramString.equals("dr10")) {
            String str = getString(R.string.dr10);
            textView.loadDataWithBaseURL(null, str, "text/html", "utf-8", null);
            setTitle("Drinks #10");
        }




    }

    @Override
    public void onBackPressed() {
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
            interstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        } else {
            super.onBackPressed();
        }
    }
}
