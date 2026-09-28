package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class d4e0 {
    public static final void a(final d dVar, final boolean z, final boolean z2, final UiText uiText, final Function0 function0, a aVar, final int i) {
        int i2;
        Function0 function1;
        b bVar;
        long j;
        uiText.getClass();
        function0.getClass();
        b bVarI = aVar.i(1896563087);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.b(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(uiText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            if (z2) {
                bVarI.N(1531000993);
                j = ((ast) bVarI.O(cst.e)).b;
            } else {
                bVarI.N(1531001979);
                j = ((ast) bVarI.O(cst.e)).a;
            }
            bVarI.X(false);
            bVar = bVarI;
            ihe0.c(function1, g3w.h(j.i(dVar, 16.0f), "streak_boost_badge"), false, j060.c(((zib0) bVarI.O(ajb0.a)).e), j, 0L, 0.0f, 0.0f, null, null, pp8.b(121620708, new Function2() { // from class: b4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2;
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        qyd0 qyd0Var = ejb0.a;
                        float f = ((cjb0) aVar3.O(qyd0Var)).d;
                        float f2 = ((cjb0) aVar3.O(qyd0Var)).b;
                        d.a aVar4 = d.a.b;
                        d dVarG = h.g(aVar4, f, f2);
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar3.O(qyd0Var)).b, true, new hw0()), ht.a.k, aVar3, 48);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarG);
                        yka.k.getClass();
                        tsr.a aVar5 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar5);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, d160VarA, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        if (z) {
                            aVar3.N(1696822168);
                            aVar2 = aVar3;
                            h6n.b(pib0.a(R.drawable.img__streak_level_1, 0, aVar3), "streak_boost_icon", j.r(aVar4, 12.0f), ((lib0) aVar3.O(oib0.a)).O, aVar2, 432, 0);
                            aVar2.H();
                        } else {
                            aVar2 = aVar3;
                            aVar2.N(1697091682);
                            aVar2.H();
                        }
                        UiText uiText2 = uiText;
                        uiText2.getClass();
                        String strG = uiText2.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b));
                        imf0 imf0VarB = imf0.b(((ijb0) aVar2.O(kjb0.a)).s, 0L, 0L, t9i.D, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                        qyd0 qyd0Var2 = oib0.a;
                        a aVar6 = aVar2;
                        lkf0.d(strG, null, ((lib0) aVar2.O(qyd0Var2)).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarB, aVar6, 0, 0, 131066);
                        h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar6), "go_to_streak", g3w.h(j.r(aVar4, 8.0f), "streak_boost_icon_button"), ((lib0) aVar6.O(qyd0Var2)).O, aVar6, 432, 0);
                        aVar6.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, (i2 >> 12) & 14, 996);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c4e0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d4e0.a(dVar, z, z2, uiText, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
