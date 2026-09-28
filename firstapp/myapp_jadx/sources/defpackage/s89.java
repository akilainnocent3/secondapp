package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class s89 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j3a0 j3a0Var = (j3a0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j3a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(j3a0Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            abd0.a(j3a0Var, null, false, aVar, iIntValue & 14, 6);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
