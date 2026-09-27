package ws;

import dr.w2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final h0<d0> f143737a = new h0<>("InvalidModuleNotifier");

    public static final void a(@oy.l i0 i0Var) {
        w2 w2Var;
        kotlin.jvm.internal.m0.p(i0Var, "<this>");
        d0 d0Var = (d0) i0Var.D0(f143737a);
        if (d0Var != null) {
            d0Var.a(i0Var);
            w2Var = w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var != null) {
            return;
        }
        throw new b0("Accessing invalid module descriptor " + i0Var);
    }
}
