package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qb0 implements Function0 {
    public final /* synthetic */ xb0 a;
    public final /* synthetic */ bef0 b;

    public /* synthetic */ qb0(xb0 xb0Var, bef0 bef0Var) {
        this.a = xb0Var;
        this.b = bef0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        xb0 xb0Var = this.a;
        ob0 ob0Var = xb0Var.f;
        final bef0 bef0Var = this.b;
        Function0 function0 = new Function0() { // from class: tb0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bef0Var.k0();
            }
        };
        dq40 dq40Var = new dq40();
        xb0Var.e.d("dataBuilder", ob0Var, new vb0(dq40Var, function0));
        T t = dq40Var.a;
        if (t != 0) {
            return (aef0) t;
        }
        Intrinsics.n(AnalyticsParam.EVENT_PARAM_RESULT);
        throw null;
    }
}
