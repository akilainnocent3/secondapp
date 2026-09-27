package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class mt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f152676a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f152677b;

    public static boolean a(Context context) {
        boolean zBooleanValue;
        Boolean bool = f152677b;
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (f152676a) {
            try {
                Boolean bool2 = f152677b;
                if (bool2 != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    Object obj = dw2.f148384j;
                    nt2 nt2VarA = cw2.a().a(context);
                    zBooleanValue = nt2VarA != null && nt2VarA.I0;
                    f152677b = Boolean.valueOf(zBooleanValue);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }
}
