package defpackage;

import android.view.ViewTreeObserver;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.spin2win.model.response.GameDetailsResponse;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class i1b0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ a1b0 a;

    public i1b0(a1b0 a1b0Var) {
        this.a = a1b0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        zp80 binding;
        ViewTreeObserver viewTreeObserver;
        ArrayList<Double> betChipList;
        zp80 binding2;
        a1b0 a1b0Var = this.a;
        wxi wxiVar = a1b0Var.v;
        if (wxiVar != null) {
            wxiVar.c.E(false);
        }
        wxi wxiVar2 = a1b0Var.v;
        if (wxiVar2 != null && (binding2 = wxiVar2.J.getBinding()) != null) {
            binding2.c3.performClick();
        }
        GameDetailsResponse gameDetailsResponse = a1b0Var.T;
        if (gameDetailsResponse != null && (betChipList = gameDetailsResponse.getBetChipList()) != null && !betChipList.isEmpty()) {
            double dDoubleValue = ((Number) CollectionsKt.q0(betChipList).get(0)).doubleValue();
            if (dDoubleValue != 0.0d) {
                a1b0Var.j0(dDoubleValue, AnalyticsParam.DATA_NORMAL);
            }
        }
        wxi wxiVar3 = a1b0Var.v;
        if (wxiVar3 == null || (binding = wxiVar3.J.getBinding()) == null || (viewTreeObserver = binding.c3.getViewTreeObserver()) == null) {
            return true;
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        return true;
    }
}
