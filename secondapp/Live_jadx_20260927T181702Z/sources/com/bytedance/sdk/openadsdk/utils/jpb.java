package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bumptech.glide.manager.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class jpb {
    public static void hww() {
        Context contextHww = com.bytedance.sdk.openadsdk.core.bs.hww();
        if (contextHww != null && com.bytedance.sdk.component.utils.weu.vy()) {
            String packageName = contextHww.getPackageName();
            int i10 = contextHww.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = contextHww.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr == null || strArr.length <= 0) {
                    return;
                }
                List<String> listTq = tq();
                for (String str : strArr) {
                    if (str != null) {
                        listTq.remove(str);
                    }
                }
                if (listTq.isEmpty()) {
                    return;
                }
                for (String str2 : listTq) {
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static List<String> tq() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add(e.f31484b);
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
