package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.mq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR%\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabUserGrabAvailable;", "", "grabAvailable", "", "cashBetThreshold", "", "remainingCashBetThreshold", "hasGrabbedGift", "<init>", "(ZJJZ)V", "getGrabAvailable", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getCashBetThreshold", "()J", "getRemainingCashBetThreshold", "getHasGrabbedGift", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabUserGrabAvailable {
    public static final int $stable = 0;

    @SerializedName("cashBetThreshold")
    private final long cashBetThreshold;

    @SerializedName("grabAvailable")
    private final boolean grabAvailable;

    @SerializedName("hasGrabbedGift")
    private final boolean hasGrabbedGift;

    @SerializedName("remainingCashBetThreshold")
    private final long remainingCashBetThreshold;

    public /* synthetic */ GiftGrabUserGrabAvailable(boolean z, long j, long j2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? false : z2);
    }

    public static /* synthetic */ GiftGrabUserGrabAvailable copy$default(GiftGrabUserGrabAvailable giftGrabUserGrabAvailable, boolean z, long j, long j2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = giftGrabUserGrabAvailable.grabAvailable;
        }
        if ((i & 2) != 0) {
            j = giftGrabUserGrabAvailable.cashBetThreshold;
        }
        if ((i & 4) != 0) {
            j2 = giftGrabUserGrabAvailable.remainingCashBetThreshold;
        }
        if ((i & 8) != 0) {
            z2 = giftGrabUserGrabAvailable.hasGrabbedGift;
        }
        boolean z3 = z2;
        return giftGrabUserGrabAvailable.copy(z, j, j2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getGrabAvailable() {
        return this.grabAvailable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getCashBetThreshold() {
        return this.cashBetThreshold;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRemainingCashBetThreshold() {
        return this.remainingCashBetThreshold;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasGrabbedGift() {
        return this.hasGrabbedGift;
    }

    public final GiftGrabUserGrabAvailable copy(boolean grabAvailable, long cashBetThreshold, long remainingCashBetThreshold, boolean hasGrabbedGift) {
        return new GiftGrabUserGrabAvailable(grabAvailable, cashBetThreshold, remainingCashBetThreshold, hasGrabbedGift);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabUserGrabAvailable)) {
            return false;
        }
        GiftGrabUserGrabAvailable giftGrabUserGrabAvailable = (GiftGrabUserGrabAvailable) other;
        return this.grabAvailable == giftGrabUserGrabAvailable.grabAvailable && this.cashBetThreshold == giftGrabUserGrabAvailable.cashBetThreshold && this.remainingCashBetThreshold == giftGrabUserGrabAvailable.remainingCashBetThreshold && this.hasGrabbedGift == giftGrabUserGrabAvailable.hasGrabbedGift;
    }

    public final long getCashBetThreshold() {
        return this.cashBetThreshold;
    }

    public final boolean getGrabAvailable() {
        return this.grabAvailable;
    }

    public final boolean getHasGrabbedGift() {
        return this.hasGrabbedGift;
    }

    public final long getRemainingCashBetThreshold() {
        return this.remainingCashBetThreshold;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasGrabbedGift) + f87.a(f87.a(Boolean.hashCode(this.grabAvailable) * 31, this.cashBetThreshold, 31), this.remainingCashBetThreshold, 31);
    }

    public String toString() {
        boolean z = this.grabAvailable;
        long j = this.cashBetThreshold;
        long j2 = this.remainingCashBetThreshold;
        boolean z2 = this.hasGrabbedGift;
        StringBuilder sb = new StringBuilder("GiftGrabUserGrabAvailable(grabAvailable=");
        sb.append(z);
        sb.append(", cashBetThreshold=");
        sb.append(j);
        g41.a(j2, ", remainingCashBetThreshold=", ", hasGrabbedGift=", sb);
        return mq0.a(sb, z2, ")");
    }

    public GiftGrabUserGrabAvailable(boolean z, long j, long j2, boolean z2) {
        this.grabAvailable = z;
        this.cashBetThreshold = j;
        this.remainingCashBetThreshold = j2;
        this.hasGrabbedGift = z2;
    }

    public GiftGrabUserGrabAvailable() {
        this(false, 0L, 0L, false, 15, null);
    }
}
