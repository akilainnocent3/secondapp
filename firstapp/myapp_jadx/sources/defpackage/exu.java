package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class exu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ exu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ssw<Boolean> sswVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj2;
                long jLongValue = ((Long) obj).longValue();
                int i2 = MatchEventActivity.a0;
                matchEventActivity.U1(new a5o.w(((n4p) matchEventActivity.C1()).c(), jLongValue, System.currentTimeMillis() / 1000));
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                if (Intrinsics.g((Boolean) obj, Boolean.TRUE)) {
                    q1c0Var.V2("RANGE");
                    ql60 ql60Var = q1c0Var.p0;
                    if (ql60Var != null && (sswVar = ql60Var.N) != null) {
                        sswVar.m(Boolean.FALSE);
                    }
                }
                break;
        }
        return Unit.a;
    }
}
