package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.domain.usecase.GetTeamNewsUseCase", f = "GetTeamNewsUseCase.kt", l = {16}, m = "invoke-BWLJW6A", v = 2)
public final class kfk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ lfk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfk(lfk lfkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = lfkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(0, this, null, null);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
