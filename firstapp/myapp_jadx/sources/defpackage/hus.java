package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public final class hus {
    public final mpe0 a = hwr.b(new sbo(1));
    public final ConcurrentHashMap<Topic, Subscriber> b = new ConcurrentHashMap<>();
    public final wts c = new Subscriber() { // from class: wts
        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            int i = 0;
            aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SOCKET_USE_CASE, "on receive sports message: ", str), new Object[0]);
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i2 = 0;
            while (true) {
                hus husVar = this.a;
                if (i >= length) {
                    husVar.g.a(Integer.valueOf(i2));
                    return;
                } else {
                    i2 += ((Sport) ((JsonSerializeService) husVar.a.getValue()).fromJson(jSONArray.getString(i), Sport.class)).eventSize;
                    i++;
                }
            }
        }
    };
    public final xts d = new Subscriber() { // from class: xts
        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SOCKET_USE_CASE, "on receive market status message: ", str), new Object[0]);
            SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
            if (socketMarketMessageCreate == null || !socketMarketMessageCreate.isLive) {
                return;
            }
            this.a.i.a(socketMarketMessageCreate);
        }
    };
    public final yts e = new Subscriber() { // from class: yts
        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SOCKET_USE_CASE, "on receive market status message: ", str), new Object[0]);
            SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
            if (socketMarketMessageCreate == null) {
                return;
            }
            this.a.i.a(socketMarketMessageCreate);
        }
    };
    public final zts f = new Subscriber() { // from class: zts
        @Override // com.sportybet.ntespm.socket.Subscriber
        public final void onReceive(String str) {
            itf0.a aVar = itf0.a;
            aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_SOCKET_USE_CASE, "on receive event status message: ", str), new Object[0]);
            SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str);
            if (socketEventMessageCreate == null) {
                return;
            }
            this.a.k.a(socketEventMessageCreate);
        }
    };
    public final b390 g;
    public final t340 h;
    public final b390 i;
    public final t340 j;
    public final b390 k;
    public final t340 l;

    /* JADX WARN: Type inference failed for: r0v3, types: [wts] */
    /* JADX WARN: Type inference failed for: r0v4, types: [xts] */
    /* JADX WARN: Type inference failed for: r0v5, types: [yts] */
    /* JADX WARN: Type inference failed for: r0v6, types: [zts] */
    public hus() {
        pb5 pb5Var = pb5.b;
        b390 b390VarB = d390.b(0, 100, pb5Var, 1);
        this.g = b390VarB;
        this.h = e1i.a(b390VarB);
        b390 b390VarB2 = d390.b(0, 100, pb5Var, 1);
        this.i = b390VarB2;
        this.j = e1i.a(b390VarB2);
        b390 b390VarB3 = d390.b(0, 100, pb5Var, 1);
        this.k = b390VarB3;
        this.l = e1i.a(b390VarB3);
    }

    public final void a() {
        for (Map.Entry<Topic, Subscriber> entry : this.b.entrySet()) {
            SocketPushManager.getInstance().subscribeTopic(entry.getKey(), entry.getValue());
        }
    }

    public final void b(boolean z) {
        ConcurrentHashMap<Topic, Subscriber> concurrentHashMap = this.b;
        for (Map.Entry<Topic, Subscriber> entry : concurrentHashMap.entrySet()) {
            SocketPushManager.getInstance().unsubscribeTopic(entry.getKey(), entry.getValue());
        }
        if (z) {
            concurrentHashMap.clear();
        }
    }
}
