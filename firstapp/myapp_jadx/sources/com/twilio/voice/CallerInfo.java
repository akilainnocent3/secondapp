package com.twilio.voice;

/* JADX INFO: loaded from: classes8.dex */
public class CallerInfo {
    private Boolean isVerified;

    public CallerInfo(String str) {
        Boolean boolValueOf = null;
        this.isVerified = null;
        if (str != null && !str.equals("null")) {
            boolValueOf = Boolean.valueOf(str.equals(VoiceConstants.TN_VALIDATION_PASSED_A));
        }
        this.isVerified = boolValueOf;
    }

    public Boolean isVerified() {
        return this.isVerified;
    }
}
