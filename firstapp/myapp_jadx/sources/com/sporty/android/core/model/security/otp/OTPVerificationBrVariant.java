package com.sporty.android.core.model.security.otp;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0004j\u0010\b\u0007\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/security/otp/OTPVerificationBrVariant;", "", "<init>", "(Ljava/lang/String;I)V", "DEFER_FACIAL", "Lcom/google/gson/annotations/SerializedName;", "value", "CONTROL", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum OTPVerificationBrVariant {
    DEFER_FACIAL,
    CONTROL;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<OTPVerificationBrVariant> getEntries() {
        return $ENTRIES;
    }
}
