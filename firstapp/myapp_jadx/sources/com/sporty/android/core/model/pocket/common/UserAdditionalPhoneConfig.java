package com.sporty.android.core.model.pocket.common;

import defpackage.gpp;
import defpackage.mq0;
import defpackage.zug0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u0018¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/UserAdditionalPhoneConfig;", "", "enabled", "", "maxCount", "", "primaryPhoneOtpVerificationRequired", "<init>", "(ZIZ)V", "getEnabled", "()Z", "getMaxCount", "()I", "getPrimaryPhoneOtpVerificationRequired", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UserAdditionalPhoneConfig {
    private final boolean enabled;
    private final int maxCount;
    private final boolean primaryPhoneOtpVerificationRequired;

    public UserAdditionalPhoneConfig(boolean z, int i, boolean z2) {
        this.enabled = z;
        this.maxCount = i;
        this.primaryPhoneOtpVerificationRequired = z2;
    }

    public static /* synthetic */ UserAdditionalPhoneConfig copy$default(UserAdditionalPhoneConfig userAdditionalPhoneConfig, boolean z, int i, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = userAdditionalPhoneConfig.enabled;
        }
        if ((i2 & 2) != 0) {
            i = userAdditionalPhoneConfig.maxCount;
        }
        if ((i2 & 4) != 0) {
            z2 = userAdditionalPhoneConfig.primaryPhoneOtpVerificationRequired;
        }
        return userAdditionalPhoneConfig.copy(z, i, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxCount() {
        return this.maxCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPrimaryPhoneOtpVerificationRequired() {
        return this.primaryPhoneOtpVerificationRequired;
    }

    public final UserAdditionalPhoneConfig copy(boolean enabled, int maxCount, boolean primaryPhoneOtpVerificationRequired) {
        return new UserAdditionalPhoneConfig(enabled, maxCount, primaryPhoneOtpVerificationRequired);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdditionalPhoneConfig)) {
            return false;
        }
        UserAdditionalPhoneConfig userAdditionalPhoneConfig = (UserAdditionalPhoneConfig) other;
        return this.enabled == userAdditionalPhoneConfig.enabled && this.maxCount == userAdditionalPhoneConfig.maxCount && this.primaryPhoneOtpVerificationRequired == userAdditionalPhoneConfig.primaryPhoneOtpVerificationRequired;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxCount() {
        return this.maxCount;
    }

    public final boolean getPrimaryPhoneOtpVerificationRequired() {
        return this.primaryPhoneOtpVerificationRequired;
    }

    public int hashCode() {
        return Boolean.hashCode(this.primaryPhoneOtpVerificationRequired) + gpp.a(this.maxCount, Boolean.hashCode(this.enabled) * 31, 31);
    }

    public String toString() {
        boolean z = this.enabled;
        int i = this.maxCount;
        return mq0.a(zug0.a("UserAdditionalPhoneConfig(enabled=", ", maxCount=", ", primaryPhoneOtpVerificationRequired=", i, z), this.primaryPhoneOtpVerificationRequired, ")");
    }
}
