package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class da2 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ da2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lkf0.d(this.b, null, c68.a(R.color.text_type1_secondary, aVar), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar), aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
            default:
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((o2i) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String strA = cb40.a(R.string.bet_history__pot_win, new Object[0], aVar2);
                    qyd0 qyd0Var = kjb0.a;
                    imf0 imf0Var = ((ijb0) aVar2.O(qyd0Var)).g;
                    qyd0 qyd0Var2 = oib0.a;
                    lkf0.d(strA, null, ((lib0) aVar2.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 131066);
                    lkf0.d(this.b, h.j(d.a.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), ((lib0) aVar2.O(qyd0Var2)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar2.O(qyd0Var)).g, aVar2, 48, 0, 131064);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
