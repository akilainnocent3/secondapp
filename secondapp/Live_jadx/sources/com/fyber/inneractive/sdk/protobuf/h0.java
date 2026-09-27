package com.fyber.inneractive.sdk.protobuf;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile h0 f47479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f47480c = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47481a = Collections.EMPTY_MAP;

    public static h0 a() {
        h0 h0Var;
        h0 h0Var2 = f47479b;
        if (h0Var2 != null) {
            return h0Var2;
        }
        synchronized (h0.class) {
            h0Var = f47479b;
            if (h0Var == null) {
                Class cls = f0.f47469a;
                h0 h0Var3 = null;
                if (cls != null) {
                    try {
                        h0Var3 = (h0) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                h0Var = h0Var3 != null ? h0Var3 : f47480c;
                f47479b = h0Var;
            }
        }
        return h0Var;
    }

    public final x0 a(int i10, d2 d2Var) {
        return (x0) this.f47481a.get(new g0(i10, d2Var));
    }
}
