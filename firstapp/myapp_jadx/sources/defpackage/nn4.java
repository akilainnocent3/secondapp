package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nn4 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return (ntm) qn4.a((qn70) obj, (wrz) obj2, qrm.class, null, null);
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic_action_bar_back, 0, aVar), "back", j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar), aVar, 432, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
