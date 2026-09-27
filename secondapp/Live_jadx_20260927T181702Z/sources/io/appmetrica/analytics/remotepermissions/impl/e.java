package io.appmetrica.analytics.remotepermissions.impl;

import fr.y1;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import java.util.Set;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class e implements PermissionStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f99007a = y1.k();

    public final synchronized void a(@l Set<String> set) {
        this.f99007a = set;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy
    public final synchronized boolean forbidUsePermission(@l String str) {
        return !this.f99007a.contains(str);
    }
}
