package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class en4 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new bp4((srm) qn70Var.a(jq40.a(srm.class), null, null), (rrm) qn70Var.a(jq40.a(rrm.class), null, null), (v5b) qn70Var.a(jq40.a(v5b.class), null, null));
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h9n.a(erz.a(R.drawable.ic_check, 0, aVar), null, h.j(d.a.b, 12.0f, 0.0f, 0.0f, 0.0f, 14), null, null, 0.0f, null, aVar, 432, 120);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
