package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING}, m = "bringIntoView")
public final class ka5 extends x1b {
    public lk40 a;
    public Object[] b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ la5 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka5(la5 la5Var, x1b x1bVar) {
        super(x1bVar);
        this.f = la5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
