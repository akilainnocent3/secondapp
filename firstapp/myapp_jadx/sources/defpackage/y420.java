package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportybet.feature.debugscreen.impl.popupqueue.PopupQueueDebugActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y420 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public /* synthetic */ y420(d dVar, int i) {
        this.b = dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final PopupQueueDebugActivity popupQueueDebugActivity = (PopupQueueDebugActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = PopupQueueDebugActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0z.a(null, null, null, null, null, pp8.b(623388090, new Function2() { // from class: z420
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            int i3 = PopupQueueDebugActivity.b;
                            int i4 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                hy60.a(null, pp8.b(-1046487946, new a520(popupQueueDebugActivity, i4), aVar2), null, null, null, 0, ((lib0) aVar2.O(oib0.a)).i0, 0L, null, hk9.a, aVar2, 805306416, 445);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                cfe0.a((d) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ y420(PopupQueueDebugActivity popupQueueDebugActivity) {
        this.b = popupQueueDebugActivity;
    }
}
