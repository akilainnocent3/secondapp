package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v19 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        j3a0 j3a0Var = (j3a0) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        j3a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= aVar.M(j3a0Var) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            f4a0.d(j3a0Var, null, false, null, c68.a(R.color.background_snackbar, aVar), c68.a(R.color.text_type2_primary, aVar), c68.a(R.color.brand_secondary_variable_type3, aVar), 0L, c68.a(R.color.text_type2_secondary, aVar), aVar, iIntValue & 14, 142);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
