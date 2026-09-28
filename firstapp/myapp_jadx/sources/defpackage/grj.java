package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.gameplay.GameplayUseCase", f = "GameplayUseCase.kt", l = {84, 90, 95, 96}, m = "onHitPressed", v = 1)
public final class grj extends x1b {
    public long a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public vtw i;
    public vtw v;
    public /* synthetic */ Object w;
    public final /* synthetic */ erj y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grj(erj erjVar, x1b x1bVar) {
        super(x1bVar);
        this.y = erjVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.f(this);
    }
}
