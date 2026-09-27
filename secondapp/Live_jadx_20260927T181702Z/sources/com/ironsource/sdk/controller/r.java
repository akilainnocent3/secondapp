package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private s f63906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63907b = false;

    public r(s sVar) {
        this.f63906a = sVar;
    }

    @JavascriptInterface
    public String getTokenForMessaging() {
        if (this.f63907b) {
            return "";
        }
        this.f63907b = true;
        return this.f63906a.b();
    }
}
