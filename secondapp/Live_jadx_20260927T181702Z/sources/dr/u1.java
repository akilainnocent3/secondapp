package dr;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class u1<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f79514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f79515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C f79516d;

    public u1(A a10, B b10, C c10) {
        this.f79514b = a10;
        this.f79515c = b10;
        this.f79516d = c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ u1 j(u1 u1Var, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = u1Var.f79514b;
        }
        if ((i10 & 2) != 0) {
            obj2 = u1Var.f79515c;
        }
        if ((i10 & 4) != 0) {
            obj3 = u1Var.f79516d;
        }
        return u1Var.i(obj, obj2, obj3);
    }

    public final A d() {
        return this.f79514b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return kotlin.jvm.internal.m0.g(this.f79514b, u1Var.f79514b) && kotlin.jvm.internal.m0.g(this.f79515c, u1Var.f79515c) && kotlin.jvm.internal.m0.g(this.f79516d, u1Var.f79516d);
    }

    public final B g() {
        return this.f79515c;
    }

    public final C h() {
        return this.f79516d;
    }

    public int hashCode() {
        A a10 = this.f79514b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f79515c;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f79516d;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    @oy.l
    public final u1<A, B, C> i(A a10, B b10, C c10) {
        return new u1<>(a10, b10, c10);
    }

    public final A k() {
        return this.f79514b;
    }

    public final B l() {
        return this.f79515c;
    }

    public final C m() {
        return this.f79516d;
    }

    @oy.l
    public String toString() {
        return '(' + this.f79514b + ", " + this.f79515c + ", " + this.f79516d + ')';
    }
}
