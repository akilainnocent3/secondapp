package defpackage;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public final class mmz {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
