package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class dy2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile fy2 f148413b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ dy2 f148412a = new dy2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f148414c = new Object();

    public static ey2 a(Context context) {
        if (f148413b == null) {
            synchronized (f148414c) {
                try {
                    if (f148413b == null) {
                        f148413b = new fy2(ug1.a(context, "YadPreferenceFile"));
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        fy2 fy2Var = f148413b;
        if (fy2Var != null) {
            return fy2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
