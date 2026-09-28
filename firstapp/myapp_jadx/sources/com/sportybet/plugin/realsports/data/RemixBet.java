package com.sportybet.plugin.realsports.data;

import defpackage.cwz;
import defpackage.mtg0;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/RemixBet;", "", "isWon", "", "shouldShowRedDot", "winningStatus", "", "<init>", "(ZZI)V", "()Z", "getShouldShowRedDot", "getWinningStatus", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBet {
    public static final int $stable = 0;
    private final boolean isWon;
    private final boolean shouldShowRedDot;
    private final int winningStatus;

    public RemixBet(boolean z, boolean z2, int i) {
        this.isWon = z;
        this.shouldShowRedDot = z2;
        this.winningStatus = i;
    }

    public static /* synthetic */ RemixBet copy$default(RemixBet remixBet, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = remixBet.isWon;
        }
        if ((i2 & 2) != 0) {
            z2 = remixBet.shouldShowRedDot;
        }
        if ((i2 & 4) != 0) {
            i = remixBet.winningStatus;
        }
        return remixBet.copy(z, z2, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsWon() {
        return this.isWon;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShouldShowRedDot() {
        return this.shouldShowRedDot;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWinningStatus() {
        return this.winningStatus;
    }

    public final RemixBet copy(boolean isWon, boolean shouldShowRedDot, int winningStatus) {
        return new RemixBet(isWon, shouldShowRedDot, winningStatus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixBet)) {
            return false;
        }
        RemixBet remixBet = (RemixBet) other;
        return this.isWon == remixBet.isWon && this.shouldShowRedDot == remixBet.shouldShowRedDot && this.winningStatus == remixBet.winningStatus;
    }

    public final boolean getShouldShowRedDot() {
        return this.shouldShowRedDot;
    }

    public final int getWinningStatus() {
        return this.winningStatus;
    }

    public int hashCode() {
        return Integer.hashCode(this.winningStatus) + mtg0.a(Boolean.hashCode(this.isWon) * 31, 31, this.shouldShowRedDot);
    }

    public final boolean isWon() {
        return this.isWon;
    }

    public String toString() {
        return zk1.a(this.winningStatus, ")", cwz.a("RemixBet(isWon=", ", shouldShowRedDot=", ", winningStatus=", this.isWon, this.shouldShowRedDot));
    }

    public /* synthetic */ RemixBet(boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, (i2 & 4) != 0 ? 0 : i);
    }
}
