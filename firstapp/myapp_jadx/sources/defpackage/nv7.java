package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.social.presentation.codeChat.room.CodeChatRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class nv7 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

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
                    wv7.a(codeChatRoomActivity.e, null, aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                adq.c((Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nv7(CodeChatRoomActivity codeChatRoomActivity) {
        this.b = codeChatRoomActivity;
    }
}
