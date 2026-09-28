package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.data.repository.BookingCodeRepositoryImpl", f = "BookingCodeRepositoryImpl.kt", l = {161, 166}, m = "togglePostBetUpsellBannerExpanded", v = 2)
public final class a15 extends x1b {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u05 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a15(u05 u05Var, x1b x1bVar) {
        super(x1bVar);
        this.c = u05Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.j(this);
    }
}
