package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w89 implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c55.a.a(31.0f, 2.0f, 197040, 1, ((lib0) aVar.O(oib0.a)).B, j060.c(((zib0) aVar.O(ajb0.a)).d), aVar, null);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new hja0((fzm) qn70Var.a(jq40.a(fzm.class), null, null), (dum) qn70Var.a(jq40.a(dum.class), null, null), (b5) qn70Var.a(jq40.a(b5.class), null, null));
        }
    }
}
