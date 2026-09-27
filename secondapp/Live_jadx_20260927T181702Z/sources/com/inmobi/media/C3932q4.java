package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3932q4 extends AbstractC3907p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f57404b;

    public C3932q4(int i10, Config config) {
        kotlin.jvm.internal.m0.p(config, "config");
        this.f57403a = i10;
        this.f57404b = config;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3932q4)) {
            return false;
        }
        C3932q4 c3932q4 = (C3932q4) obj;
        return this.f57403a == c3932q4.f57403a && kotlin.jvm.internal.m0.g(this.f57404b, c3932q4.f57404b);
    }

    public final int hashCode() {
        return this.f57404b.hashCode() + (this.f57403a * 31);
    }

    public final String toString() {
        return "ConfigSuccess(statusCode=" + this.f57403a + ", config=" + this.f57404b + gi.j.f86771d;
    }
}
