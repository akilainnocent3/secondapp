package defpackage;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class lmz {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
