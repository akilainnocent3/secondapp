package yads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ya implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wa3 f158207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f158208d;

    public ya(String str, wa3 wa3Var, Map map) {
        this.f158206b = str;
        this.f158207c = wa3Var;
        this.f158208d = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f158206b.length() > 0) {
            this.f158207c.a(this.f158206b, this.f158208d);
        }
    }
}
