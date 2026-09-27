package com.yandex.mobile.ads.instream.newapi;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@InstreamExperimentalApi
public final class InstreamAdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f76893a;

    public InstreamAdRequestError(@l String str) {
        this.f76893a = str;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(InstreamAdRequestError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.instream.newapi.InstreamAdRequestError");
        return m0.g(this.f76893a, ((InstreamAdRequestError) obj).f76893a);
    }

    @l
    public final String getDescription() {
        return this.f76893a;
    }

    public int hashCode() {
        return this.f76893a.hashCode();
    }

    @l
    public String toString() {
        return "InstreamAdRequestError(description='" + this.f76893a + "')";
    }
}
