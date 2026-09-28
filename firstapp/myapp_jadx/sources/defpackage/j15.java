package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.data.repository.BookingCodesRemoteDataSource", f = "BookingCodesRemoteDataSource.kt", l = {18}, m = "getTournamentBookingCodes-hUnOzRk", v = 2)
public final class j15 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ k15 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j15(k15 k15Var, x1b x1bVar) {
        super(x1bVar);
        this.b = k15Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, null, null, 0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
