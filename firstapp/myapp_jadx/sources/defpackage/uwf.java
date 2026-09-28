package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class uwf {
    public static final void a(final vwf vwfVar, final Function1<? super wwf, Unit> function1, a aVar, final int i) {
        int i2;
        b bVar;
        function1.getClass();
        b bVarI = aVar.i(-1572908627);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(vwfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function1) ? 32 : 16;
        }
        int i3 = 1;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = vwfVar instanceof vwf.a;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z) {
                bVarI.N(-427491556);
                String strA = cb40.a(R.string.email_change__verification_email_sent_title, new Object[0], bVarI);
                String strA2 = cb40.a(R.string.email_change__verification_email_sent_content, new Object[0], bVarI);
                boolean z2 = (i2 & 112) == 32;
                Object objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = new ocb(function1, i3);
                    bVarI.r(objY);
                }
                nzj.b(null, strA, strA2, null, null, null, null, null, null, null, null, null, (Function0) objY, null, bVarI, 0, 0, 12281);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                if (vwfVar instanceof vwf.b) {
                    bVar.N(-427083162);
                    String strA3 = cb40.a(R.string.common_functions__error, new Object[0], bVar);
                    String strA4 = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVar);
                    boolean z3 = (i2 & 112) == 32;
                    Object objY2 = bVar.y();
                    if (z3 || objY2 == c0042a) {
                        objY2 = new pcb(function1, 1);
                        bVar.r(objY2);
                    }
                    nzj.b(null, strA3, strA4, null, null, null, null, null, null, null, null, null, (Function0) objY2, null, bVar, 0, 0, 12281);
                    bVar = bVar;
                    bVar.X(false);
                } else {
                    bVar.N(-426761227);
                    bVar.X(false);
                }
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: twf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    uwf.a(vwfVar, function1, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
