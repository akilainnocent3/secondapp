package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l79 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ l79(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g75.a(androidx.compose.foundation.a.b(ls7.a(h.j(j.r(d.a.b, 32.0f), 0.0f, ((cjb0) aVar.O(ejb0.a)).e, 0.0f, 18.0f, 5), j060.c(((zib0) aVar.O(ajb0.a)).d)), ((lib0) aVar.O(oib0.a)).B, zk40.a), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                qn70Var.getClass();
                ((wrz) obj2).getClass();
                return new u6f((mum) qn70Var.a(jq40.a(mum.class), null, null), (jum) qn70Var.a(jq40.a(jum.class), null, null));
        }
    }
}
