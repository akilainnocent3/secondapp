package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0f0 {
    public static final void a(final int i, a aVar, final d dVar, final Function0 function0, final boolean z, final boolean z2) {
        long jB;
        function0.getClass();
        b bVarI = aVar.i(1003340661);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z3 || objY == c0042a) {
                if (z) {
                    jB = z2 ? r58.d(4281326642L) : j58.f;
                } else {
                    jB = z2 ? r58.b(2133842994) : r58.d(4283454559L);
                }
                objY = new j58(jB);
                bVarI.r(objY);
            }
            long j = ((j58) objY).a;
            d dVarB = androidx.compose.foundation.a.b(ls7.a(j.r(dVar, 30.0f), j060.a), r58.d(4279967269L), zk40.a);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarI);
            }
            d dVarB2 = androidx.compose.foundation.d.b(dVarB, (psw) objY2, ut50.b(0.0f, 3, j, false), z, null, function0, 24);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB2);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
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
            h9n.a(erz.a(R.drawable.wd_boost_icon, 0, bVarI), "Boost", j.e(d.a.b, 1.0f), null, null, 0.0f, new gf4(j, 5), bVarI, 432, 56);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function0, z, z2) { // from class: j0f0
                public final /* synthetic */ d a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Function0 d;

                {
                    this.a = dVar;
                    this.b = z;
                    this.c = z2;
                    this.d = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k0f0.a(qj40.a(1), (a) obj, this.a, this.d, this.b, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
