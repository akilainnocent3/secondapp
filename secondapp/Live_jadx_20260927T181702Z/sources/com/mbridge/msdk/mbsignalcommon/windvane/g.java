package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f68247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f68248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f68249c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f68247a = context;
        this.f68249c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f68248b = obj;
        this.f68249c = windVaneWebView;
    }
}
