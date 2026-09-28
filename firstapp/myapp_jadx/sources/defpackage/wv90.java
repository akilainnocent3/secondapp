package defpackage;

import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131, HttpStatusCodesKt.HTTP_PROCESSING}, m = "tryEnqueue")
public final class wv90 extends x1b {
    public uv90.b a;
    public c9p b;
    public quw c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ uv90.b f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv90(uv90.b bVar, x1b x1bVar) {
        super(x1bVar);
        this.f = bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(0, null, this);
    }
}
