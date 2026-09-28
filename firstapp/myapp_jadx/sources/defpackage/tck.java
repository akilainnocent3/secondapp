package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.dedicatedteampage.team.domain.usecase.GetRecentResultsUseCase", f = "GetRecentResultsUseCase.kt", l = {17}, m = "invoke-yxL6bBk", v = 2)
public final class tck extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ uck b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tck(uck uckVar, x1b x1bVar) {
        super(x1bVar);
        this.b = uckVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, null, 0, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
