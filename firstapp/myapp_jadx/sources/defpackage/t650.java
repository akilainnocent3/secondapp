package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {445}, m = "initialize")
public final class t650 extends x1b {
    public s650 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ s650<Object, Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t650(s650 s650Var, x1b x1bVar) {
        super(x1bVar);
        this.c = s650Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.d(this);
    }
}
