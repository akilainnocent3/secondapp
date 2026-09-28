package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bj9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ bj9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.spr_ic_close_black_24dp, 0, aVar), AnalyticsParam.STORY_SKIP_REASON_CLOSE, j.r(d.a.b, 30.0f), c68.a(R.color.icon_primary, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new xn5((b5) qn70Var.a(jq40.a(b5.class), null, null), (String) qn70Var.a(jq40.a(String.class), null, new eae0("qualifier_base_url_cdn")), (mp5) qn70Var.a(jq40.a(mp5.class), null, null), (k5b) qn70Var.a(jq40.a(k5b.class), null, bob0.a), (OkHttpClient) qn70Var.a(jq40.a(OkHttpClient.class), null, null));
        }
    }
}
