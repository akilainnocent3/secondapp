package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f55538b;

    public Ta(int i10) {
        this.f55537a = i10;
        this.f55538b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ta)) {
            return false;
        }
        Ta ta2 = (Ta) obj;
        return this.f55537a == ta2.f55537a && kotlin.jvm.internal.m0.g(this.f55538b, ta2.f55538b);
    }

    public final int hashCode() {
        int i10 = this.f55537a * 31;
        Integer num = this.f55538b;
        return i10 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f55537a + ", errorCode=" + this.f55538b + gi.j.f86771d;
    }

    public Ta(int i10, Integer num) {
        this.f55537a = i10;
        this.f55538b = num;
    }
}
