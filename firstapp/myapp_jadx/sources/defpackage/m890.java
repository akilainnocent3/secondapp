package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class m890 implements iaj<gwr, Integer, a, Integer, Unit> {
    public final /* synthetic */ List a;
    public final /* synthetic */ abf b;

    public m890(List list, abf abfVar) {
        this.a = list;
        this.b = abfVar;
    }

    @Override // defpackage.iaj
    public final Unit d(gwr gwrVar, Integer num, a aVar, Integer num2) {
        int i;
        gwr gwrVar2 = gwrVar;
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (aVar2.M(gwrVar2) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= aVar2.d(iIntValue) ? 32 : 16;
        }
        if (aVar2.q(i & 1, (i & 147) != 146)) {
            x590 x590Var = (x590) this.a.get(iIntValue);
            aVar2.N(-1040265911);
            o890.b(gwrVar2, gwr.b(gwrVar2), x590Var.c, this.b, Integer.valueOf(x590Var.a), aVar2, (i & 14) | 4096);
            if (iIntValue == 7) {
                aVar2.N(-1040036233);
                h2f0.a.a(h.j(d.a.b, 0.0f, 24.0f, 0.0f, 24.0f, 5), 0.0f, 0L, aVar2, 3078, 6);
                aVar2.H();
            } else {
                aVar2.N(-1039935328);
                aVar2.H();
            }
            aVar2.H();
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
