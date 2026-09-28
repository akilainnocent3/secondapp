package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.domain.usecase.StartStackerGameUseCase", f = "StartStackerGameUseCase.kt", l = {12, 13}, m = "invoke", v = 1)
public final class gwd0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ hwd0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwd0(hwd0 hwd0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = hwd0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
