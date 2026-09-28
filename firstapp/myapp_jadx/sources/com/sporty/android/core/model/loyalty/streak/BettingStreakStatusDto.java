package com.sporty.android.core.model.loyalty.streak;

import defpackage.cwz;
import defpackage.mtg0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/loyalty/streak/BettingStreakStatusDto;", "", "showNewBadge", "", "showStreakAlertNewBadge", "enabled", "currentStreakDays", "", "<init>", "(ZZZI)V", "getShowNewBadge", "()Z", "getShowStreakAlertNewBadge", "getEnabled", "getCurrentStreakDays", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakStatusDto {
    private final int currentStreakDays;
    private final boolean enabled;
    private final boolean showNewBadge;
    private final boolean showStreakAlertNewBadge;

    public BettingStreakStatusDto(boolean z, boolean z2, boolean z3, int i) {
        this.showNewBadge = z;
        this.showStreakAlertNewBadge = z2;
        this.enabled = z3;
        this.currentStreakDays = i;
    }

    public static /* synthetic */ BettingStreakStatusDto copy$default(BettingStreakStatusDto bettingStreakStatusDto, boolean z, boolean z2, boolean z3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bettingStreakStatusDto.showNewBadge;
        }
        if ((i2 & 2) != 0) {
            z2 = bettingStreakStatusDto.showStreakAlertNewBadge;
        }
        if ((i2 & 4) != 0) {
            z3 = bettingStreakStatusDto.enabled;
        }
        if ((i2 & 8) != 0) {
            i = bettingStreakStatusDto.currentStreakDays;
        }
        return bettingStreakStatusDto.copy(z, z2, z3, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowStreakAlertNewBadge() {
        return this.showStreakAlertNewBadge;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    public final BettingStreakStatusDto copy(boolean showNewBadge, boolean showStreakAlertNewBadge, boolean enabled, int currentStreakDays) {
        return new BettingStreakStatusDto(showNewBadge, showStreakAlertNewBadge, enabled, currentStreakDays);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakStatusDto)) {
            return false;
        }
        BettingStreakStatusDto bettingStreakStatusDto = (BettingStreakStatusDto) other;
        return this.showNewBadge == bettingStreakStatusDto.showNewBadge && this.showStreakAlertNewBadge == bettingStreakStatusDto.showStreakAlertNewBadge && this.enabled == bettingStreakStatusDto.enabled && this.currentStreakDays == bettingStreakStatusDto.currentStreakDays;
    }

    public final int getCurrentStreakDays() {
        return this.currentStreakDays;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getShowNewBadge() {
        return this.showNewBadge;
    }

    public final boolean getShowStreakAlertNewBadge() {
        return this.showStreakAlertNewBadge;
    }

    public int hashCode() {
        return Integer.hashCode(this.currentStreakDays) + mtg0.a(mtg0.a(Boolean.hashCode(this.showNewBadge) * 31, 31, this.showStreakAlertNewBadge), 31, this.enabled);
    }

    public String toString() {
        boolean z = this.showNewBadge;
        boolean z2 = this.showStreakAlertNewBadge;
        boolean z3 = this.enabled;
        int i = this.currentStreakDays;
        StringBuilder sbA = cwz.a("BettingStreakStatusDto(showNewBadge=", ", showStreakAlertNewBadge=", ", enabled=", z, z2);
        sbA.append(z3);
        sbA.append(", currentStreakDays=");
        sbA.append(i);
        sbA.append(")");
        return sbA.toString();
    }
}
