package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss9 implements gaj {
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
            qyd0 qyd0Var = oib0.a;
            f4a0.d(j3a0Var, null, false, null, ((lib0) aVar.O(qyd0Var)).w0, ((lib0) aVar.O(qyd0Var)).o, 0L, 0L, ((lib0) aVar.O(qyd0Var)).a0, aVar, iIntValue & 14, 206);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
