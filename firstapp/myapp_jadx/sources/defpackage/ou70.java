package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.search.SearchFragment;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SearchPreMatchPanel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ou70 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ou70(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                SearchPreMatchPanel searchPreMatchPanel = (SearchPreMatchPanel) obj2;
                lk50 lk50Var = (lk50) obj;
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                if (lk50Var instanceof lk50.c) {
                    searchPreMatchPanel.n((List) ((lk50.c) lk50Var).a);
                } else {
                    searchPreMatchPanel.l(sn5.c(searchPreMatchPanel, R.string.common_functions__no_game, new Object[0]));
                }
                break;
            default:
                long jLongValue = ((Long) obj).longValue();
                k6c0 k6c0VarN3 = ((qub0) obj2).N3();
                k6c0VarN3.getClass();
                ej5.c(o8i0.d(k6c0VarN3), null, null, new d6c0(k6c0VarN3, jLongValue, null), 3);
                break;
        }
        return Unit.a;
    }
}
