package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\t\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\t\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\t\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabUserSocketGrabAvailable;", "", "grabAvailable", "", "cashBetThreshold", "", "remainingCashBetThreshold", "<init>", "(ZJJ)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabUserSocketGrabAvailable {
    public static final int $stable = 0;

    @SerializedName("cashBetThreshold")
    public final long cashBetThreshold;

    @SerializedName("grabAvailable")
    public final boolean grabAvailable;

    @SerializedName("remainingCashBetThreshold")
    public final long remainingCashBetThreshold;

    public /* synthetic */ GiftGrabUserSocketGrabAvailable(boolean z, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }

    public static /* synthetic */ GiftGrabUserSocketGrabAvailable copy$default(GiftGrabUserSocketGrabAvailable giftGrabUserSocketGrabAvailable, boolean z, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = giftGrabUserSocketGrabAvailable.grabAvailable;
        }
        if ((i & 2) != 0) {
            j = giftGrabUserSocketGrabAvailable.cashBetThreshold;
        }
        if ((i & 4) != 0) {
            j2 = giftGrabUserSocketGrabAvailable.remainingCashBetThreshold;
        }
        return giftGrabUserSocketGrabAvailable.copy(z, j, j2);
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

    public final GiftGrabUserSocketGrabAvailable copy(boolean grabAvailable, long cashBetThreshold, long remainingCashBetThreshold) {
        return new GiftGrabUserSocketGrabAvailable(grabAvailable, cashBetThreshold, remainingCashBetThreshold);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabUserSocketGrabAvailable)) {
            return false;
        }
        GiftGrabUserSocketGrabAvailable giftGrabUserSocketGrabAvailable = (GiftGrabUserSocketGrabAvailable) other;
        return this.grabAvailable == giftGrabUserSocketGrabAvailable.grabAvailable && this.cashBetThreshold == giftGrabUserSocketGrabAvailable.cashBetThreshold && this.remainingCashBetThreshold == giftGrabUserSocketGrabAvailable.remainingCashBetThreshold;
    }

    public int hashCode() {
        return Long.hashCode(this.remainingCashBetThreshold) + f87.a(Boolean.hashCode(this.grabAvailable) * 31, this.cashBetThreshold, 31);
    }

    public String toString() {
        boolean z = this.grabAvailable;
        long j = this.cashBetThreshold;
        long j2 = this.remainingCashBetThreshold;
        StringBuilder sb = new StringBuilder("GiftGrabUserSocketGrabAvailable(grabAvailable=");
        sb.append(z);
        sb.append(", cashBetThreshold=");
        sb.append(j);
        return zug.a(j2, ", remainingCashBetThreshold=", ")", sb);
    }

    public GiftGrabUserSocketGrabAvailable(boolean z, long j, long j2) {
        this.grabAvailable = z;
        this.cashBetThreshold = j;
        this.remainingCashBetThreshold = j2;
    }

    public GiftGrabUserSocketGrabAvailable() {
        this(false, 0L, 0L, 7, null);
    }
}
