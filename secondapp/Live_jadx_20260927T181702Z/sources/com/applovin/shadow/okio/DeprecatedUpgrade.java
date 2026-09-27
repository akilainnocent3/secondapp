package com.applovin.shadow.okio;

/* JADX INFO: renamed from: com.applovin.shadow.okio.-DeprecatedUpgrade, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@cs.j(name = "-DeprecatedUpgrade")
public final class DeprecatedUpgrade {

    @oy.l
    private static final DeprecatedOkio Okio = DeprecatedOkio.INSTANCE;

    @oy.l
    private static final DeprecatedUtf8 Utf8 = DeprecatedUtf8.INSTANCE;

    @oy.l
    public static final DeprecatedOkio getOkio() {
        return Okio;
    }

    @oy.l
    public static final DeprecatedUtf8 getUtf8() {
        return Utf8;
    }
}
