package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class gv6 extends xe4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(nlp.a);

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.xe4
    public final Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2) {
        float width;
        float fA;
        Paint paint = qsg0.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float fA2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            fA2 = vs50.a(bitmap.getWidth(), width, i, 0.5f);
            fA = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            fA = vs50.a(bitmap.getHeight(), width, i2, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (fA2 + 0.5f), (int) (fA + 0.5f));
        Bitmap bitmapE = ue4Var.e(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        qsg0.a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        return obj instanceof gv6;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return -599754482;
    }
}
