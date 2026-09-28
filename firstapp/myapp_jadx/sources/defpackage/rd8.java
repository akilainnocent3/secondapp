package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {HttpStatusCodesKt.HTTP_PROCESSING, 104}, m = "load")
public final class rd8 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ud8<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd8(ud8 ud8Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ud8Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
