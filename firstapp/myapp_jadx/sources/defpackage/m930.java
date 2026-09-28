package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class m930 implements gaj<Boolean, a, Integer, Unit> {
    public final /* synthetic */ long a;
    public final /* synthetic */ ca30 b;

    public m930(long j, ca30 ca30Var) {
        this.a = j;
        this.b = ca30Var;
    }

    @Override // defpackage.gaj
    public final Unit invoke(Boolean bool, a aVar, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        a aVar2 = aVar;
        int iIntValue = num.intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar2.b(zBooleanValue) ? 4 : 2;
        }
        if (!aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            aVar2.G();
        } else if (zBooleanValue) {
            aVar2.N(-499784343);
            q330.a(j.r(d.a.b, 16.0f), this.a, 2.5f, 0L, 0, 0.0f, aVar2, 390, 56);
            aVar2.H();
        } else {
            aVar2.N(-499540745);
            final ca30 ca30Var = this.b;
            boolean zM = aVar2.M(ca30Var);
            Object objY = aVar2.y();
            if (zM || objY == a.C0041a.a) {
                objY = new fxh() { // from class: l930
                    @Override // defpackage.fxh
                    public final float invoke() {
                        return ca30Var.a();
                    }
                };
                aVar2.r(objY);
            }
            u930.a((fxh) objY, this.a, aVar2, 0);
            aVar2.H();
        }
        return Unit.a;
    }
}
