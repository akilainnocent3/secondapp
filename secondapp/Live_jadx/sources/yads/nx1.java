package yads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nx1 extends rx1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Comparator f153251a;

    public nx1(y72 y72Var) {
        this.f153251a = y72Var;
    }

    @Override // yads.rx1
    public final Map b() {
        return new TreeMap(this.f153251a);
    }
}
