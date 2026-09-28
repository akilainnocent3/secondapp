package com.twilio.voice;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Pair;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class CallInviteProxy implements MessageListener {
    private static final Logger logger = Logger.getLogger(CallInviteProxy.class);
    private Call call;
    private CallInvite callInvite;
    String codecParams;
    private final Context context;
    private Call.EventListener eventListener;
    private String gateway;
    private final Handler handler;
    private final MediaFactory mediaFactory;
    private final MessageListener messageListener;
    long nativeCallInviteProxy;
    private EventPublisher publisher;
    private String region;
    String selectedCodec;
    private String tempCallSid;
    private final ThreadUtils.ThreadChecker threadChecker;
    private boolean released = false;
    private ConnectivityReceiver connectivityReceiver = null;
    private String selectedRegion = Voice.region;
    private final Call.EventListener eventListenerProxy = new AnonymousClass1();

    /* JADX INFO: renamed from: com.twilio.voice.CallInviteProxy$1, reason: invalid class name */
    public class AnonymousClass1 implements Call.EventListener {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onEvent$0(Map map) {
            CallInviteProxy.this.threadChecker.checkIsOnValidThread();
            CallInviteProxy.logger.d("CallInviteProxy::eventListenerProxy::onEvent(...)");
            if (((String) ((Pair) map.get(EventKeys.EVENT_GROUP)).first).equals(EventGroupType.REGISTRATION_EVENT_GROUP) && ((String) ((Pair) map.get("name")).first).equals("unsupported-cancel-message-error")) {
                CallInviteProxy.this.release((String) ((Pair) map.get(EventKeys.CALL_SID_KEY)).first);
            }
            if (CallInviteProxy.this.eventListener != null) {
                CallInviteProxy.this.eventListener.onEvent(map);
            }
            CallInviteProxy.this.publishEvent(map);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onMetric$1(Map map) {
            CallInviteProxy.this.threadChecker.checkIsOnValidThread();
            CallInviteProxy.logger.d("onMetric");
            if (CallInviteProxy.this.eventListener != null) {
                CallInviteProxy.this.eventListener.onMetric(map);
            }
            if (((String) ((Pair) map.get(EventKeys.EVENT_GROUP)).first).equals(EventGroupType.CALL_QUALITY_STATS_GROUP)) {
                CallInviteProxy.this.call.onSample(InsightsUtils.createRtcSample(map));
            }
        }

        @Override // com.twilio.voice.Call.EventListener
        public void onEvent(final Map<String, Pair<String, Class>> map) {
            CallInviteProxy.this.handler.post(new Runnable() { // from class: com.twilio.voice.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onEvent$0(map);
                }
            });
        }

        @Override // com.twilio.voice.Call.EventListener
        public void onMetric(final Map<String, Pair<String, Class>> map) {
            CallInviteProxy.this.handler.post(new Runnable() { // from class: com.twilio.voice.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onMetric$1(map);
                }
            });
        }
    }

    public CallInviteProxy(Context context, Handler handler, MessageListener messageListener, Call.EventListener eventListener, CallInvite callInvite) {
        String str = null;
        Preconditions.checkApplicationContext(context, "must create Call with application context");
        this.context = context;
        this.handler = handler;
        this.threadChecker = new ThreadUtils.ThreadChecker(handler.getLooper().getThread());
        this.messageListener = messageListener;
        this.eventListener = eventListener;
        this.mediaFactory = MediaFactory.instance(this, context);
        this.callInvite = callInvite;
        Pair<String, String> pair = Voice.callSidBridgeTokenPair;
        if (pair != null && ((String) pair.first).equals(callInvite.getCallSid())) {
            str = (String) Voice.callSidBridgeTokenPair.second;
        }
        if (str != null) {
            EventPublisher eventPublisher = new EventPublisher(context, Constants.getClientSdkProductName(), str);
            this.publisher = eventPublisher;
            eventPublisher.addListener(new i());
        }
    }

    private EventPayload.Builder createEventPayloadBuilder() {
        return new EventPayload.Builder().callSid(this.callInvite.getCallSid()).tempCallSid(this.tempCallSid).messageSid(this.callInvite.getMessageSid()).direction(Constants.Direction.INCOMING).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName(Constants.getClientSdkProductName()).clientName(Utils.parseClientIdentity(this.callInvite.getTo())).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).preflight(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$new$2(VoiceException voiceException) {
        logger.e("Error publishing data : " + voiceException.getMessage() + ":" + voiceException.getErrorCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallInvite$0(CallInvite callInvite) {
        this.threadChecker.checkIsOnValidThread();
        this.threadChecker.checkIsOnValidThread();
        logger.d("onCallInvite");
        Voice.callInviteProxyMap.put(callInvite.getCallSid(), this);
        registerConnectivityBroadcastReceiver();
        this.messageListener.onCallInvite(callInvite);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCancelledCallInvite$1(CallException callException, CancelledCallInvite cancelledCallInvite) {
        this.threadChecker.checkIsOnValidThread();
        Logger logger2 = logger;
        StringBuilder sb = new StringBuilder("onCancelledCallInvite: CallException code: ");
        sb.append(callException == null ? "null" : Integer.valueOf(callException.getErrorCode()));
        logger2.d(sb.toString());
        boolean z = this.released;
        release(cancelledCallInvite.getCallSid());
        if (z) {
            return;
        }
        this.messageListener.onCancelledCallInvite(cancelledCallInvite, callException);
    }

    private native void nativeNetworkChange(long j, Voice.NetworkChangeEvent networkChangeEvent);

    private native void nativeRelease(long j);

    private native String nativeSendMessage(long j, CallMessage callMessage);

    /* JADX INFO: Access modifiers changed from: private */
    public void publishEvent(Map<String, Pair<String, Class>> map) {
        if (!((String) map.get(EventKeys.EVENT_GROUP).first).equals(EventGroupType.SETTINGS_GROUP)) {
            InsightsUtils.processEvent(map, createEventPayloadBuilder(), this.publisher, Constants.Direction.INCOMING);
            return;
        }
        if (((String) map.get("name").first).equals("codec")) {
            this.codecParams = (String) map.get(EventKeys.CODEC_PARAMS).first;
            this.selectedCodec = (String) map.get(EventKeys.SELECTED_CODEC).first;
        } else if (((String) map.get("name").first).equals(EventKeys.EDGE_HOST_REGION)) {
            this.gateway = (String) map.get(EventKeys.EDGE_HOST_NAME).first;
            this.region = (String) map.get(EventKeys.EDGE_HOST_REGION).first;
        }
        InsightsUtils.processEvent(map, createEventPayloadBuilderForSettingsEvent(), this.publisher, Constants.Direction.INCOMING);
    }

    private void registerConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver = new ConnectivityReceiver();
        this.connectivityReceiver = connectivityReceiver;
        this.context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    private void unregisterConnectivityBroadcastReceiver() {
        ConnectivityReceiver connectivityReceiver = this.connectivityReceiver;
        if (connectivityReceiver != null) {
            this.context.unregisterReceiver(connectivityReceiver);
        }
    }

    public EventPayload.Builder createEventPayloadBuilderForSettingsEvent() {
        return createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    public synchronized EventPublisher getPublisher() {
        this.threadChecker.checkIsOnValidThread();
        return this.publisher;
    }

    public void networkChange(Voice.NetworkChangeEvent networkChangeEvent) {
        this.threadChecker.checkIsOnValidThread();
        if (!this.released) {
            long j = this.nativeCallInviteProxy;
            if (j != 0) {
                nativeNetworkChange(j, networkChangeEvent);
                return;
            }
        }
        logger.d("Ignoring networkChangeEvent: " + networkChangeEvent.name() + " because CallInviteProxy is either released or is not set.");
    }

    @Override // com.twilio.voice.MessageListener
    public void onCallInvite(final CallInvite callInvite) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.j
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$onCallInvite$0(callInvite);
            }
        });
    }

    @Override // com.twilio.voice.MessageListener
    public void onCancelledCallInvite(final CancelledCallInvite cancelledCallInvite, final CallException callException) {
        this.handler.post(new Runnable() { // from class: com.twilio.voice.h
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$onCancelledCallInvite$1(callException, cancelledCallInvite);
            }
        });
    }

    public synchronized void release(String str) {
        try {
            logger.d("CallInviteProxy::release");
            this.threadChecker.checkIsOnValidThread();
            if (!this.released) {
                unregisterConnectivityBroadcastReceiver();
                Voice.callInviteProxyMap.remove(str);
                long j = this.nativeCallInviteProxy;
                if (j != 0) {
                    nativeRelease(j);
                    this.nativeCallInviteProxy = 0L;
                }
                this.mediaFactory.release(this);
                this.released = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String sendMessage(CallMessage callMessage) {
        if (!this.released) {
            long j = this.nativeCallInviteProxy;
            if (j != 0) {
                return nativeSendMessage(j, callMessage);
            }
        }
        logger.d("Ignoring sendMessage:" + callMessage.getContent() + " because CallInviteProxy is either released or is not set.");
        return "";
    }

    public synchronized void setCall(Call call) {
        this.threadChecker.checkIsOnValidThread();
        this.call = call;
    }

    public synchronized void setEventListener(Call.EventListener eventListener) {
        this.threadChecker.checkIsOnValidThread();
        this.eventListener = eventListener;
    }

    public synchronized void setTempCallSid(String str) {
        this.threadChecker.checkIsOnValidThread();
        this.tempCallSid = str;
    }
}
