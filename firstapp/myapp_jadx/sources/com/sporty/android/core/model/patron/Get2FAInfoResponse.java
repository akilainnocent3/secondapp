package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import defpackage.cwz;
import defpackage.mtg0;
import defpackage.zk1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR%\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/patron/Get2FAInfoResponse;", "", "enable", "", "checkNewDeviceEnable", "checkNotLoginDays", "", "<init>", "(ZZI)V", "getEnable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getCheckNewDeviceEnable", "getCheckNotLoginDays", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Get2FAInfoResponse {

    @SerializedName("checkNewDeviceEnable")
    private final boolean checkNewDeviceEnable;

    @SerializedName("checkNotLoginDays")
    private final int checkNotLoginDays;

    @SerializedName("enable")
    private final boolean enable;

    public Get2FAInfoResponse(boolean z, boolean z2, int i) {
        this.enable = z;
        this.checkNewDeviceEnable = z2;
        this.checkNotLoginDays = i;
    }

    public static /* synthetic */ Get2FAInfoResponse copy$default(Get2FAInfoResponse get2FAInfoResponse, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = get2FAInfoResponse.enable;
        }
        if ((i2 & 2) != 0) {
            z2 = get2FAInfoResponse.checkNewDeviceEnable;
        }
        if ((i2 & 4) != 0) {
            i = get2FAInfoResponse.checkNotLoginDays;
        }
        return get2FAInfoResponse.copy(z, z2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCheckNewDeviceEnable() {
        return this.checkNewDeviceEnable;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCheckNotLoginDays() {
        return this.checkNotLoginDays;
    }

    public final Get2FAInfoResponse copy(boolean enable, boolean checkNewDeviceEnable, int checkNotLoginDays) {
        return new Get2FAInfoResponse(enable, checkNewDeviceEnable, checkNotLoginDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Get2FAInfoResponse)) {
            return false;
        }
        Get2FAInfoResponse get2FAInfoResponse = (Get2FAInfoResponse) other;
        return this.enable == get2FAInfoResponse.enable && this.checkNewDeviceEnable == get2FAInfoResponse.checkNewDeviceEnable && this.checkNotLoginDays == get2FAInfoResponse.checkNotLoginDays;
    }

    public final boolean getCheckNewDeviceEnable() {
        return this.checkNewDeviceEnable;
    }

    public final int getCheckNotLoginDays() {
        return this.checkNotLoginDays;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        return Integer.hashCode(this.checkNotLoginDays) + mtg0.a(Boolean.hashCode(this.enable) * 31, 31, this.checkNewDeviceEnable);
    }

    public String toString() {
        return zk1.a(this.checkNotLoginDays, ")", cwz.a("Get2FAInfoResponse(enable=", ", checkNewDeviceEnable=", ", checkNotLoginDays=", this.enable, this.checkNewDeviceEnable));
    }
}
