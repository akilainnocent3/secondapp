package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class nth extends xe4 {
    public static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(nlp.a);

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.xe4
    public final Bitmap c(ue4 ue4Var, Bitmap bitmap, int i, int i2) {
        return qsg0.b(ue4Var, bitmap, i, i2);
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        return obj instanceof nth;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return 1572326941;
    }
}
