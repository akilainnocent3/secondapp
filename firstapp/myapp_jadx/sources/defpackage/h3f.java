package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.DoubleOrNothingRepoImpl", f = "DoubleOrNothingRepoImpl.kt", l = {51}, m = "createAndSettle", v = 2)
public final class h3f extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ j3f b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3f(j3f j3fVar, x1b x1bVar) {
        super(x1bVar);
        this.b = j3fVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(null, 0L, 0, this);
    }
}
