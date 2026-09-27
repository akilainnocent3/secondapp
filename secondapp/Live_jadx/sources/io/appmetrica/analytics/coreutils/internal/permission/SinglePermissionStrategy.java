package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class SinglePermissionStrategy implements PermissionResolutionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f95330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f95331b;

    public SinglePermissionStrategy(@l PermissionExtractor permissionExtractor, @l String str) {
        this.f95330a = permissionExtractor;
        this.f95331b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(@l Context context) {
        return this.f95330a.hasPermission(context, this.f95331b);
    }
}
