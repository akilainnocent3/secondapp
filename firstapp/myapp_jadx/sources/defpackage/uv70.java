package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.type.RegularMarketRule;

/* JADX INFO: loaded from: classes7.dex */
public final class uv70 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ SearchFragment a;
    public final /* synthetic */ uhd0 b;

    public uv70(uhd0 uhd0Var, SearchFragment searchFragment) {
        this.a = searchFragment;
        this.b = uhd0Var;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        ohp<Object>[] ohpVarArr = SearchFragment.V;
        SearchFragment searchFragment = this.a;
        rw70 rw70VarQ0 = searchFragment.q0();
        avy avyVarG = hih0.g(fVar);
        wwd0 wwd0Var = rw70VarQ0.B;
        wwd0Var.getClass();
        wwd0Var.k(null, avyVarG);
        mfb0 mfb0Var = rw70VarQ0.y;
        RegularMarketRule regularMarketRule = rw70VarQ0.z;
        if (mfb0Var != null && regularMarketRule != null) {
            String id = mfb0Var.getId();
            id.getClass();
            rw70VarQ0.B1(rw70VarQ0.y1(id, regularMarketRule));
        }
        OneUpTwoUpSwitch.setState$default(this.b.A, fVar, false, false, 4, null);
        mfb0 mfb0Var2 = searchFragment.P;
        searchFragment.v0(hih0.g(fVar), searchFragment.Q, mfb0Var2 != null ? mfb0Var2.getId() : null, true);
    }
}
