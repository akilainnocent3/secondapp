package io.appmetrica.analytics.coreutils.internal.services;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(33)
public final class PackageManagerUtilsTiramisu {

    @l
    public static final PackageManagerUtilsTiramisu INSTANCE = new PackageManagerUtilsTiramisu();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    private static final String f95345a = "[PackageManagerUtilsTiramisu]";

    private PackageManagerUtilsTiramisu() {
    }

    @m
    public final ProviderInfo resolveContentProvider(@l PackageManager packageManager, @l String str) {
        try {
            return packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(8L));
        } catch (Throwable unused) {
            return null;
        }
    }
}
