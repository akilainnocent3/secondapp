package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Qi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f96396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f96397b;

    public Qi(Context context, SafePackageManager safePackageManager) {
        this.f96396a = context;
        this.f96397b = safePackageManager;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f96397b;
        Context context = this.f96396a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo != null) {
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    String str = strArr[i10];
                    if (iArr == null || iArr.length <= i10 || (iArr[i10] & 2) == 0) {
                        arrayList.add(new PermissionState(str, false));
                    } else {
                        arrayList.add(new PermissionState(str, true));
                    }
                }
            }
        }
        return arrayList;
    }
}
