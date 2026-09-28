package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class vob0 {
    public static final qyd0 a = new qyd0(new sob0());

    public static final void a(final int i, final op8 op8Var, a aVar) {
        b bVarI = aVar.i(736125206);
        if (bVarI.q(i & 1, (i & 3) != 2)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new ot50(j58.f, new nt50(0.4f, 0.4f, 0.4f, 0.4f));
                bVarI.r(objY);
            }
            j730 j730VarA = ut50.a.a((ot50) objY);
            p8i p8iVar = yob0.a;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            boolean zM = bVarI.M(mmdVar);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                long jN = mmdVar.N(18.0f);
                t9i t9iVar = t9i.E;
                long jC = d2l.c(0);
                p8i p8iVar2 = yob0.a;
                xob0 xob0Var = new xob0(new imf0(0L, jN, t9iVar, null, p8iVar2, jC, null, null, 0, 0L, null, null, 16777049), new imf0(0L, mmdVar.N(10.0f), t9i.D, null, p8iVar2, d2l.c(0), null, null, 0, 0L, null, null, 16777049), new imf0(0L, mmdVar.N(12.0f), t9iVar, null, p8iVar2, d2l.c(0), null, null, 0, 0L, null, null, 16777049), new imf0(0L, mmdVar.N(20.0f), t9iVar, null, p8iVar2, d2l.c(0), null, null, 0, 0L, null, null, 16777049), new imf0(0L, mmdVar.N(12.0f), t9iVar, null, p8iVar2, d2l.c(0), null, null, 0, 0L, null, null, 16777049));
                bVarI.r(xob0Var);
                objY2 = xob0Var;
            }
            hna.b(new j730[]{j730VarA, a.a((xob0) objY2)}, pp8.b(150766678, new Function2() { // from class: tob0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        op8Var.invoke(aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var) { // from class: uob0
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    vob0.a(qj40.a(7), this.a, (a) obj);
                    return Unit.a;
                }
            };
        }
    }
}
