package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.TierDashboardUiMapper", f = "TierDashboardUiMapper.kt", l = {389, 401}, m = "determineHintState", v = 2)
public final class irf0 extends x1b {
    public BigDecimal a;
    public krf0 b;
    public krf0 c;
    public BigDecimal d;
    public BigDecimal e;
    public String f;
    public krf0 i;
    public boolean v;
    public /* synthetic */ Object w;
    public final /* synthetic */ jrf0 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irf0(jrf0 jrf0Var, x1b x1bVar) {
        super(x1bVar);
        this.y = jrf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.g(null, false, null, null, null, false, null, null, null, false, this);
    }
}
