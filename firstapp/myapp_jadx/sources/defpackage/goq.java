package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class goq implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ goq(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                fpq fpqVar = (fpq) serializable;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lkf0.d(fpqVar.a.g((Context) aVar.O(AndroidCompositionLocals_androidKt.b)), null, ((lib0) aVar.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar.O(kjb0.a)).j, aVar, 0, 0, 131066);
                } else {
                    aVar.G();
                }
                break;
            default:
                float fFloatValue = ((Float) obj2).floatValue();
                ((m020) obj).getClass();
                ((aq40) serializable).a += fFloatValue;
                break;
        }
        return Unit.a;
    }
}
