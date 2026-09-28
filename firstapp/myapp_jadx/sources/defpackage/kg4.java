package defpackage;

import android.graphics.BlurMaskFilter;

/* JADX INFO: loaded from: classes.dex */
public final class kg4 {
    public static void a(zqz zqzVar, int i, BlurMaskFilter blurMaskFilter, int i2) {
        long j = j58.b;
        if ((i2 & 2) != 0) {
            i = 3;
        }
        if ((i2 & 4) != 0) {
            blurMaskFilter = null;
        }
        int i3 = (i2 & 8) != 0 ? 0 : 1;
        zqzVar.m(j);
        zqzVar.c(i);
        zqzVar.h(i3);
        zqzVar.e().setMaskFilter(blurMaskFilter);
    }
}
