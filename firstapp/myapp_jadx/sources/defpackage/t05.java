package defpackage;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.data.repository.BookingCodeRepositoryImpl", f = "BookingCodeRepositoryImpl.kt", l = {134}, m = "checkIsBookingCodeExistInMyShareCode", v = 2)
public final class t05 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ u05 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t05(u05 u05Var, x1b x1bVar) {
        super(x1bVar);
        this.b = u05Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.m(null, this);
    }
}
