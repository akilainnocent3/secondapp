package com.ironsource.adqualitysdk.sdk.i;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class fi<T> extends ed {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private T f2042;

    public fi(T t10, dm dmVar) {
        super(dmVar);
        this.f2042 = t10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            T t10 = this.f2042;
            T t11 = ((fi) obj).f2042;
            if (t10 != null) {
                return t10.equals(t11);
            }
            if (t11 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        T t10 = this.f2042;
        if (t10 != null) {
            return t10.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2042);
        return sb2.toString();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ed
    /* JADX INFO: renamed from: ｋ */
    public final dr mo2068(du duVar, cq cqVar) {
        return new dr(this.f2042);
    }
}
