package yads;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ua {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sf2 f156327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f156328b = new LinkedHashMap();

    public ua(sf2 sf2Var) {
        this.f156327a = sf2Var;
    }

    public final u81 a(ua1 ua1Var) {
        u81 u81Var = (u81) this.f156328b.get(ua1Var);
        return u81Var == null ? u81.f156312b : u81Var;
    }
}
