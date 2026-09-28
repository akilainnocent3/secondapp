package defpackage;

import androidx.compose.foundation.layout.h;
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
public final class ssa0 {
    public static final void a(final d dVar, final tsa0 tsa0Var, final Function0 function0, a aVar, final int i) {
        tsa0Var.getClass();
        function0.getClass();
        b bVarI = aVar.i(248797461);
        int i2 = (bVarI.M(tsa0Var) ? 32 : 16) | i | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarD = androidx.compose.foundation.d.d(dVar, false, null, null, function0, 15);
            float f = ((qhb0) bVarI.O(shb0.a)).a;
            qyd0 qyd0Var = oib0.a;
            d dVarH = h.h(d35.a(dVarD, f, ((lib0) bVarI.O(qyd0Var)).A, zk40.a), 0.0f, 9.0f, 1);
            d160 d160VarA = b160.a(new kw0.i(12.0f, true, new iw0(ht.a.n)), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(tsa0Var.b, null, ((lib0) bVarI.O(qyd0Var)).i, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(kjb0.a)).i, bVarI, 0, 0, 131066);
            final twd0 twd0VarB = xe0.b(tsa0Var.c ? -180.0f : 0.0f, null, null, null, bVarI, 0, 30);
            crz crzVarA = erz.a(R.drawable.ic__arrow_chevron_down, 0, bVarI);
            d dVarR = j.r(d.a.b, 12.0f);
            boolean zM = bVarI.M(twd0VarB);
            Object objY = bVarI.y();
            if (zM || objY == a.C0041a.a) {
                objY = new Function1() { // from class: qsa0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        a7l a7lVar = (a7l) obj;
                        a7lVar.getClass();
                        a7lVar.u(((Number) twd0VarB.getValue()).floatValue());
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            h6n.b(crzVarA, null, androidx.compose.ui.graphics.a.a(dVarR, (Function1) objY), ((lib0) bVarI.O(qyd0Var)).i, bVarI, 48, 0);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(tsa0Var, function0, i) { // from class: rsa0
                public final /* synthetic */ tsa0 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(7);
                    ssa0.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
