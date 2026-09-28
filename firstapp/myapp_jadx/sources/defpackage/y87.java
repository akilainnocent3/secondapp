package defpackage;

import com.sportygames.chat.remote.models.RainDetailInfoResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y87 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y87(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) obj2;
                int i2 = ChatActivity.B0;
                if (((Boolean) obj).booleanValue()) {
                    ha7 ha7Var = (ha7) chatActivity.a;
                    if (ha7Var != null) {
                        ha7Var.J.setClickable(false);
                    }
                    ha7 ha7Var2 = (ha7) chatActivity.a;
                    if (ha7Var2 != null) {
                        ha7Var2.J.setVisibility(8);
                    }
                }
                break;
            default:
                ((fgb) obj2).t2 = (RainDetailInfoResponse) obj;
                break;
        }
        return Unit.a;
    }
}
