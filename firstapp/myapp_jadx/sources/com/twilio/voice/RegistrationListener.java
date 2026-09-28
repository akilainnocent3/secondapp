package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public interface RegistrationListener {
    void onError(RegistrationException registrationException, String str, String str2);

    void onRegistered(String str, String str2);
}
