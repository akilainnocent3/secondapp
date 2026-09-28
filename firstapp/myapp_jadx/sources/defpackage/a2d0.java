package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
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

/* JADX INFO: loaded from: classes5.dex */
public final class a2d0 {
    public static final void a(d dVar, final String str, final r2d0 r2d0Var, final Function0 function0, final Function0 function1, final Function0 function2, a aVar, final int i) {
        final d dVar2;
        boolean z;
        r2d0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(1097818915);
        int i2 = i | 6 | (bVarI.M(str) ? 32 : 16) | (bVarI.M(r2d0Var) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(function2) ? 131072 : 65536);
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            d.a aVar2 = d.a.b;
            d dVarK = j.k(aVar2, 0.0f, 48.0f, 1);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarK);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (r2d0Var instanceof r2d0.c) {
                bVarI.N(161412298);
                wy90.a(function0, bVarI, (i2 >> 9) & 14);
                bVarI.X(false);
                z = true;
            } else {
                if (!r2d0Var.equals(r2d0.b.b)) {
                    throw igf0.a(bVarI, -271889832, false);
                }
                bVarI.N(161602235);
                d dVarG = j.g(aVar2, 1.0f);
                d160 d160VarA = b160.a(kw0.a, ht.a.j, bVarI, 0);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarG);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, d160VarA, bVar);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                d dVarC3 = j.c(aVar2, 1.0f);
                if (1.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                int i3 = i2 >> 9;
                g7i0.a(i3 & 112, bVarI, dVarC3.n(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), function1);
                d dVarC4 = j.c(aVar2, 1.0f);
                if (2.0f <= 0.0d) {
                    ukn.a("invalid weight; must be greater than zero");
                }
                z = true;
                xrx.a(i3 & 896, bVarI, dVarC4.n(new LayoutWeightElement(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true)), str == null ? "" : str, function2);
                bVarI.X(true);
                bVarI.X(false);
            }
            bVarI.X(z);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, r2d0Var, function0, function1, function2, i) { // from class: z1d0
                public final /* synthetic */ String b;
                public final /* synthetic */ r2d0 c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;
                public final /* synthetic */ Function0 f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    a2d0.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
