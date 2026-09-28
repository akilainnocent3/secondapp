package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class udd0 {
    public static final void a(int i, a aVar) {
        b bVarI = aVar.i(-268785010);
        int i2 = 1;
        if (bVarI.q(i & 1, i != 0)) {
            d dVarJ = h.j(d.a.b, 0.0f, 8.0f, 0.0f, 4.0f, 5);
            kw0.i iVar = new kw0.i(8.0f, true, new hw0());
            umz umzVarA = h.a(2, 8.0f, 0.0f);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new twn(i2);
                bVarI.r(objY);
            }
            aur.b(dVarJ, null, umzVarA, iVar, null, null, false, null, (Function1) objY, bVarI, 817914246, 362);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new tdd0();
        }
    }
}
