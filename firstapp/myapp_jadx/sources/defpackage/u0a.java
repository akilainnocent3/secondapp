package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u0a implements Function2 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    h6n.b(erz.a(R.drawable.ic__cancel, 0, aVar), "home", null, ((lib0) aVar.O(oib0.a)).P, aVar, 48, 4);
                } else {
                    aVar.G();
                }
                return Unit.a;
            case 1:
                ((Integer) obj2).getClass();
                v9o.a(qj40.a(1), (a) obj);
                return Unit.a;
            default:
                return (ttm) qn4.a((qn70) obj, (wrz) obj2, nys.class, null, null);
        }
    }

    public /* synthetic */ u0a(byte b, int i) {
        this.a = i;
    }
}
