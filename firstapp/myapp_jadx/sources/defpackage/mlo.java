package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mlo {
    public static final void a(int i, int i2, Function2 function2, a aVar, final int i3) {
        final Function2 function3;
        final int i4;
        final int i5;
        function2.getClass();
        b bVarI = aVar.i(-300933908);
        int i6 = i3 | 18;
        if (bVarI.q(i6 & 1, (i6 & 147) != 146)) {
            bVarI.A0();
            if ((i3 & 1) == 0 || bVarI.h0()) {
                i4 = R.color.colorPrimaryDark;
                i5 = R.color.absolute_type3;
            } else {
                bVarI.G();
                i4 = i;
                i5 = i2;
            }
            bVarI.Y();
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
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
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            dnn dnnVarC = r8j0.c(q8j0.a.a(bVarI).k, bVarI);
            d dVarI = j.i(j.g(aVar2, 1.0f), dnnVarC.d());
            long jA = c68.a(i4, bVarI);
            zk40.a aVar4 = zk40.a;
            d dVarB = androidx.compose.foundation.a.b(dVarI, jA, aVar4);
            n54 n54Var2 = ht.a.b;
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            g75.a(dVar2.b(dVarB, n54Var2), bVarI, 0);
            g75.a(dVar2.b(androidx.compose.foundation.a.b(j.i(j.g(aVar2, 1.0f), dnnVarC.a()), c68.a(i5, bVarI), aVar4), ht.a.h), bVarI, 0);
            d dVarE2 = h.e(j.e(aVar2, 1.0f), dnnVarC);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarE2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            function3 = function2;
            function3.invoke(bVarI, 6);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            function3 = function2;
            bVarI.G();
            i4 = i;
            i5 = i2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i4, i5, function3, i3) { // from class: llo
                public final /* synthetic */ int a;
                public final /* synthetic */ int b;
                public final /* synthetic */ Function2 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    mlo.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
