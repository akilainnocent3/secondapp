package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g7 implements gaj {
    public final /* synthetic */ int a;

    public /* synthetic */ g7(int i) {
        this.a = i;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                t tVar = (t) obj;
                final int iY0 = tVar.y0(10.0f);
                int i = iY0 * 2;
                final y yVarD0 = ((vhv) obj2).d0(oxa.i(0, ((kxa) obj3).a, i));
                return t.z1(tVar, yVarD0.a, yVarD0.b - i, new Function1() { // from class: i7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ((y.a) obj4).s(yVarD0, 0, -iY0, 0.0f);
                        return Unit.a;
                    }
                });
            default:
                j3a0 j3a0Var = (j3a0) obj;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                j3a0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar.M(j3a0Var) ? 4 : 2;
                }
                if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    qyd0 qyd0Var = oib0.a;
                    f4a0.d(j3a0Var, null, false, null, ((lib0) aVar.O(qyd0Var)).w0, ((lib0) aVar.O(qyd0Var)).o, 0L, 0L, ((lib0) aVar.O(qyd0Var)).o, aVar, iIntValue & 14, 206);
                } else {
                    aVar.G();
                }
                return Unit.a;
        }
    }
}
