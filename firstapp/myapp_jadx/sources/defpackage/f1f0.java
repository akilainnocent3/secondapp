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
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
public final class f1f0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    public static final void a(final int i, final int i2, a aVar, final d dVar, final String str, final Function0 function0, final boolean z) {
        b bVar;
        ?? r5;
        imf0 imf0VarL;
        function0.getClass();
        b bVarI = aVar.i(870008521);
        int i3 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.b(z) ? 32 : 16);
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= bVarI.b(false) ? 256 : 128;
        }
        int i4 = i3 | (bVarI.A(function0) ? 2048 : 1024) | (bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            d dVarD = androidx.compose.foundation.d.d(j.i(dVar, 48.0f), false, null, null, function0, 15);
            n54 n54Var = ht.a.a;
            aiv aivVarC = g75.c(n54Var, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarD);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar2);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            n54 n54Var2 = ht.a.e;
            androidx.compose.foundation.layout.d dVar3 = androidx.compose.foundation.layout.d.a;
            d.a aVar3 = d.a.b;
            d dVarB = dVar3.b(aVar3, n54Var2);
            aiv aivVarC2 = g75.c(n54Var, false);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar2);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            d dVarH = g3w.h(h.g(aVar3, 8.0f, 6.0f), "auto_bet_tab_button_label");
            if (z) {
                bVarI.N(140203065);
                imf0VarL = mla.l(R.style.B1_B, bVarI);
                r5 = 0;
                bVarI.X(false);
            } else {
                r5 = 0;
                bVarI.N(140292345);
                imf0VarL = mla.l(R.style.B1_M, bVarI);
                bVarI.X(false);
            }
            lkf0.d(str, dVarH, c68.a(R.color.text_primary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarL, bVarI, i4 & 14, 0, 131064);
            b bVar3 = bVarI;
            bVar3.N(140929581);
            bVar3.X(r5);
            bVar3.X(true);
            if (z) {
                bVar3.N(979573594);
                g75.a(g3w.h(androidx.compose.foundation.a.b(dVar3.b(j.i(j.g(aVar3, 1.0f), 4.0f), ht.a.h), c68.a(R.color.border_brand_sub, bVar3), zk40.a), "auto_bet_tab_button_indicator"), bVar3, r5);
                bVar3.X(r5);
            } else {
                bVar3.N(979905139);
                bVar3.X(r5);
            }
            bVar3.X(true);
            bVar = bVar3;
        } else {
            b bVar4 = bVarI;
            bVar4.G();
            bVar = bVar4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: e1f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    f1f0.a(qj40.a(i | 1), i2, (a) obj, dVar, str, function0, z);
                    return Unit.a;
                }
            };
        }
    }
}
