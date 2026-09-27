package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import cs.o;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(30)
public final class SafePackageManagerHelperForR {

    @l
    public static final SafePackageManagerHelperForR INSTANCE = new SafePackageManagerHelperForR();

    private SafePackageManagerHelperForR() {
    }

    @o
    @m
    public static final String extractPackageInstaller(@l PackageManager packageManager, @l String str) {
        return packageManager.getInstallSourceInfo(str).getInstallingPackageName();
    }
}
