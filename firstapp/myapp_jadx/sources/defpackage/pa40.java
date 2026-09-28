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
public final class pa40 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(sa40 sa40Var, a aVar, final int i) {
        final sa40 sa40Var2;
        sa40 sa40Var3;
        b bVarI = aVar.i(-1888474294);
        int i2 = i | 2;
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                sa40Var3 = (sa40) p8i0.a(jq40.a(sa40.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                sa40Var3 = sa40Var;
            }
            bVarI.Y();
            ytw ytwVarC = wyh.c(sa40Var3.b, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(sa40Var3.c, bVarI, 0, 7);
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
            boolean zA = bVarI.A(sa40Var3);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new ma40(sa40Var3, i3);
                bVarI.r(objY);
            }
            mcd0.a(dVarH, "Realtime CMS Test Mode", "realtime_cms_test_mode", "realtime_cms_test_mode_switch", zBooleanValue, false, (Function1) objY, 0, null, null, false, bVarI, 3510, 6, 928);
            d dVarH2 = h.h(aVar2, 16.0f, 0.0f, 2);
            boolean zBooleanValue2 = ((Boolean) ytwVarC2.getValue()).booleanValue();
            sa40Var2 = sa40Var3;
            boolean zA2 = bVarI.A(sa40Var2);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function1() { // from class: na40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        sa40 sa40Var4 = sa40Var2;
                        ej5.c(o8i0.d(sa40Var4), null, null, new qa40(sa40Var4, zBooleanValue3, null), 3);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            mcd0.a(dVarH2, "CMS Display String Key", "cms_display_string_key", "cms_display_string_key_switch", zBooleanValue2, false, (Function1) objY2, 0, null, null, false, bVarI, 3510, 6, 928);
            bVarI.X(true);
        } else {
            bVarI.G();
            sa40Var2 = sa40Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: oa40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    pa40.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
