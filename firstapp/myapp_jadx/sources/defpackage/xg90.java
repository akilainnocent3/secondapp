package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class xg90 {
    public static final void a(final v690 v690Var, final uf00<yg90> uf00Var, final Function1<? super yg90, Unit> function1, a aVar, int i) {
        b bVar;
        uf00Var.getClass();
        function1.getClass();
        b bVarI = aVar.i(181925567);
        int i2 = (bVarI.d(v690Var.ordinal()) ? 4 : 2) | i | (bVarI.M(uf00Var) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        int i3 = 0;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Iterator<yg90> it = uf00Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (it.next().a == v690Var) {
                    break;
                } else {
                    i3++;
                }
            }
            final int i4 = i3;
            bVar = bVarI;
            mfc.a(i4, g3w.h(j.g(j.i(d.a.b, 36.0f), 1.0f), "side_panel_tab_bar"), c68.a(R.color.background_general_primary, bVarI), c68.a(R.color.background_general_primary, bVarI), 0.0f, 0.0f, false, pp8.b(759864865, new gaj() { // from class: tg90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    List list = (List) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    list.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? aVar2.M(list) : aVar2.A(list) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int size = list.size();
                        int i5 = i4;
                        if (i5 < size) {
                            aVar2.N(-1638355520);
                            h2f0.a.b(h2f0.c((y1f0) list.get(i5)), 2.0f, c68.a(R.color.brand_secondary, aVar2), aVar2, 3120, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-1638108543);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), xp9.a, pp8.b(770756641, new Function2() { // from class: ug90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        for (final yg90 yg90Var : uf00Var) {
                            v690 v690Var2 = yg90Var.a;
                            final boolean z = v690Var == v690Var2;
                            d dVarH = g3w.h(d.a.b, "side_panel_tab_" + v690Var2.name());
                            long jA = c68.a(R.color.text_type1_primary, aVar2);
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.A(yg90Var);
                            Object objY = aVar2.y();
                            if (zM || objY == a.C0041a.a) {
                                objY = new Function0() { // from class: vg90
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(yg90Var);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY);
                            }
                            w1f0.b(z, (Function0) objY, dVarH, false, pp8.b(1582136341, new Function2() { // from class: wg90
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    a aVar3 = (a) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lkf0.d(cb40.a(yg90Var.a.b, new Object[0], aVar3), null, c68.a(R.color.text_type1_tertiary, aVar3), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(z ? R.style.B2_M : R.style.B2_R, aVar3), aVar3, 0, 0, 131066);
                                    } else {
                                        aVar3.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar2), jA, 0L, aVar2, 24576, 424);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 918773808, 64);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new tbi(v690Var, uf00Var, function1, i);
        }
    }
}
