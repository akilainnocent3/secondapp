package yads;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f158466a = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};

    public static boolean a() {
        try {
            if (new File("/system/app/Superuser/Superuser.apk").exists()) {
                return true;
            }
        } catch (Throwable unused) {
        }
        try {
            String[] strArr = f158466a;
            boolean z10 = false;
            for (int i10 = 0; i10 < 8; i10++) {
                z10 = z10 || (Build.VERSION.SDK_INT < 31 && new File(strArr[i10]).exists());
            }
            if (z10) {
                return true;
            }
        } catch (Throwable unused2) {
        }
        return false;
    }
}
