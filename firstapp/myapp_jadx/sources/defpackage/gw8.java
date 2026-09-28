package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gw8 implements otk0 {
    public static final op8 a = new op8(391114307, new cw8(), false);
    public static final op8 b = new op8(-1969123078, new dw8(), false);
    public static final op8 c = new op8(1950742315, new ew8(), false);
    public static final op8 d = new op8(1850560259, new fw8(), false);
    public static final /* synthetic */ gw8 e = new gw8();

    public static final void a(final ut3 ut3Var, a aVar, final int i) {
        b bVarI = aVar.i(-1509273506);
        int i2 = (bVarI.M(ut3Var) ? 4 : 2) | i;
        if (!bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.G();
        } else if (ut3Var instanceof ju3) {
            bVarI.N(1287111303);
            iu3.a((ju3) ut3Var, bVarI, i2 & 14);
            bVarI.X(false);
        } else if (ut3Var instanceof ou3) {
            bVarI.N(1287114375);
            nu3.a((ou3) ut3Var, bVarI, i2 & 14);
            bVarI.X(false);
        } else if (ut3Var instanceof gu3) {
            bVarI.N(1287117315);
            fu3.a((gu3) ut3Var, bVarI, i2 & 14);
            bVarI.X(false);
        } else if (ut3Var instanceof ru3) {
            bVarI.N(1287120845);
            qu3.a((ru3) ut3Var, bVarI, i2 & 14);
            bVarI.X(false);
        } else {
            if (!(ut3Var instanceof au3)) {
                throw igf0.a(bVarI, 1287109562, false);
            }
            bVarI.N(1287123971);
            zt3.a((au3) ut3Var, bVarI, i2 & 14);
            bVarI.X(false);
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: tt3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gw8.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.otk0
    public Object zza() {
        List list = v2l0.a;
        return Boolean.valueOf(((url0) trl0.b.a.a).zza());
    }
}
