package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;

/* JADX INFO: loaded from: classes2.dex */
public final class awa {
    public static final String a(float f) {
        if (f < 1.0f) {
            return "small";
        }
        if (f == 1.0f) {
            return CaxEybC.SJzFHwoWVUG;
        }
        if (f <= 1.15f) {
            return "large";
        }
        return f <= 1.3f ? "extra_large" : "huge";
    }
}
