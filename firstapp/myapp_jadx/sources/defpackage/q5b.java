package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {226}, m = "clearSource$lifecycle_livedata_release")
public final class q5b extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ r5b<Object> b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5b(r5b r5bVar, x1b x1bVar) {
        super(x1bVar);
        this.b = r5bVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o(this);
    }
}
