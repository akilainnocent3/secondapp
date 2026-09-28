package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vd9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        nvi0 nvi0Var = (nvi0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nvi0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(nvi0Var) ? 4 : 2;
        }
        if (!aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            aVar.G();
        } else if (nvi0Var.equals(nvi0.a.a)) {
            aVar.N(-984576639);
            aVar.H();
        } else {
            if (!(nvi0Var instanceof nvi0.b)) {
                throw rg.a(1907900224, aVar);
            }
            aVar.N(-984526078);
            xau.i(null, (nvi0.b) nvi0Var, aVar, (iIntValue << 3) & 112);
            aVar.H();
        }
        return Unit.a;
    }
}
