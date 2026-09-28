package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jz2 {
    public static final void a(final d dVar, final ez2 ez2Var, final Function0<Unit> function0, a aVar, final int i) {
        b bVar;
        b bVarI = aVar.i(835270458);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.M(ez2Var) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarA = ls7.a(dVar, j060.c(4.0f));
            boolean z = ez2Var.c;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            bVar = bVarI;
            lkf0.b(ez2Var.a, h.h(androidx.compose.foundation.a.b(dw.a(oka.a(0, bVarI, androidx.compose.foundation.d.b(dVarA, (psw) objY, ut50.b(0.0f, 3, j58.f, false), z, null, function0, 24), "select_bet_amount_" + ez2Var.a), ez2Var.c ? 1.0f : 0.5f), r58.d(4280831680L), zk40.a), 0.0f, 8.0f, 1), 0L, 0L, null, null, null, 0L, new gdf0(3), 0L, 0, false, 0, 0, null, imf0.b(((xob0) bVarI.O(vob0.a)).d, ez2Var.b ? r58.d(4294949442L) : r58.d(4288723199L), i7f.b(16.0f, bVarI), null, null, null, 0L, null, null, null, 0, i7f.b(16.0f, bVarI), null, null, 16646140), bVar, 0, 0, 65020);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ez2Var, function0, i) { // from class: iz2
                public final /* synthetic */ ez2 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    jz2.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final qcn qcnVar, final Function1 function1, a aVar, final int i) {
        int i2;
        dVar.getClass();
        qcnVar.getClass();
        b bVarI = aVar.i(1715248004);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(qcnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function1) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            y1i.b(j.g(dVar, 1.0f), new kw0.i(8.0f, true, new hw0()), new kw0.i(8.0f, true, new hw0()), null, 3, 0, pp8.b(1979443775, new fz2(0, qcnVar, function1), bVarI), bVarI, 1597872, 40);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: gz2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    jz2.b(dVar, qcnVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
