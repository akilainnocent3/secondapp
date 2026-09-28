package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zsc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zsc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj3).invoke((Long) obj);
                ((ytw) obj2).setValue(Boolean.FALSE);
                break;
            default:
                zp40 zp40Var = (zp40) obj3;
                nn40 nn40Var = (nn40) obj2;
                Double d = (Double) obj;
                if (!Intrinsics.c(d, zp40Var.a)) {
                    zp40Var.a = d != null ? d.doubleValue() : 0.0d;
                }
                nn40Var.V = 1;
                nn40Var.C0().d.m(d);
                Double d2 = nn40Var.C0().d.d();
                d2.getClass();
                double dDoubleValue = d2.doubleValue();
                Double d3 = nn40Var.N;
                double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
                B b = nn40Var.b;
                if (dDoubleValue > dDoubleValue2) {
                    xo40 xo40Var = (xo40) b;
                    if (xo40Var != null) {
                        xo40Var.C.setVisibility(0);
                    }
                    xo40 xo40Var2 = (xo40) nn40Var.b;
                    if (xo40Var2 != null) {
                        xo40Var2.e.setErrorBetAmount();
                    }
                    xo40 xo40Var3 = (xo40) nn40Var.b;
                    if (xo40Var3 != null) {
                        xo40Var3.X.setSeekMax();
                    }
                } else {
                    xo40 xo40Var4 = (xo40) b;
                    if (xo40Var4 != null) {
                        xo40Var4.C.setVisibility(4);
                    }
                    xo40 xo40Var5 = (xo40) nn40Var.b;
                    if (xo40Var5 != null) {
                        xo40Var5.e.setErrorBetAmountLayout();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
