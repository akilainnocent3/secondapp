package defpackage;

import com.sporty.android.chat.data.ChatMessage;
import com.sporty.android.chat.data.DefaultCommand;
import com.sporty.android.chat.data.LogProcess;
import com.sporty.android.chat.data.LogStatus;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class kg7 implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ hg7 b;

    public /* synthetic */ kg7(String str, hg7 hg7Var) {
        this.a = str;
        this.b = hg7Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = this.a;
        hg7 hg7Var = this.b;
        try {
            String str2 = ((f1e0) obj).c;
            pg7.c.getClass();
            DefaultCommand defaultCommand = (DefaultCommand) mep.a.e(str2, DefaultCommand.class);
            mpe0 mpe0Var = ljs.a;
            ChatMessage chatMessageE = ljs.e(defaultCommand.getJsonBody());
            boolean zIsIsolated = chatMessageE != null ? chatMessageE.isIsolated() : false;
            itf0.a aVar = itf0.a;
            aVar.q("SPORTY_CHAT_SOCKET");
            aVar.l("topic subscribe received, topic: %s, command: %s", str, defaultCommand);
            ljs.a(LogProcess.WEBSOCKET_CONNECTION_STATUS, LogStatus.RECEIVED, hg7Var.c, jpu.b(new Pair("isIsolatedUser", String.valueOf(zIsIsolated))));
            pg7.f.j(defaultCommand);
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q("SPORTY_CHAT_SOCKET");
            aVar2.p(e, "topic subscribe error, topic: %s", str);
        }
        return Unit.a;
    }
}
