package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n6r implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                qcn qcnVar = (qcn) obj4;
                a aVar = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((o2i) obj).getClass();
                if (aVar.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Iterator<E> it = qcnVar.iterator();
                    while (it.hasNext()) {
                        p6r.a((y6r) it.next(), aVar, 0);
                    }
                } else {
                    aVar.G();
                }
                break;
            default:
                UiText uiText = (UiText) obj4;
                a aVar2 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((e160) obj).getClass();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    uiText.getClass();
                    lkf0.d(uiText.g((Context) aVar2.O(AndroidCompositionLocals_androidKt.b)), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((ijb0) aVar2.O(kjb0.a)).n, 0L, 0L, t9i.E, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), aVar2, 0, 0, 131070);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
