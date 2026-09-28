package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class irr implements hrr {
    public static final irr a = new irr();

    @Override // defpackage.hrr
    public final Object a(v6l v6lVar, v1b<? super Bitmap> v1bVar) {
        long j = v6lVar.u;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (j >> 32), (int) (j & 4294967295L), Bitmap.Config.ARGB_8888);
        v6lVar.c(i40.b(new Canvas(bitmapCreateBitmap)), null);
        return bitmapCreateBitmap;
    }
}
