package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pmm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pmm(d dVar, int i) {
        this.a = 0;
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        Object obj3 = this.b;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                smm.e((d) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            case 1:
                mox moxVar = (mox) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h9n.a(erz.a(moxVar.b, 0, aVar), null, j.r(h.j(d.a.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 24.0f), null, null, 0.0f, null, aVar, 432, 120);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                k9h k9hVar = (k9h) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    int iOrdinal = k9hVar.b.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.page_payment__use_another_deposit_method;
                    } else {
                        if (iOrdinal != 1) {
                            uhc.a();
                            return null;
                        }
                        i = R.string.page_payment__use_another_withdrawal_method;
                    }
                    lkf0.d(cb40.a(i, new Object[0], aVar2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H4_M, aVar2), aVar2, 0, 0, 131070);
                } else {
                    aVar2.G();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ pmm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
