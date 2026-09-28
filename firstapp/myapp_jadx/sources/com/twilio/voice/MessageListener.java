package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public interface MessageListener {
    void onCallInvite(CallInvite callInvite);

    void onCancelledCallInvite(CancelledCallInvite cancelledCallInvite, CallException callException);
}
