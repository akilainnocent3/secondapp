package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ghc implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("SELECT order_id FROM real_bet_history_order_table WHERE is_selected_for_bulk_delete = 1");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (hq60VarH1.D1()) {
                        arrayList.add(hq60VarH1.k1(0));
                    }
                    hq60VarH1.close();
                    return arrayList;
                } catch (Throwable th) {
                    hq60VarH1.close();
                    throw th;
                }
        }
    }
}
