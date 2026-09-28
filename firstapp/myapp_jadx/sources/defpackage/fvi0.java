package defpackage;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.WDViewModel", f = "WDViewModel.kt", l = {1096, 1113, 1129, 1145, 1146, 1160, 1175, 1196}, m = "errorHandle", v = 1)
public final class fvi0 extends x1b {
    public cri0 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yui0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvi0(yui0 yui0Var, x1b x1bVar) {
        super(x1bVar);
        this.c = yui0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.B1(null, this);
    }
}
