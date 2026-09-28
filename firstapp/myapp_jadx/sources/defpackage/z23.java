package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.plugin.realsports.betslip.widget.BetSlipFooter;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.sportyherov2.components.ShAllBetList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z23 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z23(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                huy huyVar = (huy) obj;
                int i2 = BetSlipFooter.j0;
                huyVar.getClass();
                to3 to3Var = ((BetSlipFooter) obj2).H;
                if (to3Var != null) {
                    to3Var.d1(BetSlipFooter.i(huyVar));
                }
                return Unit.a;
            case 1:
                w78 w78Var = (w78) obj2;
                if (w78Var.K) {
                    w78Var.L.invoke();
                }
                return Unit.a;
            case 2:
                MatchEventDetailActivity matchEventDetailActivity = (MatchEventDetailActivity) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                int i3 = MatchEventDetailActivity.U;
                matchEventDetailActivity.X1(zBooleanValue);
                if (zBooleanValue) {
                    matchEventDetailActivity.V1("detail_market_category_tab_" + matchEventDetailActivity.getCMSString(R.string.page_instant_virtual__bet_builder, new Object[0]));
                }
                matchEventDetailActivity.W1(new a5o.m(((n4p) matchEventDetailActivity.C1()).c(), bool));
                matchEventDetailActivity.getFullStoryCommonManager().f(AnalyticsEvent.IV__EVENT_LIST__DETAILS__BET_BUILDER_BTN, jpu.b(new Pair(AnalyticsParam.EVENT_STATUS, bool)));
                return Unit.a;
            default:
                LoadingState loadingState = (LoadingState) obj;
                w3c0 w3c0Var = (w3c0) ((q1c0) obj2).b;
                if (w3c0Var != null) {
                    ShAllBetList shAllBetList = w3c0Var.k0;
                    loadingState.getClass();
                    shAllBetList.F = 1;
                    int i4 = ShAllBetList.a.a[loadingState.getStatus().ordinal()];
                    if (i4 == 1) {
                        shAllBetList.binding.i.setVisibility(0);
                        shAllBetList.binding.w.setVisibility(4);
                    } else if (i4 == 2) {
                        shAllBetList.binding.i.setVisibility(8);
                        shAllBetList.binding.w.setVisibility(0);
                        if (loadingState.getData() != null && (collection = (Collection) ((HTTPResponse) loadingState.getData()).getData()) != null && !collection.isEmpty()) {
                            shAllBetList.J(shAllBetList.F);
                            List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                            shAllBetList.binding.v.setVisibility(8);
                            if (shAllBetList.binding.w.getAdapter() != null) {
                                shAllBetList.binding.w.setAdapter(null);
                            }
                            shAllBetList.binding.w.setAdapter(new fvw(list));
                        }
                    } else {
                        if (i4 != 3) {
                            uhc.a();
                            return null;
                        }
                        shAllBetList.binding.i.setVisibility(8);
                        shAllBetList.I();
                    }
                }
                return Unit.a;
        }
    }
}
