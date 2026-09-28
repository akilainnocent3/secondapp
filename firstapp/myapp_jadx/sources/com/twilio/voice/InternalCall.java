package com.twilio.voice;

import android.content.Context;
import android.os.Handler;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
abstract class InternalCall implements EventPublisher.EventPublisherListener {
    private static final Logger logger = Logger.getLogger(InternalCall.class);
    String bridgeToken;
    String codecParams;
    Context context;
    Constants.Direction direction;
    boolean disconnectCalled;
    String from;
    String gateway;
    Handler handler;
    boolean isMuted;
    boolean isOnHold;
    private JSONArray payload;
    EventPublisher publisher;
    String region;
    String selectedCodec;
    String selectedRegion = Voice.region;
    String sid;
    Call.State state;
    final String tempCallSid;
    String to;
    private final UUID uuid;

    public InternalCall() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.uuid = uuidRandomUUID;
        this.tempCallSid = "TSID" + uuidRandomUUID;
    }

    public EventPayload.Builder createEventPayloadBuilder() {
        return new EventPayload.Builder().callSid(this.sid).tempCallSid(this.tempCallSid).direction(this.direction).selectedRegion(this.selectedRegion).gateway(this.gateway).region(this.region).productName(Constants.getClientSdkProductName()).clientName(Utils.parseClientIdentity(this.to)).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).preflight(Boolean.FALSE);
    }

    public EventPayload.Builder createEventPayloadBuilderForSettingsEvent() {
        return createEventPayloadBuilder().codecParams(this.codecParams).selectedCodec(this.selectedCodec);
    }

    public abstract void disconnect();

    public EventPublisher getPublisher() {
        return this.publisher;
    }

    public abstract String getSid();

    public abstract Call.State getState();

    public abstract boolean isMuted();

    public boolean isValidState() {
        return this.state != Call.State.DISCONNECTED;
    }

    public abstract void mute(boolean z);

    @Override // com.twilio.voice.EventPublisher.EventPublisherListener
    public void onError(VoiceException voiceException) {
        logger.e("Error publishing data : " + voiceException.getMessage() + ":" + voiceException.getErrorCode());
    }

    public void onSample(RTCStatsSample rTCStatsSample) {
        this.payload = InsightsUtils.publishMetrics(rTCStatsSample, this.sid, this.direction, this.payload, this.publisher);
    }

    public void publishFeedbackEvent(Call.Score score, Call.Issue issue) {
        EventPayload eventPayloadBuild;
        String str;
        logger.d("Publishing event feedback event");
        if (score == Call.Score.NOT_REPORTED && issue == Call.Issue.NOT_REPORTED) {
            eventPayloadBuild = createEventPayloadBuilder().build();
            str = "received-none";
        } else {
            eventPayloadBuild = createEventPayloadBuilder().score(score).issue(issue).build();
            str = "received";
        }
        try {
            JSONObject payload = eventPayloadBuild.getPayload();
            EventPublisher eventPublisher = this.publisher;
            Constants.SeverityLevel severityLevel = Constants.SeverityLevel.INFO;
            this.publisher.publish(severityLevel, EventGroupType.FEEDBACK_EVENT_GROUP, str, eventPublisher.createEvent(severityLevel, EventGroupType.FEEDBACK_EVENT_GROUP, str, payload));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public abstract void sendDigits(String str);

    public void setSid(String str) {
        this.sid = str;
    }
}
