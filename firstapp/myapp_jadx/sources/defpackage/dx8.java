package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dx8 implements gaj {
    public final /* synthetic */ int a;

    public /* synthetic */ dx8(int i) {
        this.a = i;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d(cb40.a(R.string.common_functions__ok, new Object[0], aVar), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 0, 0, 131070);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                d dVar = (d) obj;
                a aVar2 = (a) obj2;
                e3w.a((Integer) obj3, dVar, aVar2, -1757916737);
                d dVarA = d35.a(dVar, 1.0f, ((lib0) aVar2.O(oib0.a)).G, j060.a);
                aVar2.H();
                return dVarA;
        }
    }
}
