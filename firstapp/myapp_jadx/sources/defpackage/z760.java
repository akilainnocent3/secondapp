package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.speedybingo.presentation.mapper.SBBallPoolMapper", f = "SBBallPoolMapper.kt", l = {93}, m = "sendExtraBall", v = 1)
public final class z760 extends x1b {
    public fg60 a;
    public dw1 b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ w760 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z760(w760 w760Var, x1b x1bVar) {
        super(x1bVar);
        this.f = w760Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, null, this);
    }
}
