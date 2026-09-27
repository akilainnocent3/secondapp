package io.appmetrica.analytics.coreutils.internal.services;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import dr.w2;
import io.appmetrica.analytics.coreutils.impl.d;
import io.appmetrica.analytics.coreutils.impl.e;
import io.appmetrica.analytics.coreutils.impl.f;
import io.appmetrica.analytics.coreutils.impl.g;
import io.appmetrica.analytics.coreutils.impl.h;
import io.appmetrica.analytics.coreutils.impl.i;
import io.appmetrica.analytics.coreutils.impl.j;
import io.appmetrica.analytics.coreutils.impl.k;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SafePackageManager {
    private static Object a(Boolean bool, ds.a aVar) {
        try {
            Object objInvoke = aVar.invoke();
            return objInvoke == null ? bool : objInvoke;
        } catch (Throwable unused) {
        }
    }

    @m
    public final ActivityInfo getActivityInfo(@l Context context, @l ComponentName componentName, int i10) {
        return (ActivityInfo) a(null, new io.appmetrica.analytics.coreutils.impl.a(context, componentName, i10));
    }

    @m
    public final ApplicationInfo getApplicationInfo(@l Context context, @l String str, int i10) {
        return (ApplicationInfo) a(null, new io.appmetrica.analytics.coreutils.impl.b(context, str, i10));
    }

    @m
    public final Bundle getApplicationMetaData(@l Context context) {
        return (Bundle) a(null, new io.appmetrica.analytics.coreutils.impl.c(this, context));
    }

    @m
    public final String getInstallerPackageName(@l Context context, @l String str) {
        return (String) a(null, new d(context, str));
    }

    @m
    public final PackageInfo getPackageInfo(@l Context context, @l String str) {
        return getPackageInfo(context, str, 0);
    }

    @m
    public final ServiceInfo getServiceInfo(@l Context context, @l ComponentName componentName, int i10) {
        return (ServiceInfo) a(null, new f(context, componentName, i10));
    }

    public final boolean hasSystemFeature(@l Context context, @l String str) {
        return ((Boolean) a(Boolean.FALSE, new g(context, str))).booleanValue();
    }

    @m
    public final ResolveInfo resolveActivity(@l Context context, @l Intent intent, int i10) {
        return (ResolveInfo) a(null, new h(context, intent, i10));
    }

    @m
    public final ProviderInfo resolveContentProvider(@l Context context, @l String str) {
        return (ProviderInfo) a(null, new i(context, str));
    }

    @m
    public final ResolveInfo resolveService(@l Context context, @l Intent intent, int i10) {
        return (ResolveInfo) a(null, new j(context, intent, i10));
    }

    @m
    public final w2 setComponentEnabledSetting(@l Context context, @l ComponentName componentName, int i10, int i11) {
        return (w2) a(null, new k(context, componentName, i10, i11));
    }

    @m
    public final PackageInfo getPackageInfo(@l Context context, @l String str, int i10) {
        return (PackageInfo) a(null, new e(context, str, i10));
    }
}
