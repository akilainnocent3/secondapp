package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ulh extends d.c implements psr {
    public rqe D;
    public float E;

    @Override // defpackage.psr
    public final biv e(t tVar, vhv vhvVar, long j) {
        int iK;
        int i;
        int iH;
        int i2;
        if (!kxa.e(j) || this.D == rqe.a) {
            iK = kxa.k(j);
            i = kxa.i(j);
        } else {
            int iRound = Math.round(kxa.i(j) * this.E);
            int iK2 = kxa.k(j);
            iK = kxa.i(j);
            if (iRound < iK2) {
                iRound = iK2;
            }
            if (iRound <= iK) {
                iK = iRound;
            }
            i = iK;
        }
        if (!kxa.d(j) || this.D == rqe.b) {
            int iJ = kxa.j(j);
            int iH2 = kxa.h(j);
            iH = iJ;
            i2 = iH2;
        } else {
            int iRound2 = Math.round(kxa.h(j) * this.E);
            int iJ2 = kxa.j(j);
            iH = kxa.h(j);
            if (iRound2 < iJ2) {
                iRound2 = iJ2;
            }
            if (iRound2 <= iH) {
                iH = iRound2;
            }
            i2 = iH;
        }
        final y yVarD0 = vhvVar.d0(oxa.a(iK, i, iH, i2));
        return t.z1(tVar, yVarD0.a, yVarD0.b, new Function1() { // from class: tlh
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y.a.A((y.a) obj, yVarD0, 0, 0);
                return Unit.a;
            }
        });
    }
}
