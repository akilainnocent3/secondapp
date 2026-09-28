package defpackage;

import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r0i {
    public static final int a = (int) zqe0.a("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, 2147483647L);

    public static final o0i a(lyh lyhVar, Function2 function2) {
        return new o0i(new m0i(lyhVar, function2));
    }

    public static lyh b(lyh lyhVar, Function2 function2) {
        return c(new n0i(lyhVar, function2), a);
    }

    public static final <T> lyh<T> c(lyh<? extends lyh<? extends T>> lyhVar, int i) {
        if (i <= 0) {
            kb5.a(hce0.a(i, "Expected positive concurrency level, but had "));
            return null;
        }
        if (i == 1) {
            return new o0i(lyhVar);
        }
        return new x67(i, -2, pb5.a, lyhVar, e.a);
    }

    public static final b77 d(lyh lyhVar, Function2 function2) {
        return f(lyhVar, new q0i(function2, null));
    }

    public static final e77 e(lyh... lyhVarArr) {
        return new e77(lyhVarArr.length == 0 ? m2g.a : new zx0(lyhVarArr), e.a, -2, pb5.a);
    }

    public static final b77 f(lyh lyhVar, gaj gajVar) {
        return new b77(gajVar, lyhVar, e.a, -2, pb5.a);
    }
}
