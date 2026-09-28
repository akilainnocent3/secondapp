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
public final class k2l {
    public static final void a(final int i, final int i2, a aVar, final String str, final Function0 function0) {
        b bVarA = mzj.a(1920693514, aVar, str, function0);
        int i3 = (bVarA.M(str) ? 4 : 2) | i2 | (bVarA.d(i) ? 32 : 16) | (bVarA.A(function0) ? 256 : 128);
        if (bVarA.q(i3 & 1, (i3 & 147) != 146)) {
            h92.a(cb40.a(R.string.page_payment__pending_request, new Object[0], bVarA), pp8.b(-1212035102, new Function2() { // from class: i2l
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
            }, bVarA), i, fw20.a(R.dimen.withdraw_set_up_icon, bVarA), cb40.a(R.string.page_payment__go_to_confirm, new Object[0], bVarA), function0, j.w(d.a.b, fw20.a(R.dimen.transfer_layout_width, bVarA)), null, null, bVarA, ((i3 << 3) & 896) | 48 | ((i3 << 9) & 458752), 384);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, i2, str, function0) { // from class: j2l
                public final /* synthetic */ String a;
                public final /* synthetic */ int b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = str;
                    this.c = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k2l.a(this.b, iA, (a) obj, this.a, this.c);
                    return Unit.a;
                }
            };
        }
    }
}
