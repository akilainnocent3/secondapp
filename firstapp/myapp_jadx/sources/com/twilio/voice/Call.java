package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import com.twilio.voice.Call;
import defpackage.b9p;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes8.dex */
public class Call extends InternalCall {
    private static final Logger logger = Logger.getLogger(Call.class);
    private final CallInvite callInvite;
    private CallMessageListener callMessageListener;
    private CallMessageListenerProxy callMessageListenerProxy;
    private Set<CallQualityWarning> currentCallQualityWarning;
    EventListener eventListenerProxy;
    private Listener listener;
    private MediaFactory mediaFactory;
    private long nativeCallDelegate;
    private Queue<Pair<Handler, StatsListener>> statsListenersQueue;
    private final ThreadUtils.ThreadChecker threadChecker;
    private List<LocalAudioTrack> localAudioTracks = Collections.EMPTY_LIST;
    private ConnectivityReceiver connectivityReceiver = null;
    private final Listener callListenerProxy = new AnonymousClass1();
    private final StatsListener statsListenerProxy = new StatsListener() { // from class: ru5
        @Override // com.twilio.voice.StatsListener
        public final void onStats(List list) {
            this.a.lambda$new$1(list);
        }
    };

    /* JADX INFO: renamed from: com.twilio.voice.Call$1, reason: invalid class name */
    public class AnonymousClass1 implements Listener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onCallQualityWarningsChanged$6(Set set, Call call, Set set2) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onCallQualityWarningsChanged(): {" + Call.this + "}");
            Call.this.currentCallQualityWarning = set;
            Call.this.listener.onCallQualityWarningsChanged(call, set, set2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConnectFailure$4(Call call, CallException callException) {
            Call.logger.d("Call::callListenerProxy::onConnectFailure(): {" + Call.this + "}");
            Call.this.threadChecker.checkIsOnValidThread();
            Call.this.releaseCall();
            Call call2 = Call.this;
            call2.unregisterConnectivityBroadcastReceiver(call2.context);
            Voice.calls.remove(Call.this);
            Voice.rejects.remove(Call.this);
            Call call3 = Call.this;
            call3.state = State.DISCONNECTED;
            call3.release();
            Call.this.listener.onConnectFailure(call, callException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onConnected$1(Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onConnected(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.CONNECTED;
            call.sid = call2.nativeGetSid(call2.nativeCallDelegate);
            Call.this.listener.onConnected(call);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onDisconnected$5(Call call, CallException callException) {
            Call.logger.d("Call::callListenerProxy::onDisconnected(): {" + Call.this + "}");
            Call.this.threadChecker.checkIsOnValidThread();
            Call.this.releaseCall();
            Call call2 = Call.this;
            call2.unregisterConnectivityBroadcastReceiver(call2.context);
            Voice.calls.remove(Call.this);
            Voice.rejects.remove(Call.this);
            Call call3 = Call.this;
            call3.state = State.DISCONNECTED;
            call3.release();
            Call.this.listener.onDisconnected(call, callException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReconnected$3(Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onConnectFailure(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.CONNECTED;
            call2.listener.onReconnected(call);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReconnecting$2(Call call, CallException callException) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onReconnecting(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.RECONNECTING;
            call2.listener.onReconnecting(call, callException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onRinging$0(Call call) {
            Call.this.threadChecker.checkIsOnValidThread();
            Call.logger.d("Call::callListenerProxy::onRinging(): {" + Call.this + "}");
            Call call2 = Call.this;
            call2.state = State.RINGING;
            call.sid = call2.nativeGetSid(call2.nativeCallDelegate);
            Call.this.listener.onRinging(call);
        }

        @Override // com.twilio.voice.Call.Listener
        public void onCallQualityWarningsChanged(final Call call, final Set<CallQualityWarning> set, final Set<CallQualityWarning> set2) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onCallQualityWarningsChanged$6(set, call, set2);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onConnectFailure(final Call call, final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onConnectFailure$4(call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onConnected(final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onConnected$1(call);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onDisconnected(final Call call, final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onDisconnected$5(call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onReconnected(final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onReconnected$3(call);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onReconnecting(final Call call, final CallException callException) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onReconnecting$2(call, callException);
                }
            });
        }

        @Override // com.twilio.voice.Call.Listener
        public void onRinging(final Call call) {
            Call.this.handler.post(new Runnable() { // from class: com.twilio.voice.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onRinging$0(call);
                }
            });
        }
    }

    public interface CallMessageListener {
        void onMessageFailure(String str, String str2, VoiceException voiceException);

        void onMessageReceived(String str, CallMessage callMessage);

        void onMessageSent(String str, String str2);
    }

    public enum CallQualityWarning {
        WARN_HIGH_RTT("high-rtt"),
        WARN_HIGH_JITTER("high-jitter"),
        WARN_HIGH_PACKET_LOSS("high-packet-loss"),
        WARN_LOW_MOS("low-mos"),
        WARN_CONSTANT_AUDIO_IN_LEVEL("constant-audio-input-level"),
        WARN_CONSTANT_AUDIO_OUTPUT_LEVEL("constant-audio-output-level");

        private final String warningName;

        CallQualityWarning(String str) {
            this.warningName = str;
        }

        public static CallQualityWarning fromString(String str) {
            CallQualityWarning callQualityWarning = WARN_HIGH_RTT;
            if (str.equals(callQualityWarning.warningName)) {
                return callQualityWarning;
            }
            CallQualityWarning callQualityWarning2 = WARN_HIGH_JITTER;
            if (str.equals(callQualityWarning2.warningName)) {
                return callQualityWarning2;
            }
            CallQualityWarning callQualityWarning3 = WARN_HIGH_PACKET_LOSS;
            if (str.equals(callQualityWarning3.warningName)) {
                return callQualityWarning3;
            }
            CallQualityWarning callQualityWarning4 = WARN_LOW_MOS;
            if (str.equals(callQualityWarning4.warningName)) {
                return callQualityWarning4;
            }
            CallQualityWarning callQualityWarning5 = WARN_CONSTANT_AUDIO_IN_LEVEL;
            if (str.equals(callQualityWarning5.warningName)) {
                return callQualityWarning5;
            }
            CallQualityWarning callQualityWarning6 = WARN_CONSTANT_AUDIO_OUTPUT_LEVEL;
            if (str.equals(callQualityWarning6.warningName)) {
                return callQualityWarning6;
            }
            b9p.a("Unsupported warning name string -> ".concat(str));
            return null;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.warningName;
        }
    }

    public interface EventListener {
        void onEvent(Map<String, Pair<String, Class>> map);

        void onMetric(Map<String, Pair<String, Class>> map);
    }

    public enum Issue {
        NOT_REPORTED("not-reported"),
        DROPPED_CALL("dropped-call"),
        AUDIO_LATENCY("audio-latency"),
        ONE_WAY_AUDIO(Chyeyik.XEx),
        CHOPPY_AUDIO("choppy-audio"),
        NOISY_CALL("noisy-call"),
        ECHO("echo");

        private final String issueName;

        Issue(String str) {
            this.issueName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.issueName;
        }
    }

    public interface Listener {
        default void onCallQualityWarningsChanged(Call call, Set<CallQualityWarning> set, Set<CallQualityWarning> set2) {
        }

        void onConnectFailure(Call call, CallException callException);

        void onConnected(Call call);

        void onDisconnected(Call call, CallException callException);

        void onReconnected(Call call);

        void onReconnecting(Call call, CallException callException);

        void onRinging(Call call);
    }

    public enum Score {
        NOT_REPORTED(0),
        ONE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5);

        private final int score;

        Score(int i) {
            this.score = i;
        }

        public int getValue() {
            return this.score;
        }
    }

    public enum State {
        CONNECTING,
        RINGING,
        CONNECTED,
        RECONNECTING,
        DISCONNECTED
    }

    public Call(Context context, CallInvite callInvite, Listener listener) {
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.listener = listener;
        this.from = callInvite.getFrom();
        this.to = callInvite.getTo();
        this.sid = callInvite.getCallSid();
        this.bridgeToken = callInvite.getBridgeToken();
        this.callInvite = callInvite;
        this.disconnectCalled = false;
        this.direction = Constants.Direction.INCOMING;
        Handler handlerCreateHandler = Utils.createHandler();
        this.handler = handlerCreateHandler;
        this.threadChecker = new ThreadUtils.ThreadChecker(handlerCreateHandler.getLooper().getThread());
        this.state = State.CONNECTING;
        EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), this.bridgeToken);
        this.publisher = eventPublisher;
        eventPublisher.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
    }

    private boolean isPermittedNetworkChangeEvent(Voice.NetworkChangeEvent networkChangeEvent) {
        if (networkChangeEvent != Voice.NetworkChangeEvent.CONNECTION_CHANGED) {
            return true;
        }
        State state = this.state;
        return (state == State.CONNECTING || state == State.RINGING) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$0(Pair pair, List list) {
        ((StatsListener) pair.second).onStats(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(final List list) {
        final Pair<Handler, StatsListener> pairPoll = this.statsListenersQueue.poll();
        if (pairPoll != null) {
            ((Handler) pairPoll.first).post(new Runnable() { // from class: qu5
                @Override // java.lang.Runnable
                public final void run() {
                    Call.lambda$new$0(pairPoll, list);
                }
            });
        }
    }

    private native long nativeAccept(AcceptOptions acceptOptions, Listener listener, StatsListener statsListener, EventListener eventListener, CallMessageListener callMessageListener, Handler handler, long j);

    private native long nativeConnect(ConnectOptions connectOptions, Listener listener, StatsListener statsListener, EventListener eventListener, CallMessageListener callMessageListener, long j, Handler handler);

    private native void nativeDisconnect(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native String nativeGetSid(long j);

    private native void nativeGetStats(long j);

    private native void nativeHold(long j, boolean z);

    private native void nativeMute(long j, boolean z);

    private native void nativeNetworkChange(long j, Voice.NetworkChangeEvent networkChangeEvent);

    private native long nativeReject(AcceptOptions acceptOptions, Listener listener, EventListener eventListener, CallMessageListener callMessageListener, Handler handler, long j);

    private native void nativeRelease(long j);

    private native void nativeReleaseCall(long j);

    private native String nativeSendCallMessage(long j, CallMessage callMessage);

    private native void nativeSendDigits(long j, String str);

    private void registerConnectivityBroadcastReceiver(Context context) {
        ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver;
        context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void releaseCall() {
        long j = this.nativeCallDelegate;
        if (j != 0) {
            nativeReleaseCall(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterConnectivityBroadcastReceiver(Context context) {
        context.unregisterReceiver(this.connectivityReceiver);
        this.connectivityReceiver = null;
    }

    public void accept(AcceptOptions acceptOptions, long j) {
        logger.d("Call::accept(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        publishLoggerEventToInsights();
        CallOptions.checkAudioTracksReleased(acceptOptions.getAudioTracks());
        this.localAudioTracks = acceptOptions.getAudioTracks();
        CallMessageListener callMessageListener = acceptOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy((EventListener) null, this.handler, this.publisher, this.callInvite);
        synchronized (this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            this.mediaFactory = MediaFactory.instance(this, this.context);
            this.nativeCallDelegate = nativeAccept(acceptOptions, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, this.handler, j);
        }
    }

    public void connect(ConnectOptions connectOptions) {
        logger.d("Call::connect(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.calls.add(this);
        publishLoggerEventToInsights();
        CallOptions.checkAudioTracksReleased(connectOptions.getAudioTracks());
        this.localAudioTracks = connectOptions.getAudioTracks();
        CallMessageListener callMessageListener = connectOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy(this.tempCallSid, false, connectOptions.getEventListener(), this.handler, this.publisher);
        synchronized (this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            MediaFactory mediaFactoryInstance = MediaFactory.instance(this, this.context);
            this.mediaFactory = mediaFactoryInstance;
            this.nativeCallDelegate = nativeConnect(connectOptions, this.callListenerProxy, this.statsListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, mediaFactoryInstance.getNativeMediaFactoryHandle(), this.handler);
        }
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void disconnect() {
        logger.d("Call::disconnect(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        if (!this.disconnectCalled && isValidState()) {
            long j = this.nativeCallDelegate;
            if (j != 0) {
                this.disconnectCalled = true;
                nativeDisconnect(j);
            }
        }
    }

    public Set<CallQualityWarning> getCallQualityWarnings() {
        return this.currentCallQualityWarning;
    }

    public String getFrom() {
        return this.from;
    }

    @Override // com.twilio.voice.InternalCall
    public String getSid() {
        return this.sid;
    }

    @Override // com.twilio.voice.InternalCall
    public State getState() {
        return this.state;
    }

    public synchronized void getStats(StatsListener statsListener) {
        this.threadChecker.checkIsOnValidThread();
        Preconditions.checkNotNull(statsListener, "statsListener must not be null");
        if (this.state == State.DISCONNECTED) {
            return;
        }
        this.statsListenersQueue.offer(new Pair<>(Utils.createHandler(), statsListener));
        nativeGetStats(this.nativeCallDelegate);
    }

    public String getTo() {
        return this.to;
    }

    public synchronized void hold(boolean z) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState()) {
            this.isOnHold = z;
            nativeHold(this.nativeCallDelegate, z);
        }
    }

    @Override // com.twilio.voice.InternalCall
    public boolean isMuted() {
        return this.isMuted;
    }

    public boolean isOnHold() {
        return this.isOnHold;
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void mute(boolean z) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState()) {
            this.isMuted = z;
            nativeMute(this.nativeCallDelegate, z);
        }
    }

    public void networkChange(Voice.NetworkChangeEvent networkChangeEvent) {
        this.threadChecker.checkIsOnValidThread();
        if (isValidState() && isPermittedNetworkChangeEvent(networkChangeEvent)) {
            nativeNetworkChange(this.nativeCallDelegate, networkChangeEvent);
            return;
        }
        logger.d("Ignoring networkChangeEvent: " + networkChangeEvent.name() + " in Call.State: " + this.state);
    }

    @Override // com.twilio.voice.InternalCall, com.twilio.voice.EventPublisher.EventPublisherListener
    public /* bridge */ /* synthetic */ void onError(VoiceException voiceException) {
        super.onError(voiceException);
    }

    public void postFeedback(Score score, Issue issue) {
        Preconditions.checkNotNull(score, "score must not be null");
        Preconditions.checkNotNull(issue, "issue must not be null");
        publishFeedbackEvent(score, issue);
    }

    public void publishLoggerEventToInsights() {
        InsightsUtils.publishLoggerEvent(this.publisher, createEventPayloadBuilder().build());
    }

    public void reject(AcceptOptions acceptOptions, CallInviteProxy callInviteProxy) {
        logger.d("Call::reject(): {" + this + "}");
        this.threadChecker.checkIsOnValidThread();
        registerConnectivityBroadcastReceiver(this.context);
        Voice.rejects.add(this);
        Iterator<LocalAudioTrack> it = acceptOptions.getAudioTracks().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        CallMessageListener callMessageListener = acceptOptions.getCallMessageListener();
        this.callMessageListener = callMessageListener;
        this.callMessageListenerProxy = new CallMessageListenerProxy(this.publisher, callMessageListener);
        this.eventListenerProxy = new EventListenerProxy((EventListener) null, this.handler, this.publisher, this.callInvite);
        synchronized (this.callListenerProxy) {
            Voice.loadLibrary(this.context);
            this.nativeCallDelegate = nativeReject(acceptOptions, this.callListenerProxy, this.eventListenerProxy, this.callMessageListenerProxy, this.handler, callInviteProxy.nativeCallInviteProxy);
        }
    }

    public synchronized void release() {
        try {
            logger.d("Call::release(): {" + this + "}");
            this.threadChecker.checkIsOnValidThread();
            Iterator<LocalAudioTrack> it = this.localAudioTracks.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            long j = this.nativeCallDelegate;
            if (j != 0) {
                nativeRelease(j);
                this.nativeCallDelegate = 0L;
            }
            MediaFactory mediaFactory = this.mediaFactory;
            if (mediaFactory != null) {
                mediaFactory.release(this);
                this.mediaFactory = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.twilio.voice.InternalCall
    public synchronized void sendDigits(String str) {
        this.threadChecker.checkIsOnValidThread();
        Preconditions.checkNotNull(str, "digits must not be null");
        if (!str.matches("^[0-9\\*\\#w]+$")) {
            throw new IllegalArgumentException("digits string must not be null and should only contains 0-9, *, #, or w characters");
        }
        if (isValidState()) {
            nativeSendDigits(this.nativeCallDelegate, str);
        }
    }

    public String sendMessage(CallMessage callMessage) {
        logger.d("Call::sendMessage(): {" + this + "}");
        return nativeSendCallMessage(this.nativeCallDelegate, callMessage);
    }

    public Call(Context context, String str, Listener listener) {
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.listener = listener;
        this.callInvite = null;
        this.state = State.CONNECTING;
        this.direction = Constants.Direction.OUTGOING;
        Handler handlerCreateHandler = Utils.createHandler();
        this.handler = handlerCreateHandler;
        this.threadChecker = new ThreadUtils.ThreadChecker(handlerCreateHandler.getLooper().getThread());
        EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), str);
        this.publisher = eventPublisher;
        eventPublisher.addListener(this);
        this.statsListenersQueue = new ConcurrentLinkedQueue();
    }
}
