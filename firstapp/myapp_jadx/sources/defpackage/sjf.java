package defpackage;

import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes7.dex */
public final class sjf implements pjf {
    public final lq1 a;
    public final mjf b;

    public sjf(lq1 lq1Var, mjf mjfVar) {
        this.a = lq1Var;
        this.b = mjfVar;
    }

    @Override // defpackage.pjf
    public final g1i a() {
        return new g1i(new qjf(bm50.f(this.a.c(a.c(BOConfigParam.EarlyPayoutConfig)))), new rjf(this, null));
    }
}
