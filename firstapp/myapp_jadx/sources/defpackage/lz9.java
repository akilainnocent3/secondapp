package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lz9 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(j.t(d.a.b, 32.0f, 4.0f), aVar, 6);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new fb((lzm) qn70Var.a(jq40.a(lzm.class), null, null), (msm) qn70Var.a(jq40.a(msm.class), null, null), (itm) qn70Var.a(jq40.a(itm.class), null, null), (v5b) qn70Var.a(jq40.a(v5b.class), null, null), (yxm) qn70Var.a(jq40.a(yxm.class), null, null));
        }
    }
}
