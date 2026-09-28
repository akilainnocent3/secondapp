package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.tax.TaxConfigs;
import com.sporty.android.core.model.realsports.MaxCombinationRejectConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class hx4 implements ex4 {
    public final lq1 a;

    public hx4(lq1 lq1Var) {
        lq1Var.getClass();
        this.a = lq1Var;
    }

    @Override // defpackage.ex4
    public final lyh<MaxCombinationRejectConfig> B() {
        return uzh.b(bm50.f(new wl50(a(pu0.b.a), new fx4(this))));
    }

    @Override // defpackage.ex4
    public final TaxConfigs C() {
        BOConfigValueBundle bOConfigValueBundleE = this.a.e();
        return bOConfigValueBundleE == null ? TaxConfigs.INSTANCE.getDefault() : b6f0.b(bOConfigValueBundleE);
    }

    @Override // defpackage.jq1
    public final lyh<lk50<BOConfigValueBundle>> a(pu0 pu0Var) {
        pu0Var.getClass();
        return this.a.a(pu0Var);
    }

    @Override // defpackage.ex4
    public final lyh<TaxConfigs> p() {
        return uzh.b(bm50.f(new wl50(a(pu0.b.a), new gx4(0))));
    }
}
