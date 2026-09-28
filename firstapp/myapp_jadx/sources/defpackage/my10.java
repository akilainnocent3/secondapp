package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class my10 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ my10(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        zt50 zt50Var;
        nk2 binding;
        c920 binding2;
        nk2 binding3;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zy10 zy10Var = (zy10) obj2;
                zy10Var.R = ((Boolean) obj).booleanValue();
                zy10Var.T = 0;
                zt50 zt50Var2 = zy10Var.b;
                zy10Var.q0(zt50Var2 != null ? zt50Var2.S : null);
                zt50 zt50Var3 = zy10Var.b;
                if (zt50Var3 != null && (binding3 = zt50Var3.S.getBinding()) != null && binding3.W.getVisibility() == 0) {
                    zy10Var.e = false;
                }
                wz.a(zy10Var.R ? "AutoBetOnRED" : "AutoBetOffRED", "Pocket Rockets", "bet");
                if (!zy10Var.R && (zt50Var = zy10Var.b) != null && (binding = zt50Var.S.getBinding()) != null && (binding2 = binding.d.getBinding()) != null) {
                    binding2.b.setText("");
                }
                break;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                ((Function1) obj2).invoke(new bri0.c0(ijf0Var));
                break;
        }
        return Unit.a;
    }
}
