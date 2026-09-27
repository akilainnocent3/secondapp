package io.appmetrica.analytics.idsync.internal.model;

import f0.p;
import g8.a;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class IdSyncConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f95525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f95526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f95527c;

    public IdSyncConfig(boolean z10, long j10, @l List<RequestConfig> list) {
        this.f95525a = z10;
        this.f95526b = j10;
        this.f95527c = list;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(IdSyncConfig.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.IdSyncConfig");
        }
        IdSyncConfig idSyncConfig = (IdSyncConfig) obj;
        return this.f95525a == idSyncConfig.f95525a && this.f95526b == idSyncConfig.f95526b && m0.g(this.f95527c, idSyncConfig.f95527c);
    }

    public final boolean getEnabled() {
        return this.f95525a;
    }

    public final long getLaunchDelay() {
        return this.f95526b;
    }

    @l
    public final List<RequestConfig> getRequests() {
        return this.f95527c;
    }

    public int hashCode() {
        return this.f95527c.hashCode() + ((p.a(this.f95526b) + (a.a(this.f95525a) * 31)) * 31);
    }

    @l
    public String toString() {
        return "IdSyncConfig(enabled=" + this.f95525a + ", launchDelay=" + this.f95526b + ", requests=" + this.f95527c + ')';
    }
}
