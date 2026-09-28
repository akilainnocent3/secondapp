package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class dxb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dxb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        qq80 binding6;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0 || ogx.a("-?\\d*(\\.\\d{0,2})?", str)) {
                    function1.invoke(str);
                }
                break;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                q1c0Var.T = (int) ((Double) obj).doubleValue();
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                if (w3c0Var != null && (binding6 = w3c0Var.e.getBinding()) != null) {
                    binding6.d.setStatus(true);
                }
                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                if (w3c0Var2 != null) {
                    w3c0Var2.e.E();
                }
                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                if (w3c0Var3 != null) {
                    w3c0Var3.d.E();
                }
                q1c0Var.U = true;
                q1c0Var.R = 0;
                q1c0Var.C1();
                wz.a("AutoBet", "Sporty Hero", "2", q1c0Var.U ? "On" : "Off");
                q1c0Var.n3();
                ((x5a0) q1c0Var.R1).setValue(Boolean.FALSE);
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && (binding = w3c0Var4.e.getBinding()) != null && binding.h0.getVisibility() == 0) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding5 = w3c0Var5.e.getBinding()) != null) {
                        binding5.h0.setVisibility(8);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding4 = w3c0Var6.e.getBinding()) != null) {
                        binding4.L.setVisibility(8);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding3 = w3c0Var7.e.getBinding()) != null) {
                        binding3.j0.setVisibility(8);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding2 = w3c0Var8.e.getBinding()) != null) {
                        binding2.t0.setVisibility(0);
                    }
                    q1c0Var.c0 = false;
                }
                break;
        }
        return Unit.a;
    }
}
