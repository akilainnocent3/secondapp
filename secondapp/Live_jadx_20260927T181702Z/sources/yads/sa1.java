package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class sa1 implements rc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc3 f155338a;

    public sa1(qc3 qc3Var) {
        this.f155338a = qc3Var;
    }

    @Override // yads.rc3
    public final Map a() {
        v2 v2Var = this.f155338a.f154429a;
        Map mapG = fr.m1.g();
        Map map = this.f155338a.f154430b;
        if (map != null) {
            mapG.putAll(map);
        }
        z2 z2Var = v2Var.f156717f;
        String str = z2Var != null ? z2Var.f158566d : null;
        if (str != null) {
            mapG.put("video-session-id", str);
        }
        return fr.m1.d(mapG);
    }
}
