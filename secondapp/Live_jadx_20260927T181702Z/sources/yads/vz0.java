package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile uz0 f157146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f157147b = new Object();

    public static final uz0 a(Context context) {
        if (f157146a == null) {
            synchronized (f157147b) {
                try {
                    if (f157146a == null) {
                        f157146a = new uz0(ug1.a(context, "YadPreferenceFile"));
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        uz0 uz0Var = f157146a;
        if (uz0Var != null) {
            return uz0Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
