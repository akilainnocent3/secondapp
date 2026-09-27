package fg;

import android.util.SparseArray;
import eh.f1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<f1> f84276a = new SparseArray<>();

    public f1 a(int i10) {
        f1 f1Var = this.f84276a.get(i10);
        if (f1Var != null) {
            return f1Var;
        }
        f1 f1Var2 = new f1(9223372036854775806L);
        this.f84276a.put(i10, f1Var2);
        return f1Var2;
    }

    public void b() {
        this.f84276a.clear();
    }
}
