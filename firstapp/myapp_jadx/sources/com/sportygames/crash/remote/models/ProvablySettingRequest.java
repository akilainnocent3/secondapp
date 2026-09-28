package com.sportygames.crash.remote.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Lcom/sportygames/crash/remote/models/ProvablySettingRequest;", "", "isSeedRandom", "", "manualClientSeed", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "setSeedRandom", "(Z)V", "getManualClientSeed", "()Ljava/lang/String;", "setManualClientSeed", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProvablySettingRequest {
    public static final int $stable = 8;
    private boolean isSeedRandom;
    private String manualClientSeed;

    public ProvablySettingRequest(boolean z, String str) {
        this.isSeedRandom = z;
        this.manualClientSeed = str;
    }

    public static /* synthetic */ ProvablySettingRequest copy$default(ProvablySettingRequest provablySettingRequest, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = provablySettingRequest.isSeedRandom;
        }
        if ((i & 2) != 0) {
            str = provablySettingRequest.manualClientSeed;
        }
        return provablySettingRequest.copy(z, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSeedRandom() {
        return this.isSeedRandom;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getManualClientSeed() {
        return this.manualClientSeed;
    }

    public final ProvablySettingRequest copy(boolean isSeedRandom, String manualClientSeed) {
        return new ProvablySettingRequest(isSeedRandom, manualClientSeed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProvablySettingRequest)) {
            return false;
        }
        ProvablySettingRequest provablySettingRequest = (ProvablySettingRequest) other;
        return this.isSeedRandom == provablySettingRequest.isSeedRandom && Intrinsics.g(this.manualClientSeed, provablySettingRequest.manualClientSeed);
    }

    public final String getManualClientSeed() {
        return this.manualClientSeed;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isSeedRandom) * 31;
        String str = this.manualClientSeed;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isSeedRandom() {
        return this.isSeedRandom;
    }

    public final void setManualClientSeed(String str) {
        this.manualClientSeed = str;
    }

    public final void setSeedRandom(boolean z) {
        this.isSeedRandom = z;
    }

    public String toString() {
        return "ProvablySettingRequest(isSeedRandom=" + this.isSeedRandom + ", manualClientSeed=" + this.manualClientSeed + ")";
    }
}
