package com.sporty.android.platform.features.newotp.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/platform/features/newotp/model/OtpAuthenticationData;", "", "otpSelectionGroup", "Lcom/sporty/android/platform/features/newotp/model/OtpSelectionGroup;", "sessionToken", "", "<init>", "(Lcom/sporty/android/platform/features/newotp/model/OtpSelectionGroup;Ljava/lang/String;)V", "getOtpSelectionGroup", "()Lcom/sporty/android/platform/features/newotp/model/OtpSelectionGroup;", "getSessionToken", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpAuthenticationData {
    public static final int $stable = 0;
    private final OtpSelectionGroup otpSelectionGroup;
    private final String sessionToken;

    public OtpAuthenticationData(OtpSelectionGroup otpSelectionGroup, String str) {
        otpSelectionGroup.getClass();
        str.getClass();
        this.otpSelectionGroup = otpSelectionGroup;
        this.sessionToken = str;
    }

    public static /* synthetic */ OtpAuthenticationData copy$default(OtpAuthenticationData otpAuthenticationData, OtpSelectionGroup otpSelectionGroup, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            otpSelectionGroup = otpAuthenticationData.otpSelectionGroup;
        }
        if ((i & 2) != 0) {
            str = otpAuthenticationData.sessionToken;
        }
        return otpAuthenticationData.copy(otpSelectionGroup, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final OtpSelectionGroup getOtpSelectionGroup() {
        return this.otpSelectionGroup;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final OtpAuthenticationData copy(OtpSelectionGroup otpSelectionGroup, String sessionToken) {
        otpSelectionGroup.getClass();
        sessionToken.getClass();
        return new OtpAuthenticationData(otpSelectionGroup, sessionToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpAuthenticationData)) {
            return false;
        }
        OtpAuthenticationData otpAuthenticationData = (OtpAuthenticationData) other;
        return Intrinsics.g(this.otpSelectionGroup, otpAuthenticationData.otpSelectionGroup) && Intrinsics.g(this.sessionToken, otpAuthenticationData.sessionToken);
    }

    public final OtpSelectionGroup getOtpSelectionGroup() {
        return this.otpSelectionGroup;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public int hashCode() {
        return this.sessionToken.hashCode() + (this.otpSelectionGroup.hashCode() * 31);
    }

    public String toString() {
        return "OtpAuthenticationData(otpSelectionGroup=" + this.otpSelectionGroup + ", sessionToken=" + this.sessionToken + ")";
    }
}
