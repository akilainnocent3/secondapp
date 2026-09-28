package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
public final class xv90 extends x1b {
    public uv90 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uv90 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv90(uv90 uv90Var, x1b x1bVar) {
        super(x1bVar);
        this.c = uv90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, null, this);
    }
}
