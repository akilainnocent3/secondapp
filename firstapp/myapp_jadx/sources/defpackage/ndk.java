package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.searchv2.domain.usecase.GetSearchResultsUseCase", f = "GetSearchResultsUseCase.kt", l = {11}, m = "invoke-gIAlu-s", v = 2)
public final class ndk extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ odk b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndk(odk odkVar, x1b x1bVar) {
        super(x1bVar);
        this.b = odkVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object objA = this.b.a(null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
