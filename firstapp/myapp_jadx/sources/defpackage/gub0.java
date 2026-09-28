package defpackage;

import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gub0 implements Function1 {
    public final /* synthetic */ qub0 a;

    public /* synthetic */ gub0(qub0 qub0Var) {
        this.a = qub0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b6c0 b6c0Var = (b6c0) obj;
        b6c0Var.getClass();
        qub0 qub0Var = this.a;
        qub0Var.q3(b6c0Var);
        a6c0 a6c0Var = qub0Var.d3;
        if (a6c0Var != null) {
            SHOverBetComponent sHOverBetComponent = a6c0Var.k;
            SHRangeComponent sHRangeComponent = a6c0Var.l;
            if (b6c0Var == b6c0.b && sHOverBetComponent != null) {
                Boolean bool = (Boolean) ((x5a0) gci0.h).getValue();
                sHOverBetComponent.setVipTheme(bool != null ? bool.booleanValue() : false);
            }
            if (b6c0Var == b6c0.c && sHRangeComponent != null) {
                Boolean bool2 = (Boolean) ((x5a0) gci0.h).getValue();
                sHRangeComponent.setVipTheme(bool2 != null ? bool2.booleanValue() : false);
            }
        }
        fd90 fd90Var = qub0Var.e3;
        if (fd90Var != null) {
            fd90Var.u();
        }
        return Unit.a;
    }
}
