package com.ironsource;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: com.ironsource.m8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4400m8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4456p8 f62356a;

    public C4400m8(C4456p8 c4456p8) {
        this.f62356a = c4456p8;
    }

    @JavascriptInterface
    public void receiveMessageFromExternal(String str) {
        this.f62356a.handleMessageFromAd(str);
    }
}
