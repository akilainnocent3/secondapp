package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f54824c;

    public I2(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f54822a = i10;
        this.f54823b = str;
        this.f54824c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2)) {
            return false;
        }
        I2 i10 = (I2) obj;
        return this.f54822a == i10.f54822a && kotlin.jvm.internal.m0.g(this.f54823b, i10.f54823b) && kotlin.jvm.internal.m0.g(this.f54824c, i10.f54824c);
    }

    public final int hashCode() {
        int i10 = this.f54822a * 31;
        String str = this.f54823b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f54824c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f54822a + ", eventMessage=" + this.f54823b + ", eventData=" + this.f54824c + gi.j.f86771d;
    }

    public I2(int i10, String str, Map map) {
        this.f54822a = i10;
        this.f54823b = str;
        this.f54824c = map;
    }
}
