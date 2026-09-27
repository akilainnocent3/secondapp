package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C4907a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f96909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f96910c;

    public C4907a4(String str, Integer num, String str2) {
        this.f96908a = str;
        this.f96909b = num;
        this.f96910c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4907a4.class == obj.getClass()) {
            C4907a4 c4907a4 = (C4907a4) obj;
            if (!this.f96908a.equals(c4907a4.f96908a)) {
                return false;
            }
            Integer num = this.f96909b;
            if (num == null ? c4907a4.f96909b != null : !num.equals(c4907a4.f96909b)) {
                return false;
            }
            String str = this.f96910c;
            String str2 = c4907a4.f96910c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f96908a.hashCode() * 31;
        Integer num = this.f96909b;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f96910c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
