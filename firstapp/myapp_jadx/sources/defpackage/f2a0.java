package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.data.smartremix.SmartRemixRepositoryImpl", f = "SmartRemixRepositoryImpl.kt", l = {16}, m = "checkEligibility", v = 2)
public final class f2a0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ g2a0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2a0(g2a0 g2a0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = g2a0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
