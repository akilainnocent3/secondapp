package com.appsflyer.internal;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AFLogger;
import defpackage.gek0;
import defpackage.gf80;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1vSDK implements AFj1ySDK {
    private static ProviderInfo A_(Context context) {
        try {
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final boolean AFAdRevenueData(Context context) {
        context.getClass();
        return A_(context) != null;
    }

    @Override // com.appsflyer.internal.AFj1ySDK
    public final boolean getMonetizationNetwork(Context context) {
        context.getClass();
        ProviderInfo providerInfoA_ = A_(context);
        if (providerInfoA_ == null) {
            return false;
        }
        try {
            gf80 gf80Var = new gf80(context);
            String str = ((PackageItemInfo) providerInfoA_).packageName;
            if (TextUtils.isEmpty(str)) {
                gek0.b.a("ServiceVerifyKit", "error input packageName");
            } else {
                gf80Var.b = str;
            }
            if (TextUtils.isEmpty("com.huawei.appgallery.sign_certchain")) {
                gek0.b.a("ServiceVerifyKit", "error input certChainKey");
            }
            if (TextUtils.isEmpty("com.huawei.appgallery.fingerprint_signature")) {
                gek0.b.a("ServiceVerifyKit", "error input certSignerKey");
            }
            gf80Var.a("FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212");
            gf80Var.a("3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F");
            return gf80Var.b();
        } catch (Throwable th) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
            return false;
        }
    }
}
