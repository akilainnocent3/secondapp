package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f98899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98900b;

    public d(NetworkTask networkTask) {
        this.f98899a = networkTask;
        this.f98900b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f98900b.equals(((d) obj).f98900b);
    }

    public final int hashCode() {
        return this.f98900b.hashCode();
    }
}
