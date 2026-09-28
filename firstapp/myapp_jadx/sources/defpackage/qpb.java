package defpackage;

import com.sportybet.plugin.realsports.betslip.widget.QuickBetView;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qpb implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ qpb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new zqb((qsm) qn70Var.a(jq40.a(qsm.class), null, null), (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a));
            default:
                n780 n780Var = (n780) obj;
                boolean z = QuickBetView.j1;
                n780Var.getClass();
                return new Pair(n780Var, (Boolean) obj2);
        }
    }
}
