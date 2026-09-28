package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h150 {
    public static final void a(final ogo.b bVar, final boolean z, final Function0<Unit> function0, a aVar, final int i) {
        b bVar2;
        long jA;
        imf0 imf0VarL;
        String strA;
        int i2 = bVar.c;
        function0.getClass();
        b bVarI = aVar.i(695158236);
        int i3 = (bVarI.A(bVar) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            if (i2 == 0) {
                jA = rzg.a(bVarI, -873112152, R.color.text_disabled_name, bVarI, false);
            } else {
                jA = z ? rzg.a(bVarI, -873028452, R.color.bg_brand_sub_primary_d_lighter, bVarI, false) : rzg.a(bVarI, -872949650, R.color.text_primary, bVarI, false);
            }
            if (z) {
                bVarI.N(-872856526);
                imf0VarL = mla.l(R.style.B1_M, bVarI);
                bVarI.X(false);
            } else {
                bVarI.N(-872798990);
                imf0VarL = mla.l(R.style.B1_R, bVarI);
                bVarI.X(false);
            }
            imf0 imf0Var = imf0VarL;
            int i4 = i3 & 14;
            bVarI.N(-292905690);
            Float f = bVar.a;
            Float f2 = bVar.b;
            if (f == null && f2 == null) {
                bVarI.N(-798072372);
                strA = cb40.a(R.string.component_odds_filters__all, new Object[0], bVarI);
                bVarI.X(false);
            } else if (f2 == null) {
                bVarI.N(-798069223);
                strA = cb40.a(R.string.component_odds_filters__odds, new Object[0], bVarI) + " ≥ " + gky.a.a(String.valueOf(f), false);
                bVarI.X(false);
            } else if (f == null) {
                bVarI.N(-798063655);
                strA = cb40.a(R.string.component_odds_filters__odds, new Object[0], bVarI) + " ≤ " + gky.a(String.valueOf(f2.floatValue()));
                bVarI.X(false);
            } else {
                bVarI.N(-798058882);
                strA = cb40.a(R.string.component_odds_filters__odds, new Object[0], bVarI) + " " + f + " - " + f2;
                bVarI.X(false);
            }
            bVarI.X(false);
            String str = strA + " (" + i2 + ")";
            boolean z2 = (i4 == 4 || bVarI.A(bVar)) | ((i3 & 896) == 256);
            Object objY = bVarI.y();
            if (z2 || objY == a.C0041a.a) {
                objY = new jdi(bVar, function0);
                bVarI.r(objY);
            }
            bVar2 = bVarI;
            lkf0.d(str, h.h(h.j(j.g(g3w.f(d.a.b, true, (Function0) objY), 1.0f), 16.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 10.0f, 1), jA, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVar2, 0, 0, 131064);
            ute.b(null, 1.0f, c68.a(R.color.background_type1_primary, bVar2), bVar2, 48, 1);
        } else {
            bVar2 = bVarI;
            bVar2.G();
        }
        e eVarZ = bVar2.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(z, function0, i) { // from class: f150
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(9);
                    h150.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
