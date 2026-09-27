package io.appmetrica.analytics.coreutils.internal.system;

import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class RootChecker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f95367a = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class RootStatus {
        public static final int NOT_ROOT = 0;
        public static final int ROOT = 1;
    }

    public static int isRootedPhone() {
        return (isSuperuserApkExists() || isSuperuserNativeLibExists()) ? 1 : 0;
    }

    public static boolean isSuperuserApkExists() {
        try {
            return new File("/system/app/Superuser/Superuser.apk").exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isSuperuserNativeLibExists() {
        String[] strArr = f95367a;
        for (int i10 = 0; i10 < 8; i10++) {
            String str = strArr[i10];
            try {
                if (AndroidUtils.isApiAchieved(31)) {
                    continue;
                } else {
                    if (new File(str + "su").exists()) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
