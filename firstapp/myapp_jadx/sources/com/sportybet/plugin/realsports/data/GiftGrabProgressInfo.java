package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabProgressInfo;", "", "grabAvailable", "", "giftGrabActivityEnded", "<init>", "(ZZ)V", "getGrabAvailable", "()Z", "getGiftGrabActivityEnded", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabProgressInfo {
    public static final int $stable = 0;
    private final boolean giftGrabActivityEnded;
    private final boolean grabAvailable;

    public /* synthetic */ GiftGrabProgressInfo(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ GiftGrabProgressInfo copy$default(GiftGrabProgressInfo giftGrabProgressInfo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = giftGrabProgressInfo.grabAvailable;
        }
        if ((i & 2) != 0) {
            z2 = giftGrabProgressInfo.giftGrabActivityEnded;
        }
        return giftGrabProgressInfo.copy(z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getGrabAvailable() {
        return this.grabAvailable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getGiftGrabActivityEnded() {
        return this.giftGrabActivityEnded;
    }

    public final GiftGrabProgressInfo copy(boolean grabAvailable, boolean giftGrabActivityEnded) {
        return new GiftGrabProgressInfo(grabAvailable, giftGrabActivityEnded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabProgressInfo)) {
            return false;
        }
        GiftGrabProgressInfo giftGrabProgressInfo = (GiftGrabProgressInfo) other;
        return this.grabAvailable == giftGrabProgressInfo.grabAvailable && this.giftGrabActivityEnded == giftGrabProgressInfo.giftGrabActivityEnded;
    }

    public final boolean getGiftGrabActivityEnded() {
        return this.giftGrabActivityEnded;
    }

    public final boolean getGrabAvailable() {
        return this.grabAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.giftGrabActivityEnded) + (Boolean.hashCode(this.grabAvailable) * 31);
    }

    public String toString() {
        return "GiftGrabProgressInfo(grabAvailable=" + this.grabAvailable + ", giftGrabActivityEnded=" + this.giftGrabActivityEnded + ")";
    }

    public GiftGrabProgressInfo(boolean z, boolean z2) {
        this.grabAvailable = z;
        this.giftGrabActivityEnded = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GiftGrabProgressInfo() {
        boolean z = false;
        this(z, z, 3, null);
    }
}
