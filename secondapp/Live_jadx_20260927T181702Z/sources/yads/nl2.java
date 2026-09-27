package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class nl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f153088a;

    public nl2(Map map) {
        this.f153088a = fr.n1.J0(map);
    }

    public final void a(String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        this.f153088a.put(str, str2);
    }
}
