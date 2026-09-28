package com.sportybet.plugin.webcontainer.jsbridge;

import android.webkit.WebView;
import defpackage.tx5;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class LDJSCallbackContext {
    private static final String LOG_TAG = "LDJSCallbackContext";
    private String callbackId;
    public WebView webView;

    public LDJSCallbackContext(String str, WebView webView) {
        this.callbackId = str;
        this.webView = webView;
    }

    private void webViewSendPluginResult(LDJSPluginResult lDJSPluginResult, String str) {
        try {
            if (lDJSPluginResult.getStatus() == 0 || lDJSPluginResult.getStatus() == 1) {
                String message = lDJSPluginResult.getMessage();
                String strA = (!str.matches("[\\d]+") || Integer.parseInt(str) <= 0) ? tx5.a("javascript:window.", str, "('", message, "')") : tx5.a("javascript:mapp.execGlobalCallback(", str, ",'", message, "')");
                WebView webView = this.webView;
                if (webView != null) {
                    webView.loadUrl(strA);
                    return;
                }
                return;
            }
            WebView webView2 = this.webView;
            if (webView2 != null) {
                webView2.loadUrl("javascript:alert('" + lDJSPluginResult.getMessage() + "')");
            }
        } catch (Exception unused) {
        }
    }

    public void error(JSONObject jSONObject) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.ERROR, jSONObject));
    }

    public String getUrl() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView.getUrl();
        }
        return null;
    }

    public void sendPluginResult(LDJSPluginResult lDJSPluginResult) {
        webViewSendPluginResult(lDJSPluginResult, this.callbackId);
    }

    public void success(JSONObject jSONObject) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK, jSONObject));
    }

    public void error(String str) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.ERROR, str));
    }

    public void success(String str) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK, str));
    }

    public void error(int i) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.ERROR, i));
    }

    public void success(JSONArray jSONArray) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK, jSONArray));
    }

    public void success(byte[] bArr) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK, bArr));
    }

    public void success(int i) {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK, i));
    }

    public void success() {
        sendPluginResult(new LDJSPluginResult(LDJSPluginResult.Status.OK));
    }
}
