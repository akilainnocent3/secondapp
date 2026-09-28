package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qh9 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ qh9(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(pib0.a(R.drawable.ic__arrow_tail_left, 0, aVar), "back", null, ((lib0) aVar.O(oib0.a)).P, aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                ((qn70) obj).getClass();
                ((wrz) obj2).getClass();
                return new dnb0();
        }
    }
}
