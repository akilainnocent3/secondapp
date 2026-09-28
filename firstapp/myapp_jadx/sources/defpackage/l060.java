package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public final class l060 extends xe4 {
    public static final byte[] c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(nlp.a);
    public final int b;

    public l060(int i) {
        gm20.a("roundingRadius must be greater than 0.", i > 0);
        this.b = i;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.xe4
    public final Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qsg0.a;
        int i3 = this.b;
        gm20.a("roundingRadius must be greater than 0.", i3 > 0);
        Bitmap.Config configD = qsg0.d(bitmap);
        Bitmap bitmapC = qsg0.c(ue4Var, bitmap);
        Bitmap bitmapE = ue4Var.e(bitmapC.getWidth(), bitmapC.getHeight(), configD);
        bitmapE.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapC, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapE.getWidth(), bitmapE.getHeight());
        Lock lock = qsg0.d;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof l060) && this.b == ((l060) obj).b;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return erh0.g(-569625254, erh0.g(this.b, 17));
    }
}
