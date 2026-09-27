package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ju1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static ju1 f151264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f151265c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fr.m f151266a = new fr.m();

    public final void a() {
        synchronized (f151265c) {
            this.f151266a.clear();
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final List b() {
        List listA6;
        synchronized (f151265c) {
            listA6 = fr.r0.a6(this.f151266a);
        }
        return listA6;
    }
}
