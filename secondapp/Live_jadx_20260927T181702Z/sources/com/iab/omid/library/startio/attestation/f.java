package com.iab.omid.library.startio.attestation;

import android.webkit.WebView;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class f implements com.iab.omid.library.startio.messagelistener.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.startio.messagelistener.a f53835a;

    private f(WebView webView) {
        com.iab.omid.library.startio.messagelistener.a aVar = new com.iab.omid.library.startio.messagelistener.a(webView, this);
        this.f53835a = aVar;
        aVar.a();
    }

    public static f a(WebView webView) {
        return new f(webView);
    }

    @Override // com.iab.omid.library.startio.messagelistener.b
    public String getListenerName() {
        return "omidJsAttestationListener";
    }

    @Override // com.iab.omid.library.startio.messagelistener.b
    public void onMessageReceived(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            a(jSONObject);
            return;
        }
        com.iab.omid.library.startio.utils.d.b("Unexpected method in AttestationMessageListener: " + str);
    }

    @Override // com.iab.omid.library.startio.messagelistener.b
    public void onWebMessageListenerUnsupported() {
        com.iab.omid.library.startio.utils.d.b("The Attestation Webview Listener cannot be supported in this WebView version.");
    }

    private void a(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("mechanism");
            String string2 = jSONObject.getString("version");
            Map mapB = com.iab.omid.library.startio.utils.c.b(jSONObject.getJSONObject("attestationArgs"));
            mapB.put("version", string2);
            e.a(com.iab.omid.library.startio.internal.g.b().a().getApplicationContext(), string, new a(mapB));
        } catch (Exception e10) {
            com.iab.omid.library.startio.utils.d.a("Error processing attestation request", e10);
        }
    }
}
