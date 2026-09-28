package defpackage;

import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wfz implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wfz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                h8f0 h8f0Var = (h8f0) obj;
                return Boolean.valueOf(h8f0Var != null ? ((Boolean) ((x5a0) h8f0Var.b).getValue()).booleanValue() : false);
            case 1:
                qub0 qub0Var = (qub0) obj;
                qub0Var.p1 = 2;
                ul2 ul2VarS0 = qub0Var.S0();
                boolean zBooleanValue = ((Boolean) ((x5a0) qub0Var.F2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) qub0Var.I2).getValue();
                qub0Var.Y2(ul2VarS0, zBooleanValue, num != null ? num.intValue() : 0);
                return Unit.a;
            case 2:
                e activity = ((znf0) obj).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return Unit.a;
            default:
                ((Function1) obj).invoke(g1k0.e.a);
                return Unit.a;
        }
    }
}
