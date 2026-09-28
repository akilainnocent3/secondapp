package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vcf0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(xcf0 xcf0Var, a aVar, final int i) {
        xcf0 xcf0Var2;
        b bVarI = aVar.i(532047692);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                xcf0Var2 = (xcf0) p8i0.a(jq40.a(xcf0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                xcf0Var2 = xcf0Var;
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(xcf0Var2.c, bVarI, 0, 7);
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
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d dVarH = h.h(aVar2, 16.0f, 0.0f, 2);
            boolean zBooleanValue = ((Boolean) ytwVarC.getValue()).booleanValue();
            boolean zA = bVarI.A(xcf0Var2);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new a6z(xcf0Var2, 1);
                bVarI.r(objY);
            }
            xcf0Var = xcf0Var2;
            mcd0.a(dVarH, "Enable Test Header", "enable_test_header", "realtime_cms_test_mode_switch", zBooleanValue, false, (Function1) objY, 0, null, null, false, bVarI, 3510, 6, 928);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        final xcf0 xcf0Var3 = xcf0Var;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: ucf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    vcf0.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
