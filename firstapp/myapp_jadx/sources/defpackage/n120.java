package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {236}, m = "acquire")
public final class n120 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ r120 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n120(r120 r120Var, x1b x1bVar) {
        super(x1bVar);
        this.b = r120Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
