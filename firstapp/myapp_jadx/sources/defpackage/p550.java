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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class p550 {
    public static final void a(final String str, final int i, final int i2, final Function0<Unit> function0, final Function0<Unit> function1, a aVar, final int i3) {
        b bVar;
        b bVarA = v2g.a(function0, function1, aVar, 705487796);
        int i4 = i3 | (bVarA.M(str) ? 4 : 2) | (bVarA.d(i) ? 32 : 16) | (bVarA.d(i2) ? 256 : 128) | (bVarA.A(function0) ? 2048 : 1024) | (bVarA.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarA.q(i4 & 1, (i4 & 9363) != 9362)) {
            boolean z = i > 0;
            boolean z2 = i < i2 + (-1);
            long jA = c68.a(R.color.text_brand_sub_primary_d_base, bVarA);
            long jA2 = c68.a(R.color.text_disabled_name, bVarA);
            d.a aVar2 = d.a.b;
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarA, 48);
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
            hlh0.a(bVarA, d160VarA, yka.a.f);
            hlh0.a(bVarA, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarA.S || !Intrinsics.g(bVarA.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarA, iHashCode, c1350a);
            }
            lkf0.d(str, yy.a(bVarA, dVarC, yka.a.d, 1.0f, true), c68.a(R.color.text_tertiary, bVarA), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_B, bVarA), bVarA, i4 & 14, 0, 131064);
            String strConcat = " < ".concat(cb40.a(R.string.common_functions__prev, new Object[0], bVarA));
            d dVarH = g3w.h(aVar2, "remix_bet_prev_btn");
            Object objY = bVarA.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarA);
            }
            boolean z3 = z;
            lkf0.d(strConcat, androidx.compose.foundation.d.b(dVarH, (psw) objY, ut50.b(0.0f, 7, 0L, false), z3, null, function0, 24), z3 ? jA : jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarA), bVarA, 0, 0, 131064);
            ty0.a(bVarA, j.w(aVar2, 12.0f));
            String strConcat2 = cb40.a(R.string.common_functions__next, new Object[0], bVarA).concat(" > ");
            d dVarH2 = g3w.h(aVar2, "remix_bet_next_btn");
            Object objY2 = bVarA.y();
            if (objY2 == c0042a) {
                objY2 = rzk.a(bVarA);
            }
            boolean z4 = z2;
            lkf0.d(strConcat2, androidx.compose.foundation.d.b(dVarH2, (psw) objY2, ut50.b(0.0f, 7, 0L, false), z4, null, function1, 24), z4 ? jA : jA2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B2_R, bVarA), bVarA, 0, 0, 131064);
            bVar = bVarA;
            bVar.X(true);
        } else {
            bVar = bVarA;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, i, i2, function0, function1, i3) { // from class: o550
                public final /* synthetic */ String a;
                public final /* synthetic */ int b;
                public final /* synthetic */ int c;
                public final /* synthetic */ Function0 d;
                public final /* synthetic */ Function0 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    p550.a(this.a, this.b, this.c, this.d, this.e, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
