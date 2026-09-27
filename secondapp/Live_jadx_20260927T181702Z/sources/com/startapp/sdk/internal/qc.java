package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class qc {
    public static void a(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        si.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(ii.b(context, i10)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        si.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(ii.b(context, i10)), Integer.valueOf(Math.round(i11 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i12 / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(i13 / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        si.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }
}
