package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rb0 implements Function0 {
    public final /* synthetic */ xb0 a;
    public final /* synthetic */ bef0 b;

    public /* synthetic */ rb0(xb0 xb0Var, bef0 bef0Var) {
        this.a = xb0Var;
        this.b = bef0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xb0 xb0Var = this.a;
        pb0 pb0Var = xb0Var.g;
        ub0 ub0Var = new ub0(0, xb0Var, this.b);
        dq40 dq40Var = new dq40();
        xb0Var.e.d("positioner", pb0Var, new vb0(dq40Var, ub0Var));
        T t = dq40Var.a;
        if (t != 0) {
            return (lk40) t;
        }
        Intrinsics.n(AnalyticsParam.EVENT_PARAM_RESULT);
        throw null;
    }
}
