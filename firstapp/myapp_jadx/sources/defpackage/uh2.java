package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.domain.entity.Selection;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uh2 {
    public static final void a(d dVar, Selection selection, final Function0 function0, a aVar, int i) {
        int i2;
        selection.getClass();
        b bVarI = aVar.i(-1295285967);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(selection) : bVarI.A(selection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            d dVarJ = h.j(d35.a(j.i(j.g(dVar, 1.0f), 32.0f), 1.0f, c68.a(R.color.line_type2_secondary, bVarI), j060.c(2.0f)), 12.0f, 0.0f, 10.0f, 0.0f, 10);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            lkf0.d(selection.getDisplayText(), androidx.compose.ui.platform.d.a(new LayoutWeightElement(1.0f, true), "android:id/bet_builder_selection"), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, imf0.b(((eah0) bVarI.O(gah0.a)).k, c68.a(R.color.text_type2_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), bVarI, 0, 24960, 110588);
            bVarI = bVarI;
            d.a aVar3 = d.a.b;
            ty0.a(bVarI, j.w(aVar3, 4.0f));
            crz crzVarA = erz.a(R.drawable.spr_ic_cancel_bordered, 0, bVarI);
            d dVarR = j.r(aVar3, 24.0f);
            boolean z = (i2 & 896) == 256;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: sh2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            h6n.b(crzVarA, "remove selection", androidx.compose.ui.platform.d.a(h.f(androidx.compose.foundation.d.d(dVarR, false, null, null, (Function0) objY, 15), 2.0f), "android:id/bet_builder_selection_remove_icon"), c68.a(R.color.text_type2_secondary, bVarI), bVarI, 48, 0);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new th2(dVar, selection, function0, i);
        }
    }
}
