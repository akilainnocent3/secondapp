package defpackage;

import com.sporty.android.chat.data.SocketStatus;
import com.sporty.android.chat.data.SocketStatusTypeEnum;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;
import okhttp3.OkHttpClient;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes4.dex */
public final class kjs {
    public final vd7 a;
    public final String b;
    public final ijs c = new ijs(this, 0);
    public final jjs d = new lfy() { // from class: jjs
        @Override // defpackage.lfy
        public final void u1(Object obj) {
            SocketStatus socketStatus = (SocketStatus) obj;
            socketStatus.getClass();
            if (SocketStatusTypeEnum.ERROR == socketStatus.getType()) {
                vd7 vd7Var = this.a.a;
                Exception exception = socketStatus.getException();
                itf0.a aVar = itf0.a;
                aVar.q("SPORTY_CHAT");
                aVar.o(exception);
                vd7Var.a.m0().E1(null);
            }
        }
    };

    /* JADX WARN: Type inference failed for: r1v2, types: [jjs] */
    public kjs(vd7 vd7Var, String str) {
        this.a = vd7Var;
        this.b = str;
    }

    public final void a() {
        boolean zIsConnected;
        String str = this.a.a.m0().R;
        String str2 = this.a.a.m0().Z;
        String str3 = this.b;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.a.a.m0().S;
        String str5 = this.a.a.m0().T;
        String str6 = this.a.a.m0().U;
        qn4.b(str, str2, str4, str5, str6);
        hg7 hg7Var = new hg7();
        hg7Var.a = str;
        hg7Var.b = str2;
        hg7Var.c = str3;
        hg7Var.d = str4;
        hg7Var.e = str5;
        hg7Var.f = str6;
        synchronized (pg7.a) {
            try {
                itf0.a aVar = itf0.a;
                aVar.q("SPORTY_CHAT_SOCKET");
                aVar.a("setupStompClient, chatSocketData: %s", hg7Var);
                try {
                    StompClient stompClient = pg7.d;
                    zIsConnected = stompClient != null ? stompClient.isConnected() : false;
                } catch (Exception e) {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q("SPORTY_CHAT_SOCKET");
                    aVar2.p(e, "Failed to check if connected or not", new Object[0]);
                }
                if (zIsConnected || pg7.e) {
                    aVar.q("SPORTY_CHAT_SOCKET");
                    aVar.a("socket is connected or connecting", new Object[0]);
                } else if (str2.length() == 0) {
                    aVar.q("SPORTY_CHAT_SOCKET");
                    aVar.g("no userId", new Object[0]);
                } else {
                    pg7.e = true;
                    String strConcat = "/topic/user.".concat(str2);
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    int i = rpm.a;
                    OkHttpClient.Builder builderFollowRedirects = builder.proxySelector(new qpm()).followRedirects(true);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient okHttpClientBuild = builderFollowRedirects.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).pingInterval(30L, timeUnit).build();
                    HashMap map = new HashMap();
                    map.put("userId", str2);
                    map.put("Platform", str4);
                    map.put("App-Version", str5);
                    map.put("Device-Id", str6);
                    StompClient stompClientA = xjo.a(str, map, okHttpClientBuild);
                    r2i<bbs> r2iVarLifecycle = stompClientA.lifecycle();
                    if (r2iVarLifecycle != null) {
                        final ig7 ig7Var = new ig7(hg7Var);
                        r2iVarLifecycle.h(new slr(new pya() { // from class: jg7
                            @Override // defpackage.pya
                            public final void accept(Object obj) {
                                ig7Var.invoke(obj);
                            }
                        }, taj.e, taj.c));
                    }
                    stompClientA.connect();
                    r2i<f1e0> r2iVar = stompClientA.topic(strConcat, a.c(new e1e0("x-queue-name", "user.".concat(str2))));
                    final kg7 kg7Var = new kg7(strConcat, hg7Var);
                    pya pyaVar = new pya() { // from class: lg7
                        @Override // defpackage.pya
                        public final void accept(Object obj) {
                            kg7Var.invoke(obj);
                        }
                    };
                    final mg7 mg7Var = new mg7();
                    pya pyaVar2 = new pya() { // from class: ng7
                        @Override // defpackage.pya
                        public final void accept(Object obj) {
                            mg7Var.invoke(obj);
                        }
                    };
                    taj.d dVar = taj.c;
                    r2iVar.getClass();
                    r2iVar.h(new slr(pyaVar, pyaVar2, dVar));
                    pg7.d = stompClientA;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pg7.f.g(this.c);
        pg7.g.g(this.d);
    }
}
