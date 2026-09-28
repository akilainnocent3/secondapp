package defpackage;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.room.paging.CommonLimitOffsetImpl", f = "LimitOffsetPagingSource.kt", l = {145, 153}, m = "nonInitialLoad")
public final class sd8 extends x1b {
    public wqz.b a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ud8<Object> c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd8(ud8 ud8Var, x1b x1bVar) {
        super(x1bVar);
        this.c = ud8Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        wqz.b.C1263b<Object, Object> c1263b = ud8.i;
        return this.c.b(null, 0, this);
    }
}
