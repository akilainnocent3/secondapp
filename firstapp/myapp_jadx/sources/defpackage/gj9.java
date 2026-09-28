package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gj9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ gj9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_transactions_pix_btg, 0, aVar), "transactions", j.w(d.a.b, 21.0f), c68.a(R.color.bg_brand_sub_primary_d_lighter, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new mui0((Context) qn70Var.a(jq40.a(Context.class), null, null), (b5) qn70Var.a(jq40.a(b5.class), null, null));
        }
    }
}
