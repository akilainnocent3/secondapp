package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.CashOutLoadingButton;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Bet;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gwu extends gi6 {
    public final bi6 b;
    public final wwd0 c;
    public final cwu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwu(ComposeView composeView, ArrayList arrayList, final xo6 xo6Var, bi6 bi6Var) {
        super(composeView, arrayList);
        arrayList.getClass();
        xo6Var.getClass();
        this.b = bi6Var;
        this.c = xwd0.a(new hwu(0));
        this.d = new cwu(this, 0);
        Context context = composeView.getContext();
        context.getClass();
        int iA = r0b.a(context, 10);
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        layoutParams.setMargins(iA, 0, iA, 0);
        composeView.setLayoutParams(layoutParams);
        composeView.setBackgroundColor(composeView.getContext().getColor(R.color.background_cashout_card));
        float dimension = composeView.getContext().getResources().getDimension(R.dimen.openbet_card_elevation);
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.l(composeView, dimension);
        composeView.setViewCompositionStrategy(u6i0.b.a);
        composeView.setContent(new op8(-182177604, new Function2() { // from class: dwu
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final gwu gwuVar = this.a;
                    final ytw ytwVarC = wyh.c(gwuVar.c, aVar, 0, 7);
                    hwu hwuVar = (hwu) ytwVarC.getValue();
                    bi6 bi6Var2 = gwuVar.b;
                    boolean zA = aVar.A(gwuVar) | aVar.M(ytwVarC);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new Function1() { // from class: ewu
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                Bet bet;
                                xgd0 xgd0Var = (xgd0) obj3;
                                xgd0Var.getClass();
                                ConstraintLayout constraintLayout = xgd0Var.a;
                                AppCompatTextView appCompatTextView = xgd0Var.f;
                                constraintLayout.getClass();
                                cq40 cq40Var = new cq40();
                                gwu gwuVar2 = gwuVar;
                                constraintLayout.setOnClickListener(new fwu(cq40Var, gwuVar2));
                                CashOutLoadingButton cashOutLoadingButton = xgd0Var.e;
                                cashOutLoadingButton.setCashOutSmallSize();
                                xgd0Var.B.setOnClickListener(new bjg(gwuVar2, 1));
                                bi6 bi6Var3 = gwuVar2.b;
                                cwu cwuVar = gwuVar2.d;
                                if (bi6Var3 != null) {
                                    pl6 pl6Var = ((hwu) ytwVarC.getValue()).a;
                                    bi6Var3.a.d.d(cashOutLoadingButton, (pl6Var == null || (bet = pl6Var.a) == null) ? false : bet.isFallbackCashOut);
                                }
                                if (bi6Var3 != null) {
                                    bi6Var3.a.d.a.z0().c(appCompatTextView, AnalyticsEvent.OPEN_BETS_REDUCED_OFFER_LABEL);
                                }
                                appCompatTextView.setOnClickListener(cwuVar);
                                xgd0Var.i.setOnClickListener(cwuVar);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY);
                    }
                    dhd0.b(hwuVar, xo6Var, bi6Var2, (Function1) objY, aVar, 64);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.gi6
    public final void a(int i) {
        pl6 pl6VarB = b(i);
        if (pl6VarB != null) {
            boolean z = pl6VarB.w;
            pl6VarB.w = false;
            hwu hwuVar = new hwu(pl6VarB.clone(), z);
            wwd0 wwd0Var = this.c;
            wwd0Var.getClass();
            wwd0Var.k(null, hwuVar);
        }
    }
}
