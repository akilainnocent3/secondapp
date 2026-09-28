package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class e8n {
    public static final /* synthetic */ int a = 0;

    public static t70 a(int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        ws50 ws50Var = x68.e;
        Bitmap.Config configB = w70.b(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = tl0.a(i, i2, i3, ws50Var);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB);
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new t70(bitmapCreateBitmap);
    }
}
