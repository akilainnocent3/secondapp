package defpackage;

import com.sporty.android.core.model.pocket.withdraw.WithdrawNoticeData;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.BaseWithdrawViewModel", f = "BaseWithdrawViewModel.kt", l = {109, 112}, m = "hasCheckWithdrawNotice", v = 2)
public final class n82 extends x1b {
    public WithdrawNoticeData a;
    public /* synthetic */ Object b;
    public final /* synthetic */ o82 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n82(o82 o82Var, x1b x1bVar) {
        super(x1bVar);
        this.c = o82Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.I1(this);
    }
}
