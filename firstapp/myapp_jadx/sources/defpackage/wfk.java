package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.domain.usecase.GetTrendingQueriesUseCase", f = "GetTrendingQueriesUseCase.kt", l = {10}, m = "invoke-IoAF18A", v = 2)
public final class wfk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ xfk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfk(xfk xfkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = xfkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
