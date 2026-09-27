package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class vc {
    public static void a(Context context, WebView webView, wc wcVar) {
        if (wcVar == null) {
            wcVar = new wc(context);
        }
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.CALENDAR", Boolean.valueOf(wcVar.f75793b.contains("calendar") && p0.a(wcVar.f75792a, "android.permission.WRITE_CALENDAR")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.INLINEVIDEO", Boolean.valueOf(wcVar.f75793b.contains("inlineVideo")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.SMS", Boolean.valueOf(wcVar.f75793b.contains("sms") && p0.a(wcVar.f75792a, "android.permission.SEND_SMS")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.STOREPICTURE", Boolean.valueOf(wcVar.f75793b.contains("storePicture")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.TEL", Boolean.valueOf(wcVar.f75793b.contains("tel") && p0.a(wcVar.f75792a, "android.permission.CALL_PHONE")));
    }
}
