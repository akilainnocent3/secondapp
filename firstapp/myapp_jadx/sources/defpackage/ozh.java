package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ozh {
    public static final <T> lyh<T> a(lyh<? extends T> lyhVar, int i, pb5 pb5Var) {
        if (i < 0 && i != -2 && i != -1) {
            kb5.a(hce0.a(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1 && pb5Var != pb5.a) {
            hb5.a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == -1) {
            pb5Var = pb5.b;
            i = 0;
        }
        int i2 = i;
        pb5 pb5Var2 = pb5Var;
        return lyhVar instanceof abj ? abj.a.a((abj) lyhVar, null, i2, pb5Var2, 1) : new a77(i2, 2, pb5Var2, lyhVar, null);
    }

    public static lyh b(lyh lyhVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return a(lyhVar, i, pb5.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> lyh<T> c(lyh<? extends T> lyhVar, CoroutineContext coroutineContext) {
        if (coroutineContext.get(c9p.b.a) != null) {
            r2z.a(coroutineContext, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (coroutineContext.equals(e.a)) {
            return lyhVar;
        }
        return lyhVar instanceof abj ? abj.a.a((abj) lyhVar, coroutineContext, 0, null, 6) : new a77(0, 12, null, lyhVar, coroutineContext);
    }
}
