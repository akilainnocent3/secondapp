package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class q75 {
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0083  */
    /* JADX WARN: Code duplicated, block: B:53:0x0086  */
    /* JADX WARN: Code duplicated, block: B:57:0x0090  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, ht htVar, boolean z, final op8 op8Var, a aVar, int i, int i2) {
        int i3;
        boolean z2;
        boolean z3;
        ht htVar2;
        d dVar2;
        boolean z4;
        e eVarZ;
        ht htVar3;
        final aiv aivVarC;
        boolean zM;
        Object objY;
        int i4;
        b bVarI = aVar.i(380139498);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= bVarI.M(htVar) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (bVarI.A(op8Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                if (i5 != 0) {
                    dVar = d.a.b;
                }
                if (i6 != 0) {
                    htVar3 = ht.a.a;
                } else {
                    htVar3 = htVar;
                }
                if (i7 != 0) {
                    z2 = false;
                }
                aivVarC = g75.c(htVar3, z2);
                zM = bVarI.M(aivVarC) | ((i3 & 7168) == 2048);
                objY = bVarI.y();
                if (zM || objY == a.C0041a.a) {
                    objY = new Function2() { // from class: n75
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            rce0 rce0Var = (rce0) obj;
                            kxa kxaVar = (kxa) obj2;
                            return aivVarC.c(rce0Var, rce0Var.K(Unit.a, new op8(-431986394, new p75(op8Var, new androidx.compose.foundation.layout.e(rce0Var, kxaVar.a)), true)), kxaVar.a);
                        }
                    };
                    bVarI.r(objY);
                }
                f0.a(dVar, (Function2) objY, bVarI, i3 & 14, 0);
                htVar2 = htVar3;
                z4 = z2;
                dVar2 = dVar;
            } else {
                bVarI.G();
                htVar2 = htVar;
                dVar2 = dVar;
                z4 = z2;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new o75(dVar2, htVar2, z4, op8Var, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if (bVarI.A(op8Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            if (i5 != 0) {
                dVar = d.a.b;
            }
            if (i6 != 0) {
                htVar3 = ht.a.a;
            } else {
                htVar3 = htVar;
            }
            if (i7 != 0) {
                z2 = false;
            }
            aivVarC = g75.c(htVar3, z2);
            zM = bVarI.M(aivVarC) | ((i3 & 7168) == 2048);
            objY = bVarI.y();
            if (zM) {
                objY = new Function2() { // from class: n75
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        rce0 rce0Var = (rce0) obj;
                        kxa kxaVar = (kxa) obj2;
                        return aivVarC.c(rce0Var, rce0Var.K(Unit.a, new op8(-431986394, new p75(op8Var, new androidx.compose.foundation.layout.e(rce0Var, kxaVar.a)), true)), kxaVar.a);
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function2() { // from class: n75
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        rce0 rce0Var = (rce0) obj;
                        kxa kxaVar = (kxa) obj2;
                        return aivVarC.c(rce0Var, rce0Var.K(Unit.a, new op8(-431986394, new p75(op8Var, new androidx.compose.foundation.layout.e(rce0Var, kxaVar.a)), true)), kxaVar.a);
                    }
                };
                bVarI.r(objY);
            }
            f0.a(dVar, (Function2) objY, bVarI, i3 & 14, 0);
            htVar2 = htVar3;
            z4 = z2;
            dVar2 = dVar;
        } else {
            bVarI.G();
            htVar2 = htVar;
            dVar2 = dVar;
            z4 = z2;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new o75(dVar2, htVar2, z4, op8Var, i, i2);
        }
    }
}
