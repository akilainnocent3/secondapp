package com.yandex.div.evaluable.function;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ColorFunctionsKt {
    public static final double toColorFloatComponentValue(int i10) throws IllegalArgumentException {
        if (i10 < 0 || i10 >= 256) {
            throw new IllegalArgumentException("Value out of channel range 0..255");
        }
        return ((double) i10) / ((double) 255.0f);
    }

    public static final int toColorIntComponentValue(double d10) throws IllegalArgumentException {
        if (d10 < 0.0d || d10 > 1.0d) {
            throw new IllegalArgumentException();
        }
        return (int) ((d10 * ((double) 255.0f)) + ((double) 0.5f));
    }
}
