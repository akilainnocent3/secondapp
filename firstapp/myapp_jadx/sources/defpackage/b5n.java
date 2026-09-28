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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b5n {
    public static final void a(final int i, a aVar, final d dVar, Function0 function0) {
        final Function0 function1;
        b bVar;
        dVar.getClass();
        function0.getClass();
        b bVarI = aVar.i(-1206380481);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVarD = androidx.compose.foundation.d.d(androidx.compose.foundation.a.b(j.i(j.g(dVar, 1.0f), 48.0f), c68.a(R.color.bg_brand_sub_primary_d_base, bVarI), zk40.a), false, null, null, function0, 15);
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = new z4n();
                bVarI.r(objY);
            }
            d dVarB = xa80.b(dVarD, false, (Function1) objY);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            function1 = function0;
            lkf0.d(cb40.a(R.string.page_instant_virtual__skip_to_result, new Object[0], bVarI), g3w.h(d.a.b, "ib_skip_button_text"), c68.a(R.color.text_inverse_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, bVarI), bVarI, 48, 0, 131064);
            bVar = bVarI;
            bVar.X(true);
        } else {
            function1 = function0;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, dVar, function1) { // from class: a5n
                public final /* synthetic */ d a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = dVar;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b5n.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
