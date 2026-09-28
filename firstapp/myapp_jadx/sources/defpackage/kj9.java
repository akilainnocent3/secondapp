package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.withdraw.e;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kj9 implements gaj {
    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e.c cVar = (e.c) obj;
        a aVar = (a) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        cVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= (iIntValue & 8) == 0 ? aVar.M(cVar) : aVar.A(cVar) ? 4 : 2;
        }
        if (aVar.q(iIntValue & 1, (iIntValue & 19) != 18)) {
            o610.a(cVar.d, null, aVar, 8, 2);
        } else {
            aVar.G();
        }
        return Unit.a;
    }
}
