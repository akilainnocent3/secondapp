package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common_ui.widgets.d;
import com.sporty.android.common_ui.widgets.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.FilteredMarkets;
import com.sportybet.plugin.realsports.data.Market;
import com.sportybet.plugin.realsports.event.PreMatchEventAdapter;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cc20 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                String str = (String) obj;
                int i2 = PreMatchEventActivity.a2;
                str.getClass();
                preMatchEventActivity.y1 = str;
                int length = str.length();
                HashMap<String, List<Market>> map = preMatchEventActivity.M;
                if (length == 0) {
                    List<Market> list = map.get("market_search");
                    if (list != null) {
                        list.clear();
                    }
                } else {
                    List<Market> list2 = map.get("all");
                    if (list2 == null) {
                        list2 = m2g.a;
                    }
                    FilteredMarkets filteredMarketsB = vpu.b(preMatchEventActivity.y1, list2);
                    String keyword = filteredMarketsB.getKeyword();
                    if (keyword == null) {
                        keyword = "";
                    }
                    List<Market> list3 = map.get("market_search");
                    if (list3 != null) {
                        list3.clear();
                    }
                    List<Market> list4 = map.get("market_search");
                    if (list4 != null) {
                        list4.addAll(filteredMarketsB.getMarkets());
                    }
                    str = keyword;
                }
                if (!preMatchEventActivity.w1 || preMatchEventActivity.y1.length() <= 0) {
                    ComposeView composeView = preMatchEventActivity.v1;
                    if (composeView != null) {
                        composeView.setVisibility(8);
                    }
                } else {
                    ComposeView composeView2 = preMatchEventActivity.v1;
                    if (composeView2 != null) {
                        composeView2.setVisibility(0);
                    }
                }
                PreMatchEventAdapter preMatchEventAdapter = preMatchEventActivity.A0;
                if (preMatchEventAdapter != null) {
                    preMatchEventAdapter.setMarkets(map.get("market_search"), preMatchEventActivity.x0, "market_search", preMatchEventActivity.z1);
                }
                aq70 aq70Var = preMatchEventActivity.B0;
                if (aq70Var != null && (recyclerView = preMatchEventActivity.U) != null) {
                    recyclerView.k0(aq70Var);
                }
                PreMatchEventAdapter preMatchEventAdapter2 = preMatchEventActivity.A0;
                if (preMatchEventAdapter2 != null) {
                    preMatchEventAdapter2.notifyDataSetChanged();
                }
                return str;
            default:
                loe0 loe0Var = (loe0) obj2;
                View view = (View) obj;
                view.getClass();
                Context contextRequireContext = loe0Var.requireContext();
                contextRequireContext.getClass();
                e eVar = new e(contextRequireContext);
                eVar.c = d.a.C0204a.b;
                eVar.e = sn5.d(loe0Var, R.string.common_payment_providers__withdraw_asset_unsupported_tooltips_hint, new Object[0]);
                eVar.b(view);
                return Unit.a;
        }
    }
}
