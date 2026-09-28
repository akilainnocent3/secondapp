package defpackage;

import android.widget.TextView;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.ROrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class qr30 extends SimpleResponseWrapper<ROrder> {
    public final /* synthetic */ pr30.b a;

    public qr30(pr30.b bVar) {
        this.a = bVar;
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onFailure(Throwable th) {
        pr30.b bVar = this.a;
        TextView textView = bVar.b;
        bVar.d.b = null;
        pr30 pr30Var = pr30.this;
        if (pr30Var.c.isFinishing()) {
            return;
        }
        textView.setVisibility(0);
        int bizCode = getBizCode();
        textView.setText((bizCode == 19411 || bizCode == 19413) ? getMessage() : sn5.b(pr30Var.c, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseComplete() {
        super.onResponseComplete();
        pr30.b bVar = this.a;
        bVar.a.setVisibility(8);
        bVar.c.setVisibility(8);
    }

    @Override // com.sportybet.android.data.SimpleResponseWrapper
    public final void onSuccess(ROrder rOrder) {
        List<RealBetHistoryOrderDto> list;
        ROrder rOrder2 = rOrder;
        pr30.b bVar = this.a;
        bVar.d.b = null;
        pr30 pr30Var = pr30.this;
        if (pr30Var.c.isFinishing() || (list = rOrder2.entityList) == null) {
            return;
        }
        ArrayList arrayListG = kgb0.g(bVar.d.g, list);
        if (arrayListG.size() > 0) {
            bVar.d.f = rOrder2.entityList.get(arrayListG.size() - 1).getOrderId();
            bVar.d.g = rOrder2.entityList.get(arrayListG.size() - 1).getCreateTime().longValue();
            ArrayList arrayList = pr30Var.a;
            arrayList.addAll(arrayList.size() - 1, arrayListG);
            pr30Var.notifyDataSetChanged();
        }
        bVar.d.a = rOrder2.entityList.size() == 10;
        pr30Var.notifyItemChanged(pr30Var.a.size() - 1);
    }
}
