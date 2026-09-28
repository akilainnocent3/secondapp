package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class rkz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rkz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w3c0 w3c0Var;
        w3c0 w3c0Var2;
        w3c0 w3c0Var3;
        w3c0 w3c0Var4;
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        qq80 binding6;
        qq80 binding7;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mk50.c cVar = (mk50.c) ((mk50) obj2);
                return new okz.e(a4h.f(CollectionsKt.i0(((okz.e) cVar.a).a, ((okz.d) obj).a())), ((okz.e) cVar.a).b);
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                String str = (String) obj;
                str.getClass();
                if (!q1c0Var.G.isEmpty() && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.e.getBetPlaced() && (w3c0Var2 = (w3c0) q1c0Var.b) != null && !w3c0Var2.e.getBetInProgress()) {
                    q1c0Var.c0 = false;
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding7 = w3c0Var5.e.getBinding()) != null) {
                        binding7.v.setClickable(false);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding6 = w3c0Var6.e.getBinding()) != null) {
                        binding6.v.setAlpha(0.65f);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding5 = w3c0Var7.e.getBinding()) != null) {
                        binding5.L.setVisibility(8);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding4 = w3c0Var8.e.getBinding()) != null) {
                        binding4.h0.setVisibility(8);
                    }
                    w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                    if (w3c0Var9 != null && (binding3 = w3c0Var9.e.getBinding()) != null) {
                        binding3.j0.setVisibility(8);
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding2 = w3c0Var10.e.getBinding()) != null) {
                        binding2.v.setVisibility(0);
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    if (w3c0Var11 != null && (binding = w3c0Var11.e.getBinding()) != null) {
                        binding.t0.setVisibility(8);
                    }
                    Double dValueOf = null;
                    if (q1c0Var.V && (w3c0Var4 = (w3c0) q1c0Var.b) != null) {
                        dValueOf = Double.valueOf(w3c0Var4.e.getCashoutCoeff());
                    }
                    if (!q1c0Var.G.isEmpty() && (w3c0Var3 = (w3c0) q1c0Var.b) != null) {
                        q1c0Var.u2(1, str, dValueOf, w3c0Var3.e);
                    }
                    q1c0Var.X0();
                }
                q1c0Var.C1();
                q1c0Var.v2(1);
                return Unit.a;
        }
    }
}
