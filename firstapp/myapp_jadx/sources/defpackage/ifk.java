package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.domain.usecase.GetTeamDetailsUseCase", f = "GetTeamDetailsUseCase.kt", l = {11}, m = "invoke-gIAlu-s", v = 2)
public final class ifk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ jfk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifk(jfk jfkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = jfkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
