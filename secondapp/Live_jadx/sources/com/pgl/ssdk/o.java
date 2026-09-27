package com.pgl.ssdk;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class o<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f72085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f72086b;

    public o(A a10, B b10) {
        this.f72085a = a10;
        this.f72086b = b10;
    }

    public static <A, B> o<A, B> a(A a10, B b10) {
        return new o<>(a10, b10);
    }

    public B b() {
        return this.f72086b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        A a10 = this.f72085a;
        if (a10 == null) {
            if (oVar.f72085a != null) {
                return false;
            }
        } else if (!a10.equals(oVar.f72085a)) {
            return false;
        }
        B b10 = this.f72086b;
        if (b10 == null) {
            if (oVar.f72086b != null) {
                return false;
            }
        } else if (!b10.equals(oVar.f72086b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f72085a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f72086b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public A a() {
        return this.f72085a;
    }
}
