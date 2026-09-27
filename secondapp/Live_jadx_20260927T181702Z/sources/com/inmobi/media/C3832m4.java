package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.m4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3832m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Config f56988b;

    public C3832m4(String url, Config availableConfig) {
        kotlin.jvm.internal.m0.p(url, "url");
        kotlin.jvm.internal.m0.p(availableConfig, "availableConfig");
        this.f56987a = url;
        this.f56988b = availableConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3832m4) && kotlin.jvm.internal.m0.g(this.f56988b.getType(), ((C3832m4) obj).f56988b.getType());
    }

    public final int hashCode() {
        return this.f56988b.getType().hashCode();
    }
}
