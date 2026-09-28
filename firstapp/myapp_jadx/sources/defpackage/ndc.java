package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem;
import com.sportybet.android.gp.tz.R;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ndc {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final TimePickerItem timePickerItem, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1398176787);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(timePickerItem) : bVarI.A(timePickerItem) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            d.a aVar2 = d.a.b;
            d dVarG = h.g(j.g(aVar2, 1.0f), 12.0f, 6.0f);
            d160 d160VarA = b160.a(kw0.a, ht.a.k, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Calendar calendar = Calendar.getInstance();
            if (timePickerItem != null) {
                calendar.setTimeInMillis(timePickerItem.getStartTime());
            }
            calendar.getClass();
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new kdc(ytwVar, 0);
                bVarI.r(objY2);
            }
            ftc.a(layoutWeightElement, calendar, (Function0) objY2, bVarI, 384);
            h6n.b(erz.a(R.drawable.spr_ic_arrow_upward_black_24dp, 0, bVarI), null, h.h(p1a.a(aVar2, 90.0f), 12.0f, 0.0f, 2), c68.a(R.color.text_type1_secondary, bVarI), bVarI, 432, 0);
            if (1.0f <= 0.0d) {
                ukn.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            Calendar calendar2 = Calendar.getInstance();
            if (timePickerItem != null) {
                calendar2.setTimeInMillis(timePickerItem.getEndTime());
            }
            calendar2.getClass();
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new wo8(ytwVar, 1);
                bVarI.r(objY3);
            }
            ftc.a(layoutWeightElement2, calendar2, (Function0) objY3, bVarI, 384);
            bVarI.X(true);
            boolean zBooleanValue = ((Boolean) ytwVar.getValue()).booleanValue();
            Long lValueOf = timePickerItem != null ? Long.valueOf(timePickerItem.getStartTime()) : null;
            Long lValueOf2 = timePickerItem != null ? Long.valueOf(timePickerItem.getEndTime()) : null;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new xo8(ytwVar, 1);
                bVarI.r(objY4);
            }
            Function0 function0 = (Function0) objY4;
            boolean z = (i2 & 112) == 32;
            Object objY5 = bVarI.y();
            if (z || objY5 == c0042a) {
                objY5 = new ldc(ytwVar, function1);
                bVarI.r(objY5);
            }
            ytc.a(zBooleanValue, lValueOf, lValueOf2, function0, (Function2) objY5, bVarI, 3072);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mdc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    ndc.a(timePickerItem, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
