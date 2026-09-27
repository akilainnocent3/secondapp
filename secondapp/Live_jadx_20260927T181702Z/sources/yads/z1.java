package yads;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f158558b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile z1 f158559c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f158560a = new HashMap();

    public final x1 a(long j10) {
        x1 x1Var;
        synchronized (f158558b) {
            x1Var = (x1) this.f158560a.remove(Long.valueOf(j10));
        }
        return x1Var;
    }

    public final void a(long j10, x1 x1Var) {
        synchronized (f158558b) {
            this.f158560a.put(Long.valueOf(j10), x1Var);
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }
}
