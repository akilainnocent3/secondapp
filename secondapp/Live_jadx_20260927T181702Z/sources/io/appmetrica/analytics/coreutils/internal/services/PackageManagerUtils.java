package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import cs.o;
import fk.n0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class PackageManagerUtils {

    @l
    public static final PackageManagerUtils INSTANCE = new PackageManagerUtils();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SafePackageManager f95344a = new SafePackageManager();

    private PackageManagerUtils() {
    }

    @o
    public static final int getAppVersionCodeInt(@l Context context) {
        PackageInfo packageInfo = getPackageInfo(context);
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @l
    @o
    public static final String getAppVersionCodeString(@l Context context) {
        return String.valueOf(getAppVersionCodeInt(context));
    }

    @l
    @o
    public static final String getAppVersionName(@l Context context) {
        String str;
        PackageInfo packageInfo = getPackageInfo(context);
        return (packageInfo == null || (str = packageInfo.versionName) == null) ? n0.f84864h : str;
    }

    @o
    @m
    public static final PackageInfo getPackageInfo(@l Context context) {
        return f95344a.getPackageInfo(context, context.getPackageName());
    }

    @o
    @m
    public static final ServiceInfo getServiceInfo(@l Context context, @l Class<?> cls) {
        return f95344a.getServiceInfo(context, new ComponentName(context, cls), 4);
    }

    @o
    public static final boolean hasContentProvider(@l Context context, @l String str) {
        return resolveContentProvider(context, str) != null;
    }

    @o
    @m
    public static final ProviderInfo resolveContentProvider(@l Context context, @l String str) {
        return f95344a.resolveContentProvider(context, str);
    }
}
