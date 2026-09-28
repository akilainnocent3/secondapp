package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.h;
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

/* JADX INFO: loaded from: classes8.dex */
public final class pqi0 {
    public static final void a(final dpi0 dpi0Var, final boolean z, final Function0 function0, final Function0 function1, a aVar, final int i) {
        b bVarI = aVar.i(1297475948);
        int i2 = i | (bVarI.M(dpi0Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            kw0.j jVar = kw0.a;
            d160 d160VarA = b160.a(jVar, ht.a.k, bVarI, 48);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarY = j.y(aVar2, 12.0f, 0.0f, 2);
            d160 d160VarA2 = b160.a(jVar, ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarY);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            t9g t9gVarO = f.o(yi0.e(300, 0, null, 6), null, 2);
            gzg0 gzg0VarE = yi0.e(300, 0, null, 6);
            n54.a aVar4 = ht.a.m;
            f160 f160Var = f160.a;
            hh0.d(f160Var, z, null, t9gVarO.b(f.b(gzg0VarE, aVar4, 12)).b(f.f(yi0.e(300, 0, null, 6), 2)), f.s(yi0.e(300, 0, null, 6), null, 2).b(f.j(yi0.e(300, 0, null, 6), aVar4, 12)).b(f.g(yi0.e(300, 0, null, 6), 2)), null, pp8.b(1519997964, new gaj() { // from class: nqi0
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ((jh0) obj).getClass();
                    fri0.a(6, (a) obj2, h.j(d.a.b, 12.0f, 0.0f, 8.0f, 0.0f, 10), function0, dpi0Var.b());
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572870 | (i2 & 112), 18);
            bVarI.X(true);
            cpi0.b(f160Var.a(1.0f, h.j(aVar2, 0.0f, 0.0f, 12.0f, 0.0f, 11), true), dpi0Var, function1, bVarI, ((i2 >> 3) & 896) | ((i2 << 3) & 112));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, function1, i) { // from class: oqi0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pqi0.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
