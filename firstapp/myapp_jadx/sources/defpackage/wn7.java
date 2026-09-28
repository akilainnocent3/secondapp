package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class wn7 extends xe4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(nlp.a);

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.xe4
    public final Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qsg0.a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapC = qsg0.c(ue4Var, bitmap);
        Bitmap bitmapE = ue4Var.e(iMin, iMin, qsg0.d(bitmap));
        bitmapE.setHasAlpha(true);
        Lock lock = qsg0.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f2, f2, f2, qsg0.b);
            canvas.drawBitmap(bitmapC, (Rect) null, rectF, qsg0.c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapC.equals(bitmap)) {
                ue4Var.d(bitmapC);
            }
            return bitmapE;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        return obj instanceof wn7;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return 1101716364;
    }
}
