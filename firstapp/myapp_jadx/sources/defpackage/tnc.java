package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tnc implements Function2 {
    public final /* synthetic */ int a = 0;

    public /* synthetic */ tnc() {
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    lkf0.d(cb40.a(R.string.wap_setting__dark_mode, new Object[0], aVar), new LayoutWeightElement(1.0f, false), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new imf0(((lib0) aVar.O(oib0.a)).o, d2l.f(12), t9i.E, null, null, 0L, null, null, 0, 0L, null, null, 16777208), aVar, 0, 0, 131068);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                cmm.b(qj40.a(1), (a) obj);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ tnc(int i) {
    }
}
