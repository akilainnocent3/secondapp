package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.SpeedyBingoViewModel", f = "SpeedyBingoViewModel.kt", l = {590, 595}, m = "handleError", v = 1)
public final class zua0 extends x1b {
    public /* synthetic */ Object a;
    public final /* synthetic */ uua0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zua0(uua0 uua0Var, x1b x1bVar) {
        super(x1bVar);
        this.b = uua0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z1(null, this);
    }
}
