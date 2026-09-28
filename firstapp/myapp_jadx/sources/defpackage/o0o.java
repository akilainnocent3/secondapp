package defpackage;

import com.sportybet.feature.kyc.nin.NINReVerifyActivity;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o0o implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o0o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((nnt) obj).getValue();
            case 1:
                int i2 = NINReVerifyActivity.d;
                ((NINReVerifyActivity) obj).finish();
                return Unit.a;
            default:
                ResultsActivity resultsActivity = (ResultsActivity) obj;
                int i3 = ResultsActivity.A;
                fm50 fm50Var = new fm50(resultsActivity, m2g.a);
                fm50Var.c = new wk50(resultsActivity);
                return fm50Var;
        }
    }
}
