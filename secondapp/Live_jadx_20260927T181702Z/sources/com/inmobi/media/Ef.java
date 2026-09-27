package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ef {
    public static final Df a(byte b10) {
        if (b10 == 1) {
            return Df.PORTRAIT;
        }
        if (b10 == 2) {
            return Df.REVERSE_PORTRAIT;
        }
        if (b10 == 3) {
            return Df.LANDSCAPE;
        }
        return b10 == 4 ? Df.REVERSE_LANDSCAPE : Df.PORTRAIT;
    }

    public static final boolean b(Df df2) {
        kotlin.jvm.internal.m0.p(df2, "<this>");
        return df2 == Df.LANDSCAPE || df2 == Df.REVERSE_LANDSCAPE;
    }

    public static final int a(Df df2) {
        kotlin.jvm.internal.m0.p(df2, "<this>");
        int iOrdinal = df2.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 90;
        }
        if (iOrdinal == 2) {
            return 180;
        }
        if (iOrdinal == 3) {
            return com.google.android.material.bottomappbar.d.f50281j;
        }
        throw new dr.o0();
    }
}
