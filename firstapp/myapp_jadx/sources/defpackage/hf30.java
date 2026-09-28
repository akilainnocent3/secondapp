package defpackage;

import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes7.dex */
public final class hf30 extends OneUpTwoUpSwitch.d {
    public final /* synthetic */ QuickBetView a;

    public hf30(QuickBetView quickBetView) {
        this.a = quickBetView;
    }

    @Override // com.sportybet.android.widget.OneUpTwoUpSwitch.d
    public final void d(OneUpTwoUpSwitch.f fVar) {
        Selection selection;
        QuickBetView quickBetView = this.a;
        tf30 tf30Var = quickBetView.d0;
        if (tf30Var == null || (selection = QuickBetView.n1) == null) {
            return;
        }
        quickBetView.getOneTwoUpItemControl().getSwitchView().setActivate(false);
        zuy zuyVarE = hih0.e(quickBetView.getOneTwoUpItemControl().getSwitchView().getA());
        avy avyVarG = hih0.g(fVar);
        List listC = a.c(selection);
        tf30Var.z1(g880.n(listC, zuyVarE, avyVarG).getRequestBody(), aak.c, listC);
        quickBetView.b0(avyVarG);
    }
}
