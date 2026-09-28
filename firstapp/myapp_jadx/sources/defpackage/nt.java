package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class nt extends d.c implements psr {
    public kt D;
    public float E;
    public float F;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        long j2;
        long jB;
        final kt ktVar = this.D;
        final float f = this.E;
        float f2 = this.F;
        boolean z = ktVar instanceof mjm;
        if (z) {
            j2 = j;
            jB = kxa.b(0, 0, 0, 0, 11, j2);
        } else {
            j2 = j;
            jB = kxa.b(0, 0, 0, 0, 14, j2);
        }
        final y yVarD0 = vhvVar.d0(jB);
        int iF0 = yVarD0.f0(ktVar);
        if (iF0 == Integer.MIN_VALUE) {
            iF0 = 0;
        }
        int i = z ? yVarD0.b : yVarD0.a;
        int iH = (z ? kxa.h(j2) : kxa.i(j2)) - i;
        final int iE = f.e((!Float.isNaN(f) ? tVar.y0(f) : 0) - iF0, 0, iH);
        final int iE2 = f.e(((!Float.isNaN(f2) ? tVar.y0(f2) : 0) - i) + iF0, 0, iH - iE);
        int iMax = yVarD0.a;
        if (!z) {
            iMax = Math.max(iMax + iE + iE2, kxa.k(j2));
        }
        int iMax2 = yVarD0.b;
        if (z) {
            iMax2 = Math.max(iMax2 + iE + iE2, kxa.j(j2));
        }
        final int i2 = iMax2;
        final int i3 = iMax;
        return t.z1(tVar, i3, i2, new Function1() { // from class: lt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4;
                y.a aVar = (y.a) obj;
                boolean z2 = ktVar instanceof mjm;
                float f3 = f;
                int i5 = iE;
                int i6 = iE2;
                y yVar = yVarD0;
                if (z2) {
                    i4 = 0;
                } else {
                    i4 = !g7f.b(f3, Float.NaN) ? i5 : (i3 - i6) - yVar.a;
                }
                if (!z2) {
                    i5 = 0;
                } else if (g7f.b(f3, Float.NaN)) {
                    i5 = (i2 - i6) - yVar.b;
                }
                y.a.A(aVar, yVar, i4, i5);
                return Unit.a;
            }
        });
    }
}
