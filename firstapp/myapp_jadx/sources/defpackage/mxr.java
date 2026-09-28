package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mxr {
    public static final void a(final Function0 function0, final d dVar, final gyr gyrVar, final nxr nxrVar, a aVar, final int i) {
        b bVarI = aVar.i(1055276397);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i | (bVarI.M(dVar) ? 32 : 16) | (bVarI.M(gyrVar) ? 256 : 128) | (bVarI.M(nxrVar) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            dh9.a(6, pp8.b(-933153643, new androidx.compose.foundation.lazy.layout.d(gyrVar, dVar, nxrVar, m.c(function0, bVarI)), bVarI), bVarI);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, gyrVar, nxrVar, i) { // from class: jxr
                public final /* synthetic */ d b;
                public final /* synthetic */ gyr c;
                public final /* synthetic */ nxr d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mxr.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
