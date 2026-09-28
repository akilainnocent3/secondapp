package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
interface RegistrarListener {
    void onError(RegistrationException registrationException);

    void onSuccess(String str);
}
