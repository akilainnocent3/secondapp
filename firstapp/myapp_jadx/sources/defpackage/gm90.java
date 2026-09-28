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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class gm90 {
    public static final void a(final sm90 sm90Var, final a390 a390Var, final Function1 function1, final pf3 pf3Var, final qf3 qf3Var, a aVar, final int i) {
        b bVarI = aVar.i(706639070);
        int i2 = i | (bVarI.A(sm90Var) ? 4 : 2) | (bVarI.M(a390Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(pf3Var) ? 2048 : 1024) | (bVarI.A(qf3Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            zzr zzrVarA = e0s.a(0, 3, bVarI);
            boolean zM = ((i2 & 112) == 32) | bVarI.M(zzrVarA);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new fm90(a390Var, zzrVarA, null);
                bVarI.r(objY);
            }
            xvf.e(bVarI, a390Var, (Function2) objY);
            d dVarE = j.e(d.a.b, 1.0f);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new cm90();
                bVarI.r(objY2);
            }
            d dVarF = g3w.f(dVarE, true, (Function0) objY2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            at90.a(sm90Var.a, qf3Var, bVarI, (i2 >> 9) & 112);
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            ll90 ll90Var = sm90Var.b;
            boolean z = (i2 & 896) == 256;
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new dm90(function1, 0);
                bVarI.r(objY3);
            }
            kl90.a(layoutWeightElement, ll90Var, zzrVarA, (Function0) objY3, pf3Var, bVarI, (i2 << 3) & 57344);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(a390Var, function1, pf3Var, qf3Var, i) { // from class: em90
                public final /* synthetic */ a390 b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ pf3 d;
                public final /* synthetic */ qf3 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    gm90.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
