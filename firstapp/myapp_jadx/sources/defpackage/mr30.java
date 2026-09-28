package defpackage;

import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.Order;
import com.sporty.android.core.model.realsports.SportBet;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class mr30 implements gv5<BaseResponse<SportBet>> {
    public final /* synthetic */ lr30.a a;

    public mr30(lr30.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<SportBet>> su5Var, Throwable th) {
        lr30.a aVar = this.a;
        TextView textView = aVar.b;
        aVar.c.c = null;
        lr30 lr30Var = lr30.this;
        if (lr30Var.b.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        aVar.a.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(sn5.b(lr30Var.b, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<SportBet>> su5Var, bi50<BaseResponse<SportBet>> bi50Var) {
        BaseResponse<SportBet> baseResponse;
        List<Order> list;
        lr30.a aVar = this.a;
        TextView textView = aVar.b;
        aVar.c.c = null;
        lr30 lr30Var = lr30.this;
        if (lr30Var.b.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData() || (list = baseResponse.data.orders) == null) {
            aVar.a.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(sn5.b(lr30Var.b, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
            return;
        }
        ArrayList arrayListF = kgb0.f(aVar.c.g, list);
        if (arrayListF.size() > 0) {
            aVar.c.f = baseResponse.data.orders.get(arrayListF.size() - 1).orderId;
            aVar.c.g = baseResponse.data.orders.get(arrayListF.size() - 1).createTime;
            ArrayList arrayList = lr30Var.a;
            arrayList.addAll(arrayList.size() - 1, arrayListF);
            lr30Var.notifyItemRangeInserted(lr30Var.a.size() - 1, arrayListF.size());
        }
        aVar.c.a = baseResponse.data.totalNum > lr30Var.a.size() - 1;
        lr30Var.notifyItemChanged(lr30Var.a.size() - 1);
    }
}
