package io.appmetrica.analytics.idsync.internal.model;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Preconditions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NetworkType f95529a;

    public Preconditions(@l NetworkType networkType) {
        this.f95529a = networkType;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(Preconditions.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f95529a == ((Preconditions) obj).f95529a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.idsync.internal.model.Preconditions");
    }

    @l
    public final NetworkType getNetworkType() {
        return this.f95529a;
    }

    public int hashCode() {
        return this.f95529a.hashCode();
    }

    @l
    public String toString() {
        return "Preconditions(networkType=" + this.f95529a + ')';
    }
}
