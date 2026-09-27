package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.df, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3617df {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f56268a;

    public C3617df(Map requestParams) {
        kotlin.jvm.internal.m0.p(requestParams, "requestParams");
        this.f56268a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3617df) && kotlin.jvm.internal.m0.g(this.f56268a, ((C3617df) obj).f56268a);
    }

    public final int hashCode() {
        return this.f56268a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f56268a + gi.j.f86771d;
    }
}
