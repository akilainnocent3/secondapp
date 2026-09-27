package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.uk, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4047uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f57832b;

    public C4047uk(String str, Map map) {
        this.f57831a = str;
        this.f57832b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4047uk)) {
            return false;
        }
        C4047uk c4047uk = (C4047uk) obj;
        return kotlin.jvm.internal.m0.g(this.f57831a, c4047uk.f57831a) && kotlin.jvm.internal.m0.g(this.f57832b, c4047uk.f57832b);
    }

    public final int hashCode() {
        String str = this.f57831a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map map = this.f57832b;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "TokenMetaData(keywords=" + this.f57831a + ", extras=" + this.f57832b + gi.j.f86771d;
    }
}
