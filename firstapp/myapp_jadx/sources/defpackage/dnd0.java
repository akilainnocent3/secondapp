package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class dnd0 {
    /* JADX WARN: Code duplicated, block: B:115:0x0166 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0168 A[SYNTHETIC] */
    public static final void a(final int i, final wmd0 wmd0Var, final float f, final float f2, a aVar, final int i2) {
        int i3;
        int i4;
        int i5;
        String strC;
        int i6 = i;
        wmd0Var.getClass();
        b bVarI = aVar.i(481089342);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i6) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(wmd0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.c(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.c(f2) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            float f3 = (f - 11.0f) / 12.0f;
            qcn<bpd0> qcnVar = wmd0Var.a;
            float size = (f - (qcnVar.size() * f3)) - qcnVar.size();
            d dVarJ = h.j(j.t(d.a.b, f2, f), 0.0f, size < 0.0f ? 0.0f : size, 0.0f, 0.0f, 13);
            i78 i78VarA = g78.a(new kw0.i(1.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            boolean z = true;
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (qcnVar.isEmpty()) {
                i4 = 0;
            } else {
                Iterator<bpd0> it = qcnVar.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    if (it.next().b.length() > 0 && (i4 = i4 + 1) < 0) {
                        kotlin.collections.b.p();
                        throw null;
                    }
                }
            }
            Iterator<bpd0> it2 = qcnVar.iterator();
            int i7 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i5 = -1;
                    break;
                }
                bpd0 next = it2.next();
                qcn<uf4> qcnVar2 = next.c;
                if (qcnVar2 == null || !qcnVar2.isEmpty()) {
                    Iterator<uf4> it3 = qcnVar2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            uf4 next2 = it3.next();
                            if (next2 == uf4.e || next2 == uf4.c) {
                            }
                        } else if (next.b.length() > 0) {
                            i5 = i7;
                            break;
                        }
                    }
                } else if (next.b.length() > 0) {
                    i5 = i7;
                    break;
                }
                i7++;
            }
            bVarI.N(-319888722);
            int i8 = i4;
            int size2 = qcnVar.size() - 1;
            int i9 = -1;
            while (i9 < size2) {
                bpd0 bpd0Var = qcnVar.get(size2);
                boolean z2 = z;
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z2);
                boolean z3 = i6 == size2 ? z2 : false;
                int i10 = i5;
                boolean z4 = size2 == i5 ? z2 : false;
                int i11 = i8 % 4;
                if (i11 == z2) {
                    bVarI.N(740939401);
                    strC = com.sportygames.newcms.c.c(uld0.i0.i, new String[0], bVarI);
                    bVarI.X(false);
                } else if (i11 == 2) {
                    bVarI.N(740940969);
                    strC = com.sportygames.newcms.c.c(uld0.i0.j, new String[0], bVarI);
                    bVarI.X(false);
                } else if (i11 != 3) {
                    bVarI.N(740944138);
                    strC = com.sportygames.newcms.c.c(uld0.i0.l, new String[0], bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(740942535);
                    strC = com.sportygames.newcms.c.c(uld0.i0.k, new String[0], bVarI);
                    bVarI.X(false);
                }
                int i12 = i3;
                int i13 = size2;
                qcn<bpd0> qcnVar3 = qcnVar;
                hpd0.c(layoutWeightElement, z3, z4, f2, f3, strC, bpd0Var.b, bpd0Var.a, bpd0Var.c, bVarI, i3 & 7168);
                if (bpd0Var.b.length() > 0) {
                    i8--;
                }
                size2 = i13 - 1;
                i6 = i;
                i3 = i12;
                qcnVar = qcnVar3;
                i5 = i10;
                i9 = -1;
                z = true;
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cnd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dnd0.a(i, wmd0Var, f, f2, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
