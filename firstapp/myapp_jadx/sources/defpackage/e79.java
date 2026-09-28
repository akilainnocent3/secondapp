package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e79 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q330.a(h.f(j.r(d.a.b, 48.0f), 4.5f), ((lib0) aVar.O(oib0.a)).D, 4.5f, 0L, 0, 0.0f, aVar, 390, 56);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                vnr.a(qj40.a(1), (a) obj);
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new g4k((mum) qn70Var.a(jq40.a(mum.class), null, null), (b5) qn70Var.a(jq40.a(b5.class), null, null));
        }
    }
}
