package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t930 implements gaj<m75, a, Integer, Unit> {
    public final /* synthetic */ ca30 a;
    public final /* synthetic */ boolean b;

    public t930(ca30 ca30Var, boolean z) {
        this.a = ca30Var;
        this.b = z;
    }

    @Override // defpackage.gaj
    public final Unit invoke(m75 m75Var, a aVar, Integer num) {
        m75 m75Var2 = m75Var;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.M(m75Var2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            o930.a.a(this.a, this.b, m75Var2.b(d.a.b, ht.a.b), 0L, 0L, 0.0f, aVar2, 1572864);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
