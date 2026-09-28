package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ioi implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ioi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                joi joiVar = (joi) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(1 & iIntValue, (iIntValue & 3) != 2)) {
                    lpi.a((koi) ((x5a0) joiVar.a).getValue(), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                zs.b bVar = (zs.b) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    UiText uiText = bVar.d;
                    if (uiText == null) {
                        aVar2.N(-201135555);
                        aVar2.H();
                    } else {
                        aVar2.N(-201135554);
                        lkf0.d(uiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), null, syj.a(0L, 0L, 0L, null, null, aVar2, 31).e.b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.B1_M, aVar2), aVar2, 0, 0, 131066);
                        aVar2.H();
                    }
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
