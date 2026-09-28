package defpackage;

import com.sportygames.commons.chat.views.ChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p87 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                bbs bbsVar = (bbs) obj;
                int i = ChatActivity.B0;
                bbsVar.getClass();
                int i2 = ChatActivity.a.c[bbsVar.a.ordinal()];
                break;
            default:
                ((String) obj).getClass();
                break;
        }
        return Unit.a;
    }
}
