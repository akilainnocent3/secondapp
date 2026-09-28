package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rh9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ rh9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(pib0.a(R.drawable.ic__cancel, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, null, ((lib0) aVar.O(oib0.a)).P, aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return a4h.b(a4h.a(new un5((Context) qn70Var.a(jq40.a(Context.class), null, null)), new mp5((Context) qn70Var.a(jq40.a(Context.class), null, null)), new mo5((Context) qn70Var.a(jq40.a(Context.class), null, null)), new lp5((Context) qn70Var.a(jq40.a(Context.class), null, null), (k5b) qn70Var.a(jq40.a(k5b.class), null, cob0.a)), new yn5((Context) qn70Var.a(jq40.a(Context.class), null, null))));
        }
    }
}
