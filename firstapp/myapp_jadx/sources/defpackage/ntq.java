package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ntq {
    public static final void a(final d dVar, final cuq.d dVar2, final Function1 function1, a aVar, final int i) {
        dVar2.getClass();
        function1.getClass();
        b bVarI = aVar.i(677658535);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(dVar2) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            d dVarE = j.e(dVar, 1.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new btq();
                bVarI.r(objY);
            }
            d dVarH = h.h(xa80.b(dVarE, false, (Function1) objY), 16.0f, 0.0f, 2);
            kw0.i iVar = new kw0.i(16.0f, true, new hw0());
            umz umzVarB = h.b(0.0f, 16.0f, 0.0f, fA + 16.0f, 5);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new bwg(1, function1, dVar2);
                bVarI.r(objY2);
            }
            aur.a(dVarH, null, umzVarB, false, iVar, ht.a.n, null, false, null, (Function1) objY2, bVarI, 221184, 458);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar2, function1, i) { // from class: ctq
                public final /* synthetic */ cuq.d b;
                public final /* synthetic */ Function1 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    ntq.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
