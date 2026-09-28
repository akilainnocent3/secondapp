package defpackage;

import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import com.sporty.android.chat.data.SocketStatus;
import com.sporty.android.chat.data.SocketStatusTypeEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ig7 implements Function1 {
    public final /* synthetic */ hg7 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LogStatus logStatus;
        bbs bbsVar = (bbs) obj;
        ssw<SocketStatus> sswVar = pg7.g;
        bbs.a aVar = bbsVar.a;
        Exception exc = bbsVar.b;
        itf0.a aVar2 = itf0.a;
        aVar2.q("SPORTY_CHAT_SOCKET");
        aVar2.i(exc, aVar);
        int[] iArr = pg7.a.a;
        int i = iArr[aVar.ordinal()];
        if (i != 1) {
            logStatus = i != 2 ? LogStatus.ERROR : LogStatus.DISCONNECTED;
        } else {
            logStatus = LogStatus.CONNECTED;
        }
        mpe0 mpe0Var = ljs.a;
        ljs.b(LogProcess.WEBSOCKET_CONNECTION_STATUS, logStatus, this.a.c);
        int i2 = iArr[aVar.ordinal()];
        if (i2 == 1) {
            pg7.b.postDelayed(new og7(), 1000L);
        } else if (i2 == 2) {
            pg7.e = false;
            sswVar.j(new SocketStatus(SocketStatusTypeEnum.DISCONNECTED, null, 2, null));
        } else if (i2 != 3) {
            pg7.e = false;
        } else {
            pg7.e = false;
            sswVar.j(new SocketStatus(SocketStatusTypeEnum.ERROR, exc));
        }
        return Unit.a;
    }
}
