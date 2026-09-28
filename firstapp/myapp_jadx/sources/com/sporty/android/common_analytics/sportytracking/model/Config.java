package com.sporty.android.common_analytics.sportytracking.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/common_analytics/sportytracking/model/Config;", "", "auto_remove_suspended", "", "auto_accept_odds_change", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getAuto_remove_suspended", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAuto_accept_odds_change", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/common_analytics/sportytracking/model/Config;", "equals", "other", "hashCode", "", "toString", "", "common-analytics", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Config {
    private final Boolean auto_accept_odds_change;
    private final Boolean auto_remove_suspended;

    public /* synthetic */ Config(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }

    public static /* synthetic */ Config copy$default(Config config, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = config.auto_remove_suspended;
        }
        if ((i & 2) != 0) {
            bool2 = config.auto_accept_odds_change;
        }
        return config.copy(bool, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAuto_remove_suspended() {
        return this.auto_remove_suspended;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAuto_accept_odds_change() {
        return this.auto_accept_odds_change;
    }

    public final Config copy(Boolean auto_remove_suspended, Boolean auto_accept_odds_change) {
        return new Config(auto_remove_suspended, auto_accept_odds_change);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Config)) {
            return false;
        }
        Config config = (Config) other;
        return Intrinsics.g(this.auto_remove_suspended, config.auto_remove_suspended) && Intrinsics.g(this.auto_accept_odds_change, config.auto_accept_odds_change);
    }

    public final Boolean getAuto_accept_odds_change() {
        return this.auto_accept_odds_change;
    }

    public final Boolean getAuto_remove_suspended() {
        return this.auto_remove_suspended;
    }

    public int hashCode() {
        Boolean bool = this.auto_remove_suspended;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.auto_accept_odds_change;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "Config(auto_remove_suspended=" + this.auto_remove_suspended + ", auto_accept_odds_change=" + this.auto_accept_odds_change + ")";
    }

    public Config(Boolean bool, Boolean bool2) {
        this.auto_remove_suspended = bool;
        this.auto_accept_odds_change = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Config() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
