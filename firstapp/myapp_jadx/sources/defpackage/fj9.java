package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fj9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ fj9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_help_pix_btg, 0, aVar), "help", j.r(d.a.b, 20.0f), c68.a(R.color.bg_brand_sub_primary_d_lighter, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new od60((Context) qn70Var.a(jq40.a(Context.class), null, null), (iua0) qn70Var.a(jq40.a(iua0.class), null, null), (com.sportygames.newcms.d) qn70Var.a(jq40.a(com.sportygames.newcms.d.class), null, null), (wd60) qn70Var.a(jq40.a(wd60.class), null, null), (vmy) qn70Var.a(jq40.a(vmy.class), null, null), (b5) qn70Var.a(jq40.a(b5.class), null, null), (pp5) qn70Var.a(jq40.a(pp5.class), null, null), (String) qn70Var.a(jq40.a(String.class), null, new eae0("qualifier_base_url_cdn")), (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a), (k5b) qn70Var.a(jq40.a(k5b.class), null, cob0.a));
        }
    }
}
