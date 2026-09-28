package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLuckyNumberFeatureMatchCardsUseCase", f = "ObserveLuckyNumberFeatureMatchCardsUseCase.kt", l = {321}, m = "getFeatureMatchCards", v = 2)
public final class qey extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ afy b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qey(afy afyVar, x1b x1bVar) {
        super(x1bVar);
        this.b = afyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
