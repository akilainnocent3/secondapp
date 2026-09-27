package com.applovin.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f26829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26830d;

    public e(String str, String str2) {
        this(str, str2, null, false);
    }

    public String a() {
        return this.f26828b;
    }

    public Map b() {
        return this.f26829c;
    }

    public String c() {
        return this.f26827a;
    }

    public boolean d() {
        return this.f26830d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f26827a + "', backupUrl='" + this.f26828b + "', headers='" + this.f26829c + "', shouldFireInWebView='" + this.f26830d + '\'' + fw.b.f85383j;
    }

    public e(String str, String str2, Map map, boolean z10) {
        this.f26827a = str;
        this.f26828b = str2;
        this.f26829c = map;
        this.f26830d = z10;
    }
}
