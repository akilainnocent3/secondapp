package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class xo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f157949a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile xo2 f157950b;

    public static void a(Context context, final Object obj) {
        r82.a(context).a(new bp2() { // from class: yads.fe4
            @Override // yads.bp2
            public final boolean a(po2 po2Var) {
                return xo2.a(obj, po2Var);
            }
        });
    }

    public static final boolean a(Object obj, po2 po2Var) {
        return kotlin.jvm.internal.m0.g(obj, po2Var.f154034q);
    }
}
