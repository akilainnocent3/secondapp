package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.basepay.usecase.WithdrawUseCase", f = "WithdrawUseCase.kt", l = {65, 79, 80}, m = "invoke-BWLJW6A", v = 2)
public final class yqj0 extends x1b {
    public msj0 a;
    public bag b;
    public zqj0 c;
    public WithdrawRequest d;
    public xoj0.b.g e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zqj0 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqj0(zqj0 zqj0Var, x1b x1bVar) {
        super(x1bVar);
        this.i = zqj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        Object objA = this.i.a(null, null, null, this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
