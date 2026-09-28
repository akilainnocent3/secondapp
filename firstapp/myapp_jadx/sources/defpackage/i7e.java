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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i7e {
    public static final void a(d dVar, final UiText uiText, final uxs uxsVar, final Function0 function0, a aVar, final int i) {
        final d dVar2;
        uiText.getClass();
        function0.getClass();
        b bVarI = aVar.i(-777994377);
        int i2 = i | 6 | (bVarI.M(uiText) ? 32 : 16) | (bVarI.d(uxsVar.ordinal()) ? 256 : 128) | (bVarI.A(function0) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            dVar2 = d.a.b;
            d dVarJ = h.j(j.g(dVar2, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            kw0.k kVar = kw0.c;
            n54.a aVar2 = ht.a.m;
            i78 i78VarA = g78.a(kVar, aVar2, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(dVar2, 1.0f);
            qyd0 qyd0Var = ajb0.a;
            d dVarF = h.f(androidx.compose.foundation.a.b(lx80.d(dVarG, 16.0f, j060.e(((zib0) bVarI.O(qyd0Var)).d, ((zib0) bVarI.O(qyd0Var)).d, 0.0f, 0.0f, 12), false, 0L, 0L, 28), ((lib0) bVarI.O(oib0.a)).n0, zk40.a), ((cjb0) bVarI.O(ejb0.a)).g);
            i78 i78VarA2 = g78.a(kVar, aVar2, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA2, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            aza.a(j.g(dVar2, 1.0f), uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), uxsVar, null, alb0.a(sya.a, new g7f(44.0f), null, 0L, 0.0f, 29), null, null, null, function0, null, bVarI, (i2 & 896) | 6 | ((i2 << 15) & 234881024), 744);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(uiText, uxsVar, function0, i) { // from class: h7e
                public final /* synthetic */ UiText b;
                public final /* synthetic */ uxs c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    i7e.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
