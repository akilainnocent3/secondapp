package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class sv70 implements sw70 {
    public final /* synthetic */ SearchLivePanel a;

    public sv70(SearchLivePanel searchLivePanel, SearchFragment searchFragment) {
        this.a = searchLivePanel;
    }

    @Override // defpackage.sw70
    public final void a(int i, final String str) {
        str.getClass();
        RecyclerView.f adapter = this.a.getRecycler().getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof cw70)) {
                adapter = null;
            }
            final cw70 cw70Var = (cw70) adapter;
            if (cw70Var == null) {
                return;
            }
            cw70Var.b.h(i, str, new Function1() { // from class: rv70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    cw70 cw70Var2 = cw70Var;
                    List<T> list = cw70Var2.a.f;
                    list.getClass();
                    String str2 = str;
                    str2.getClass();
                    cw70Var2.b.getClass();
                    vfh0.a(str2, (String) obj, list);
                    cw70Var2.notifyDataSetChanged();
                    return Unit.a;
                }
            });
        }
    }

    @Override // defpackage.sw70
    public final int b(String str) {
        str.getClass();
        RecyclerView.f adapter = this.a.getRecycler().getAdapter();
        if (adapter == null) {
            return 0;
        }
        if (!(adapter instanceof cw70)) {
            adapter = null;
        }
        cw70 cw70Var = (cw70) adapter;
        if (cw70Var == null) {
            return 0;
        }
        return cw70Var.b.f(str);
    }

    @Override // defpackage.sw70
    public final List<String> c() {
        RecyclerView.f adapter = this.a.getRecycler().getAdapter();
        if (adapter != null) {
            if (!(adapter instanceof cw70)) {
                adapter = null;
            }
            cw70 cw70Var = (cw70) adapter;
            if (cw70Var != null) {
                return cw70Var.b.g();
            }
        }
        return m2g.a;
    }
}
