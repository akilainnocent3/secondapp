package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.domain.usecase.DetermineGiftNavigationUseCase", f = "DetermineGiftNavigationUseCase.kt", l = {53}, m = "navigateBySegmentation", v = 2)
public final class gbe extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ fbe b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbe(fbe fbeVar, x1b x1bVar) {
        super(x1bVar);
        this.b = fbeVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
