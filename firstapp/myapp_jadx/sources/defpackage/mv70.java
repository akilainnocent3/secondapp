package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchlivepanel.SearchLivePanel;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchFragment$observe$1$2", f = "SearchFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mv70 extends tje0 implements Function2<gw70, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SearchFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv70(SearchFragment searchFragment, v1b<? super mv70> v1bVar) {
        super(2, v1bVar);
        this.b = searchFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mv70 mv70Var = new mv70(this.b, v1bVar);
        mv70Var.a = obj;
        return mv70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(gw70 gw70Var, v1b<? super Unit> v1bVar) {
        return ((mv70) create(gw70Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        gw70 gw70Var = (gw70) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = SearchFragment.V;
        final SearchFragment searchFragment = this.b;
        SearchLivePanel searchLivePanel = searchFragment.p0().H;
        mfb0 mfb0Var = gw70Var.a;
        RegularMarketRule regularMarketRule = gw70Var.b;
        List<Event> list = gw70Var.c;
        final boolean z = gw70Var.d;
        if (list == null) {
            searchFragment.p0().G.a.setVisibility(8);
            c8i0.f(searchLivePanel.getRecycler());
            searchLivePanel.getLoading().I();
            c8i0.n(searchLivePanel.getLoading());
        } else if (list.isEmpty()) {
            searchFragment.p0().G.a.setVisibility(8);
            c8i0.f(searchLivePanel.getRecycler());
            searchLivePanel.getLoading().G(R.string.common_functions__no_game);
            c8i0.n(searchLivePanel.getLoading());
        } else {
            c8i0.n(searchLivePanel.getLoading());
            final SearchLivePanel searchLivePanel2 = searchFragment.p0().H;
            jvd0 jvd0Var = searchFragment.E;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            ibs viewLifecycleOwner = searchFragment.getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            searchFragment.E = ebs.a(viewLifecycleOwner.getLifecycle()).b(new xv70(searchFragment, list, null));
            RecyclerView.f adapter = searchLivePanel2.getRecycler().getAdapter();
            if (adapter != null) {
                final cw70 cw70Var = (cw70) (adapter instanceof cw70 ? adapter : null);
                if (cw70Var != null) {
                    cw70Var.k().setSportRule(mfb0Var);
                    cw70Var.k().setMarketRule(regularMarketRule);
                    cw70Var.b.b(regularMarketRule, list, true);
                    searchLivePanel2.E(regularMarketRule);
                    cw70Var.j(list, new Runnable() { // from class: su70
                        @Override // java.lang.Runnable
                        public final void run() {
                            ohp<Object>[] ohpVarArr2 = SearchFragment.V;
                            if (z) {
                                cw70 cw70Var2 = cw70Var;
                                int size = cw70Var2.a.f.size();
                                for (int i = 0; i < size; i++) {
                                    cw70Var2.notifyItemChanged(i, Integer.valueOf(i));
                                }
                            }
                            SearchFragment searchFragment2 = searchFragment;
                            if (!searchFragment2.isAdded() || searchFragment2.getView() == null) {
                                return;
                            }
                            SearchLivePanel searchLivePanel3 = searchLivePanel2;
                            c8i0.f(searchLivePanel3.getLoading());
                            searchFragment2.p0().G.a.setVisibility(0);
                            c8i0.n(searchLivePanel3.getRecycler());
                        }
                    });
                    Unit unit = Unit.a;
                }
            }
        }
        return Unit.a;
    }
}
