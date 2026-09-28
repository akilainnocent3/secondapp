package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class ze10 {
    public static final void a(final uf00 uf00Var, final Integer num, final s610 s610Var, d dVar, final Function1 function1, a aVar, final int i) {
        final d dVar2;
        uf00Var.getClass();
        s610Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(-1530542280);
        int i2 = i | (bVarI.M(uf00Var) ? 4 : 2) | (bVarI.M(num) ? 32 : 16) | (bVarI.A(s610Var) ? 256 : 128) | 3072 | (bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d.a aVar2 = d.a.b;
            d dVarC = c.c(bVarI, aVar2);
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
            hf10.d(uf00Var, num, new bf10(c68.a(R.color.border_brand_sub, bVarI), c68.a(R.color.transparent, bVarI), c68.a(R.color.bg_brand_sub_secondary_d_darker, bVarI), c68.a(R.color.text_brand_sub_primary_d_base, bVarI), c68.a(R.color.text_brand_sub_selected, bVarI)), null, function1, bVarI, i2 & 57470);
            o610.a(s610Var, h.j(aVar2, 0.0f, 16.0f, 0.0f, 0.0f, 13), bVarI, ((i2 >> 6) & 14) | 56, 0);
            bVarI.X(true);
            dVar2 = aVar2;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(num, s610Var, dVar2, function1, i) { // from class: ye10
                public final /* synthetic */ Integer b;
                public final /* synthetic */ s610 c;
                public final /* synthetic */ d d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(513);
                    ze10.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
