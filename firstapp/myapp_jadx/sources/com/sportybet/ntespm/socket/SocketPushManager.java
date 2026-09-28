package com.sportybet.ntespm.socket;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.protobuf.InvalidProtocolBufferException;
import com.sporty.android.core.model.MyLog;
import com.sportybet.ntespm.socket.protobuf.SocketMessage;
import defpackage.bxg0;
import defpackage.cbg;
import defpackage.dbg;
import defpackage.hp0;
import defpackage.itf0;
import defpackage.oti;
import defpackage.pn50;
import defpackage.qag;
import defpackage.qti;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class SocketPushManager implements qti, ISocketPushManager {
    private static final long HEARTBEAT_TIMEOUT_MS = 20000;
    static final int MESSAGE_DID_CONNECT = 0;
    static final int MESSAGE_DID_DISCONNECT = 2;
    static final int MESSAGE_DID_READ_DATA = 1;
    static final int MESSAGE_MAKE_PROGRESS = 3;
    static final int MESSAGE_TOPIC_ADDED = 4;
    static final int MESSAGE_TOPIC_REMOVED = 5;
    static final short MESSAGE_TYPE_HEARTBEAT = 0;
    static final short MESSAGE_TYPE_PUSH_MESSAGE = 258;
    static final short MESSAGE_TYPE_RESPONSE = 257;
    private static final int STATE_ADDRESS_PENDING = 1;
    private static final int STATE_CONNECTED = 4;
    private static final int STATE_CONNECTING = 3;
    private static final int STATE_DISABLED = -1;
    private static final int STATE_IDLE = 7;
    private static final int STATE_REGISTERED = 6;
    private static final int STATE_REGISTERING = 5;
    private static final int STATE_TOKEN_PENDING = 0;
    private static final int STATE_UNCONNECTED = 2;
    private static volatile SocketPushManager instance;
    private Runnable bgTask;
    private final cbg environmentManager;
    private Long lastConnectedTimestamp;
    private Long lastDisconnectedTimestamp;
    private String mAddress;
    private Call mAddressCall;
    private String mDeviceId;
    private Handler mMainThreadHandler;
    private int mProduct;
    private ReadDataHandler mReadDataHandler;
    private ReadHandler mReadThreadHandler;
    private int mRegisterRequestId;
    private Socket mSocket;
    private int mState;
    private String mToken;
    private WriteHandler mWriteThreadHandler;
    private final OkHttpClient okHttpClient;
    private final AtomicInteger requestId = new AtomicInteger(0);
    private final SubscriberManager mSubscriberManager = new SubscriberManager();
    private long lastHeartbeatTime = 0;
    private Runnable heartbeatTimeoutTask = null;
    private final ConcurrentHashMap<TopicSubscription, TopicSubscriptionStatus> topicSubscriptions = new ConcurrentHashMap<>();
    private final ArrayList<OnSubscribedListener> mOnSubscribedListenerList = new ArrayList<>();
    private final ArrayList<OnUnsubscribedListener> mOnUnsubscribedListenerList = new ArrayList<>();

    /* JADX INFO: renamed from: com.sportybet.ntespm.socket.SocketPushManager$2, reason: invalid class name */
    public class AnonymousClass2 implements Callback {
        public AnonymousClass2() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailure$0() {
            SocketPushManager.this.mAddressCall = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$onResponse$1(int i, String str) {
            SocketPushManager.this.mAddressCall = null;
            if (i != 200) {
                if (i == 416) {
                    SocketPushManager.this.mState = -1;
                    SocketPushManager.this.makeProcess();
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getInt("retCode") == 200) {
                    String string = jSONObject.getString("node");
                    if (TextUtils.isEmpty(string) || string.split(":").length != 2) {
                        return;
                    }
                    SocketPushManager.this.mAddress = string;
                    SocketPushManager.this.mState = 2;
                    SocketPushManager.this.makeProcess();
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.f(e, "unable to get socket server address", new Object[0]);
            }
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SOCKET);
            aVar.p(iOException, "unable to get socket address: %s", iOException.getMessage());
            SocketPushManager.this.mMainThreadHandler.post(new Runnable() { // from class: com.sportybet.ntespm.socket.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onFailure$0();
                }
            });
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            final int iCode = response.code();
            try {
                final String strString = response.body().string();
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.a("get socket server address result, code: " + iCode + ", response body: " + strString, new Object[0]);
                SocketPushManager.this.mMainThreadHandler.post(new Runnable() { // from class: com.sportybet.ntespm.socket.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onResponse$1(iCode, strString);
                    }
                });
            } catch (Exception e) {
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_SOCKET);
                aVar2.f(e, "unable to get socket server address", new Object[0]);
            }
        }
    }

    private SocketPushManager() {
        createHandlers();
        this.okHttpClient = pn50.a(null, null, null, null, null, null, 1023);
        hp0 hp0Var = hp0.A;
        hp0Var.getClass();
        Context applicationContext = hp0Var.getApplicationContext();
        applicationContext.getClass();
        this.environmentManager = ((dbg) qag.a(applicationContext, dbg.class)).c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void close() {
        this.mReadThreadHandler.removeCallbacksAndMessages(null);
        this.mWriteThreadHandler.removeCallbacksAndMessages(null);
        ReadDataHandler readDataHandler = this.mReadDataHandler;
        if (readDataHandler != null) {
            readDataHandler.removeCallbacksAndMessages(null);
        }
        Socket socket = this.mSocket;
        if (socket != null) {
            WriteHandler writeHandler = this.mWriteThreadHandler;
            writeHandler.sendMessage(writeHandler.obtainMessage(5, socket));
            this.mSocket = null;
        }
    }

    private void connect() {
        if (this.mState == 2) {
            Socket socket = new Socket();
            this.mSocket = socket;
            try {
                socket.setSoTimeout(10000);
            } catch (SocketException e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_SOCKET);
                aVar.f(e, "Unable to connect socket server.", new Object[0]);
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.a("Connecting to socket server at %s", this.mAddress);
            WriteHandler writeHandler = this.mWriteThreadHandler;
            writeHandler.sendMessage(writeHandler.obtainMessage(0, Pair.create(this.mSocket, this.mAddress)));
            this.mState = 3;
        }
    }

    private void createHandlers() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper()) { // from class: com.sportybet.ntespm.socket.SocketPushManager.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i = message.what;
                if (i == 0) {
                    if (SocketPushManager.this.mSocket == message.obj) {
                        SocketPushManager.this.mState = 4;
                        SocketPushManager.this.lastConnectedTimestamp = Long.valueOf(System.currentTimeMillis());
                        itf0.a aVar = itf0.a;
                        aVar.q(MyLog.TAG_SOCKET);
                        aVar.a("SocketPushManager: Connection established, state: %d", Integer.valueOf(SocketPushManager.this.mState));
                        SocketPushManager.this.makeProcess();
                        return;
                    }
                    return;
                }
                if (i == 1) {
                    Pair pair = (Pair) message.obj;
                    if (SocketPushManager.this.mSocket == pair.first) {
                        SocketPushManager.this.readData((short) message.arg1, (byte[]) pair.second);
                        return;
                    }
                    return;
                }
                int i2 = 0;
                if (i == 2) {
                    if (SocketPushManager.this.mSocket == message.obj) {
                        itf0.a aVar2 = itf0.a;
                        aVar2.q(MyLog.TAG_SOCKET);
                        aVar2.n("SocketPushManager: Connection disconnected", new Object[0]);
                        SocketPushManager.this.close();
                        SocketPushManager.this.mState = 2;
                        SocketPushManager.this.lastDisconnectedTimestamp = Long.valueOf(System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                if (i == 3) {
                    SocketPushManager.this.makeProcess();
                    return;
                }
                if (i == 4) {
                    Topic topic = (Topic) message.obj;
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_SOCKET);
                    aVar3.a("SocketPushManager: Topic added: %s", topic);
                    ArrayList arrayList = SocketPushManager.this.mOnSubscribedListenerList;
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((OnSubscribedListener) obj).onSubscribed(topic);
                    }
                    return;
                }
                if (i != 5) {
                    return;
                }
                Topic topic2 = (Topic) message.obj;
                itf0.a aVar4 = itf0.a;
                aVar4.q(MyLog.TAG_SOCKET);
                aVar4.a("SocketPushManager: Topic removed: %s", topic2);
                ArrayList arrayList2 = SocketPushManager.this.mOnUnsubscribedListenerList;
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ((OnUnsubscribedListener) obj2).onUnsubscribed(topic2);
                }
            }
        };
        HandlerThread handlerThread = new HandlerThread("read thread", 10);
        handlerThread.start();
        this.mReadThreadHandler = new ReadHandler(handlerThread.getLooper());
        HandlerThread handlerThread2 = new HandlerThread("write thread", 10);
        handlerThread2.start();
        this.mWriteThreadHandler = new WriteHandler(handlerThread2.getLooper());
        this.mReadThreadHandler.setMainThreadHandler(this.mMainThreadHandler);
        this.mWriteThreadHandler.setMainThreadHandler(this.mMainThreadHandler);
        HandlerThread handlerThread3 = new HandlerThread("read data thread", 10);
        handlerThread3.start();
        if (handlerThread3.getLooper() == null || this.mMainThreadHandler == null) {
            return;
        }
        this.mReadDataHandler = new ReadDataHandler(handlerThread3.getLooper(), this.mMainThreadHandler, this.mSubscriberManager);
    }

    public static SocketPushManager getInstance() {
        if (instance == null) {
            synchronized (SocketPushManager.class) {
                try {
                    if (instance == null) {
                        instance = new SocketPushManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    private int getRequestId() {
        return this.requestId.incrementAndGet();
    }

    private synchronized void getSocketServerAddress() {
        String str = this.environmentManager.b().j;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Alive URL cannot be empty");
        }
        String strConcat = str.concat("node");
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SOCKET);
        aVar.a("call alive node api to get socket server address: %s", strConcat);
        try {
            if (!TextUtils.isEmpty(this.mDeviceId)) {
                Call callNewCall = this.okHttpClient.newCall(new Request.Builder().url(strConcat + "?deviceId=" + URLEncoder.encode(this.mDeviceId, "utf-8")).build());
                this.mAddressCall = callNewCall;
                FirebasePerfOkHttpClient.enqueue(callNewCall, new AnonymousClass2());
            }
        } catch (UnsupportedEncodingException e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.f(e, "unable to get socket server address", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$scheduleHeartbeatTimer$0() {
        if (System.currentTimeMillis() - this.lastHeartbeatTime > HEARTBEAT_TIMEOUT_MS) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SOCKET);
            aVar.n("Heartbeat timeout, reconnecting...", new Object[0]);
            if (this.mState > 2) {
                close();
                this.mState = 2;
                makeProcess();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startBgTask$1() {
        close();
        if (this.mState > 2) {
            this.mState = 2;
        }
        stopHeartbeatTimer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeProcess() {
        int i = this.mState;
        if (i == 0 || i == 1) {
            if (this.mAddressCall == null) {
                getSocketServerAddress();
                return;
            }
            return;
        }
        if (i == 2) {
            if (!this.mSubscriberManager.hasTopics() || TextUtils.isEmpty(this.mToken)) {
                return;
            }
            connect();
            return;
        }
        if (i != 4) {
            if (i != 6) {
                return;
            }
            resubscribeAllTopics();
            this.mState = 7;
            sendHeartbeat();
            return;
        }
        this.mRegisterRequestId = getRequestId();
        SocketMessage.RegDev regDevBuild = SocketMessage.RegDev.newBuilder().setRequestId(this.mRegisterRequestId).setProductCode(this.mProduct).setDeviceId(this.mDeviceId).setDevType(SocketMessage.DevType.ANDROID).setToken(this.mToken).build();
        WriteHandler writeHandler = this.mWriteThreadHandler;
        writeHandler.sendMessage(writeHandler.obtainMessage(1, Pair.create(this.mSocket, regDevBuild)));
        ReadHandler readHandler = this.mReadThreadHandler;
        readHandler.sendMessage(readHandler.obtainMessage(0, this.mSocket));
        this.mState = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readData(short s, byte[] bArr) {
        try {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SOCKET);
            aVar.a("SocketPushManager: Received message type: %d, message length: %d", Short.valueOf(s), Integer.valueOf(bArr.length));
            if (s == 0) {
                SocketMessage.HeartBeat from = SocketMessage.HeartBeat.parseFrom(bArr);
                aVar.q(MyLog.TAG_SOCKET);
                aVar.a("<-- HEARTBEAT, data: %s", from);
                this.lastHeartbeatTime = System.currentTimeMillis();
                scheduleHeartbeatTimer();
                return;
            }
            if (s != 257) {
                if (s != 258) {
                    return;
                }
                SocketMessage.RetMsg from2 = SocketMessage.RetMsg.parseFrom(bArr);
                aVar.q(MyLog.TAG_SOCKET);
                aVar.a("<-- PUSH_MESSAGE, data: %s", from2);
                ReadDataHandler readDataHandler = this.mReadDataHandler;
                if (readDataHandler != null) {
                    readDataHandler.sendMessage(readDataHandler.obtainMessage(ReadDataHandler.MESSAGE_READ_DATA, from2));
                    return;
                }
                return;
            }
            SocketMessage.Response from3 = SocketMessage.Response.parseFrom(bArr);
            aVar.q(MyLog.TAG_SOCKET);
            aVar.a("<-- RESPONSE, data: %s", from3);
            SocketMessage.RetCode retCode = from3.getRetCode();
            SocketMessage.RetCode retCode2 = SocketMessage.RetCode.SUCCESS;
            if (retCode == retCode2 && from3.getRequestId() == this.mRegisterRequestId) {
                this.mState = 6;
                makeProcess();
            }
            TopicExtKt.subAcknowledged(this.topicSubscriptions, from3.getRequestId(), from3.getRetCode() == retCode2, System.currentTimeMillis());
        } catch (InvalidProtocolBufferException e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.p(e, "failed to read data, type: %s", Short.valueOf(s));
        }
    }

    private void resubscribeAllTopics() {
        this.topicSubscriptions.clear();
        Iterator<Topic> it = this.mSubscriberManager.getTopicSet().iterator();
        while (it.hasNext()) {
            subscribeTopic(it.next());
        }
    }

    private synchronized void scheduleHeartbeatTimer() {
        stopHeartbeatTimer();
        if (isConnected()) {
            Runnable runnable = new Runnable() { // from class: mja0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$scheduleHeartbeatTimer$0();
                }
            };
            this.heartbeatTimeoutTask = runnable;
            this.mMainThreadHandler.postDelayed(runnable, HEARTBEAT_TIMEOUT_MS);
        }
    }

    private void sendHeartbeat() {
        this.mWriteThreadHandler.removeMessages(4);
        SocketMessage.HeartBeat heartBeatBuild = SocketMessage.HeartBeat.newBuilder().setRequestId(getRequestId()).build();
        WriteHandler writeHandler = this.mWriteThreadHandler;
        writeHandler.sendMessageDelayed(writeHandler.obtainMessage(4, Pair.create(this.mSocket, heartBeatBuild)), 5000L);
        scheduleHeartbeatTimer();
    }

    private void startBgTask() {
        synchronized (SocketPushManager.class) {
            Runnable runnable = new Runnable() { // from class: nja0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$startBgTask$1();
                }
            };
            this.bgTask = runnable;
            this.mMainThreadHandler.postDelayed(runnable, 15000L);
        }
    }

    private void stopBgTask() {
        synchronized (SocketPushManager.class) {
            try {
                Runnable runnable = this.bgTask;
                if (runnable != null) {
                    this.mMainThreadHandler.removeCallbacks(runnable);
                    this.bgTask = null;
                }
                stopHeartbeatTimer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private synchronized void stopHeartbeatTimer() {
        Runnable runnable = this.heartbeatTimeoutTask;
        if (runnable != null) {
            this.mMainThreadHandler.removeCallbacks(runnable);
            this.heartbeatTimeoutTask = null;
        }
    }

    private void subscribeTopic(Topic topic) {
        SocketMessage.Subscribe subscribeBuild;
        int requestId = getRequestId();
        try {
            subscribeBuild = topic instanceof MultiTopic ? SocketMessage.Subscribe.newBuilder().setRequestId(requestId).setTopic(topic.getTopic()).setSubType(SocketMessage.SubType.SUB).setPushType(SocketMessage.PushType.forNumber(topic.getType())).setAccountId(((MultiTopic) topic).getAccountId()).build() : SocketMessage.Subscribe.newBuilder().setRequestId(requestId).setTopic(topic.getTopic()).setSubType(SocketMessage.SubType.SUB).setPushType(SocketMessage.PushType.forNumber(topic.getType())).build();
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SOCKET);
            aVar.p(e, "Failed to subscribe topic %s", topic);
            subscribeBuild = null;
        }
        if (subscribeBuild != null) {
            TopicExtKt.subRequest(this.topicSubscriptions, topic, requestId, System.currentTimeMillis());
            WriteHandler writeHandler = this.mWriteThreadHandler;
            writeHandler.sendMessage(writeHandler.obtainMessage(2, new bxg0(this.mSocket, subscribeBuild, topic)));
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.a("SocketPushManager: subscribe topic %s", topic);
        }
    }

    private void unsubscribeTopic(Topic topic) {
        SocketMessage.Subscribe subscribeBuild;
        int requestId = getRequestId();
        try {
            subscribeBuild = topic instanceof MultiTopic ? SocketMessage.Subscribe.newBuilder().setRequestId(requestId).setTopic(topic.getTopic()).setSubType(SocketMessage.SubType.UNSUB).setPushType(SocketMessage.PushType.forNumber(topic.getType())).setAccountId(((MultiTopic) topic).getAccountId()).build() : SocketMessage.Subscribe.newBuilder().setRequestId(requestId).setTopic(topic.getTopic()).setSubType(SocketMessage.SubType.UNSUB).setPushType(SocketMessage.PushType.forNumber(topic.getType())).build();
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SOCKET);
            aVar.p(e, "Failed to unsubscribe topic %s", topic);
            subscribeBuild = null;
        }
        if (subscribeBuild != null) {
            TopicExtKt.unSubRequest(this.topicSubscriptions, topic, requestId, System.currentTimeMillis());
            WriteHandler writeHandler = this.mWriteThreadHandler;
            writeHandler.sendMessage(writeHandler.obtainMessage(3, new bxg0(this.mSocket, subscribeBuild, topic)));
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_SOCKET);
            aVar2.a("SocketPushManager: unsubscribe topic %s", topic);
        }
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void addOnSubscribedListener(OnSubscribedListener onSubscribedListener) {
        this.mOnSubscribedListenerList.add(onSubscribedListener);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void addOnUnsubscribedListener(OnUnsubscribedListener onUnsubscribedListener) {
        this.mOnUnsubscribedListenerList.add(onUnsubscribedListener);
    }

    public String getAddress() {
        return this.mAddress;
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public Long getLastConnectedTimestamp() {
        return this.lastConnectedTimestamp;
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public Long getLastDisconnectedTimestamp() {
        return this.lastDisconnectedTimestamp;
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public int getStatus() {
        return this.mState;
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public Set<Topic> getSubscribedTopics(Subscriber subscriber) {
        return this.mSubscriberManager.getSubscribedTopics(subscriber);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void init(int i, String str, String str2) {
        oti.c().a(this);
        this.mProduct = i;
        this.mToken = str;
        this.mDeviceId = str2;
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_SOCKET);
        aVar.l("init socket, productCode: " + this.mProduct + ", token: " + this.mToken + ", deviceId: " + this.mDeviceId, new Object[0]);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public boolean isConnected() {
        makeProcess();
        return this.mState >= 4;
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public boolean isTopicActive(Topic topic) {
        if (topic == null) {
            return false;
        }
        return TopicExtKt.isTopicActive(this.topicSubscriptions, topic);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public boolean isTopicSubscribed(Topic topic, Subscriber subscriber) {
        if (topic == null) {
            return false;
        }
        SubscriberManager subscriberManager = this.mSubscriberManager;
        return subscriber == null ? subscriberManager.isTopicSubscribed(topic) : subscriberManager.isTopicSubscribed(topic, subscriber);
    }

    @Override // defpackage.qti
    public void onActivityCreated(Activity activity) {
    }

    @Override // defpackage.qti
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // defpackage.qti
    public void onActivityResumed(Activity activity) {
    }

    @Override // defpackage.qti
    public void onBecameBackground() {
        stopBgTask();
        startBgTask();
    }

    @Override // defpackage.qti
    public void onBecameForeground() {
        stopBgTask();
        makeProcess();
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void subscribeTopic(Topic topic, Subscriber subscriber, boolean z) {
        if (this.mState != 7) {
            makeProcess();
        } else if (z) {
            unsubscribeTopic(topic);
            subscribeTopic(topic);
        } else if (this.mSubscriberManager.hasNoSubscribersOfTopic(topic)) {
            subscribeTopic(topic);
        }
        this.mSubscriberManager.subscribe(topic, subscriber);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void unsubscribeTopic(Topic topic, Subscriber subscriber) {
        if (this.mState == 7) {
            if (this.mSubscriberManager.isOnlyOneSubscriberOfTopic(topic, subscriber)) {
                unsubscribeTopic(topic);
            } else if (this.mSubscriberManager.hasNoSubscribersOfTopic(topic)) {
                TopicExtKt.removeSubscription(this.topicSubscriptions, topic);
            }
        } else {
            makeProcess();
        }
        this.mSubscriberManager.unsubscribe(topic, subscriber);
    }

    @Override // com.sportybet.ntespm.socket.ISocketPushManager
    public void subscribeTopic(Topic topic, Subscriber subscriber) {
        subscribeTopic(topic, subscriber, false);
    }
}
