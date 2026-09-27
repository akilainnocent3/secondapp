package com.iab.omid.library.startio.attestation;

import aa.y;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public class g {
    public static boolean a(WebView webView) {
        if (!y.a("WEB_MESSAGE_LISTENER")) {
            return false;
        }
        try {
            if (!c.a(com.iab.omid.library.startio.internal.g.b().a()).b()) {
                return false;
            }
            f.a(webView);
            return true;
        } catch (Exception e10) {
            com.iab.omid.library.startio.utils.d.a("Error during initialization of AttestationMessageListener", e10);
            return false;
        }
    }
}
