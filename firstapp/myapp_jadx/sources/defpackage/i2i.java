package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public final class i2i {
    public static final /* synthetic */ int a = 0;

    public static final lyh a(ssw sswVar) {
        sswVar.getClass();
        return ozh.b(hzh.a(new g2i(sswVar, null)), -1, 2);
    }

    public static final r5b b(lyh lyhVar) {
        lyhVar.getClass();
        return c(lyhVar, null, 3);
    }

    public static r5b c(lyh lyhVar, CoroutineContext coroutineContext, int i) {
        if ((i & 1) != 0) {
            coroutineContext = e.a;
        }
        lyhVar.getClass();
        coroutineContext.getClass();
        r5b r5bVarB = s5b.b(coroutineContext, new h2i(lyhVar, null));
        if (lyhVar instanceof uwd0) {
            if (fw0.X().Y()) {
                r5bVarB.m(((uwd0) lyhVar).getValue());
                return r5bVarB;
            }
            r5bVarB.j(((uwd0) lyhVar).getValue());
        }
        return r5bVarB;
    }
}
