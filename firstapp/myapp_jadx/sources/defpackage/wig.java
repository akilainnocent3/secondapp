package defpackage;

import com.sportybet.plugin.event.EventActivity;
import com.sportybet.plugin.realsports.search.SearchFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wig implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                EventActivity eventActivity = (EventActivity) obj;
                agd0 agd0Var = eventActivity.R;
                if (agd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                int i2 = 0;
                agd0Var.H.setVisibility(0);
                agd0 agd0Var2 = eventActivity.R;
                if (agd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                agd0Var2.I.setVisibility(0);
                List list = (List) eventActivity.T.get("market_search");
                if (list == null) {
                    list = m2g.a;
                }
                ArrayList arrayListH = vpu.h(list, hhy.a());
                agd0 agd0Var3 = eventActivity.R;
                if (agd0Var3 != null) {
                    jjy.c(agd0Var3.H, arrayListH, eventActivity.b0, new njg(eventActivity, i2), new sub(eventActivity, 1), true);
                    return Unit.a;
                }
                Intrinsics.n("binding");
                throw null;
            case 1:
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                ((SearchFragment) obj).u0();
                return Unit.a;
            default:
                ((q1c0) obj).a2();
                return Unit.a;
        }
    }
}
