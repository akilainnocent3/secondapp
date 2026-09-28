package defpackage;

import com.sportybet.android.auth.SportyAccountManagerImpl;
import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i97 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i97(Object obj, int i) {
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
                String str = (String) obj;
                int i2 = ChatActivity.B0;
                str.getClass();
                chatActivity.o0 = Long.parseLong(str);
                ((x5a0) chatActivity.p0).setValue(Boolean.TRUE);
                return Unit.a;
            default:
                return SportyAccountManagerImpl.setLastNickname$lambda$0((String) obj2, (t8) obj);
        }
    }
}
