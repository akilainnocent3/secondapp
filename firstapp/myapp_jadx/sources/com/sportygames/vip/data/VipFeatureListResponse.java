package com.sportygames.vip.data;

import defpackage.mtg0;
import defpackage.ruw;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/sportygames/vip/data/VipFeatureListResponse;", "", "vipModeEnabled", "", "stakeSafeEnabled", "turboEnabled", "eliteEnabled", "lastHeroStandingEnabled", "<init>", "(ZZZZZ)V", "getVipModeEnabled", "()Z", "getStakeSafeEnabled", "getTurboEnabled", "getEliteEnabled", "getLastHeroStandingEnabled", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VipFeatureListResponse {
    public static final int $stable = 0;
    private final boolean eliteEnabled;
    private final boolean lastHeroStandingEnabled;
    private final boolean stakeSafeEnabled;
    private final boolean turboEnabled;
    private final boolean vipModeEnabled;

    public VipFeatureListResponse(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.vipModeEnabled = z;
        this.stakeSafeEnabled = z2;
        this.turboEnabled = z3;
        this.eliteEnabled = z4;
        this.lastHeroStandingEnabled = z5;
    }

    public static /* synthetic */ VipFeatureListResponse copy$default(VipFeatureListResponse vipFeatureListResponse, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = vipFeatureListResponse.vipModeEnabled;
        }
        if ((i & 2) != 0) {
            z2 = vipFeatureListResponse.stakeSafeEnabled;
        }
        if ((i & 4) != 0) {
            z3 = vipFeatureListResponse.turboEnabled;
        }
        if ((i & 8) != 0) {
            z4 = vipFeatureListResponse.eliteEnabled;
        }
        if ((i & 16) != 0) {
            z5 = vipFeatureListResponse.lastHeroStandingEnabled;
        }
        boolean z6 = z5;
        boolean z7 = z3;
        return vipFeatureListResponse.copy(z, z2, z7, z4, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVipModeEnabled() {
        return this.vipModeEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStakeSafeEnabled() {
        return this.stakeSafeEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getTurboEnabled() {
        return this.turboEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getEliteEnabled() {
        return this.eliteEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getLastHeroStandingEnabled() {
        return this.lastHeroStandingEnabled;
    }

    public final VipFeatureListResponse copy(boolean vipModeEnabled, boolean stakeSafeEnabled, boolean turboEnabled, boolean eliteEnabled, boolean lastHeroStandingEnabled) {
        return new VipFeatureListResponse(vipModeEnabled, stakeSafeEnabled, turboEnabled, eliteEnabled, lastHeroStandingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipFeatureListResponse)) {
            return false;
        }
        VipFeatureListResponse vipFeatureListResponse = (VipFeatureListResponse) other;
        return this.vipModeEnabled == vipFeatureListResponse.vipModeEnabled && this.stakeSafeEnabled == vipFeatureListResponse.stakeSafeEnabled && this.turboEnabled == vipFeatureListResponse.turboEnabled && this.eliteEnabled == vipFeatureListResponse.eliteEnabled && this.lastHeroStandingEnabled == vipFeatureListResponse.lastHeroStandingEnabled;
    }

    public final boolean getEliteEnabled() {
        return this.eliteEnabled;
    }

    public final boolean getLastHeroStandingEnabled() {
        return this.lastHeroStandingEnabled;
    }

    public final boolean getStakeSafeEnabled() {
        return this.stakeSafeEnabled;
    }

    public final boolean getTurboEnabled() {
        return this.turboEnabled;
    }

    public final boolean getVipModeEnabled() {
        return this.vipModeEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.lastHeroStandingEnabled) + mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.vipModeEnabled) * 31, 31, this.stakeSafeEnabled), 31, this.turboEnabled), 31, this.eliteEnabled);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VipFeatureListResponse(vipModeEnabled=");
        sb.append(this.vipModeEnabled);
        sb.append(", stakeSafeEnabled=");
        sb.append(this.stakeSafeEnabled);
        sb.append(", turboEnabled=");
        sb.append(this.turboEnabled);
        sb.append(", eliteEnabled=");
        sb.append(this.eliteEnabled);
        sb.append(", lastHeroStandingEnabled=");
        return ruw.a(sb, this.lastHeroStandingEnabled, ')');
    }
}
