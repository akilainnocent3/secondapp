package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o8a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o8a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                wwd0 wwd0Var = ((xw4) obj).d;
                Boolean bool = Boolean.FALSE;
                wwd0Var.getClass();
                wwd0Var.k(null, bool);
                break;
            default:
                l560 l560Var = (l560) obj;
                eo80 eo80Var = l560Var.l0;
                String strValueOf = String.valueOf(eo80Var != null ? eo80Var.C0.getText() : null);
                double d = 0.0d;
                double dA = (strValueOf.length() <= 0 || strValueOf.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) ? 0.0d : j560.a(1, 0, strValueOf);
                eo80 eo80Var2 = l560Var.l0;
                if (String.valueOf(eo80Var2 != null ? eo80Var2.r0.getText() : null).length() > 0) {
                    eo80 eo80Var3 = l560Var.l0;
                    d = Double.parseDouble(String.valueOf(eo80Var3 != null ? eo80Var3.r0.getText() : null));
                }
                l560Var.K0(dA, d);
                int i2 = l560Var.B;
                eo80 eo80Var4 = l560Var.l0;
                if (i2 == 2) {
                    if (eo80Var4 != null) {
                        eo80Var4.C0.setText(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                    }
                } else if (eo80Var4 != null) {
                    eo80Var4.r0.setText("");
                }
                eo80 eo80Var5 = l560Var.l0;
                if (eo80Var5 != null) {
                    eo80Var5.b.setVisibility(8);
                }
                break;
        }
        return Unit.a;
    }
}
