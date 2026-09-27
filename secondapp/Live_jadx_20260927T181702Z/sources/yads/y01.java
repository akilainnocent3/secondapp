package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class y01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f158087a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xy0 f158088b;

    public static final xy0 a(Context context) {
        if (f158088b == null) {
            synchronized (f158087a) {
                try {
                    if (f158088b == null) {
                        f158088b = new xy0(context, "com.huawei.hms.location.LocationServices");
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        xy0 xy0Var = f158088b;
        if (xy0Var != null) {
            return xy0Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
