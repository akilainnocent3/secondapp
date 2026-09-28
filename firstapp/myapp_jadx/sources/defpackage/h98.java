package defpackage;

import android.widget.TextView;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.ROrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h98 extends SimpleResponseWrapper<ROrder> {
    public final /* synthetic */ g98.b a;

    public h98(g98.b bVar) {
        this.a = bVar;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        g98.b bVar = this.a;
        TextView textView = bVar.b;
        bVar.d.b = null;
        g98 g98Var = g98.this;
        if (g98Var.c.isFinishing()) {
            return;
        }
        textView.setVisibility(0);
        int bizCode = getBizCode();
        textView.setText((bizCode == 19411 || bizCode == 19413) ? getMessage() : sn5.b(g98Var.c, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        super.onResponseComplete();
        g98.b bVar = this.a;
        bVar.a.setVisibility(8);
        bVar.c.setVisibility(8);
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(ROrder rOrder) {
        List<RealBetHistoryOrderDto> list;
        ROrder rOrder2 = rOrder;
        g98.b bVar = this.a;
        bVar.d.b = null;
        g98 g98Var = g98.this;
        if (g98Var.c.isFinishing() || (list = rOrder2.entityList) == null) {
            return;
        }
        ArrayList arrayListA = sm7.a(bVar.d.g, list);
        if (arrayListA.size() > 0) {
            bVar.d.f = rOrder2.entityList.get(arrayListA.size() - 1).getOrderId();
            bVar.d.g = rOrder2.entityList.get(arrayListA.size() - 1).getCreateTime().longValue();
            ArrayList arrayList = g98Var.a;
            arrayList.addAll(arrayList.size() - 1, arrayListA);
            g98Var.notifyDataSetChanged();
        }
        bVar.d.a = rOrder2.entityList.size() == 10;
        g98Var.notifyItemChanged(g98Var.a.size() - 1);
    }
}
