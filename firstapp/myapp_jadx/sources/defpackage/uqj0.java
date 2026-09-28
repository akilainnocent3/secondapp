package defpackage;

import androidx.recyclerview.widget.r;
import com.sporty.android.core.model.pocket.withdraw.WithdrawRequest;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.uiprocess.WithdrawUiProcess", f = "WithdrawUiProcess.kt", l = {139, 158, r.d.DEFAULT_DRAG_ANIMATION_DURATION, 199}, m = "processWithdraw", v = 2)
public final class uqj0 extends x1b {
    public final /* synthetic */ xqj0 A;
    public int B;
    public fnj0 a;
    public WithdrawRequest b;
    public y300 c;
    public v1i0 d;
    public v1i0.c e;
    public g0i0.d f;
    public xqj0 i;
    public int v;
    public int w;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqj0(xqj0 xqj0Var, x1b x1bVar) {
        super(x1bVar);
        this.A = xqj0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.f(null, this);
    }
}
