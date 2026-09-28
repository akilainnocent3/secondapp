package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131}, m = "onFinish")
public final class vv90 extends x1b {
    public uv90.b a;
    public c9p b;
    public tuw c;
    public /* synthetic */ Object d;
    public final /* synthetic */ uv90.b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv90(uv90.b bVar, x1b x1bVar) {
        super(x1bVar);
        this.e = bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
