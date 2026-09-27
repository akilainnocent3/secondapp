package com.iab.omid.library.prebidorg.adsession;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum zu {
    HTML("html"),
    NATIVE("native"),
    JAVASCRIPT("javascript");

    private final String zz;

    zu(String str) {
        this.zz = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zz;
    }
}
