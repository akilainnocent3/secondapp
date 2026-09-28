package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/patron/Send2FACodeResponse;", "", "remainSendTimes", "", "maxSendTimes", "<init>", "(II)V", "getRemainSendTimes", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getMaxSendTimes", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Send2FACodeResponse {

    @SerializedName("maxSendTimes")
    private final int maxSendTimes;

    @SerializedName("remainSendTimes")
    private final int remainSendTimes;

    public Send2FACodeResponse(int i, int i2) {
        this.remainSendTimes = i;
        this.maxSendTimes = i2;
    }

    public static /* synthetic */ Send2FACodeResponse copy$default(Send2FACodeResponse send2FACodeResponse, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = send2FACodeResponse.remainSendTimes;
        }
        if ((i3 & 2) != 0) {
            i2 = send2FACodeResponse.maxSendTimes;
        }
        return send2FACodeResponse.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRemainSendTimes() {
        return this.remainSendTimes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxSendTimes() {
        return this.maxSendTimes;
    }

    public final Send2FACodeResponse copy(int remainSendTimes, int maxSendTimes) {
        return new Send2FACodeResponse(remainSendTimes, maxSendTimes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Send2FACodeResponse)) {
            return false;
        }
        Send2FACodeResponse send2FACodeResponse = (Send2FACodeResponse) other;
        return this.remainSendTimes == send2FACodeResponse.remainSendTimes && this.maxSendTimes == send2FACodeResponse.maxSendTimes;
    }

    public final int getMaxSendTimes() {
        return this.maxSendTimes;
    }

    public final int getRemainSendTimes() {
        return this.remainSendTimes;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxSendTimes) + (Integer.hashCode(this.remainSendTimes) * 31);
    }

    public String toString() {
        return n36.a("Send2FACodeResponse(remainSendTimes=", this.remainSendTimes, this.maxSendTimes, ", maxSendTimes=", ")");
    }
}
