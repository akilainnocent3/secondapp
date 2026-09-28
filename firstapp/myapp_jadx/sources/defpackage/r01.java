package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1", f = "AsyncPagingDataDiffer.kt", l = {183}, m = "presentPagingDataEvent")
public final class r01 extends x1b {
    public t01 a;
    public v01 b;
    public qqz.e c;
    public /* synthetic */ Object d;
    public final /* synthetic */ t01 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r01(t01 t01Var, x1b x1bVar) {
        super(x1bVar);
        this.e = t01Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
