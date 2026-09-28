package defpackage;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.presentation.WorldCupPassViewModel", f = "WorldCupPassViewModel.kt", l = {128, 135}, m = "applyStatus", v = 2)
public final class x3k0 extends x1b {
    public r3k0 a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ y3k0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3k0(y3k0 y3k0Var, x1b x1bVar) {
        super(x1bVar);
        this.d = y3k0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.x1(null, this);
    }
}
