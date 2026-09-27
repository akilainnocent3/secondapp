package com.startapp.sdk.internal;

import android.content.pm.PackageManager;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ue {
    public static boolean a(String str) {
        String[] strArr = ve.f75704c;
        boolean z10 = false;
        for (int i10 = 0; i10 < 14; i10++) {
            if (new File(strArr[i10], str).exists()) {
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean a(PackageManager packageManager, String[] strArr) {
        boolean z10 = false;
        for (String str : strArr) {
            try {
                packageManager.getPackageInfo(str, 0);
                z10 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z10;
    }
}
