package yads;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fb1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final eb1 f149037c = new eb1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile fb1 f149038d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f149039a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f149040b = new WeakHashMap();

    public final void a(s10 s10Var, n00 n00Var) {
        synchronized (this.f149039a) {
            this.f149040b.put(s10Var, n00Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
