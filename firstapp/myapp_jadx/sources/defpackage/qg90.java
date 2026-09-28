package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qg90 {
    public static final void a(final uf00<x690> uf00Var, final float f, final boolean z, final Function1<? super x690, Unit> function1, a aVar, final int i) {
        boolean z2;
        uf00Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1107324682);
        boolean z3 = z;
        int i2 = i | (bVarI.M(uf00Var) ? 4 : 2) | (bVarI.c(f) ? 32 : 16) | (bVarI.b(z3) ? 256 : 128) | (bVarI.A(function1) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            w690[] w690VarArr = w690.a;
            float f2 = ((f - 16.0f) - 230.0f) / 4.0f;
            d.a aVar2 = d.a.b;
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            g75.a(j.i(aVar2, 8.0f), bVarI, 6);
            d dVarG2 = j.g(h.h(aVar2, 8.0f, 0.0f, 2), 1.0f);
            d160 d160VarA = b160.a(new kw0.i(f2, true, new hw0()), ht.a.j, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            bVarI.N(-120575668);
            int i3 = 0;
            for (x690 x690Var : uf00Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.b.q();
                    throw null;
                }
                x690 x690Var2 = x690Var;
                v590.b bVar2 = new v590.b(c.a(x690Var2, bVarI));
                String str = x690Var2.d;
                i790 i790Var = x690Var2.f;
                t690 t690Var = x690Var2.h;
                String strB = x690Var2.b();
                boolean zA = ((i2 & 7168) == 2048) | bVarI.A(x690Var2);
                Object objY = bVarI.y();
                if (zA || objY == a.C0041a.a) {
                    z2 = true;
                    objY = new w110(1, function1, x690Var2);
                    bVarI.r(objY);
                } else {
                    z2 = true;
                }
                f690.c(null, bVar2, str, z3, t690Var, i790Var, strB, (Function0) objY, bVarI, (i2 << 3) & 7168, 1);
                z3 = z;
                i2 = i2;
                i3 = i4;
            }
            f30.a(bVarI, false, true, true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, z, function1, i) { // from class: pg90
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    qg90.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
