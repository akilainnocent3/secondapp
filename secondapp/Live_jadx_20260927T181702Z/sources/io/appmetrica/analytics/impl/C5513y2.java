package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5513y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC5488x2 f98638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f98639b;

    public C5513y2(EnumC5488x2 enumC5488x2, Boolean bool) {
        this.f98638a = enumC5488x2;
        this.f98639b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5513y2.class == obj.getClass()) {
            C5513y2 c5513y2 = (C5513y2) obj;
            if (this.f98638a != c5513y2.f98638a) {
                return false;
            }
            Boolean bool = this.f98639b;
            if (bool != null) {
                return bool.equals(c5513y2.f98639b);
            }
            if (c5513y2.f98639b == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        EnumC5488x2 enumC5488x2 = this.f98638a;
        int iHashCode = (enumC5488x2 != null ? enumC5488x2.hashCode() : 0) * 31;
        Boolean bool = this.f98639b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "BackgroundRestrictionsState{mAppStandByBucket=" + this.f98638a + ", mBackgroundRestricted=" + this.f98639b + fw.b.f85383j;
    }
}
