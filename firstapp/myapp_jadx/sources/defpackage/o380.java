package defpackage;

import android.os.Build;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class o380 {
    public static final SecureRandom a() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            instanceStrong.getClass();
            return instanceStrong;
        } catch (Exception unused) {
            return new SecureRandom();
        }
    }
}
