package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class p38 {
    public static final void a(final String str, final boolean z, final Function0 function0, final op8 op8Var, a aVar, final int i) {
        int i2;
        function0.getClass();
        b bVarI = aVar.i(1939237843);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        int i3 = i & 3072;
        d.a aVar2 = d.a.b;
        if (i3 == 0) {
            i2 |= bVarI.M(aVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(op8Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarG = j.g(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            ot00.a(i2 & 1022, bVarI, null, str, function0, z);
            hh0.b(l78.a, z, null, f.e(null, null, 15).b(f.f(null, 3)), f.m(null, null, 15).b(f.g(null, 3)), null, pp8.b(1719597089, new gaj() { // from class: n38
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d dVarG2 = j.g(d.a.b, 1.0f);
                        i78 i78VarA2 = g78.a(kw0.c, ht.a.m, aVar4, 0);
                        int iHashCode2 = Long.hashCode(aVar4.m());
                        ne00 ne00VarO = aVar4.o();
                        d dVarC2 = c.c(aVar4, dVarG2);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar4.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar4.D();
                        if (aVar4.g()) {
                            aVar4.F(aVar5);
                        } else {
                            aVar4.p();
                        }
                        hlh0.a(aVar4, i78VarA2, yka.a.f);
                        hlh0.a(aVar4, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a2 = yka.a.g;
                        if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar4, iHashCode2, c1350a2);
                        }
                        hlh0.a(aVar4, dVarC2, yka.a.d);
                        op8Var.invoke(l78.a, aVar4, 6);
                        aVar4.s();
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1600518 | (i2 & 112), 18);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: o38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    p38.a(str, z, function0, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
