package defpackage;

import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dog implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dog(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                uog uogVar = (uog) obj;
                tog togVar = uogVar.v;
                GroupTopic groupTopic = uogVar.f;
                if (groupTopic != null) {
                    if (groupTopic != null) {
                        SocketPushManager.getInstance().unsubscribeTopic(uogVar.f, togVar);
                    }
                    SocketPushManager.getInstance().subscribeTopic(uogVar.f, togVar);
                }
                break;
            default:
                ((Function1) obj).invoke(new rn30.m(true));
                break;
        }
        return Unit.a;
    }
}
