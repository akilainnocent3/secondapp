package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class mzi {
    public static final boolean a;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        a = z;
    }
}
