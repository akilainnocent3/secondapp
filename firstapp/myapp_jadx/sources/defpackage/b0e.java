package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class b0e {
    public static final void a(final Function0<Unit> function0, a aVar, final int i) {
        function0.getClass();
        b bVarI = aVar.i(1266739724);
        int i2 = (bVarI.A(function0) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            String strA = cb40.a(R.string.page_payment__deposit_failed, new Object[0], bVarI);
            String strA2 = cb40.a(R.string.page_payment__you_have_reached_tier_1_deposit_limit_complete_tier_2_identity_verification, new Object[0], bVarI);
            String strA3 = cb40.a(R.string.common_functions__identity_verification, new Object[0], bVarI);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_security);
            boolean z = (i2 & 14) == 4;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function0() { // from class: zzd
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            ra8.b(strA, strA2, null, numValueOf, null, strA3, null, null, null, (Function0) objY, null, bVarI, 12582912, 0, 2868);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, function0) { // from class: a0e
                public final /* synthetic */ Function0 a;

                {
                    this.a = function0;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    b0e.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
