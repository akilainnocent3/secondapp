package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vwu implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vwu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        w3c0 w3c0Var;
        w3c0 w3c0Var2;
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        w3c0 w3c0Var3;
        w3c0 w3c0Var4;
        qq80 binding6;
        qq80 binding7;
        int i = this.a;
        Double dValueOf = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                MatchEventActivity matchEventActivity = (MatchEventActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i2 = MatchEventActivity.a0;
                matchEventActivity.V1(zBooleanValue);
                matchEventActivity.T1(zBooleanValue);
                break;
            case 1:
                q1c0 q1c0Var = (q1c0) obj2;
                String str = (String) obj;
                str.getClass();
                if (q1c0Var.E != null && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.d.getBetPlaced() && (w3c0Var2 = (w3c0) q1c0Var.b) != null && !w3c0Var2.d.getBetInProgress()) {
                    q1c0Var.b0 = false;
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding7 = w3c0Var5.d.getBinding()) != null) {
                        binding7.v.setAlpha(0.65f);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding6 = w3c0Var6.d.getBinding()) != null) {
                        binding6.v.setClickable(false);
                    }
                    if (q1c0Var.P && (w3c0Var4 = (w3c0) q1c0Var.b) != null) {
                        dValueOf = Double.valueOf(w3c0Var4.d.getCashoutCoeff());
                    }
                    if (!q1c0Var.G.isEmpty() && (w3c0Var3 = (w3c0) q1c0Var.b) != null) {
                        q1c0Var.u2(0, str, dValueOf, w3c0Var3.d);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding5 = w3c0Var7.d.getBinding()) != null) {
                        binding5.L.setVisibility(8);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding4 = w3c0Var8.d.getBinding()) != null) {
                        binding4.h0.setVisibility(8);
                    }
                    w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                    if (w3c0Var9 != null && (binding3 = w3c0Var9.d.getBinding()) != null) {
                        binding3.j0.setVisibility(8);
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding2 = w3c0Var10.d.getBinding()) != null) {
                        binding2.v.setVisibility(0);
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    if (w3c0Var11 != null && (binding = w3c0Var11.d.getBinding()) != null) {
                        binding.t0.setVisibility(8);
                    }
                    q1c0Var.X0();
                }
                q1c0Var.C1();
                q1c0Var.v2(0);
                break;
            default:
                dgb0 dgb0Var = (dgb0) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                wwd0 wwd0Var = dgb0Var.H;
                wwd0Var.getClass();
                wwd0Var.k(null, num);
                dgb0Var.C1(null, true);
                break;
        }
        return Unit.a;
    }
}
