package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public interface UnregistrationListener {
    void onError(RegistrationException registrationException, String str, String str2);

    void onUnregistered(String str, String str2);
}
