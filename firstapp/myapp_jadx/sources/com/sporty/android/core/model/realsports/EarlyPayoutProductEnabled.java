package com.sporty.android.core.model.realsports;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/realsports/EarlyPayoutProductEnabled;", "", "preMatch", "", "live", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPreMatch", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLive", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/realsports/EarlyPayoutProductEnabled;", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutProductEnabled {
    private final Boolean live;
    private final Boolean preMatch;

    public /* synthetic */ EarlyPayoutProductEnabled(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }

    public static /* synthetic */ EarlyPayoutProductEnabled copy$default(EarlyPayoutProductEnabled earlyPayoutProductEnabled, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = earlyPayoutProductEnabled.preMatch;
        }
        if ((i & 2) != 0) {
            bool2 = earlyPayoutProductEnabled.live;
        }
        return earlyPayoutProductEnabled.copy(bool, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getPreMatch() {
        return this.preMatch;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getLive() {
        return this.live;
    }

    public final EarlyPayoutProductEnabled copy(Boolean preMatch, Boolean live) {
        return new EarlyPayoutProductEnabled(preMatch, live);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayoutProductEnabled)) {
            return false;
        }
        EarlyPayoutProductEnabled earlyPayoutProductEnabled = (EarlyPayoutProductEnabled) other;
        return Intrinsics.g(this.preMatch, earlyPayoutProductEnabled.preMatch) && Intrinsics.g(this.live, earlyPayoutProductEnabled.live);
    }

    public final Boolean getLive() {
        return this.live;
    }

    public final Boolean getPreMatch() {
        return this.preMatch;
    }

    public int hashCode() {
        Boolean bool = this.preMatch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.live;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        return "EarlyPayoutProductEnabled(preMatch=" + this.preMatch + ", live=" + this.live + ")";
    }

    public EarlyPayoutProductEnabled(Boolean bool, Boolean bool2) {
        this.preMatch = bool;
        this.live = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarlyPayoutProductEnabled() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
