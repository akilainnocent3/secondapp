package ua.naiksoftware.stomp;

import android.util.Log;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.az5;
import defpackage.bbs;
import defpackage.bm8;
import defpackage.bz5;
import defpackage.c1e0;
import defpackage.cdy;
import defpackage.cla0;
import defpackage.e1e0;
import defpackage.f1e0;
import defpackage.fdy;
import defpackage.fk90;
import defpackage.gla0;
import defpackage.gm8;
import defpackage.hm8;
import defpackage.hv5;
import defpackage.ib;
import defpackage.idy;
import defpackage.jm8;
import defpackage.l830;
import defpackage.mdv;
import defpackage.nm20;
import defpackage.nm8;
import defpackage.o0e0;
import defpackage.om8;
import defpackage.oxz;
import defpackage.pse;
import defpackage.pya;
import defpackage.qt1;
import defpackage.r2i;
import defpackage.rlr;
import defpackage.s0e0;
import defpackage.s2y;
import defpackage.t2i;
import defpackage.taj;
import defpackage.tdy;
import defpackage.ucy;
import defpackage.w0e0;
import defpackage.w2i;
import defpackage.x0e0;
import defpackage.x2;
import defpackage.y0e0;
import defpackage.yl8;
import defpackage.yua;
import defpackage.zd2;
import defpackage.zl8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class StompClient {
    public static final String DEFAULT_ACK = "auto";
    public static final String SUPPORTED_VERSIONS = "1.1,1.2";
    private static final String TAG = "StompClient";
    private final yua connectionProvider;
    private zd2<Boolean> connectionStream;
    private List<e1e0> headers;
    private boolean legacyWhitespace;
    private pse lifecycleDisposable;
    private l830<f1e0> messageStream;
    private pse messagesDisposable;
    private ConcurrentHashMap<String, String> topics;
    private ConcurrentHashMap<String, r2i<f1e0>> streamMap = new ConcurrentHashMap<>();
    private l830<bbs> lifecyclePublishSubject = new l830<>();
    private oxz pathMatcher = new fk90();
    private a heartBeatTask = new a(new a.b() { // from class: q0e0
        @Override // ua.naiksoftware.stomp.a.b
        public final void a() {
            this.a.sendHeartBeat("\r\n");
        }
    }, new a.InterfaceC1169a() { // from class: r0e0
        @Override // ua.naiksoftware.stomp.a.InterfaceC1169a
        public final void a() {
            this.a.lambda$new$0();
        }
    });

    public StompClient(yua yuaVar) {
        this.connectionProvider = yuaVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[Catch: all -> 0x0020, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x001c, B:10:0x0014), top: B:17:0x0001 }] */
    private synchronized zd2<Boolean> getConnectionStream() {
        zd2<Boolean> zd2Var = this.connectionStream;
        if (zd2Var == null) {
            this.connectionStream = zd2.j(Boolean.FALSE);
        } else {
            if (zd2Var.a.get() == s2y.a) {
                this.connectionStream = zd2.j(Boolean.FALSE);
            }
        }
        return this.connectionStream;
    }

    private synchronized l830<f1e0> getMessageStream() {
        try {
            l830<f1e0> l830Var = this.messageStream;
            if (l830Var == null || l830Var.j()) {
                this.messageStream = new l830<>();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.messageStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$1(bbs bbsVar) {
        Log.d(TAG, "Publish open");
        this.lifecyclePublishSubject.onNext(bbsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [z0e0] */
    public void lambda$connect$2(List list, final bbs bbsVar) {
        int iOrdinal = bbsVar.a.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                Log.d(TAG, "Socket closed");
                disconnect();
                return;
            } else {
                if (iOrdinal != 2) {
                    return;
                }
                Log.d(TAG, "Socket closed with error");
                this.lifecyclePublishSubject.onNext(bbsVar);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e1e0("accept-version", SUPPORTED_VERSIONS));
        arrayList.add(new e1e0("heart-beat", this.heartBeatTask.e + "," + this.heartBeatTask.d));
        if (list != null) {
            arrayList.addAll(list);
        }
        ((x2) this.connectionProvider).i(new f1e0("CONNECT", arrayList, null).a(this.legacyWhitespace)).b(new hv5(new ib() { // from class: z0e0
            @Override // defpackage.ib
            public final void run() {
                this.a.lambda$connect$1(bbsVar);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean lambda$connect$3(f1e0 f1e0Var) {
        return f1e0Var.a.equals("CONNECTED");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connect$4(f1e0 f1e0Var) {
        getConnectionStream().onNext(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$connect$5(Throwable th) {
        Log.e(TAG, "Error parsing message", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$disconnect$10() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$disconnect$11(Throwable th) {
        Log.e(TAG, "Disconnect error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$disconnectCompletable$12() {
        Log.d(TAG, "Stomp disconnected");
        getConnectionStream().onComplete();
        getMessageStream().onComplete();
        this.lifecyclePublishSubject.onNext(new bbs(bbs.a.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        this.lifecyclePublishSubject.onNext(new bbs(bbs.a.d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reconnect$8() {
        connect(this.headers);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$reconnect$9(Throwable th) {
        Log.e(TAG, "Disconnect error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribePath$16(String str, Throwable th) {
        unsubscribePath(str).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$topic$14(String str, f1e0 f1e0Var) {
        return this.pathMatcher.a(str, f1e0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$topic$15(String str) {
        unsubscribePath(str).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendHeartBeat(String str) {
        jm8 jm8VarI = ((x2) this.connectionProvider).i(str);
        zd2<Boolean> connectionStream = getConnectionStream();
        x0e0 x0e0Var = new x0e0();
        connectionStream.getClass();
        new nm8(jm8VarI.c(new mdv(new fdy(new idy(connectionStream, x0e0Var))))).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: subscribePath, reason: merged with bridge method [inline-methods] */
    public yl8 lambda$topic$13(final String str, List<e1e0> list) {
        String string = UUID.randomUUID().toString();
        ConcurrentHashMap<String, String> concurrentHashMap = this.topics;
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.topics = concurrentHashMap;
        }
        if (concurrentHashMap.containsKey(str)) {
            Log.d(TAG, "Attempted to subscribe to already-subscribed path!");
            return hm8.a;
        }
        this.topics.put(str, string);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e1e0(AnalyticsParam.EVENT_PARAM_ID, string));
        arrayList.add(new e1e0("destination", str));
        arrayList.add(new e1e0("ack", DEFAULT_ACK));
        if (list != null) {
            arrayList.addAll(list);
        }
        yl8 yl8VarSend = send(new f1e0("SUBSCRIBE", arrayList, null));
        pya pyaVar = new pya() { // from class: a1e0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                this.a.lambda$subscribePath$16(str, (Throwable) obj);
            }
        };
        yl8VarSend.getClass();
        return new om8(yl8VarSend, pyaVar);
    }

    private yl8 unsubscribePath(String str) {
        this.streamMap.remove(str);
        String str2 = this.topics.get(str);
        if (str2 == null) {
            return hm8.a;
        }
        this.topics.remove(str);
        Log.d(TAG, "Unsubscribe path: " + str + " id: " + str2);
        yl8 yl8VarSend = send(new f1e0("UNSUBSCRIBE", Collections.singletonList(new e1e0(AnalyticsParam.EVENT_PARAM_ID, str2)), null));
        yl8VarSend.getClass();
        return new nm8(yl8VarSend);
    }

    public void connect(final List<e1e0> list) {
        String str = TAG;
        Log.d(str, "Connect");
        this.headers = list;
        if (isConnected()) {
            Log.d(str, "Already connected, ignore");
            return;
        }
        l830<bbs> l830Var = ((x2) this.connectionProvider).a;
        pya pyaVar = new pya() { // from class: b1e0
            @Override // defpackage.pya
            public final void accept(Object obj) {
                this.a.lambda$connect$2(list, (bbs) obj);
            }
        };
        l830Var.getClass();
        taj.j jVar = taj.e;
        taj.d dVar = taj.c;
        rlr rlrVar = new rlr(pyaVar, jVar, dVar);
        l830Var.a(rlrVar);
        this.lifecycleDisposable = rlrVar;
        ucy<String> ucyVarF = ((x2) this.connectionProvider).f();
        c1e0 c1e0Var = new c1e0();
        ucyVarF.getClass();
        tdy tdyVar = new tdy(ucyVarF, c1e0Var);
        final a aVar = this.heartBeatTask;
        Objects.requireNonNull(aVar);
        idy idyVar = new idy(tdyVar, new nm20() { // from class: d1e0
            @Override // defpackage.nm20
            public final boolean test(Object obj) {
                return aVar.b((f1e0) obj);
            }
        });
        l830<f1e0> messageStream = getMessageStream();
        Objects.requireNonNull(messageStream);
        idy idyVar2 = new idy(new cdy(idyVar, new gla0(messageStream, 1)), new o0e0());
        int i = 2;
        rlr rlrVar2 = new rlr(new az5(this, i), new bz5(i), dVar);
        idyVar2.a(rlrVar2);
        this.messagesDisposable = rlrVar2;
    }

    public void disconnect() {
        yl8 yl8VarDisconnectCompletable = disconnectCompletable();
        y0e0 y0e0Var = new y0e0();
        cla0 cla0Var = new cla0();
        yl8VarDisconnectCompletable.getClass();
        yl8VarDisconnectCompletable.b(new hv5(cla0Var, y0e0Var));
    }

    public yl8 disconnectCompletable() {
        this.heartBeatTask.e();
        pse pseVar = this.lifecycleDisposable;
        if (pseVar != null) {
            pseVar.dispose();
        }
        pse pseVar2 = this.messagesDisposable;
        if (pseVar2 != null) {
            pseVar2.dispose();
        }
        return new gm8(((x2) this.connectionProvider).b(), new ib() { // from class: p0e0
            @Override // defpackage.ib
            public final void run() {
                this.a.lambda$disconnectCompletable$12();
            }
        });
    }

    public String getTopicId(String str) {
        return this.topics.get(str);
    }

    public boolean isConnected() {
        return getConnectionStream().k().booleanValue();
    }

    public r2i<bbs> lifecycle() {
        return this.lifecyclePublishSubject.i(qt1.b);
    }

    public void reconnect() {
        yl8 yl8VarDisconnectCompletable = disconnectCompletable();
        ib ibVar = new ib() { // from class: n0e0
            @Override // defpackage.ib
            public final void run() {
                this.a.lambda$reconnect$8();
            }
        };
        w0e0 w0e0Var = new w0e0();
        yl8VarDisconnectCompletable.getClass();
        yl8VarDisconnectCompletable.b(new hv5(w0e0Var, ibVar));
    }

    public yl8 send(f1e0 f1e0Var) {
        jm8 jm8VarI = ((x2) this.connectionProvider).i(f1e0Var.a(this.legacyWhitespace));
        zd2<Boolean> connectionStream = getConnectionStream();
        s0e0 s0e0Var = new s0e0();
        connectionStream.getClass();
        return jm8VarI.c(new mdv(new fdy(new idy(connectionStream, s0e0Var))));
    }

    public void setLegacyWhitespace(boolean z) {
        this.legacyWhitespace = z;
    }

    public void setPathMatcher(oxz oxzVar) {
        this.pathMatcher = oxzVar;
    }

    public r2i<f1e0> topic(final String str, final List<e1e0> list) {
        if (str == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Topic path cannot be null");
            int i = r2i.a;
            return new w2i(new taj.i(illegalArgumentException));
        }
        if (!this.streamMap.containsKey(str)) {
            ConcurrentHashMap<String, r2i<f1e0>> concurrentHashMap = this.streamMap;
            bm8 bm8Var = new bm8(new Callable() { // from class: t0e0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.lambda$topic$13(str, list);
                }
            });
            l830<f1e0> messageStream = getMessageStream();
            nm20 nm20Var = new nm20() { // from class: u0e0
                @Override // defpackage.nm20
                public final boolean test(Object obj) {
                    return this.a.lambda$topic$14(str, (f1e0) obj);
                }
            };
            messageStream.getClass();
            concurrentHashMap.put(str, new zl8(bm8Var, new t2i(new idy(messageStream, nm20Var).i(qt1.b), new ib() { // from class: v0e0
                @Override // defpackage.ib
                public final void run() {
                    this.a.lambda$topic$15(str);
                }
            }).g()));
        }
        return this.streamMap.get(str);
    }

    public StompClient withClientHeartbeat(int i) {
        this.heartBeatTask.e = i;
        return this;
    }

    public StompClient withServerHeartbeat(int i) {
        this.heartBeatTask.d = i;
        return this;
    }

    public yl8 send(String str, String str2) {
        return send(new f1e0("SEND", Collections.singletonList(new e1e0("destination", str)), str2));
    }

    public yl8 send(String str) {
        return send(str, null);
    }

    public r2i<f1e0> topic(String str) {
        return topic(str, null);
    }

    public void connect() {
        connect(null);
    }
}
