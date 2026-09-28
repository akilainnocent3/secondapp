package defpackage;

import com.sporty.android.core.model.loyalty.UserTier;
import java.math.BigDecimal;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.TierDashboardUiMapper", f = "TierDashboardUiMapper.kt", l = {327, 341}, m = "createProgressContent", v = 2)
public final class hrf0 extends x1b {
    public float A;
    public float B;
    public int C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ jrf0 F;
    public int G;
    public uqf0 a;
    public uqf0 b;
    public UserTier c;
    public List d;
    public BigDecimal e;
    public BigDecimal f;
    public wsf0 i;
    public boolean v;
    public boolean w;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hrf0(jrf0 jrf0Var, x1b x1bVar) {
        super(x1bVar);
        this.F = jrf0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.E = obj;
        this.G |= Integer.MIN_VALUE;
        return this.F.f(null, null, null, null, null, null, false, false, false, null, null, 0L, this);
    }
}
