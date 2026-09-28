package com.sporty.android.book.presentation.sportsmenu.time;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import com.sporty.android.book.presentation.sportsmenu.time.b;
import com.sportybet.android.gp.tz.R;
import defpackage.c68;
import defpackage.cb40;
import defpackage.cll;
import defpackage.cyb;
import defpackage.dgb0;
import defpackage.e040;
import defpackage.g78;
import defpackage.hlh0;
import defpackage.ht;
import defpackage.i78;
import defpackage.ib5;
import defpackage.iel;
import defpackage.inc;
import defpackage.j8i0;
import defpackage.jq40;
import defpackage.k38;
import defpackage.kw0;
import defpackage.n30;
import defpackage.ne00;
import defpackage.p8i0;
import defpackage.pr70;
import defpackage.tsr;
import defpackage.twf0;
import defpackage.ute;
import defpackage.vwu;
import defpackage.w8i0;
import defpackage.wyh;
import defpackage.yka;
import defpackage.ytw;
import defpackage.zdt;
import defpackage.zk40;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(-187506331);
        if (bVarI.q(i & 1, i != 0)) {
            w8i0 w8i0VarA = zdt.a(bVarI);
            if (w8i0VarA == null) {
                ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            j8i0 j8i0VarA = p8i0.a(jq40.a(dgb0.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            bVarI = bVarI;
            final dgb0 dgb0Var = (dgb0) j8i0VarA;
            ytw ytwVarC = wyh.c(dgb0Var.C, bVarI, 0, 7);
            int iIntValue = ((Number) wyh.c(dgb0Var.I, bVarI, 0, 7).getValue()).intValue();
            TimePickerItem timePickerItem = (TimePickerItem) ytwVarC.getValue();
            boolean zA = bVarI.A(dgb0Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new vwu(dgb0Var, 2);
                bVarI.r(objY);
            }
            Function1 function1 = (Function1) objY;
            boolean zA2 = bVarI.A(dgb0Var);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function2() { // from class: swf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        dgb0Var.C1((TimePickerItem) obj, zBooleanValue);
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            b(iIntValue, timePickerItem, function1, (Function2) objY2, bVarI, TimePickerItem.$stable << 3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new twf0();
        }
    }

    public static final void b(final int i, final TimePickerItem timePickerItem, final Function1 function1, final Function2 function2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        Function1 function3;
        androidx.compose.runtime.b bVarI = aVar.i(1678363900);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? bVarI.M(timePickerItem) : bVarI.A(timePickerItem) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function3 = function1;
            i3 |= bVarI.A(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.A(function2) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            List listK = kotlin.collections.b.k(cb40.a(R.string.common_functions__daily, new Object[0], bVarI), cb40.a(R.string.common_functions__range, new Object[0], bVarI));
            int size = i > kotlin.collections.b.j(listK) ? listK.size() - 1 : i;
            long jA = c68.a(R.color.background_cashout_card, bVarI);
            zk40.a aVar2 = zk40.a;
            d.a aVar3 = d.a.b;
            d dVarG = j.g(j.A(androidx.compose.animation.e.a(androidx.compose.foundation.a.b(aVar3, jA, aVar2)), null, 3), 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar4 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar4);
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
            int i4 = 3;
            ute.a(j.i(aVar3, 1.0f), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            int i5 = size;
            pr70.a(null, listK, i5, function3, bVarI, (i3 << 3) & 7168);
            if (i5 == 0) {
                bVarI.N(1271371840);
                boolean z = (i3 & 7168) == 2048;
                Object objY = bVarI.y();
                if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new k38(function2, i4);
                    bVarI.r(objY);
                }
                inc.a(timePickerItem, (Function1) objY, bVarI, ((i3 >> 3) & 14) | TimePickerItem.$stable);
                bVarI.X(false);
            } else {
                bVarI.N(1271555484);
                e040.b(i, timePickerItem, function1, function2, bVarI, (i3 & 14) | (TimePickerItem.$stable << 3) | (i3 & 112) | (i3 & 896) | (i3 & 7168));
                bVarI.X(false);
            }
            ute.a(j.i(aVar3, 1.0f), 0.0f, c68.a(R.color.line_type1_primary, bVarI), bVarI, 6, 2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: uwf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.b(i, timePickerItem, function1, function2, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
