package com.twilio.voice;

import android.os.Handler;
import android.util.Pair;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes8.dex */
class EventListenerProxy implements Call.EventListener {
    static final String TEMP_CALL_SID_PREFIX = "TSID";
    private Constants.Direction callDirection;
    private String callSid;
    private String calleeName;
    private String codecParams;
    private final EventPublisher eventPublisher;
    private String gateway;
    private final Handler handler;
    private final boolean isPreflight;
    private final Call.EventListener listener;
    private JSONArray metricEventPayload;
    private String region;
    private String selectedCodec;
    private final String selectedRegion;
    private final String tempCallSid;

    public EventListenerProxy(boolean z, Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher) {
        this(TEMP_CALL_SID_PREFIX + UUID.randomUUID(), z, eventListener, handler, eventPublisher);
    }

    private EventPayload.Builder createEventPayloadBuilder() {
        return new EventPayload.Builder().callSid(this.callSid).tempCallSid(this.tempCallSid).direction(this.callDirection).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName(Constants.getClientSdkProductName()).clientName(Utils.parseClientIdentity(this.calleeName)).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).preflight(Boolean.valueOf(this.isPreflight));
    }

    private EventPayload.Builder createEventPayloadBuilderForSettingsEvent() {
        return createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$0(Map map) {
        this.listener.onEvent(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$1(Map map) {
        InsightsUtils.processWarningEvent(map, createEventPayloadBuilder(), this.eventPublisher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$2(Map map) {
        InsightsUtils.processEvent(map, createEventPayloadBuilder(), this.eventPublisher, this.callDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$3(Map map) {
        InsightsUtils.processEvent(map, createEventPayloadBuilder(), this.eventPublisher, this.callDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEvent$4(Map map) {
        InsightsUtils.processEvent(map, createEventPayloadBuilder(), this.eventPublisher, this.callDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMetric$5(Map map) {
        this.listener.onMetric(map);
    }

    @Override // com.twilio.voice.Call.EventListener
    public void onEvent(final Map<String, Pair<String, Class>> map) {
        if (this.listener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onEvent$0(map);
                }
            });
        }
        Pair<String, Class> pair = map.get(EventKeys.EVENT_GROUP);
        Objects.requireNonNull(pair);
        String str = (String) pair.first;
        str.getClass();
        switch (str) {
            case "connection":
                Pair<String, Class> pair2 = map.get("name");
                Objects.requireNonNull(pair2);
                String str2 = (String) pair2.first;
                if ("outgoing".equals(str2)) {
                    this.callDirection = Constants.Direction.OUTGOING;
                } else if ("incoming".equals(str2)) {
                    this.callDirection = Constants.Direction.INCOMING;
                } else if ("ringing".equals(str2)) {
                    Pair<String, Class> pair3 = map.get(EventKeys.CALL_SID_KEY);
                    Objects.requireNonNull(pair3);
                    this.callSid = (String) pair3.first;
                }
                this.handler.post(new Runnable() { // from class: com.twilio.voice.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onEvent$2(map);
                    }
                });
                break;
            case "network-quality-warning-raised":
            case "audio-level-warning-raised":
                this.handler.post(new Runnable() { // from class: com.twilio.voice.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onEvent$1(map);
                    }
                });
                break;
            case "settings":
                Pair<String, Class> pair4 = map.get("name");
                Objects.requireNonNull(pair4);
                String str3 = (String) pair4.first;
                if ("codec".equals(str3)) {
                    Pair<String, Class> pair5 = map.get(EventKeys.CODEC_PARAMS);
                    Objects.requireNonNull(pair5);
                    this.codecParams = (String) pair5.first;
                    Pair<String, Class> pair6 = map.get(EventKeys.SELECTED_CODEC);
                    Objects.requireNonNull(pair6);
                    this.selectedCodec = (String) pair6.first;
                } else if (EventKeys.EDGE_HOST_REGION.equals(str3)) {
                    Pair<String, Class> pair7 = map.get(EventKeys.EDGE_HOST_NAME);
                    Objects.requireNonNull(pair7);
                    this.gateway = (String) pair7.first;
                    Pair<String, Class> pair8 = map.get(EventKeys.EDGE_HOST_REGION);
                    Objects.requireNonNull(pair8);
                    this.region = (String) pair8.first;
                }
                this.handler.post(new Runnable() { // from class: com.twilio.voice.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onEvent$3(map);
                    }
                });
                break;
            default:
                this.handler.post(new Runnable() { // from class: com.twilio.voice.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.lambda$onEvent$4(map);
                    }
                });
                break;
        }
    }

    @Override // com.twilio.voice.Call.EventListener
    public void onMetric(final Map<String, Pair<String, Class>> map) {
        if (this.listener != null) {
            this.handler.post(new Runnable() { // from class: com.twilio.voice.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onMetric$5(map);
                }
            });
        }
        Pair<String, Class> pair = map.get(EventKeys.EVENT_GROUP);
        Objects.requireNonNull(pair);
        if (EventGroupType.CALL_QUALITY_STATS_GROUP.equals((String) pair.first)) {
            this.metricEventPayload = InsightsUtils.publishMetrics(InsightsUtils.createRtcSample(map), this.callSid, this.callDirection, this.metricEventPayload, this.eventPublisher);
        }
    }

    public void publishLoggerEvent() {
        InsightsUtils.publishLoggerEvent(this.eventPublisher, createEventPayloadBuilder().build());
    }

    public EventListenerProxy(Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher, CallInvite callInvite) {
        this(false, eventListener, handler, eventPublisher);
        this.calleeName = Utils.parseClientIdentity(callInvite.getTo());
        this.callSid = callInvite.getCallSid();
    }

    public EventListenerProxy(String str, boolean z, Call.EventListener eventListener, Handler handler, EventPublisher eventPublisher) {
        this.listener = eventListener;
        this.handler = handler;
        this.eventPublisher = eventPublisher;
        this.tempCallSid = str;
        this.selectedRegion = Voice.region;
        this.calleeName = null;
        this.isPreflight = z;
    }
}
