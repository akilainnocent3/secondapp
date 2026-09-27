package com.bytedance.sdk.component.hv.sd.tq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww {
    public static final ImageView.ScaleType hww = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final Bitmap.Config f34747tq = Bitmap.Config.ARGB_4444;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final int f34748hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34749hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final ImageView.ScaleType f34750ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Bitmap.Config f34752sd;
    private final int vgm;
    private int vy;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final int f34751rs = 3840;
    private final int nod = 104857600;

    public hww(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.f34752sd = config;
        this.vy = i10;
        this.f34749hv = i11;
        this.f34750ok = scaleType;
        this.f34748hu = i12;
        this.vgm = i13;
        hww(i10, i11);
    }

    public static int hww(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int hww(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (((double) i12) * (((double) i11) / ((double) i13)));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = ((double) i13) / ((double) i12);
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    public Bitmap hww(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.vy == 0 && this.f34749hv == 0) {
            options.inPreferredConfig = this.f34752sd;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iHww = hww(this.vy, this.f34749hv, i10, i11, this.f34750ok);
            int iHww2 = hww(this.f34749hv, this.vy, i11, i10, this.f34750ok);
            options.inJustDecodeBounds = false;
            options.inSampleSize = hww(i10, i11, iHww, iHww2, this.f34748hu, this.vgm);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iHww || bitmapDecodeByteArray.getHeight() > iHww2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iHww, iHww2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void hww(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.vy = 3840;
                this.f34749hv = (i11 * 3840) / i10;
                return;
            } else {
                this.vy = (i10 * 3840) / i11;
                this.f34749hv = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.vy = 3840;
            this.f34749hv = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.vy = (i10 * 3840) / i11;
            this.f34749hv = 3840;
        }
    }
}
