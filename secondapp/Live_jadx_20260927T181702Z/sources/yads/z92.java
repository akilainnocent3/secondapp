package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class z92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile y92 f158669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f158670b = new Object();

    public static final y92 a(Context context) {
        if (f158669a == null) {
            synchronized (f158670b) {
                try {
                    if (f158669a == null) {
                        f158669a = new y92(ug1.a(context, "YadPreferenceFile"));
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        y92 y92Var = f158669a;
        if (y92Var != null) {
            return y92Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
