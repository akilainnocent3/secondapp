package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class bjf0 implements gaj<d, a, Integer, d> {
    public final /* synthetic */ iif0 a;

    public bjf0(iif0 iif0Var) {
        this.a = iif0Var;
    }

    @Override // defpackage.gaj
    public final d invoke(d dVar, a aVar, Integer num) {
        d dVar2 = dVar;
        a aVar2 = aVar;
        num.intValue();
        aVar2.N(1980580247);
        mmd mmdVar = (mmd) aVar2.O(kna.h);
        Object objY = aVar2.y();
        a.C0041a.C0042a c0042a = a.C0041a.a;
        if (objY == c0042a) {
            objY = m.b(new jxo(0L));
            aVar2.r(objY);
        }
        final ytw ytwVar = (ytw) objY;
        final iif0 iif0Var = this.a;
        boolean zA = aVar2.A(iif0Var);
        Object objY2 = aVar2.y();
        if (zA || objY2 == c0042a) {
            objY2 = new Function0() { // from class: xif0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    long j;
                    vkf0 vkf0VarD;
                    n6s n6sVar;
                    nk0 nk0Var;
                    long j2 = ((jxo) ytwVar.getValue()).a;
                    iif0 iif0Var2 = iif0Var;
                    gly glyVarF = iif0Var2.f();
                    long jFloatToRawIntBits = 9205357640488583168L;
                    if (glyVarF != null) {
                        long j3 = glyVarF.a;
                        nk0 nk0VarI = iif0Var2.i();
                        if (nk0VarI != null && nk0VarI.b.length() != 0) {
                            lcl lclVar = (lcl) ((x5a0) iif0Var2.s).getValue();
                            int i = lclVar == null ? -1 : nif0.c.a[lclVar.ordinal()];
                            if (i != -1) {
                                if (i == 1 || i == 2) {
                                    long j4 = iif0Var2.j().b;
                                    int i2 = ulf0.c;
                                    j = j4 >> 32;
                                } else {
                                    if (i != 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    long j5 = iif0Var2.j().b;
                                    int i3 = ulf0.c;
                                    j = j5 & 4294967295L;
                                }
                                int i4 = (int) j;
                                n6s n6sVar2 = iif0Var2.d;
                                if (n6sVar2 != null && (vkf0VarD = n6sVar2.d()) != null && (n6sVar = iif0Var2.d) != null && (nk0Var = n6sVar.a.a) != null) {
                                    int iE = f.e(iif0Var2.b.b(i4), 0, nk0Var.b.length());
                                    float fIntBitsToFloat = Float.intBitsToFloat((int) (vkf0VarD.d(j3) >> 32));
                                    ukf0 ukf0Var = vkf0VarD.a;
                                    zjw zjwVar = ukf0Var.b;
                                    int iD = zjwVar.d(iE);
                                    float fG = ukf0Var.g(iD);
                                    float fH = ukf0Var.h(iD);
                                    float fD = f.d(fIntBitsToFloat, Math.min(fG, fH), Math.max(fG, fH));
                                    if (jxo.b(j2, 0L) || Math.abs(fIntBitsToFloat - fD) <= ((int) (j2 >> 32)) / 2) {
                                        float f = zjwVar.f(iD);
                                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(((zjwVar.b(iD) - f) / 2.0f) + f)) & 4294967295L);
                                    }
                                }
                            }
                        }
                    }
                    return new gly(jFloatToRawIntBits);
                }
            };
            aVar2.r(objY2);
        }
        Function0 function0 = (Function0) objY2;
        boolean zM = aVar2.M(mmdVar);
        Object objY3 = aVar2.y();
        if (zM || objY3 == c0042a) {
            objY3 = new yif0(0, mmdVar, ytwVar);
            aVar2.r(objY3);
        }
        jj0 jj0Var = y880.a;
        d dVarA = c.a(dVar2, gnn.a, new v880(function0, (Function1) objY3));
        aVar2.H();
        return dVarA;
    }
}
