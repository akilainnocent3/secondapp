package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.realsports.SportBet;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.ROrder;
import com.sportybet.plugin.realsports.widget.NavigationBarLoadingView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class br30 implements gv5<BaseResponse<SportBet>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yq30 b;

    public br30(yq30 yq30Var, boolean z) {
        this.b = yq30Var;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<SportBet>> su5Var, Throwable th) {
        yq30 yq30Var = this.b;
        e activity = yq30Var.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || yq30Var.isDetached()) {
            return;
        }
        yq30Var.f.setRefreshing(false);
        if (this.a) {
            zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
        } else {
            yq30Var.i.c();
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<SportBet>> su5Var, bi50<BaseResponse<SportBet>> bi50Var) {
        List<Order> list;
        nr30 nr30Var;
        su5<BaseResponse<ROrder>> su5Var2;
        yq30 yq30Var = this.b;
        ArrayList arrayList = yq30Var.y;
        e activity = yq30Var.getActivity();
        if (activity == null || activity.isFinishing() || su5Var.isCanceled() || yq30Var.isDetached()) {
            return;
        }
        BaseResponse<SportBet> baseResponse = bi50Var.b;
        if (baseResponse != null && baseResponse.hasData()) {
            yq30Var.f.setRefreshing(false);
            NavigationBarLoadingView navigationBarLoadingView = yq30Var.i;
            if (navigationBarLoadingView.getVisibility() == 0) {
                navigationBarLoadingView.setVisibility(8);
            }
            SportBet sportBet = baseResponse.data;
            if (sportBet.totalNum == 0 || (list = sportBet.orders) == null) {
                NavigationBarLoadingView navigationBarLoadingView2 = yq30Var.i;
                String strD = sn5.d(yq30Var, R.string.bet_history__no_tickets_available, new Object[0]);
                navigationBarLoadingView2.setVisibility(0);
                navigationBarLoadingView2.b.setVisibility(8);
                navigationBarLoadingView2.a.setVisibility(8);
                navigationBarLoadingView2.c.setText(strD);
                navigationBarLoadingView2.e.setVisibility(8);
                navigationBarLoadingView2.c.setVisibility(0);
                navigationBarLoadingView2.d.setVisibility(0);
                vjx vjxVar = new vjx();
                for (int childCount = navigationBarLoadingView2.d.getChildCount() - 1; childCount >= 0; childCount--) {
                    navigationBarLoadingView2.d.getChildAt(childCount).setOnClickListener(vjxVar);
                }
                navigationBarLoadingView2.b();
                yq30Var.i.e(new ar30(yq30Var));
                return;
            }
            ArrayList arrayListF = kgb0.f(0L, list);
            if (arrayListF.size() > 0) {
                if (arrayList.size() > 1 && (su5Var2 = (nr30Var = (nr30) rh6.a(1, arrayList)).b) != null) {
                    su5Var2.cancel();
                    nr30Var.b = null;
                }
                arrayList.clear();
                arrayList.addAll(arrayListF);
                nr30 nr30Var2 = new nr30();
                Order order = (Order) uts.a(1, baseResponse.data.orders);
                nr30Var2.f = order.orderId;
                nr30Var2.g = order.createTime;
                nr30Var2.d = yq30Var.z;
                nr30Var2.a = baseResponse.data.totalNum > arrayList.size();
                nr30Var2.h = arrayList.size() >= 10;
                arrayList.add(nr30Var2);
                lr30 lr30Var = yq30Var.w;
                if (lr30Var != null) {
                    lr30Var.a = arrayList;
                    lr30Var.notifyDataSetChanged();
                    return;
                }
                lr30 lr30Var2 = new lr30();
                lr30Var2.b = activity;
                lr30Var2.a = arrayList;
                yq30Var.w = lr30Var2;
                yq30Var.v.setAdapter(lr30Var2);
                return;
            }
        }
        onFailure(su5Var, null);
    }
}
