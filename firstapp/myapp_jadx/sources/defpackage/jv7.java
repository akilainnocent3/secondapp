package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jv7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jv7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                CodeChatRoomActivity codeChatRoomActivity = (CodeChatRoomActivity) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = CodeChatRoomActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(657934733, new nv7(codeChatRoomActivity), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                break;
            default:
                op8 op8Var = (op8) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    op8Var.invoke(aVar2, 6);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
