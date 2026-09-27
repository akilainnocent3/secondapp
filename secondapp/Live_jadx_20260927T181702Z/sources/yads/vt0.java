package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vt0 extends androidx.recyclerview.widget.k.f {
    @Override // androidx.recyclerview.widget.k.f
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return kotlin.jvm.internal.m0.g((ut0) obj, (ut0) obj2);
    }

    @Override // androidx.recyclerview.widget.k.f
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        ut0 ut0Var = (ut0) obj;
        ut0 ut0Var2 = (ut0) obj2;
        if ((ut0Var instanceof ns0) && (ut0Var2 instanceof ns0)) {
            return kotlin.jvm.internal.m0.g(((ns0) ut0Var).f153132b, ((ns0) ut0Var2).f153132b);
        }
        tt0 tt0Var = tt0.f156045a;
        return kotlin.jvm.internal.m0.g(ut0Var, tt0Var) && kotlin.jvm.internal.m0.g(ut0Var2, tt0Var);
    }
}
