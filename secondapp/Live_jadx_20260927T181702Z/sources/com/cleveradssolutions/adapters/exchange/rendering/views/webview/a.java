package com.cleveradssolutions.adapters.exchange.rendering.views.webview;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends k {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f42885r = "zb";

    public a(Context context, String str, int i10, int i11, h hVar, c cVar) {
        super(context, str, i10, i11, hVar, cVar);
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.webview.l
    public void d() {
        n();
        x();
    }

    @Override // com.cleveradssolutions.adapters.exchange.rendering.views.webview.k
    public void setJSName(String str) {
        this.f42920i = str;
    }

    public void x() {
        com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.g hVar = new com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.h(getContext(), this, new com.cleveradssolutions.adapters.exchange.rendering.views.webview.mraid.j(this, new Handler(Looper.getMainLooper()), new com.cleveradssolutions.adapters.exchange.rendering.utils.helpers.d()));
        addJavascriptInterface(hVar, "jsBridge");
        com.cleveradssolutions.adapters.exchange.b.h(f42885r, "JS bridge initialized");
        setBaseJSInterface(hVar);
    }
}
