package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.push.PushRepositoryImpl", f = "PushRepositoryImpl.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS, HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "markItemSeen", v = 2)
public final class sa30 extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ra30 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa30(ra30 ra30Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ra30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
