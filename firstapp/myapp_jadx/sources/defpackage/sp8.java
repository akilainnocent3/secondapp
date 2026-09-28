package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sp8 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
            ((yhj0) aVar.O(bij0.a)).getClass();
            h6n.b(erz.a(R.drawable.ic_payment_account, 0, aVar), null, j.r(d.a.b, 24.0f), c68.a(R.color.text_type1_secondary, aVar), aVar, 48, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
