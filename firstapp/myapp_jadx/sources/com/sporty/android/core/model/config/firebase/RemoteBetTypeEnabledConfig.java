package com.sporty.android.core.model.config.firebase;

import com.google.gson.annotations.SerializedName;
import defpackage.tzx;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/config/firebase/RemoteBetTypeEnabledConfig;", "", "betType", "", "enabled", "", "<init>", "(Ljava/lang/String;Z)V", "getBetType", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getEnabled", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemoteBetTypeEnabledConfig {

    @SerializedName("betType")
    private final String betType;

    @SerializedName("enabled")
    private final boolean enabled;

    public RemoteBetTypeEnabledConfig(String str, boolean z) {
        str.getClass();
        this.betType = str;
        this.enabled = z;
    }

    public static /* synthetic */ RemoteBetTypeEnabledConfig copy$default(RemoteBetTypeEnabledConfig remoteBetTypeEnabledConfig, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteBetTypeEnabledConfig.betType;
        }
        if ((i & 2) != 0) {
            z = remoteBetTypeEnabledConfig.enabled;
        }
        return remoteBetTypeEnabledConfig.copy(str, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final RemoteBetTypeEnabledConfig copy(String betType, boolean enabled) {
        betType.getClass();
        return new RemoteBetTypeEnabledConfig(betType, enabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteBetTypeEnabledConfig)) {
            return false;
        }
        RemoteBetTypeEnabledConfig remoteBetTypeEnabledConfig = (RemoteBetTypeEnabledConfig) other;
        return Intrinsics.g(this.betType, remoteBetTypeEnabledConfig.betType) && this.enabled == remoteBetTypeEnabledConfig.enabled;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.enabled) + (this.betType.hashCode() * 31);
    }

    public String toString() {
        return tzx.a("RemoteBetTypeEnabledConfig(betType=", this.betType, ", enabled=", ")", this.enabled);
    }
}
