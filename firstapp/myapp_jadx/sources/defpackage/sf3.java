package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.widget.BetslipActivity;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sf3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sf3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        rv80 binding;
        w3c0 w3c0Var;
        rv80 binding2;
        rv80 binding3;
        rv80 binding4;
        rv80 binding5;
        w3c0 w3c0Var2;
        rv80 binding6;
        pv80 binding7;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                Set<g08> set = BetslipActivity.X2;
                str.getClass();
                List listC = a.c(new Pair(AnalyticsParam.EVENT_PARAM_ID, str));
                azm azmVar = ((BetslipActivity) obj2).D;
                if (azmVar == null) {
                    Intrinsics.n("router");
                    throw null;
                }
                wae waeVar = wae.TRANS_SEARCH;
                fag fagVar = fag.PAYSLIP_IV_SHORTCUT;
                Bundle bundle = new Bundle();
                bundle.putSerializable("EXTRA_ENTRANCE", fagVar);
                azmVar.j(waeVar, listC, bundle);
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (q1c0Var.z1 && iIntValue == 0 && (w3c0Var2 = (w3c0) q1c0Var.b) != null && (binding6 = w3c0Var2.j0.getBinding()) != null && (binding7 = binding6.c.getBinding()) != null && binding7.w0.getVisibility() == 0) {
                    return Unit.a;
                }
                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                if (w3c0Var3 == null || (binding = w3c0Var3.j0.getBinding()) == null || binding.c.getFbgRoundId() != 0 || !((w3c0Var = (w3c0) q1c0Var.b) == null || (binding5 = w3c0Var.j0.getBinding()) == null || !binding5.c.getBetPlaced())) {
                    return Unit.a;
                }
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && (binding4 = w3c0Var4.j0.getBinding()) != null) {
                    binding4.c.p();
                }
                w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                if (w3c0Var5 != null && (binding3 = w3c0Var5.j0.getBinding()) != null) {
                    binding3.d.p();
                }
                w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                if (w3c0Var6 != null && (binding2 = w3c0Var6.j0.getBinding()) != null) {
                    binding2.c.y(iIntValue);
                }
                return Unit.a;
        }
    }
}
