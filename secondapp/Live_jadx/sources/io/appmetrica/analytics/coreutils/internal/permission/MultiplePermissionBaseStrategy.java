package io.appmetrica.analytics.coreutils.internal.permission;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class MultiplePermissionBaseStrategy implements PermissionResolutionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PermissionExtractor f95328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f95329b;

    public MultiplePermissionBaseStrategy(@l PermissionExtractor permissionExtractor, @l List<String> list) {
        this.f95328a = permissionExtractor;
        this.f95329b = list;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy
    public boolean hasNecessaryPermissions(@l Context context) {
        return this.f95329b.isEmpty() || hasNecessaryPermissions(context, this.f95328a, this.f95329b);
    }

    public abstract boolean hasNecessaryPermissions(@l Context context, @l PermissionExtractor permissionExtractor, @l List<String> list);
}
