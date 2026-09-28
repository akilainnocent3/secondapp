package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.newcms.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qm4 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new ohn((srm) qn70Var.a(jq40.a(srm.class), null, null), (prm) qn70Var.a(jq40.a(prm.class), null, null), (rrm) qn70Var.a(jq40.a(rrm.class), null, null), (qrm) qn70Var.a(jq40.a(qrm.class), null, null), (trm) qn70Var.a(jq40.a(trm.class), null, null), (lum) qn70Var.a(jq40.a(lum.class), null, null));
            default:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mw90.a(c.c(shj.v0.G, new String[0], aVar), "logo", j.i(j.w(d.a.b, 122.0f), 30.0f), null, null, null, null, aVar, 432, 2040);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
