package com.startapp.sdk.internal;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74763a;

    public ei(String code) {
        kotlin.jvm.internal.m0.p(code, "code");
        this.f74763a = code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.m0.g(ei.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.m0.n(obj, "null cannot be cast to non-null type com.startapp.sdk.eventtracer.Traceable");
        return kotlin.jvm.internal.m0.g(this.f74763a, ((ei) obj).f74763a);
    }

    public final int hashCode() {
        return this.f74763a.hashCode();
    }
}
