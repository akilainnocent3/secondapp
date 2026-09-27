package com.bytedance.sdk.component.tq.hww;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class rs {
    private String hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private String f35052tq;

    private rs(String str) {
        this.hww = str;
    }

    public static rs hww(String str) {
        return new rs(str);
    }

    public String hww() {
        return this.hww;
    }

    public Charset hww(Charset charset) {
        try {
            String str = this.f35052tq;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
