package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class n550 {
    public static final void a(final f450 f450Var, final d dVar, a aVar, final int i) {
        b bVarI = aVar.i(-1333505975);
        int i2 = (bVarI.M(f450Var) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            umz umzVarB = h.b(0.0f, 0.0f, 0.0f, 8.0f, 7);
            kw0.i iVar = new kw0.i(6.0f, true, new hw0());
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new uhi(f450Var, 3);
                bVarI.r(objY);
            }
            aur.a(dVar, null, umzVarB, false, iVar, null, null, false, null, (Function1) objY, bVarI, 24966, 490);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, i) { // from class: k550
                public final /* synthetic */ d b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    n550.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
