package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class n930 implements gaj<m75, a, Integer, Unit> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ ca30 c;

    public n930(boolean z, long j, ca30 ca30Var) {
        this.a = z;
        this.b = j;
        this.c = ca30Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(m75 m75Var, a aVar, Integer num) {
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            q3c.b(Boolean.valueOf(this.a), null, a6w.b(z5w.c, aVar2), null, pp8.b(-2064098104, new m930(this.b, this.c), aVar2), aVar2, 24576, 10);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
