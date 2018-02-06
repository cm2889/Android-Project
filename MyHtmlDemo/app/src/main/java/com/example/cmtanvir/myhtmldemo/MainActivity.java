package com.example.cmtanvir.myhtmldemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webView;

    String mytext= "<h1> This is Heading One </h1>\n"+
                     "<h1> This is Heading Two </h1>\n"+
            "<p> This Paragraph </p>\n"+
            "<p> <u>  This Paragraph  Under line </u> </p>\n"+
            "<p> <b> This Paragraph  Bold Text </b> </p>\n"+
            "<p>  <i> This Paragraph Italic Text <i> </p>\n"+
            "This is programming Language\n"+
            "<ol>\n"+
            "<li> C </li>\n"+
            "<li> C++ </li>\n"+
            "</ol>\n\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webviewId);
        webView.loadDataWithBaseURL(null,mytext,"text/html","utf-8",null);
    }
}
