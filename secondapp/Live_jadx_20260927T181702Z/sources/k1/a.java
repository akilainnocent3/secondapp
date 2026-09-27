package k1;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: k1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(27)
    public static class C0959a {
        @k.t
        public static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config configA = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                configA = c.a(bitmap);
            }
            return bitmap.copy(configA, true);
        }

        @k.t
        public static Bitmap b(int i10, int i11, Bitmap bitmap, boolean z10) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z10 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = c.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i10, i11, config, bitmap.hasAlpha(), colorSpace);
        }

        @k.t
        public static boolean c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class b {
        @k.t
        public static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(31)
    public static class c {
        @k.t
        public static Bitmap.Config a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    @NonNull
    public static Bitmap a(@NonNull Bitmap bitmap, int i10, int i11, @Nullable Rect rect, boolean z10) {
        Bitmap bitmapCreateBitmap;
        int i12;
        int i13;
        boolean z11;
        char c10;
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("dstW and dstH must be > 0!");
        }
        if (rect != null && (rect.isEmpty() || rect.left < 0 || rect.right > bitmap.getWidth() || rect.top < 0 || rect.bottom > bitmap.getHeight())) {
            throw new IllegalArgumentException("srcRect must be contained by srcBm!");
        }
        int i14 = Build.VERSION.SDK_INT;
        Bitmap bitmapA = i14 >= 27 ? C0959a.a(bitmap) : bitmap;
        int iWidth = rect != null ? rect.width() : bitmap.getWidth();
        int iHeight = rect != null ? rect.height() : bitmap.getHeight();
        float f10 = i10 / iWidth;
        float f11 = i11 / iHeight;
        int i15 = rect != null ? rect.left : 0;
        int i16 = rect != null ? rect.top : 0;
        if (i15 == 0 && i16 == 0 && i10 == bitmap.getWidth() && i11 == bitmap.getHeight()) {
            return (bitmap.isMutable() && bitmap == bitmapA) ? bitmap.copy(bitmap.getConfig(), true) : bitmapA;
        }
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        if (i14 >= 29) {
            b.a(paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        if (iWidth == i10 && iHeight == i11) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i10, i11, bitmapA.getConfig());
            new Canvas(bitmapCreateBitmap2).drawBitmap(bitmapA, -i15, -i16, paint);
            return bitmapCreateBitmap2;
        }
        double dLog = Math.log(2.0d);
        int iCeil = (int) (f10 > 1.0f ? Math.ceil(Math.log(f10) / dLog) : Math.floor(Math.log(f10) / dLog));
        int iCeil2 = (int) (f11 > 1065353216 ? Math.ceil(Math.log(f11) / dLog) : Math.floor(Math.log(f11) / dLog));
        if (!z10 || i14 < 27 || C0959a.c(bitmap)) {
            bitmapCreateBitmap = null;
            i12 = i15;
            i13 = 0;
        } else {
            Bitmap bitmapB = C0959a.b(iCeil > 0 ? e(iWidth, i10, 1, iCeil) : iWidth, iCeil2 > 0 ? e(iHeight, i11, 1, iCeil2) : iHeight, bitmap, true);
            new Canvas(bitmapB).drawBitmap(bitmapA, -i15, -i16, paint);
            Bitmap bitmap2 = bitmapA;
            bitmapA = bitmapB;
            bitmapCreateBitmap = bitmap2;
            i13 = 1;
            i16 = 0;
            i12 = 0;
        }
        Rect rect2 = new Rect(i12, i16, iWidth, iHeight);
        Rect rect3 = new Rect();
        int i17 = iCeil;
        int i18 = iCeil2;
        while (true) {
            if (i17 == 0 && i18 == 0) {
                break;
            }
            if (i17 < 0) {
                i17++;
            } else if (i17 > 0) {
                i17--;
            }
            if (i18 < 0) {
                i18++;
            } else if (i18 > 0) {
                i18--;
            }
            int i19 = i18;
            int i20 = i13;
            int i21 = i17;
            rect3.set(0, 0, e(iWidth, i10, i17, iCeil), e(iHeight, i11, i19, iCeil2));
            boolean z12 = i21 == 0 && i19 == 0;
            boolean z13 = bitmapCreateBitmap != null && bitmapCreateBitmap.getWidth() == i10 && bitmapCreateBitmap.getHeight() == i11;
            if (bitmapCreateBitmap == null || bitmapCreateBitmap == bitmap) {
                z11 = z12;
            } else {
                if (z10) {
                    z11 = z12;
                    if (Build.VERSION.SDK_INT < 27 || C0959a.c(bitmapCreateBitmap)) {
                    }
                    new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect2, rect3, paint);
                    rect2.set(rect3);
                    Bitmap bitmap3 = bitmapA;
                    bitmapA = bitmapCreateBitmap;
                    bitmapCreateBitmap = bitmap3;
                    i18 = i19;
                    i13 = i20;
                    i17 = i21;
                } else {
                    z11 = z12;
                }
                if (!z11 || (z13 && i20 == 0)) {
                    c10 = 27;
                }
                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect2, rect3, paint);
                rect2.set(rect3);
                Bitmap bitmap4 = bitmapA;
                bitmapA = bitmapCreateBitmap;
                bitmapCreateBitmap = bitmap4;
                i18 = i19;
                i13 = i20;
                i17 = i21;
            }
            if (bitmapCreateBitmap != bitmap && bitmapCreateBitmap != null) {
                bitmapCreateBitmap.recycle();
            }
            int iE = e(iWidth, i10, i21 > 0 ? i20 : i21, iCeil);
            int iE2 = e(iHeight, i11, i19 > 0 ? i20 : i19, iCeil2);
            c10 = 27;
            if (Build.VERSION.SDK_INT >= 27) {
                bitmapCreateBitmap = C0959a.b(iE, iE2, bitmap, z10 && !z11);
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(iE, iE2, bitmapA.getConfig());
            }
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapA, rect2, rect3, paint);
            rect2.set(rect3);
            Bitmap bitmap5 = bitmapA;
            bitmapA = bitmapCreateBitmap;
            bitmapCreateBitmap = bitmap5;
            i18 = i19;
            i13 = i20;
            i17 = i21;
        }
        if (bitmapCreateBitmap != bitmap && bitmapCreateBitmap != null) {
            bitmapCreateBitmap.recycle();
        }
        return bitmapA;
    }

    public static int b(@NonNull Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    public static boolean c(@NonNull Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    public static void d(@NonNull Bitmap bitmap, boolean z10) {
        bitmap.setHasMipMap(z10);
    }

    @h1
    public static int e(int i10, int i11, int i12, int i13) {
        if (i12 == 0) {
            return i11;
        }
        return i12 > 0 ? i10 * (1 << (i13 - i12)) : i11 << ((-i12) - 1);
    }
}
