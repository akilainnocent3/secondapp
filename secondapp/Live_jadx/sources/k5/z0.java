package k5;

import android.util.SparseArray;
import x4.g1;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<g1> f102020a = new SparseArray<>();

    public g1 a(int i10) {
        g1 g1Var = this.f102020a.get(i10);
        if (g1Var != null) {
            return g1Var;
        }
        g1 g1Var2 = new g1(9223372036854775806L);
        this.f102020a.put(i10, g1Var2);
        return g1Var2;
    }

    public void b() {
        this.f102020a.clear();
    }
}
