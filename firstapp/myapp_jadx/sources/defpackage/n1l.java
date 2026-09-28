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

/* JADX INFO: loaded from: classes5.dex */
public final class n1l {
    public static final void a(int i, a aVar, final String str, Function0 function0, Function0 function1) {
        b bVarA = v2g.a(function0, function1, aVar, -1957710155);
        int i2 = (bVarA.M(str) ? 4 : 2) | i | (bVarA.A(function0) ? 32 : 16) | (bVarA.A(function1) ? 256 : 128);
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            h92.a(cb40.a(R.string.page_payment__confirm_your_identity, new Object[0], bVarA), pp8.b(-1936277107, new Function2() { // from class: l1l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        lkf0.d(str, null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar2), aVar2, 0, 0, 130042);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), R.drawable.ic_security, fw20.a(R.dimen.withdraw_set_up_icon, bVarA), cb40.a(R.string.page_payment__go_to_confirm, new Object[0], bVarA), function0, j.w(d.a.b, fw20.a(R.dimen.transfer_layout_width, bVarA)), cb40.a(R.string.common_functions__skip, new Object[0], bVarA), function1, bVarA, ((i2 << 12) & 458752) | 48 | ((i2 << 18) & 234881024), 0);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new m1l(i, str, function0, function1);
        }
    }
}
