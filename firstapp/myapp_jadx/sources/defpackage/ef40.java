package defpackage;

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

/* JADX INFO: loaded from: classes6.dex */
public final class ef40 {
    public static final void a(final int i, a aVar, d dVar, Function0 function0, Function0 function1) {
        final Function0 function2;
        final Function0 function3;
        final d dVar2;
        b bVarA = v2g.a(function0, function1, aVar, -1237398717);
        int i2 = (bVarA.A(function0) ? 4 : 2) | i | (bVarA.A(function1) ? 32 : 16) | 384;
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            dVar2 = d.a.b;
            d dVarE = j.e(dVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarA, 0);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar2);
            } else {
                bVarA.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarA, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarA, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarA, dVarC, cVar);
            l78 l78Var = l78.a;
            ty0.a(bVarA, l78Var.a(1.0f, dVar2, true));
            d dVarE2 = j.e(l78Var.a(7.0f, dVar2, true), 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarA, 0);
            int iHashCode2 = Long.hashCode(bVarA.T);
            ne00 ne00VarS2 = bVarA.S();
            d dVarC2 = c.c(bVarA, dVarE2);
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar2);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, d160VarA, bVar);
            hlh0.a(bVarA, ne00VarS2, dVar3);
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarA, iHashCode2, c1350a);
            }
            hlh0.a(bVarA, dVarC2, cVar);
            f160 f160Var = f160.a;
            d dVarE3 = j.e(f160Var.a(4.0f, dVar2, true), 1.0f);
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarA);
            }
            g75.a(androidx.compose.foundation.d.b(dVarE3, (psw) objY, null, false, null, function0, 28), bVarA, 0);
            ty0.a(bVarA, f160Var.a(2.0f, dVar2, true));
            d dVarE4 = j.e(f160Var.a(4.0f, dVar2, true), 1.0f);
            Object objY2 = bVarA.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarA);
            }
            function3 = function1;
            function2 = function0;
            g75.a(androidx.compose.foundation.d.b(dVarE4, (psw) objY2, null, false, null, function3, 28), bVarA, 0);
            bVarA.X(true);
            ty0.a(bVarA, l78Var.a(2.0f, dVar2, true));
            bVarA.X(true);
        } else {
            function2 = function0;
            function3 = function1;
            bVarA.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar2, function2, function3) { // from class: df40
                public final /* synthetic */ Function0 a;
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ d c;

                {
                    this.a = function2;
                    this.b = function3;
                    this.c = dVar2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ef40.a(qj40.a(1), (a) obj, this.c, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
