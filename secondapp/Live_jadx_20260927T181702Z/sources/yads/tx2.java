package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class tx2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ tx2 f156118a = new tx2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f156119b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile vx2 f156120c;

    public static ux2 a(Context context) {
        vx2 vx2Var;
        vx2 vx2Var2 = f156120c;
        if (vx2Var2 != null) {
            return vx2Var2;
        }
        synchronized (f156119b) {
            vx2Var = f156120c;
            if (vx2Var == null) {
                vx2Var = new vx2(ug1.a(context, "YadPreferenceFile"));
                f156120c = vx2Var;
            }
        }
        return vx2Var;
    }
}
