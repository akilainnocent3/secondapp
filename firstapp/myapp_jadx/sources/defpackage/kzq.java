package defpackage;

import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kzq implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kzq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(new io60.a(((Boolean) obj).booleanValue()));
                break;
            default:
                x7c0 x7c0Var = (x7c0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x7c0Var.S0().S1(true);
                ytw<Boolean> ytwVar = x7c0Var.j1;
                Boolean bool = Boolean.FALSE;
                x5a0 x5a0Var = (x5a0) ytwVar;
                x5a0Var.setValue(bool);
                if (zBooleanValue) {
                    x7c0Var.p1 = 1;
                    x7c0Var.R0().P1(1);
                    x7c0Var.R0().Q1(-1);
                    Boolean bool2 = Boolean.TRUE;
                    x5a0Var.setValue(bool2);
                    ((u5a0) x7c0Var.n1).k(15);
                    x7c0Var.R0().M1(!((BetContainerState) x7c0Var.R0().a.getValue()).getExtraKey());
                    x7c0Var.R0().R1(true);
                    x7c0Var.R0().S1(false);
                    ((x5a0) x7c0Var.R0().c).setValue(bool2);
                } else {
                    x5a0Var.setValue(bool);
                    x7c0Var.R0().R1(false);
                    x7c0Var.R0().Q1(-1);
                    x7c0Var.R0().M1(!((BetContainerState) x7c0Var.R0().a.getValue()).getExtraKey());
                    ((x5a0) x7c0Var.R0().c).setValue(bool);
                }
                x7c0Var.S0().P1(0);
                break;
        }
        return Unit.a;
    }
}
