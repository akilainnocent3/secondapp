package ou;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g0 implements xs.a, su.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f119737b;

    public /* synthetic */ g0(kotlin.jvm.internal.x xVar) {
        this();
    }

    public final int F0() {
        return i0.a(this) ? super.hashCode() : (((I0().hashCode() * 31) + G0().hashCode()) * 31) + (J0() ? 1 : 0);
    }

    @oy.l
    public abstract List<k1> G0();

    @oy.l
    public abstract c1 H0();

    @oy.l
    public abstract g1 I0();

    public abstract boolean J0();

    @oy.l
    public abstract g0 K0(@oy.l pu.g gVar);

    @oy.l
    public abstract v1 L0();

    public final boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return J0() == g0Var.J0() && pu.r.f121100a.a(L0(), g0Var.L0());
    }

    @Override // xs.a
    @oy.l
    public xs.g getAnnotations() {
        return k.a(H0());
    }

    public final int hashCode() {
        int i10 = this.f119737b;
        if (i10 != 0) {
            return i10;
        }
        int iF0 = F0();
        this.f119737b = iF0;
        return iF0;
    }

    @oy.l
    public abstract hu.h s();

    public g0() {
    }
}
