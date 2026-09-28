package com.twilio.voice;

import android.os.Handler;

/* JADX INFO: loaded from: classes8.dex */
public class CallMessageListenerProxy implements Call.CallMessageListener {
    private final Call.CallMessageListener callMessageListener;
    private Handler handler = Utils.createHandler();
    private final EventPublisher publisher;

    public CallMessageListenerProxy(EventPublisher eventPublisher, Call.CallMessageListener callMessageListener) {
        this.publisher = eventPublisher;
        this.callMessageListener = callMessageListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMessageFailure$2(String str, String str2, VoiceException voiceException) {
        this.callMessageListener.onMessageFailure(str, str2, voiceException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMessageReceived$0(String str, CallMessage callMessage) {
        this.callMessageListener.onMessageReceived(str, callMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMessageSent$1(String str, String str2) {
        this.callMessageListener.onMessageSent(str, str2);
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageFailure(final String str, final String str2, final VoiceException voiceException) {
        InsightsUtils.publishCallMessageSendFailedEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).voiceEventSid(str2).errorCode(Long.valueOf(voiceException.getErrorCode())).errorMessage(voiceException.getLocalizedMessage()).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: cv5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onMessageFailure$2(str, str2, voiceException);
                }
            });
        }
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageReceived(final String str, final CallMessage callMessage) {
        InsightsUtils.publishCallMessageReceivedEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).callMessageEventType(Constants.CallMessageEventType.RECEIVED).voiceEventSid(callMessage.getVoiceEventSID()).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: bv5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onMessageReceived$0(str, callMessage);
                }
            });
        }
    }

    @Override // com.twilio.voice.Call.CallMessageListener
    public void onMessageSent(final String str, final String str2) {
        InsightsUtils.publishCallMessageSentEvent(this.publisher, new EventPayload.Builder().productName(Constants.getClientSdkProductName()).callSid(str).payLoadType(Constants.APP_JSON_PAYLOAD_TYPE).callMessageEventType(Constants.CallMessageEventType.SENT).voiceEventSid(str2).build());
        if (this.callMessageListener != null) {
            this.handler.post(new Runnable() { // from class: av5
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.lambda$onMessageSent$1(str, str2);
                }
            });
        }
    }
}
