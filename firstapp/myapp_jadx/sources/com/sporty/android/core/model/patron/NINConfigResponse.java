package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007Ê\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/patron/NINConfigResponse;", "", "isNameUpdateConfigOn", "", "isVerificationConfigOn", "<init>", "(ZZ)V", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "ninNameUpdateConfig", "ninVerificationConfig", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NINConfigResponse {

    @SerializedName("ninNameUpdateConfig")
    private final boolean isNameUpdateConfigOn;

    @SerializedName("ninVerificationConfig")
    private final boolean isVerificationConfigOn;

    public NINConfigResponse(boolean z, boolean z2) {
        this.isNameUpdateConfigOn = z;
        this.isVerificationConfigOn = z2;
    }

    public static /* synthetic */ NINConfigResponse copy$default(NINConfigResponse nINConfigResponse, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nINConfigResponse.isNameUpdateConfigOn;
        }
        if ((i & 2) != 0) {
            z2 = nINConfigResponse.isVerificationConfigOn;
        }
        return nINConfigResponse.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNameUpdateConfigOn() {
        return this.isNameUpdateConfigOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsVerificationConfigOn() {
        return this.isVerificationConfigOn;
    }

    public final NINConfigResponse copy(boolean isNameUpdateConfigOn, boolean isVerificationConfigOn) {
        return new NINConfigResponse(isNameUpdateConfigOn, isVerificationConfigOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NINConfigResponse)) {
            return false;
        }
        NINConfigResponse nINConfigResponse = (NINConfigResponse) other;
        return this.isNameUpdateConfigOn == nINConfigResponse.isNameUpdateConfigOn && this.isVerificationConfigOn == nINConfigResponse.isVerificationConfigOn;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isVerificationConfigOn) + (Boolean.hashCode(this.isNameUpdateConfigOn) * 31);
    }

    public final boolean isNameUpdateConfigOn() {
        return this.isNameUpdateConfigOn;
    }

    public final boolean isVerificationConfigOn() {
        return this.isVerificationConfigOn;
    }

    public String toString() {
        return "NINConfigResponse(isNameUpdateConfigOn=" + this.isNameUpdateConfigOn + ", isVerificationConfigOn=" + this.isVerificationConfigOn + ")";
    }
}
