package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.io.FileNotFoundException;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qfj0 {
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0165  */
    /* JADX WARN: Code duplicated, block: B:62:0x016f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0182  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01af  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, boolean z, op8 op8Var, a aVar, final int i, final int i2) throws FileNotFoundException {
        d dVar2;
        int i3;
        boolean z2;
        boolean z3;
        final op8 op8Var2;
        final d dVar3;
        final boolean z4;
        e eVarZ;
        d.a aVar2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        int iHashCode2;
        androidx.compose.foundation.layout.d dVar4;
        int i4;
        op8 op8Var3 = op8Var;
        b bVarI = aVar.i(-357259948);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= bVarI.b(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (bVarI.A(op8Var3)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
                i3 |= i4;
            }
            if ((i3 & 147) != 146) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i3 & 1, z3)) {
                aVar2 = d.a.b;
                if (i5 != 0) {
                    dVar2 = aVar2;
                }
                if (i6 != 0) {
                    z2 = false;
                }
                WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                dnn dnnVarC = r8j0.c(q8j0.a.a(bVarI).k, bVarI);
                float f = ((mla.f((int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L), bVarI) - dnnVarC.d()) - dnnVarC.a()) * 0.9f;
                qyd0 qyd0Var = oib0.a;
                long j = ((lib0) bVarI.O(qyd0Var)).u0;
                zk40.a aVar4 = zk40.a;
                d dVarE = j.e(androidx.compose.foundation.a.b(dVar2, j, aVar4), 1.0f);
                aiv aivVarC = g75.c(ht.a.h, false);
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarE);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                yka.a.b bVar = yka.a.f;
                hlh0.a(bVarI, aivVarC, bVar);
                yka.a.d dVar5 = yka.a.e;
                hlh0.a(bVarI, ne00VarS, dVar5);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                yka.a.c cVar = yka.a.d;
                hlh0.a(bVarI, dVarC, cVar);
                d dVarB = androidx.compose.foundation.a.b(ls7.a(j.k(j.y(aVar2, 0.0f, c55.b, 1), 0.0f, f, 1), j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12)), ((lib0) bVarI.O(qyd0Var)).b1, aVar4);
                aiv aivVarC2 = g75.c(ht.a.a, false);
                iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarB);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC2, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar5);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                dVar4 = androidx.compose.foundation.layout.d.a;
                if (z2) {
                    bVarI.N(1027062216);
                    v0f.a(0, 2, bVarI, dVar4.f(aVar2), false);
                    bVarI.X(false);
                } else {
                    bVarI.N(1027202522);
                    bVarI.X(false);
                }
                op8 op8Var4 = op8Var;
                op8Var4.invoke(dVar4, bVarI, Integer.valueOf(((i3 >> 3) & 112) | 6));
                bVarI.X(true);
                bVarI.X(true);
                op8Var2 = op8Var4;
            } else {
                bVarI.G();
                op8Var2 = op8Var3;
            }
            dVar3 = dVar2;
            z4 = z2;
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: pfj0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                        ((Integer) obj2).getClass();
                        qfj0.a(dVar3, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if (bVarI.A(op8Var3)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i3 & 1, z3)) {
            aVar2 = d.a.b;
            if (i5 != 0) {
                dVar2 = aVar2;
            }
            if (i6 != 0) {
                z2 = false;
            }
            WeakHashMap<View, q8j0> weakHashMap2 = q8j0.v;
            dnn dnnVarC2 = r8j0.c(q8j0.a.a(bVarI).k, bVarI);
            float f2 = ((mla.f((int) (((a8j0) bVarI.O(kna.t)).a() & 4294967295L), bVarI) - dnnVarC2.d()) - dnnVarC2.a()) * 0.9f;
            qyd0 qyd0Var2 = oib0.a;
            long j2 = ((lib0) bVarI.O(qyd0Var2)).u0;
            zk40.a aVar5 = zk40.a;
            d dVarE2 = j.e(androidx.compose.foundation.a.b(dVar2, j2, aVar5), 1.0f);
            aiv aivVarC3 = g75.c(ht.a.h, false);
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarE2);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC3, bVar2);
            yka.a.d dVar6 = yka.a.e;
            hlh0.a(bVarI, ne00VarS3, dVar6);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar2 = yka.a.d;
            hlh0.a(bVarI, dVarC3, cVar2);
            d dVarB2 = androidx.compose.foundation.a.b(ls7.a(j.k(j.y(aVar2, 0.0f, c55.b, 1), 0.0f, f2, 1), j060.e(8.0f, 8.0f, 0.0f, 0.0f, 12)), ((lib0) bVarI.O(qyd0Var2)).b1, aVar5);
            aiv aivVarC4 = g75.c(ht.a.a, false);
            iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS4 = bVarI.S();
            d dVarC4 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC4, bVar2);
            hlh0.a(bVarI, ne00VarS4, dVar6);
            if (bVarI.S) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            } else {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC4, cVar2);
            dVar4 = androidx.compose.foundation.layout.d.a;
            if (z2) {
                bVarI.N(1027062216);
                v0f.a(0, 2, bVarI, dVar4.f(aVar2), false);
                bVarI.X(false);
            } else {
                bVarI.N(1027202522);
                bVarI.X(false);
            }
            op8 op8Var5 = op8Var;
            op8Var5.invoke(dVar4, bVarI, Integer.valueOf(((i3 >> 3) & 112) | 6));
            bVarI.X(true);
            bVarI.X(true);
            op8Var2 = op8Var5;
        } else {
            bVarI.G();
            op8Var2 = op8Var3;
        }
        dVar3 = dVar2;
        z4 = z2;
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pfj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws FileNotFoundException {
                    ((Integer) obj2).getClass();
                    qfj0.a(dVar3, z4, op8Var2, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
