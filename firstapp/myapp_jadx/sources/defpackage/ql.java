package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class ql {
    public static final void a(final int i, final int i2, a aVar, final String str) {
        int i3;
        str.getClass();
        b bVarI = aVar.i(912358169);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.M(str) ? 32 : 16;
        }
        if (bVarI.q(i3 & 1, (i3 & 19) != 18)) {
            y1i.b(j.g(d.a.b, 1.0f), kw0.g, new kw0.i(4.0f, true, new hw0()), null, 0, 0, pp8.b(1852688894, new gaj() { // from class: ol
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((o2i) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        int i4 = i;
                        String strConcat = "title_".concat(c.p(cb40.a(i4, new Object[0], aVar2), " ", "_", false));
                        d.a aVar3 = d.a.b;
                        lkf0.d(cb40.a(i4, new Object[0], aVar2), g3w.h(aVar3, strConcat), c68.a(R.color.text_type1_secondary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 0, 0, 131064);
                        String str2 = str;
                        lkf0.d(str2, g3w.h(aVar3, "value_".concat(c.p(str2, " ", "_", false))), c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R_21, aVar2), aVar2, 0, 0, 131064);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1573302, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i2 | 1);
                    ql.a(i, iA, (a) obj, str);
                    return Unit.a;
                }
            };
        }
    }
}
