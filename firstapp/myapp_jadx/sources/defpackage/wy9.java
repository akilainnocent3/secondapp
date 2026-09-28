package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wy9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((j78) obj).getClass();
        if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
            crz crzVarA = pib0.a(R.drawable.account_activation_successful, 0, aVar);
            d.a aVar2 = d.a.b;
            h9n.a(crzVarA, "Secure Account", j.r(aVar2, 70.0f), null, null, 0.0f, null, aVar, 432, 120);
            lkf0.d(cb40.a(R.string.component_two_fa__secure_dialog_description, new Object[0], aVar), j.g(aVar2, 1.0f), ((lib0) aVar.O(oib0.a)).a, null, 0L, null, null, null, 0L, null, new gdf0(3), 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).k, aVar, 48, 0, 130040);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
