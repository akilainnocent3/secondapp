package com.sportybet.plugin.realsports.prematch.data;

import defpackage.cwz;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.nng;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JY\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001f\u001a\u00020\u00032\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eÊ\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/EarlyPayoutCapability;", "", "haveOneUpMarket", "", "haveActiveOneUpMarket", "haveTwoUpMarket", "haveActiveTwoUpMarket", "haveDCOneUpMarket", "haveActiveDCOneUpMarket", "haveOUEarlyGoalsMarket", "haveActiveOUEarlyGoalsMarket", "<init>", "(ZZZZZZZZ)V", "getHaveOneUpMarket", "()Z", "getHaveActiveOneUpMarket", "getHaveTwoUpMarket", "getHaveActiveTwoUpMarket", "getHaveDCOneUpMarket", "getHaveActiveDCOneUpMarket", "getHaveOUEarlyGoalsMarket", "getHaveActiveOUEarlyGoalsMarket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EarlyPayoutCapability {
    public static final int $stable = 0;
    private final boolean haveActiveDCOneUpMarket;
    private final boolean haveActiveOUEarlyGoalsMarket;
    private final boolean haveActiveOneUpMarket;
    private final boolean haveActiveTwoUpMarket;
    private final boolean haveDCOneUpMarket;
    private final boolean haveOUEarlyGoalsMarket;
    private final boolean haveOneUpMarket;
    private final boolean haveTwoUpMarket;

    public EarlyPayoutCapability(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.haveOneUpMarket = z;
        this.haveActiveOneUpMarket = z2;
        this.haveTwoUpMarket = z3;
        this.haveActiveTwoUpMarket = z4;
        this.haveDCOneUpMarket = z5;
        this.haveActiveDCOneUpMarket = z6;
        this.haveOUEarlyGoalsMarket = z7;
        this.haveActiveOUEarlyGoalsMarket = z8;
    }

    public static /* synthetic */ EarlyPayoutCapability copy$default(EarlyPayoutCapability earlyPayoutCapability, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z = earlyPayoutCapability.haveOneUpMarket;
        }
        if ((i & 2) != 0) {
            z2 = earlyPayoutCapability.haveActiveOneUpMarket;
        }
        if ((i & 4) != 0) {
            z3 = earlyPayoutCapability.haveTwoUpMarket;
        }
        if ((i & 8) != 0) {
            z4 = earlyPayoutCapability.haveActiveTwoUpMarket;
        }
        if ((i & 16) != 0) {
            z5 = earlyPayoutCapability.haveDCOneUpMarket;
        }
        if ((i & 32) != 0) {
            z6 = earlyPayoutCapability.haveActiveDCOneUpMarket;
        }
        if ((i & 64) != 0) {
            z7 = earlyPayoutCapability.haveOUEarlyGoalsMarket;
        }
        if ((i & 128) != 0) {
            z8 = earlyPayoutCapability.haveActiveOUEarlyGoalsMarket;
        }
        boolean z9 = z7;
        boolean z10 = z8;
        boolean z11 = z5;
        boolean z12 = z6;
        return earlyPayoutCapability.copy(z, z2, z3, z4, z11, z12, z9, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    public final EarlyPayoutCapability copy(boolean haveOneUpMarket, boolean haveActiveOneUpMarket, boolean haveTwoUpMarket, boolean haveActiveTwoUpMarket, boolean haveDCOneUpMarket, boolean haveActiveDCOneUpMarket, boolean haveOUEarlyGoalsMarket, boolean haveActiveOUEarlyGoalsMarket) {
        return new EarlyPayoutCapability(haveOneUpMarket, haveActiveOneUpMarket, haveTwoUpMarket, haveActiveTwoUpMarket, haveDCOneUpMarket, haveActiveDCOneUpMarket, haveOUEarlyGoalsMarket, haveActiveOUEarlyGoalsMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarlyPayoutCapability)) {
            return false;
        }
        EarlyPayoutCapability earlyPayoutCapability = (EarlyPayoutCapability) other;
        return this.haveOneUpMarket == earlyPayoutCapability.haveOneUpMarket && this.haveActiveOneUpMarket == earlyPayoutCapability.haveActiveOneUpMarket && this.haveTwoUpMarket == earlyPayoutCapability.haveTwoUpMarket && this.haveActiveTwoUpMarket == earlyPayoutCapability.haveActiveTwoUpMarket && this.haveDCOneUpMarket == earlyPayoutCapability.haveDCOneUpMarket && this.haveActiveDCOneUpMarket == earlyPayoutCapability.haveActiveDCOneUpMarket && this.haveOUEarlyGoalsMarket == earlyPayoutCapability.haveOUEarlyGoalsMarket && this.haveActiveOUEarlyGoalsMarket == earlyPayoutCapability.haveActiveOUEarlyGoalsMarket;
    }

    public final boolean getHaveActiveDCOneUpMarket() {
        return this.haveActiveDCOneUpMarket;
    }

    public final boolean getHaveActiveOUEarlyGoalsMarket() {
        return this.haveActiveOUEarlyGoalsMarket;
    }

    public final boolean getHaveActiveOneUpMarket() {
        return this.haveActiveOneUpMarket;
    }

    public final boolean getHaveActiveTwoUpMarket() {
        return this.haveActiveTwoUpMarket;
    }

    public final boolean getHaveDCOneUpMarket() {
        return this.haveDCOneUpMarket;
    }

    public final boolean getHaveOUEarlyGoalsMarket() {
        return this.haveOUEarlyGoalsMarket;
    }

    public final boolean getHaveOneUpMarket() {
        return this.haveOneUpMarket;
    }

    public final boolean getHaveTwoUpMarket() {
        return this.haveTwoUpMarket;
    }

    public int hashCode() {
        return Boolean.hashCode(this.haveActiveOUEarlyGoalsMarket) + mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.haveOneUpMarket) * 31, 31, this.haveActiveOneUpMarket), 31, this.haveTwoUpMarket), 31, this.haveActiveTwoUpMarket), 31, this.haveDCOneUpMarket), 31, this.haveActiveDCOneUpMarket), 31, this.haveOUEarlyGoalsMarket);
    }

    public String toString() {
        boolean z = this.haveOneUpMarket;
        boolean z2 = this.haveActiveOneUpMarket;
        boolean z3 = this.haveTwoUpMarket;
        boolean z4 = this.haveActiveTwoUpMarket;
        boolean z5 = this.haveDCOneUpMarket;
        boolean z6 = this.haveActiveDCOneUpMarket;
        boolean z7 = this.haveOUEarlyGoalsMarket;
        boolean z8 = this.haveActiveOUEarlyGoalsMarket;
        StringBuilder sbA = cwz.a("EarlyPayoutCapability(haveOneUpMarket=", ", haveActiveOneUpMarket=", ", haveTwoUpMarket=", z, z2);
        nng.a(", haveActiveTwoUpMarket=", ", haveDCOneUpMarket=", sbA, z3, z4);
        nng.a(", haveActiveDCOneUpMarket=", ", haveOUEarlyGoalsMarket=", sbA, z5, z6);
        return lng.a(", haveActiveOUEarlyGoalsMarket=", ")", sbA, z7, z8);
    }
}
