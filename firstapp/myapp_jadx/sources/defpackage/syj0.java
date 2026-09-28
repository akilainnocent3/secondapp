package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.data.repository.WorldCupEventsRepositoryImpl", f = "WorldCupEventsRepositoryImpl.kt", l = {13}, m = "getEvents", v = 2)
public final class syj0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ tyj0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public syj0(tyj0 tyj0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = tyj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, null, null, this);
    }
}
