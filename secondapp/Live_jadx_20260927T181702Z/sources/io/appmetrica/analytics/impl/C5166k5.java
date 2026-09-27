package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Arrays;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5166k5 implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy[] f97694a;

    public C5166k5(@oy.l PermissionStrategy... permissionStrategyArr) {
        this.f97694a = permissionStrategyArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final boolean forbidUsePermission(@oy.l String str) {
        for (PermissionStrategy permissionStrategy : this.f97694a) {
            if (permissionStrategy.forbidUsePermission(str)) {
                return true;
            }
        }
        return false;
    }

    @oy.l
    public final String toString() {
        return "CompositePermissionStrategy(strategies=" + Arrays.toString(this.f97694a) + ')';
    }
}
