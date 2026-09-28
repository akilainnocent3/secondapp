package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.domain.usecase.GetSuggestedQueriesUseCase", f = "GetSuggestedQueriesUseCase.kt", l = {10}, m = "invoke-IoAF18A", v = 2)
public final class cfk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ dfk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfk(dfk dfkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = dfkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
