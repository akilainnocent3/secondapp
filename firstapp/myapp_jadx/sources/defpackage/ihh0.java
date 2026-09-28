package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ihh0 extends d.c implements psr {
    public float D;
    public float E;

    @Override // defpackage.psr
    public final int C(xkt xktVar, mzo mzoVar, int i) {
        int iB0 = mzoVar.b0(i);
        int iY0 = !Float.isNaN(this.D) ? xktVar.y0(this.D) : 0;
        return iB0 < iY0 ? iY0 : iB0;
    }

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int iK;
        int iJ;
        if (Float.isNaN(this.D) || kxa.k(j) != 0) {
            iK = kxa.k(j);
        } else {
            int iY0 = tVar.y0(this.D);
            iK = kxa.i(j);
            if (iY0 < 0) {
                iY0 = 0;
            }
            if (iY0 <= iK) {
                iK = iY0;
            }
        }
        int i = kxa.i(j);
        if (Float.isNaN(this.E) || kxa.j(j) != 0) {
            iJ = kxa.j(j);
        } else {
            int iY1 = tVar.y0(this.E);
            iJ = kxa.h(j);
            int i2 = iY1 >= 0 ? iY1 : 0;
            if (i2 <= iJ) {
                iJ = i2;
            }
        }
        final y yVarD0 = vhvVar.d0(oxa.a(iK, i, iJ, kxa.h(j)));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: hhh0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a.A((y.a) obj, yVarD0, 0, 0);
                return Unit.a;
            }
        });
    }

    @Override // defpackage.psr
    public final int o(xkt xktVar, mzo mzoVar, int i) {
        int iA0 = mzoVar.a0(i);
        int iY0 = !Float.isNaN(this.D) ? xktVar.y0(this.D) : 0;
        return iA0 < iY0 ? iY0 : iA0;
    }

    @Override // defpackage.psr
    public final int s(xkt xktVar, mzo mzoVar, int i) {
        int iX = mzoVar.x(i);
        int iY0 = !Float.isNaN(this.E) ? xktVar.y0(this.E) : 0;
        return iX < iY0 ? iY0 : iX;
    }

    @Override // defpackage.psr
    public final int w(xkt xktVar, mzo mzoVar, int i) {
        int iR = mzoVar.R(i);
        int iY0 = !Float.isNaN(this.E) ? xktVar.y0(this.E) : 0;
        return iR < iY0 ? iY0 : iR;
    }
}
