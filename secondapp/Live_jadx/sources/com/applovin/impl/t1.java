package com.applovin.impl;

import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f29197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f29198c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29196a = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f29199d = System.currentTimeMillis();

    public t1(String str, Map map) {
        this.f29197b = str;
        this.f29198c = map;
    }

    public long a() {
        return this.f29199d;
    }

    public String b() {
        return this.f29196a;
    }

    public String c() {
        return this.f29197b;
    }

    public Map d() {
        return this.f29198c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        t1 t1Var = (t1) obj;
        if (this.f29199d == t1Var.f29199d && Objects.equals(this.f29197b, t1Var.f29197b) && Objects.equals(this.f29198c, t1Var.f29198c)) {
            return Objects.equals(this.f29196a, t1Var.f29196a);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f29197b;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.f29198c;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        long j10 = this.f29199d;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.f29196a;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "Event{name='" + this.f29197b + "', id='" + this.f29196a + "', creationTimestampMillis=" + this.f29199d + ", parameters=" + this.f29198c + fw.b.f85383j;
    }
}
