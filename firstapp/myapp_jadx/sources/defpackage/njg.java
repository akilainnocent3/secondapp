package defpackage;

import android.view.View;
import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.data.FilteredMarkets;
import com.sportybet.plugin.realsports.event.EventLiveAdapter;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class njg implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ njg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj2;
                rgy rgyVar = (rgy) obj;
                int i2 = EventActivity.U0;
                rgyVar.getClass();
                eventActivity.C1();
                eventActivity.b0 = rgyVar;
                eventActivity.O1();
                HashMap map = eventActivity.T;
                List list = (List) map.get("all");
                if (list == null) {
                    list = m2g.a;
                }
                FilteredMarkets filteredMarketsB = vpu.b(eventActivity.a0, list);
                List list2 = (List) map.get("market_search");
                if (list2 != null) {
                    list2.clear();
                    list2.addAll(filteredMarketsB.getMarkets());
                }
                EventLiveAdapter eventLiveAdapter = eventActivity.w0;
                if (eventLiveAdapter != null) {
                    eventLiveAdapter.setMarkets(filteredMarketsB.getMarkets(), eventActivity.d0, eventActivity.b0);
                }
                break;
            default:
                ((View) obj).getClass();
                ((q1c0) obj2).K0();
                break;
        }
        return Unit.a;
    }
}
