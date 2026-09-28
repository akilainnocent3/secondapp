package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.debugscreen.impl.popupqueue.PopupQueueDebugActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a520 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a520(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                PopupQueueDebugActivity popupQueueDebugActivity = (PopupQueueDebugActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = PopupQueueDebugActivity.b;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String string = popupQueueDebugActivity.getString(R.string.popup_queue_tool_title);
                    string.getClass();
                    crz crzVarA = erz.a(R.drawable.ic_action_bar_back, 0, aVar);
                    boolean zA = aVar.A(popupQueueDebugActivity);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new pja(popupQueueDebugActivity, 1);
                        aVar.r(objY);
                    }
                    odd0.d(null, string, 0L, crzVarA, null, (Function0) objY, null, aVar, 0, 85);
                } else {
                    aVar.G();
                }
                break;
            default:
                op8 op8Var = (op8) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    op8Var.invoke(aVar2, 0);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
