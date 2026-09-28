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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tdx {
    public static final void a(final int i, a aVar, final String str, Function0 function0) {
        final Function0 function1 = function0;
        b bVarA = mzj.a(-925271882, aVar, str, function1);
        int i2 = i | (bVarA.M(str) ? 4 : 2) | (bVarA.A(function1) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            d.a aVar2 = d.a.b;
            d dVarG = h.g(androidx.compose.foundation.a.b(j.w(aVar2, 280.0f), c68.a(R.color.background_general_primary, bVarA), zk40.a), 20.0f, 32.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarA, 48);
            int iHashCode = Long.hashCode(bVarA.T);
            ne00 ne00VarS = bVarA.S();
            d dVarC = c.c(bVarA, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarA.D();
            if (bVarA.S) {
                bVarA.F(aVar3);
            } else {
                bVarA.p();
            }
            hlh0.a(bVarA, i78VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            hlh0.a(bVarA, dVarC, yka.a.d);
            mw90.a("https://s.sporty.net/cms/pp_2_1_cca3ceac8a.png", "image", j.r(aVar2, 120.0f), null, null, null, null, bVarA, 432, 2040);
            lkf0.d(cb40.a(R.string.identity_verification__name_change_successful, new Object[0], bVarA), h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarA), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.H3_M, bVarA), bVarA, 48, 0, 130040);
            lkf0.d(str, h.j(aVar2, 0.0f, 20.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, bVarA), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, bVarA), bVarA, (i2 & 14) | 48, 0, 130040);
            bVarA = bVarA;
            xya.a(h.j(j.g(aVar2, 1.0f), 0.0f, 24.0f, 0.0f, 0.0f, 13), false, cb40.a(R.string.common_functions__ok, new Object[0], bVarA), null, null, null, null, null, null, function0, bVarA, ((i2 << 24) & 1879048192) | 6, 506);
            function1 = function0;
            bVarA.X(true);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, str, function1) { // from class: sdx
                public final /* synthetic */ String a;
                public final /* synthetic */ Function0 b;

                {
                    this.a = str;
                    this.b = function1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tdx.a(qj40.a(1), (a) obj, this.a, this.b);
                    return Unit.a;
                }
            };
        }
    }
}
