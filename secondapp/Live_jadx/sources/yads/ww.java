package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ww {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zw f157559b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ww f157558a = new ww();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f157560c = new Object();

    public static xw a(Context context) {
        if (f157559b == null) {
            synchronized (f157560c) {
                try {
                    if (f157559b == null) {
                        f157559b = yw.a(context);
                    }
                    dr.w2 w2Var = dr.w2.f79517a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        zw zwVar = f157559b;
        if (zwVar != null) {
            return zwVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
