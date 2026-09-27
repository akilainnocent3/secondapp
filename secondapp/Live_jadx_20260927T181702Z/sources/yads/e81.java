package yads;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class e81 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d81 f148567c = new d81();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e81 f148568d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f148569a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f148570b = new WeakHashMap();

    public final void a(s00 s00Var, ia3 ia3Var) {
        synchronized (this.f148569a) {
            this.f148570b.put(s00Var, ia3Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
