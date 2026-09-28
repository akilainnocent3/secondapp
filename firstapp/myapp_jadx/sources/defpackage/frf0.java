package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.TierDashboardUiMapper", f = "TierDashboardUiMapper.kt", l = {108}, m = "createFutureTierContent", v = 2)
public final class frf0 extends x1b {
    public uqf0 a;
    public BigDecimal b;
    public BigDecimal c;
    public /* synthetic */ Object d;
    public final /* synthetic */ jrf0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frf0(jrf0 jrf0Var, x1b x1bVar) {
        super(x1bVar);
        this.e = jrf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, false, this);
    }
}
