package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class a590 implements gaj<x0g0, a, Integer, Unit> {
    public final /* synthetic */ String a;

    public a590(String str) {
        this.a = str;
    }

    @Override // defpackage.gaj
    public final Unit invoke(x0g0 x0g0Var, a aVar, Integer num) {
        x0g0 x0g0Var2 = x0g0Var;
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(x0g0Var2) : aVar2.A(x0g0Var2) ? 4 : 2;
        }
        if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            r0g0.a(x0g0Var2, null, null, 0.0f, null, 0L, 0L, pp8.b(-999924215, new z490(this.a), aVar2), aVar2, (iIntValue & 14) | 805306368, 255);
        } else {
            aVar2.G();
        }
        return Unit.a;
    }
}
