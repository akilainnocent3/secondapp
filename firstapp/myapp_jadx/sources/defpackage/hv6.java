package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class hv6 extends xe4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(nlp.a);

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.xe4
    public final Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2) {
        Paint paint = qsg0.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return qsg0.b(ue4Var, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        return obj instanceof hv6;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return -670243078;
    }
}
