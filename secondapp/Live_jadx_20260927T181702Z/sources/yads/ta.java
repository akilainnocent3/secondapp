package yads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ta {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rf2 f155793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f155794b = new LinkedHashMap();

    public ta(rf2 rf2Var) {
        this.f155793a = rf2Var;
    }

    public final t81 a(ua1 ua1Var) {
        t81 t81Var = (t81) this.f155794b.get(ua1Var);
        return t81Var == null ? t81.f155757b : t81Var;
    }
}
