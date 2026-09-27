package dr;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class z0<A, B> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A f79520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f79521c;

    public z0(A a10, B b10) {
        this.f79520b = a10;
        this.f79521c = b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ z0 i(z0 z0Var, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = z0Var.f79520b;
        }
        if ((i10 & 2) != 0) {
            obj2 = z0Var.f79521c;
        }
        return z0Var.h(obj, obj2);
    }

    public final A d() {
        return this.f79520b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.m0.g(this.f79520b, z0Var.f79520b) && kotlin.jvm.internal.m0.g(this.f79521c, z0Var.f79521c);
    }

    public final B g() {
        return this.f79521c;
    }

    @oy.l
    public final z0<A, B> h(A a10, B b10) {
        return new z0<>(a10, b10);
    }

    public int hashCode() {
        A a10 = this.f79520b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f79521c;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    public final A j() {
        return this.f79520b;
    }

    public final B k() {
        return this.f79521c;
    }

    @oy.l
    public String toString() {
        return '(' + this.f79520b + ", " + this.f79521c + ')';
    }
}
