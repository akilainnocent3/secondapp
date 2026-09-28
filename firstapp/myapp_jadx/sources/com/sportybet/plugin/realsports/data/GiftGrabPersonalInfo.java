package com.sportybet.plugin.realsports.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo;", "", "Failed", "Success", "Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo$Failed;", "Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo$Success;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface GiftGrabPersonalInfo {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo$Failed;", "Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo;", "<init>", "()V", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Failed implements GiftGrabPersonalInfo {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        private Failed() {
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo$Success;", "Lcom/sportybet/plugin/realsports/data/GiftGrabPersonalInfo;", "grabAvailable", "", "remainingCashBetThreshold", "", "<init>", "(ZJ)V", "getGrabAvailable", "()Z", "getRemainingCashBetThreshold", "()J", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success implements GiftGrabPersonalInfo {
        public static final int $stable = 0;
        private final boolean grabAvailable;
        private final long remainingCashBetThreshold;

        public /* synthetic */ Success(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
        }

        public static /* synthetic */ Success copy$default(Success success, boolean z, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                z = success.grabAvailable;
            }
            if ((i & 2) != 0) {
                j = success.remainingCashBetThreshold;
            }
            return success.copy(z, j);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getGrabAvailable() {
            return this.grabAvailable;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getRemainingCashBetThreshold() {
            return this.remainingCashBetThreshold;
        }

        public final Success copy(boolean grabAvailable, long remainingCashBetThreshold) {
            return new Success(grabAvailable, remainingCashBetThreshold);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return this.grabAvailable == success.grabAvailable && this.remainingCashBetThreshold == success.remainingCashBetThreshold;
        }

        public final boolean getGrabAvailable() {
            return this.grabAvailable;
        }

        public final long getRemainingCashBetThreshold() {
            return this.remainingCashBetThreshold;
        }

        public int hashCode() {
            return Long.hashCode(this.remainingCashBetThreshold) + (Boolean.hashCode(this.grabAvailable) * 31);
        }

        public String toString() {
            return "Success(grabAvailable=" + this.grabAvailable + ", remainingCashBetThreshold=" + this.remainingCashBetThreshold + ")";
        }

        public Success(boolean z, long j) {
            this.grabAvailable = z;
            this.remainingCashBetThreshold = j;
        }

        public Success() {
            this(false, 0L, 3, null);
        }
    }
}
