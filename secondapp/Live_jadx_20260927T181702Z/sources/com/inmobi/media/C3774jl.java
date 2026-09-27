package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.jl, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3774jl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f56756b;

    public C3774jl(int i10, Config config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f56755a = i10;
        this.f56756b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3774jl)) {
            return false;
        }
        C3774jl c3774jl = (C3774jl) obj;
        return this.f56755a == c3774jl.f56755a && kotlin.jvm.internal.m0.g(this.f56756b, c3774jl.f56756b);
    }

    public final int hashCode() {
        return this.f56756b.hashCode() + (this.f56755a * 31);
    }

    public final String toString() {
        return "ValidatedConfigResponseModel(configResponseCode=" + this.f56755a + ", config=" + this.f56756b + gi.j.f86771d;
    }
}
