package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oq2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Double dY1;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                lb80.c(pb80Var, (String) obj2);
                break;
            case 1:
                fgg fggVar = (fgg) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.getString(R.string.click_chip);
                string.getClass();
                ypa0VarD0.A1(0L, string);
                fggVar.I = 1;
                jhg jhgVar = (jhg) fggVar.b;
                if (jhgVar != null) {
                    jhgVar.i.setBetAmount(dDoubleValue, fggVar.W);
                }
                bo1 bo1Var = (bo1) fggVar.a;
                if (bo1Var != null) {
                    ssw<Double> sswVar = bo1Var.b;
                    Double d = sswVar.d();
                    sswVar.m(d != null ? Double.valueOf(d.doubleValue() + dDoubleValue) : null);
                }
                bo1 bo1Var2 = (bo1) fggVar.a;
                double dDoubleValue2 = (bo1Var2 == null || (dY1 = bo1Var2.y1()) == null) ? 0.0d : dY1.doubleValue();
                Double d2 = fggVar.E;
                double dDoubleValue3 = d2 != null ? d2.doubleValue() : 0.0d;
                B b = fggVar.b;
                if (dDoubleValue2 > dDoubleValue3) {
                    jhg jhgVar2 = (jhg) b;
                    if (jhgVar2 != null) {
                        jhgVar2.F.setVisibility(0);
                    }
                    jhg jhgVar3 = (jhg) fggVar.b;
                    if (jhgVar3 != null) {
                        jhgVar3.c.setErrorBetAmount();
                    }
                } else {
                    jhg jhgVar4 = (jhg) b;
                    if (jhgVar4 != null) {
                        jhgVar4.F.setVisibility(4);
                    }
                    jhg jhgVar5 = (jhg) fggVar.b;
                    if (jhgVar5 != null) {
                        jhgVar5.c.setErrorBetAmountLayout();
                    }
                }
                break;
            default:
                fxh fxhVar = (fxh) obj2;
                pb80 pb80Var2 = (pb80) obj;
                if (fxhVar.invoke() > 0.0f) {
                    lb80.g(pb80Var2, new m230(fxhVar.invoke(), new gt7(0.0f, 1.0f), 0));
                }
                break;
        }
        return Unit.a;
    }
}
