package k1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Point;
import android.graphics.PointF;
import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    @oy.l
    public static final Bitmap a(@oy.l Bitmap bitmap, @oy.l ds.l<? super Canvas, w2> lVar) {
        lVar.invoke(new Canvas(bitmap));
        return bitmap;
    }

    public static final boolean b(@oy.l Bitmap bitmap, @oy.l Point point) {
        int i10;
        int width = bitmap.getWidth();
        int i11 = point.x;
        return i11 >= 0 && i11 < width && (i10 = point.y) >= 0 && i10 < bitmap.getHeight();
    }

    public static final boolean c(@oy.l Bitmap bitmap, @oy.l PointF pointF) {
        float f10 = pointF.x;
        if (f10 < 0.0f || f10 >= bitmap.getWidth()) {
            return false;
        }
        float f11 = pointF.y;
        return f11 >= 0.0f && f11 < ((float) bitmap.getHeight());
    }

    @oy.l
    public static final Bitmap d(int i10, int i11, @oy.l Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @k.t0(26)
    @oy.l
    @SuppressLint({"ClassVerificationFailure"})
    public static final Bitmap e(int i10, int i11, @oy.l Bitmap.Config config, boolean z10, @oy.l ColorSpace colorSpace) {
        return Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
    }

    public static /* synthetic */ Bitmap f(int i10, int i11, Bitmap.Config config, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    public static /* synthetic */ Bitmap g(int i10, int i11, Bitmap.Config config, boolean z10, ColorSpace colorSpace, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        if ((i12 & 16) != 0) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return Bitmap.createBitmap(i10, i11, config, z10, colorSpace);
    }

    public static final int h(@oy.l Bitmap bitmap, int i10, int i11) {
        return bitmap.getPixel(i10, i11);
    }

    @oy.l
    public static final Bitmap i(@oy.l Bitmap bitmap, int i10, int i11, boolean z10) {
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    public static /* synthetic */ Bitmap j(Bitmap bitmap, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = true;
        }
        return Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
    }

    public static final void k(@oy.l Bitmap bitmap, int i10, int i11, @k.k int i12) {
        bitmap.setPixel(i10, i11, i12);
    }
}
