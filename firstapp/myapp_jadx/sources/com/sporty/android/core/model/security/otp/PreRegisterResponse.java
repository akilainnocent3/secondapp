package com.sporty.android.core.model.security.otp;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/security/otp/PreRegisterResponse;", "", "ignoreVerificationCode", "", "<init>", "(Ljava/lang/Boolean;)V", "getIgnoreVerificationCode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "(Ljava/lang/Boolean;)Lcom/sporty/android/core/model/security/otp/PreRegisterResponse;", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreRegisterResponse {

    @SerializedName("ignoreVerificationCode")
    private final Boolean ignoreVerificationCode;

    public PreRegisterResponse(Boolean bool) {
        this.ignoreVerificationCode = bool;
    }

    public static /* synthetic */ PreRegisterResponse copy$default(PreRegisterResponse preRegisterResponse, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = preRegisterResponse.ignoreVerificationCode;
        }
        return preRegisterResponse.copy(bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIgnoreVerificationCode() {
        return this.ignoreVerificationCode;
    }

    public final PreRegisterResponse copy(Boolean ignoreVerificationCode) {
        return new PreRegisterResponse(ignoreVerificationCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PreRegisterResponse) && Intrinsics.g(this.ignoreVerificationCode, ((PreRegisterResponse) other).ignoreVerificationCode);
    }

    public final Boolean getIgnoreVerificationCode() {
        return this.ignoreVerificationCode;
    }

    public int hashCode() {
        Boolean bool = this.ignoreVerificationCode;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "PreRegisterResponse(ignoreVerificationCode=" + this.ignoreVerificationCode + ")";
    }
}
