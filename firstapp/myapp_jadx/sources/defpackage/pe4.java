package defpackage;

import android.graphics.ImageDecoder;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pe4 {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source a(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static String b(int i, String str, String str2) {
        return str + i + str2;
    }

    public static /* synthetic */ void c(int i, int i2) {
        throw new IllegalArgumentException("Length too large: " + i + i2);
    }
}
