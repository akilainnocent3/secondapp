package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ftc {
    public static final void a(final d dVar, final Calendar calendar, final Function0 function0, a aVar, final int i) {
        calendar.getClass();
        b bVarI = aVar.i(614487144);
        int i2 = (bVarI.M(dVar) ? 4 : 2) | i | (bVarI.A(calendar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            nk5.b(function0, j.i(dVar, 36.0f), false, zk40.a, null, m35.a(1.0f, c68.a(R.color.line_type1_primary, bVarI)), h.a(2, 16.0f, 0.0f), pp8.b(881122358, new gaj() { // from class: dtc
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        h6n.b(erz.a(R.drawable.ic_expiry_unify, 0, aVar2), null, null, c68.a(R.color.brand_quaternary, aVar2), aVar2, 48, 4);
                        ty0.a(aVar2, j.w(d.a.b, 12.0f));
                        Date time = calendar.getTime();
                        time.getClass();
                        Locale locale = Locale.getDefault();
                        locale.getClass();
                        lkf0.d(bwf0.l(time, "dd/MM/yyyy", locale, 0, 0), null, c68.a(R.color.text_type1_primary, aVar2), null, 0L, null, t9i.C, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((eah0) aVar2.O(gah0.a)).k, aVar2, 1572864, 0, 131002);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 817892358, HttpStatusCodesKt.HTTP_PERM_REDIRECT);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(calendar, function0, i) { // from class: etc
                public final /* synthetic */ Calendar b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    ftc.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
