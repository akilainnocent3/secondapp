package defpackage;

import androidx.compose.foundation.layout.h;
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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class c5f {
    public static final void a(final d dVar, final fno fnoVar, final Function1 function1, final Function0 function0, final Function1 function2, a aVar, final int i) {
        function1.getClass();
        function0.getClass();
        function2.getClass();
        b bVarI = aVar.i(1293163149);
        Function1 function3 = function2;
        int i2 = i | (bVarI.M(fnoVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function3) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            d dVarB = androidx.compose.foundation.a.b(dVar, ((lib0) bVarI.O(oib0.a)).m0, zk40.a);
            qyd0 qyd0Var = ejb0.a;
            i78 i78VarA = g78.a(new kw0.i(((cjb0) bVarI.O(qyd0Var)).d, true, new hw0()), ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
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
            float f = ((cjb0) bVarI.O(qyd0Var)).f;
            d.a aVar3 = d.a.b;
            float f2 = 0.0f;
            int i3 = 2;
            d dVarH = h.h(aVar3, f, 0.0f, 2);
            y4f y4fVar = fnoVar.a;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                objY = new z4f(function1, 0);
                bVarI.r(objY);
            }
            int i5 = y4f.e;
            x4f.a(dVarH, y4fVar, (Function0) objY, bVarI, 0);
            bVarI.N(1301282889);
            for (j5f j5fVar : fnoVar.b) {
                d dVarH2 = h.h(aVar3, ((cjb0) bVarI.O(ejb0.a)).f, f2, i3);
                Object objY2 = bVarI.y();
                if (objY2 == c0042a) {
                    objY2 = new a5f();
                    bVarI.r(objY2);
                }
                d dVarH3 = g3w.h(xa80.b(dVarH2, false, (Function1) objY2), "double_or_nothing_round_card_" + j5fVar.a);
                boolean z2 = i4 == 256;
                Object objY3 = bVarI.y();
                if (z2 || objY3 == c0042a) {
                    objY3 = new ha1(1, function1);
                    bVarI.r(objY3);
                }
                i5f.b(dVarH3, j5fVar, (Function0) objY3, function3, bVarI, (i2 >> 3) & 7168);
                function3 = function2;
                i4 = i4;
                f2 = 0.0f;
                i3 = 2;
            }
            bVarI.X(false);
            ute.b(null, 1.0f, ((lib0) bVarI.O(oib0.a)).A, bVarI, 48, 1);
            bVarI.X(true);
            v4f v4fVar = fnoVar.c;
            if (v4fVar == null) {
                bVarI.N(-1231732467);
                bVarI.X(false);
            } else {
                bVarI.N(-1231732466);
                tfo.a(new ufo(cb40.a(v4fVar.a, new Object[0], bVarI), cb40.a(v4fVar.b, new Object[0], bVarI)), function0, function0, bVarI, ((i2 >> 3) & 896) | ((i2 >> 6) & 112));
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(fnoVar, function1, function0, function2, i) { // from class: b5f
                public final /* synthetic */ fno b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    c5f.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
