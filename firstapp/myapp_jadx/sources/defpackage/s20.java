package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class s20 {
    public static final void a(final Function0 function0, final op8 op8Var, d dVar, final Function2 function2, final Function2 function3, qx80 qx80Var, long j, long j2, long j3, long j4, yle yleVar, a aVar, final int i) {
        b bVar;
        final d dVar2;
        final qx80 qx80Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final yle yleVar2;
        long jD;
        yle yleVar3;
        long j9;
        long j10;
        qx80 qx80Var3;
        long j11;
        d dVar3;
        b bVarI = aVar.i(94478519);
        int i2 = i | 306212224;
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qx80 qx80VarB = xy80.b(cme.d, bVarI);
                long jD2 = g68.d(cme.c, bVarI);
                long jD3 = g68.d(cme.i, bVarI);
                long jD4 = g68.d(cme.e, bVarI);
                jD = g68.d(cme.g, bVarI);
                yleVar3 = new yle(false, false, 7);
                j9 = jD3;
                j10 = jD4;
                qx80Var3 = qx80VarB;
                j11 = jD2;
                dVar3 = d.a.b;
            } else {
                bVarI.G();
                dVar3 = dVar;
                qx80Var3 = qx80Var;
                j11 = j;
                j9 = j2;
                j10 = j3;
                jD = j4;
                yleVar3 = yleVar;
            }
            bVarI.Y();
            bVar = bVarI;
            ys.c(function0, op8Var, dVar3, function2, function3, qx80Var3, j11, j9, j10, jD, yleVar3, bVar, 1797558, 3456);
            dVar2 = dVar3;
            qx80Var2 = qx80Var3;
            j5 = j11;
            j6 = j9;
            j7 = j10;
            j8 = jD;
            yleVar2 = yleVar3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            qx80Var2 = qx80Var;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            yleVar2 = yleVar;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(op8Var, dVar2, function2, function3, qx80Var2, j5, j6, j7, j8, yleVar2, i) { // from class: r20
                public final /* synthetic */ op8 b;
                public final /* synthetic */ d c;
                public final /* synthetic */ Function2 d;
                public final /* synthetic */ Function2 e;
                public final /* synthetic */ qx80 f;
                public final /* synthetic */ long i;
                public final /* synthetic */ long v;
                public final /* synthetic */ long w;
                public final /* synthetic */ long y;
                public final /* synthetic */ yle z;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1769527);
                    s20.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
