package com.sportybet.feature.recap.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ&\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapConfig;", "", "recapEnabled", "", "latestRecapYear", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getRecapEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "Lcom/google/gson/annotations/SerializedName;", "value", "enabled", "getLatestRecapYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapConfig;", "equals", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkRecapConfig {

    @SerializedName("latestRecapYear")
    private final Integer latestRecapYear;

    @SerializedName("enabled")
    private final Boolean recapEnabled;

    public NetworkRecapConfig(Boolean bool, Integer num) {
        this.recapEnabled = bool;
        this.latestRecapYear = num;
    }

    public static /* synthetic */ NetworkRecapConfig copy$default(NetworkRecapConfig networkRecapConfig, Boolean bool, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = networkRecapConfig.recapEnabled;
        }
        if ((i & 2) != 0) {
            num = networkRecapConfig.latestRecapYear;
        }
        return networkRecapConfig.copy(bool, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getRecapEnabled() {
        return this.recapEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLatestRecapYear() {
        return this.latestRecapYear;
    }

    public final NetworkRecapConfig copy(Boolean recapEnabled, Integer latestRecapYear) {
        return new NetworkRecapConfig(recapEnabled, latestRecapYear);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRecapConfig)) {
            return false;
        }
        NetworkRecapConfig networkRecapConfig = (NetworkRecapConfig) other;
        return Intrinsics.g(this.recapEnabled, networkRecapConfig.recapEnabled) && Intrinsics.g(this.latestRecapYear, networkRecapConfig.latestRecapYear);
    }

    public final Integer getLatestRecapYear() {
        return this.latestRecapYear;
    }

    public final Boolean getRecapEnabled() {
        return this.recapEnabled;
    }

    public int hashCode() {
        Boolean bool = this.recapEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.latestRecapYear;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "NetworkRecapConfig(recapEnabled=" + this.recapEnabled + oAudzpbdOhCI.AiQB + this.latestRecapYear + ")";
    }
}
