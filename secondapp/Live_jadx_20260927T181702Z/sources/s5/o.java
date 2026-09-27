package s5;

import cj.v6;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public final class o implements j {
    @Override // s5.j
    public u1 a(List<? extends u1> list, List<List<Integer>> list2) {
        return new i(list, list2);
    }

    @Override // s5.j
    @Deprecated
    public u1 b(u1... u1VarArr) {
        return new i(u1VarArr);
    }

    @Override // s5.j
    public u1 empty() {
        return new i(v6.z(), v6.z());
    }
}
