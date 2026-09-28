package defpackage;

import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Results;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class gm50 implements gv5<BaseResponse<Results>> {
    public final /* synthetic */ fm50.b a;

    public gm50(fm50.b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<Results>> su5Var, Throwable th) {
        fm50.b bVar = this.a;
        TextView textView = bVar.b;
        bVar.c.b = null;
        if (su5Var.isCanceled()) {
            return;
        }
        bVar.a.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(sn5.b(fm50.this.a, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<Results>> su5Var, bi50<BaseResponse<Results>> bi50Var) {
        BaseResponse<Results> baseResponse;
        Results results;
        List<Tournament> list;
        fm50.b bVar = this.a;
        TextView textView = bVar.b;
        fm50 fm50Var = fm50.this;
        bVar.c.b = null;
        if (su5Var.isCanceled()) {
            return;
        }
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || (results = baseResponse.data) == null || (list = results.tournaments) == null) {
            bVar.a.setVisibility(8);
            textView.setVisibility(0);
            textView.setText(sn5.b(fm50Var.a, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
            return;
        }
        ArrayList arrayListH = kgb0.h(list, false);
        if (arrayListH.size() > 0) {
            bVar.c.f = ((Tournament) uts.a(1, list)).id;
            int size = fm50Var.b.size() - 1;
            fm50Var.b.addAll(size, arrayListH);
            fm50Var.notifyItemRangeInserted(size, arrayListH.size());
        }
        bVar.c.a = baseResponse.data.moreEvents;
        fm50Var.notifyItemChanged(fm50Var.b.size() - 1);
    }
}
