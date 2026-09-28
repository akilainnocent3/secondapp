package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class zw10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ zw10(Fragment fragment, int i) {
        this.a = i;
        this.b = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Fragment fragment = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) fragment;
                int iIntValue = ((Integer) obj).intValue();
                zt50 zt50Var = zy10Var.b;
                if (zt50Var == null || iIntValue != zt50Var.R.getHintAmount1Click()) {
                    zt50 zt50Var2 = zy10Var.b;
                    if (zt50Var2 == null || iIntValue != zt50Var2.R.getHintAmount2Click()) {
                        zt50 zt50Var3 = zy10Var.b;
                        if (zt50Var3 == null || iIntValue != zt50Var3.R.getHintAmount3Click()) {
                            zt50 zt50Var4 = zy10Var.b;
                            if (zt50Var4 != null && iIntValue == zt50Var4.R.getHintAmount4Click()) {
                                zy10Var.G0("BetPURPLEChip4Click");
                            }
                        } else {
                            zy10Var.G0("BetPURPLEChip3Click");
                        }
                    } else {
                        zy10Var.G0("BetPURPLEChip2Click");
                    }
                } else {
                    zy10Var.G0("BetPURPLEChip1Click");
                }
                zt50 zt50Var5 = zy10Var.b;
                if (zt50Var5 != null) {
                    zt50Var5.z.e();
                }
                zt50 zt50Var6 = zy10Var.b;
                if (zt50Var6 != null) {
                    zt50Var6.S.e();
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                ((l560) fragment).z0(str);
                break;
        }
        return Unit.a;
    }
}
