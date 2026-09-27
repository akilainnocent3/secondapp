package com.fyber.inneractive.sdk.model.vast;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public enum s {
    streaming("streaming"),
    progressive("progressive");

    String mValue;

    s(String str) {
        this.mValue = str;
    }

    public final String a() {
        return this.mValue;
    }
}
