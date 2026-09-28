package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
public final class mv90<T> extends x1b {
    public Object a;
    public tuw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ov90 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv90(ov90 ov90Var, x1b x1bVar) {
        super(x1bVar);
        this.d = ov90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}
