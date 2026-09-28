package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class sjg0 {
    public static sws.a a(oyg oygVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = oygVar.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (oygVar.b(i2, jElapsedRealtime)) {
                i++;
            }
        }
        return new sws.a(length, i);
    }
}
