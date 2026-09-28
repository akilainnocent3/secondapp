package com.sportybet.android.instantwin.newtork.model.response.penalty;

import com.google.gson.annotations.SerializedName;
import defpackage.b6c;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/penalty/NetworkSportyPenaltyOverallConfig;", "", "active", "", "<init>", "(Z)V", "getActive", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkSportyPenaltyOverallConfig {
    public static final int $stable = 0;

    @SerializedName("active")
    private final boolean active;

    public NetworkSportyPenaltyOverallConfig(boolean z) {
        this.active = z;
    }

    public static /* synthetic */ NetworkSportyPenaltyOverallConfig copy$default(NetworkSportyPenaltyOverallConfig networkSportyPenaltyOverallConfig, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkSportyPenaltyOverallConfig.active;
        }
        return networkSportyPenaltyOverallConfig.copy(z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    public final NetworkSportyPenaltyOverallConfig copy(boolean active) {
        return new NetworkSportyPenaltyOverallConfig(active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NetworkSportyPenaltyOverallConfig) && this.active == ((NetworkSportyPenaltyOverallConfig) other).active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public int hashCode() {
        return Boolean.hashCode(this.active);
    }

    public String toString() {
        return b6c.a("NetworkSportyPenaltyOverallConfig(active=", ")", this.active);
    }
}
