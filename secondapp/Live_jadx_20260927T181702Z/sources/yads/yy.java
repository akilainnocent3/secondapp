package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class yy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yy f158520a = new yy();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f158521b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile cz f158522c;

    public static zy a(Context context) {
        if (f158522c == null) {
            synchronized (f158521b) {
                try {
                    if (f158522c == null) {
                        f158522c = new cz(ug1.a(context, "YadPreferenceFile"), new dn0(), new u7(), new p33());
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        cz czVar = f158522c;
        if (czVar != null) {
            return czVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
