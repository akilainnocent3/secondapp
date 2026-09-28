package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.gameplay.GameplayUseCase", f = "GameplayUseCase.kt", l = {65, 66, 69, 74}, m = "subscribeToGameplayTopics", v = 1)
public final class hrj extends x1b {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ erj d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrj(erj erjVar, x1b x1bVar) {
        super(x1bVar);
        this.d = erjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
