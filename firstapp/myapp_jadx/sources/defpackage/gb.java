package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.popup.AcknowledgeFreeGameUseCase", f = "AcknowledgeFreeGameUseCase.kt", l = {16, 17, 18}, m = "invoke", v = 1)
public final class gb extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hb b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(hb hbVar, x1b x1bVar) {
        super(x1bVar);
        this.b = hbVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
