package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.common.domain.repository.PocketRepositoryImpl", f = "PocketRepositoryImpl.kt", l = {1088}, m = "retrySportyBank", v = 2)
public final class cu10 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ms10 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu10(ms10 ms10Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ms10Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(0L, this);
    }
}
