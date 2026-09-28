package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
public final class dyj0 extends x1b {
    public ayj0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ayj0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyj0(ayj0 ayj0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ayj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(this);
    }
}
