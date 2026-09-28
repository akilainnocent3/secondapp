package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.gameplay.GameplayUseCase", f = "GameplayUseCase.kt", l = {40}, m = "getGameplayInitData", v = 1)
public final class frj extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ erj b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frj(erj erjVar, x1b x1bVar) {
        super(x1bVar);
        this.b = erjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(this);
    }
}
