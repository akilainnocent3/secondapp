package defpackage;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.domain.usecase.matchmaking.OnConfirmJoinRoomUseCase", f = "OnConfirmJoinRoomUseCase.kt", l = {15, 16, 17, 19}, m = "invoke", v = 1)
public final class wny extends x1b {
    public double a;
    public long b;
    public hu00 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ xny e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wny(xny xnyVar, x1b x1bVar) {
        super(x1bVar);
        this.e = xnyVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0.0d, 0L, null, this);
    }
}
