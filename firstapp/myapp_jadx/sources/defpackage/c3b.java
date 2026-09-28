package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class c3b {
    public static final void a(final int i, final int i2, a aVar, d dVar, final String str, final String str2, final Function0 function0) {
        int i3;
        d dVarT;
        final d dVar2;
        function0.getClass();
        b bVarI = aVar.i(-1768043399);
        if ((i & 6) == 0) {
            i3 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                dVarT = dVar;
                int i4 = bVarI.M(dVarT) ? 256 : 128;
                i3 |= i4;
            } else {
                dVarT = dVar;
            }
            i3 |= i4;
        } else {
            dVarT = dVar;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.A(function0) ? 2048 : 1024;
        }
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            bVarI.A0();
            if ((i & 1) != 0 && !bVarI.h0()) {
                bVarI.G();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                dVarT = j.t(d.a.b, fw20.a(R.dimen.transfer_layout_width, bVarI), fw20.a(R.dimen.transfer_layout_height, bVarI));
                i3 &= -897;
            }
            d dVar3 = dVarT;
            bVarI.Y();
            h92.a(str, pp8.b(-2035732655, new Function2() { // from class: a3b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bt50.a(str2, null, null, imf0.b(mla.l(R.style.B1_R, aVar2), c68.a(R.color.text_type1_primary, aVar2), 0L, null, null, null, 0L, null, null, null, 3, 0L, null, null, 16744446), new ct50(0L, null, null, prz.c.a, 31), aVar2, 0, 6);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), R.drawable.icon_cooldown_timer, fw20.a(R.dimen.withdraw_set_up_icon, bVarI), cb40.a(R.string.common_functions__continue, new Object[0], bVarI), function0, dVar3, null, null, bVarI, (i3 & 14) | 48 | (458752 & (i3 << 6)) | ((i3 << 12) & 3670016), 384);
            dVar2 = dVar3;
        } else {
            bVarI.G();
            dVar2 = dVarT;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b3b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c3b.a(qj40.a(i | 1), i2, (a) obj, dVar2, str, str2, function0);
                    return Unit.a;
                }
            };
        }
    }
}
