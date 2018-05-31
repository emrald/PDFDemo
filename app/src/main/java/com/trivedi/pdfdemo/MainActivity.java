package com.trivedi.pdfdemo;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import com.pspdfkit.PSPDFKit;
import com.pspdfkit.document.DocumentSource;
import com.pspdfkit.document.PdfDocument;
import com.pspdfkit.document.providers.AssetDataProvider;

import java.io.File;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            PSPDFKit.initialize(MainActivity.this, "tHCmVLjjZm724h1X7Qr1EnjVH9bAkl75zPeLUC9FiYimERy6_wnwclH6U_39l8j0q9nQF5tdoMXuy0Zw2_DPCm9fSwUbOhoycXO9LxpeLiqRJl_wDpH3H0vky_mSS2UtfbEZPx3rH4T2XkfEhAjRtBLKkmbsw3mefWoqayJE80l8ic9kEkVayuTPY2ZTpnQsrEo_VSLqhvzJOYbJQnglpS4fGS-0EvlSLGmkjQMSq16ixuzp9Sbp1f6PRrVgmJUjrV0vPat2hqBSwiALuR8UPvtftbkuxtGrCErhsH9Wd_my0YdaS9y2k7TZUUCkr3fmp702yWEveRhv0PmXBmpcQ7vGDSvYq8ZGMZLIgfnTxXctiyhzsgFzE5PbfmCW0lb0W_WTKb6txt5riQixgs9F-C_GGy7xF8f2SvmMXI0FlOl27KEwFe45S049gg2mAhC");
            PdfDocument document = PdfDocument.openDocument(MainActivity.this, Uri.fromFile(new File("/path/to/document.pdf")));

// Using a custom DataProvider.
            DocumentSource assetsDataSource = new DocumentSource(new AssetDataProvider("document.pdf"));
            PdfDocument document1 = PdfDocument.openDocument(MainActivity.this, assetsDataSource);
        } catch (Exception e) {
            Log.e("LOG_TAG", "Current device is not compatible with PSPDFKit!");
        }
    }
}
