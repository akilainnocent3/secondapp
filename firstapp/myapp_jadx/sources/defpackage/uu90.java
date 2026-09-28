package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class uu90 {
    public static final void a(final d dVar, final ybs ybsVar, a aVar, final int i) {
        ybsVar.getClass();
        b bVarI = aVar.i(764492920);
        int i2 = (bVarI.M(ybsVar) ? 32 : 16) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            a22.a(dVar, pp8.b(-1189880890, new su90(ybsVar), bVarI), bVarI, 54);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ybsVar, i) { // from class: tu90
                public final /* synthetic */ ybs b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    uu90.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
