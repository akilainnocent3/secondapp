package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "awaitClose")
public final class ik90 extends x1b {
    public dnz.b.c a;
    public c9p b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kk90<Object> d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik90(kk90 kk90Var, x1b x1bVar) {
        super(x1bVar);
        this.d = kk90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.l(null, this);
    }
}
