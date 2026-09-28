package defpackage;

import android.widget.TextView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.Tournament;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class pww implements gv5<BaseResponse<PreMatchSportsData>> {
    public final /* synthetic */ lww.f a;

    public pww(lww.f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<PreMatchSportsData>> su5Var, Throwable th) {
        lww.f fVar = this.a;
        TextView textView = fVar.b;
        fVar.c.b = null;
        lww lwwVar = lww.this;
        if (lwwVar.c.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        fVar.a.setVisibility(8);
        textView.setVisibility(0);
        textView.setText(lwwVar.c.getString(R.string.common_feedback__loading_failed_tap_to_reload));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<PreMatchSportsData>> su5Var, bi50<BaseResponse<PreMatchSportsData>> bi50Var) {
        BaseResponse<PreMatchSportsData> baseResponse;
        int i;
        lww.f fVar = this.a;
        fVar.c.b = null;
        lww lwwVar = lww.this;
        if (lwwVar.c.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        fVar.a.setVisibility(8);
        fVar.b.setVisibility(0);
        if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData()) {
            onFailure(su5Var, null);
            return;
        }
        eg20 eg20Var = fVar.c;
        PreMatchSportsData preMatchSportsData = baseResponse.data;
        eg20Var.a = preMatchSportsData.moreEvents;
        List<Tournament> list = preMatchSportsData.tournaments;
        int i2 = 1;
        if (list == null || list.size() <= 0) {
            i = 1;
        } else {
            List<Event> list2 = ((Tournament) uts.a(1, list)).events;
            long j = (list2 == null || list2.size() <= 0) ? 0L : ((Event) uts.a(1, list2)).estimateStartTime;
            long j2 = fVar.c.v;
            ArrayList arrayList = kgb0.a;
            ArrayList arrayList2 = new ArrayList();
            for (Tournament tournament : list) {
                for (Event event : tournament.events) {
                    ing ingVar = new ing();
                    int i3 = i2;
                    ArrayList arrayList3 = arrayList2;
                    ingVar.c = (vjt.a(j2, event.estimateStartTime) ? 1 : 0) ^ i3;
                    j2 = event.estimateStartTime;
                    ingVar.a = event;
                    ingVar.b = tournament.id;
                    ingVar.i = tournament.name;
                    ingVar.f = tournament.categoryName;
                    ingVar.v = false;
                    arrayList3.add(ingVar);
                    arrayList2 = arrayList3;
                    i2 = i3;
                }
            }
            i = i2;
            ArrayList arrayList4 = arrayList2;
            eg20 eg20Var2 = fVar.c;
            eg20Var2.v = j;
            PreMatchSportsData preMatchSportsData2 = baseResponse.data;
            int i4 = preMatchSportsData2.lastIndex;
            eg20Var2.f += i;
            eg20Var2.i = preMatchSportsData2.lastIndex;
            if (arrayList4.size() > 0) {
                if (lwwVar.w.size() > 0) {
                    List<jpc> list3 = lwwVar.w;
                    list3.addAll(list3.size() - i, arrayList4);
                } else {
                    lwwVar.w.addAll(arrayList4);
                }
                lwwVar.o();
            }
        }
        lwwVar.notifyItemChanged(lwwVar.y.size() - i);
    }
}
