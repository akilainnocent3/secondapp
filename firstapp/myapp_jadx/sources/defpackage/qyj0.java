package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.data.repository.WorldCupBookingCodesRepositoryImpl", f = "WorldCupBookingCodesRepositoryImpl.kt", l = {17}, m = "getTournamentBookingCodes-hUnOzRk", v = 2)
public final class qyj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ ryj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qyj0(ryj0 ryj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = ryj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, null, null, 0, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
