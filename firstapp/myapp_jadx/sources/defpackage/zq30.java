package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.data.AdsData;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.RLoadMoreItem;
import com.sportybet.plugin.jackpot.data.SportBet;
import com.sportybet.plugin.jackpot.widget.NavigationBarLoadingView;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zq30 implements gv5<BaseResponse<SportBet>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cr30 b;

    public zq30(cr30 cr30Var, boolean z) {
        this.b = cr30Var;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<SportBet>> su5Var, Throwable th) {
        cr30 cr30Var = this.b;
        e activity = cr30Var.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || cr30Var.isDetached()) {
            return;
        }
        cr30Var.f.setRefreshing(false);
        if (this.a) {
            zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
        } else {
            cr30Var.i.b();
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<SportBet>> su5Var, bi50<BaseResponse<SportBet>> bi50Var) {
        List<Order> list;
        RLoadMoreItem rLoadMoreItem;
        su5<BaseResponse<SportBet>> su5Var2;
        cr30 cr30Var = this.b;
        ArrayList arrayList = cr30Var.y;
        e activity = cr30Var.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || cr30Var.isDetached()) {
            return;
        }
        BaseResponse<SportBet> baseResponse = bi50Var.b;
        if (baseResponse != null && baseResponse.hasData()) {
            cr30Var.f.setRefreshing(false);
            NavigationBarLoadingView navigationBarLoadingView = cr30Var.i;
            if (navigationBarLoadingView.getVisibility() == 0) {
                navigationBarLoadingView.setVisibility(8);
            }
            SportBet sportBet = baseResponse.data;
            int i = 1;
            if (sportBet.totalNum == 0 || (list = sportBet.orders) == null) {
                NavigationBarLoadingView navigationBarLoadingView2 = cr30Var.i;
                String strC = sn5.c(navigationBarLoadingView2, R.string.bet_history__no_tickets_available, new Object[0]);
                navigationBarLoadingView2.setVisibility(0);
                navigationBarLoadingView2.b.setVisibility(8);
                navigationBarLoadingView2.a.setVisibility(8);
                navigationBarLoadingView2.c.setText(strC);
                navigationBarLoadingView2.e.setVisibility(8);
                navigationBarLoadingView2.c.setVisibility(0);
                navigationBarLoadingView2.d.setVisibility(0);
                wjx wjxVar = new wjx();
                for (int childCount = navigationBarLoadingView2.d.getChildCount() - 1; childCount >= 0; childCount--) {
                    navigationBarLoadingView2.d.getChildAt(childCount).setOnClickListener(wjxVar);
                }
                su5<BaseResponse<AdsData>> su5Var3 = navigationBarLoadingView2.w;
                if (su5Var3 != null) {
                    su5Var3.cancel();
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(new JSONObject().put("spotId", "orderBottom"));
                    jSONObject.put("adSpots", jSONArray);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                su5<BaseResponse<AdsData>> su5VarA = navigationBarLoadingView2.v.a(jSONObject.toString());
                navigationBarLoadingView2.w = su5VarA;
                su5VarA.G(new yjx(navigationBarLoadingView2));
                cr30Var.i.d(new ba3(cr30Var, i));
                return;
            }
            for (Order order : list) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SPORTY_JACKPOT);
                aVar.a(order.toString(), new Object[0]);
            }
            ArrayList arrayListA = ikk.a(0L, list);
            if (arrayListA.size() > 0) {
                if (arrayList.size() > 1 && (su5Var2 = (rLoadMoreItem = (RLoadMoreItem) rh6.a(1, arrayList)).mJackpotListPending) != null) {
                    su5Var2.cancel();
                    rLoadMoreItem.mJackpotListPending = null;
                }
                arrayList.clear();
                arrayList.addAll(arrayListA);
                RLoadMoreItem rLoadMoreItem2 = new RLoadMoreItem();
                Order order2 = (Order) uts.a(1, baseResponse.data.orders);
                rLoadMoreItem2.lastId = order2.orderId;
                rLoadMoreItem2.lastCreateTime = order2.createTime;
                rLoadMoreItem2.isSettled = cr30Var.z;
                rLoadMoreItem2.moreEvents = baseResponse.data.totalNum > arrayList.size();
                rLoadMoreItem2.showNoMoreTickets = arrayList.size() >= 10;
                arrayList.add(rLoadMoreItem2);
                kr30 kr30Var = cr30Var.w;
                if (kr30Var != null) {
                    kr30Var.a = arrayList;
                    kr30Var.notifyDataSetChanged();
                    return;
                }
                kr30 kr30Var2 = new kr30();
                kr30Var2.b = activity;
                kr30Var2.a = arrayList;
                cr30Var.w = kr30Var2;
                cr30Var.v.setAdapter(kr30Var2);
                return;
            }
        }
        onFailure(su5Var, null);
    }
}
