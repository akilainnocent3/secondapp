package defpackage;

import com.sportybet.ntespm.socket.SocketPushManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class eog implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eog(Object obj, int i) {
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
                if (uogVar.f != null) {
                    SocketPushManager.getInstance().unsubscribeTopic(uogVar.f, uogVar.v);
                }
                break;
            default:
                ((Function1) obj).invoke(rn30.h.a);
                break;
        }
        return Unit.a;
    }
}
