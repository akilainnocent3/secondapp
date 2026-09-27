package com.iab.omid.library.prebidorg.adsession.media;

import com.vungle.ads.internal.Constants;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public enum zs {
    MINIMIZED("minimized"),
    COLLAPSED("collapsed"),
    NORMAL("normal"),
    EXPANDED("expanded"),
    FULLSCREEN(Constants.TEMPLATE_TYPE_FULLSCREEN);

    private final String zz;

    zs(String str) {
        this.zz = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zz;
    }
}
