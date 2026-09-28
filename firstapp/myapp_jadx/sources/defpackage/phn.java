package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.InitialiseStackerGameUseCase", f = "InitialiseStackerGameUseCase.kt", l = {83, 84, 89}, m = "connectAndSubscribeToWebSocket", v = 1)
public final class phn extends x1b {
    public long a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ shn d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phn(shn shnVar, x1b x1bVar) {
        super(x1bVar);
        this.d = shnVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(0L, this, null);
    }
}
