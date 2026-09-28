package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zt3 {
    public static final void a(au3 au3Var, a aVar, int i) {
        b bVarI = aVar.i(-508452584);
        int i2 = i | (bVarI.M(au3Var) ? 4 : 2);
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
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
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, i78VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarG = j.g(aVar2, 1.0f);
            d160 d160VarA = b160.a(new kw0.i(10.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarG);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            crz crzVarA = erz.a(R.drawable.ic__sports__football, 0, bVarI);
            d dVarR = j.r(aVar2, 16.0f);
            qyd0 qyd0Var = oib0.a;
            h6n.b(crzVarA, null, dVarR, ((lib0) bVarI.O(qyd0Var)).O, bVarI, 432, 0);
            String str = au3Var.b;
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            long j = ((lib0) bVarI.O(qyd0Var)).a;
            qyd0 qyd0Var2 = kjb0.a;
            lkf0.d(str, layoutWeightElement, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).f, bVarI, 0, 0, 131064);
            du3.a(R.color.text_primary, 0, bVarI, au3Var.a);
            bVarI.X(true);
            UiText uiText = au3Var.c;
            uiText.getClass();
            lkf0.e(uiText.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((ijb0) bVarI.O(qyd0Var2)).j, bVarI, 0, 0, 262142);
            bVarI = bVarI;
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new yt3(au3Var, i);
        }
    }
}
