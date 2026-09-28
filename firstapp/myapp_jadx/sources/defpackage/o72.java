package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportygames.commons.chat.remote.models.ChatListResponse;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o72 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o72(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                boolean z = ((AlertDialogCallbackType) obj) instanceof AlertDialogCallbackType.Positive;
                ku90<spg0> ku90Var = ((k72) obj2).v;
                if (z) {
                    vpg0.a(ku90Var);
                } else {
                    vpg0.b(ku90Var, aqg0.e.c);
                }
                break;
            default:
                ChatActivity chatActivity = (ChatActivity) obj2;
                f1e0 f1e0Var = (f1e0) obj;
                int i2 = ChatActivity.B0;
                f1e0Var.getClass();
                Object objE = new eal().e(f1e0Var.c, ChatListResponse.class);
                objE.getClass();
                ChatListResponse chatListResponse = (ChatListResponse) objE;
                if (ChatActivity.I1(chatListResponse)) {
                    chatActivity.z1(chatListResponse);
                }
                break;
        }
        return Unit.a;
    }
}
