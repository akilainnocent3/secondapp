package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.SearchLiveEventMeta;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xiz implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xiz(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        SearchLiveEventMeta searchLiveEventMetaK;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function2 function2 = (Function2) obj2;
                wwd0 wwd0Var = ((fjz) obj3).a;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, (eiz) function2.invoke((eiz) value, obj)));
                break;
            default:
                SearchLivePanel searchLivePanel = (SearchLivePanel) obj3;
                SearchFragment searchFragment = (SearchFragment) obj2;
                lk50 lk50Var = (lk50) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                if (lk50Var instanceof lk50.c) {
                    RecyclerView.f adapter = searchLivePanel.getRecycler().getAdapter();
                    if (adapter != null) {
                        if (!(adapter instanceof cw70)) {
                            adapter = null;
                        }
                        cw70 cw70Var = (cw70) adapter;
                        if (cw70Var != null && (searchLiveEventMetaK = cw70Var.k()) != null) {
                            searchLiveEventMetaK.setBoostInfoResult((BoostResult) ((lk50.c) lk50Var).a);
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    searchFragment.p0().G.a.setVisibility(8);
                    c8i0.f(searchLivePanel.getRecycler());
                    searchLivePanel.getLoading().I();
                    itf0.a.b(((lk50.a) lk50Var).a);
                }
                break;
        }
        return Unit.a;
    }
}
