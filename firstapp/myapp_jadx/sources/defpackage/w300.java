package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w300 {
    public static final void a(d dVar, final List list, final boolean z, final int i, final Function0 function0, a aVar, final int i2) {
        final d dVar2;
        d.a aVar2;
        list.getClass();
        b bVarI = aVar.i(-605384301);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bVarI.M(list) : bVarI.A(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.b(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.d(i) ? 2048 : 1024;
        }
        int i4 = i3 | 24576;
        if ((196608 & i2) == 0) {
            i4 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if (bVarI.q(i4 & 1, (74899 & i4) != 74898)) {
            int i5 = i * 2;
            int i6 = ((i4 >> 3) & 14) | (i4 & 896);
            boolean zD = ((((i6 & 896) ^ 384) > 256 && bVarI.b(z)) || (i6 & 384) == 256) | ((((i6 & 14) ^ 6) > 4 && bVarI.M(list)) || (i6 & 6) == 4) | bVarI.d(i5);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zD || objY == c0042a) {
                objY = new g300(i5, list, z);
                bVarI.r(objY);
            }
            g300 g300Var = (g300) objY;
            d.a aVar3 = d.a.b;
            d dVarG = j.g(aVar3, 1.0f);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (z) {
                bVarI.N(1833988502);
                d dVarH = h.h(aVar3, 0.0f, 16.0f, 1);
                int iD = ((u5a0) g300Var.d).D();
                int iD2 = ((u5a0) g300Var.e).D();
                boolean zM = bVarI.M(g300Var);
                Object objY2 = bVarI.y();
                if (zM || objY2 == c0042a) {
                    u300 u300Var = new u300(0, g300Var, g300.class, "switchNextBatch", "switchNextBatch()V", 0);
                    bVarI.r(u300Var);
                    objY2 = u300Var;
                }
                aVar2 = aVar3;
                s300.b(dVarH, list, iD, iD2, i, (Function0) ((chp) objY2), bVarI, (57344 & (i4 << 3)) | (i4 & 112) | 196614 | ((i4 << 6) & 3670016));
                bVarI.X(false);
            } else {
                aVar2 = aVar3;
                bVarI.N(1834430500);
                int iD3 = ((u5a0) g300Var.d).D();
                int iD4 = ((u5a0) g300Var.e).D();
                boolean zM2 = bVarI.M(g300Var);
                Object objY3 = bVarI.y();
                if (zM2 || objY3 == c0042a) {
                    objY3 = new v300(0, g300Var, g300.class, "switchNextBatch", "switchNextBatch()V", 0);
                    bVarI.r(objY3);
                }
                m300.b(aVar2, list, iD3, iD4, i, (Function0) ((chp) objY3), function0, bVarI, ((i4 << 9) & 234881024) | (3670016 & (i4 << 6)) | (i4 & 112) | 196614 | (57344 & (i4 << 3)));
                bVarI = bVarI;
                bVarI.X(false);
            }
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: t300
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w300.a(dVar2, list, z, i, function0, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
