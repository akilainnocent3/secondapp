package defpackage;

import androidx.compose.foundation.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class za90 {
    public static final void a(final int i, final int i2, final int i3, a aVar, d dVar, final Function0 function0, final boolean z) {
        final d dVar2;
        int i4;
        Function0 function1;
        b bVar;
        b bVarI = aVar.i(-1192742798);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i4 = (bVarI.M(dVar2) ? 4 : 2) | i2;
        }
        int i6 = i4 | (bVarI.b(z) ? 32 : 16) | (bVarI.d(i) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            function1 = function0;
            i6 |= bVarI.A(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if (bVarI.q(i6 & 1, (i6 & 1171) != 1170)) {
            d dVar3 = i5 != 0 ? d.a.b : dVar2;
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            bVar = bVarI;
            nk5.c(function1, g.a(j.g(dVar3, 1.0f), pswVar, ut50.b(0.0f, 3, c68.a(i, bVarI), false)), false, zk40.a, null, null, null, pswVar, pp8.b(-1228741841, new gaj() { // from class: xa90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z2 = z;
                        String strA = cb40.a(z2 ? R.string.common_functions__show_less : R.string.common_functions__show_more, new Object[0], aVar2);
                        imf0 imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                        int i7 = i;
                        lkf0.d(strA, null, c68.a(i7, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 131066);
                        d.a aVar3 = d.a.b;
                        ty0.a(aVar2, j.w(aVar3, 8.0f));
                        h6n.b(erz.a(R.drawable.spr_ic_chevron_right_gray, 0, aVar2), null, j.r(p1a.a(aVar3, z2 ? -90.0f : 90.0f), 24.0f), c68.a(i7, aVar2), aVar2, 48, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, ((i6 >> 9) & 14) | 905972736, 244);
            dVar2 = dVar3;
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ya90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    za90.a(i, iA, i3, (a) obj, dVar2, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(ComposeView composeView, final boolean z, boolean z2, final Function0<Unit> function0) {
        composeView.getClass();
        final int i = z2 ? R.color.text_type2_primary : R.color.text_type1_primary;
        composeView.setContent(new op8(-828460761, new Function2() { // from class: wa90
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    za90.a(i, 0, 1, aVar, null, function0, z);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
