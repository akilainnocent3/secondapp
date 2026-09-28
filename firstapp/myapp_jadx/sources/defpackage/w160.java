package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
public final class w160 extends x1b {
    public x160 a;
    public quw b;
    public /* synthetic */ Object c;
    public final /* synthetic */ x160 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w160(x160 x160Var, x1b x1bVar) {
        super(x1bVar);
        this.d = x160Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
