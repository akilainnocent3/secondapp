package com.bytedance.sdk.component.hv.vy.sd.tq;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class tq {
    public static final ImageView.ScaleType hww = ImageView.ScaleType.CENTER_INSIDE;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    public static final Bitmap.Config f34833tq = Bitmap.Config.ARGB_4444;

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private final int f34834hu;

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private int f34835hv;

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    private final ImageView.ScaleType f34836ok;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private final Bitmap.Config f34838sd;
    private final int vgm;
    private int vy;

    /* JADX INFO: renamed from: rs, reason: collision with root package name */
    private final int f34837rs = 1280;
    private final int nod = 83886080;

    public tq(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.f34838sd = config;
        this.vy = i10;
        this.f34835hv = i11;
        this.f34836ok = scaleType;
        this.f34834hu = i12;
        this.vgm = i13;
        hww(i10, i11);
    }

    private static int hww(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0) {
            return i12;
        }
        if (i10 == 0) {
            return (int) (((double) i12) * (((double) i11) / ((double) i13)));
        }
        if (i11 == 0) {
            return i10;
        }
        double d10 = ((double) i13) / ((double) i12);
        double d11 = i11;
        return ((double) i10) * d10 > d11 ? (int) (d11 / d10) : i10;
    }

    public static int hww(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(((double) i10) / ((double) i12), ((double) i11) / ((double) i13));
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(i10, i11)) / ((double) Math.max(i14, i15)), ((double) Math.min(i10, i11)) / ((double) Math.min(i14, i15))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public Bitmap hww(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.vy == 0 && this.f34835hv == 0) {
            options.inPreferredConfig = this.f34838sd;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iHww = hww(this.vy, this.f34835hv, i10, i11);
            int iHww2 = hww(this.f34835hv, this.vy, i11, i10);
            options.inJustDecodeBounds = false;
            options.inSampleSize = hww(i10, i11, iHww, iHww2, this.f34834hu, this.vgm);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iHww || bitmapDecodeByteArray.getHeight() > iHww2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iHww, iHww2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
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
        if (i10 > 1280 && i11 > 1280) {
            if (i10 > i11) {
                this.vy = 1280;
                this.f34835hv = (i11 * 1280) / i10;
                return;
            } else {
                this.vy = (i10 * 1280) / i11;
                this.f34835hv = 1280;
                return;
            }
        }
        if (i10 > 1280) {
            this.vy = 1280;
            this.f34835hv = (i11 * 1280) / i10;
        } else if (i11 > 1280) {
            this.vy = (i10 * 1280) / i11;
            this.f34835hv = 1280;
        }
    }
}
