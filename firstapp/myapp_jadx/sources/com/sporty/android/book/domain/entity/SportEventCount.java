package com.sporty.android.book.domain.entity;

import defpackage.d5d;
import defpackage.gpp;
import defpackage.ml5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/book/domain/entity/SportEventCount;", "", "sportId", "", "allEventSize", "", "todayEventSize", "outrightEventSize", "liveEventSize", "<init>", "(Ljava/lang/String;IIII)V", "getSportId", "()Ljava/lang/String;", "getAllEventSize", "()I", "getTodayEventSize", "getOutrightEventSize", "getLiveEventSize", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportEventCount {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int allEventSize;
    private final int liveEventSize;
    private final int outrightEventSize;
    private final String sportId;
    private final int todayEventSize;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/book/domain/entity/SportEventCount$Companion;", "", "<init>", "()V", "mock", "Lcom/sporty/android/book/domain/entity/SportEventCount;", "sportId", "", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SportEventCount mock(String sportId) {
            sportId.getClass();
            return new SportEventCount(sportId, 20, 10, 5, 0);
        }

        private Companion() {
        }
    }

    public SportEventCount(String str, int i, int i2, int i3, int i4) {
        str.getClass();
        this.sportId = str;
        this.allEventSize = i;
        this.todayEventSize = i2;
        this.outrightEventSize = i3;
        this.liveEventSize = i4;
    }

    public static /* synthetic */ SportEventCount copy$default(SportEventCount sportEventCount, String str, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = sportEventCount.sportId;
        }
        if ((i5 & 2) != 0) {
            i = sportEventCount.allEventSize;
        }
        if ((i5 & 4) != 0) {
            i2 = sportEventCount.todayEventSize;
        }
        if ((i5 & 8) != 0) {
            i3 = sportEventCount.outrightEventSize;
        }
        if ((i5 & 16) != 0) {
            i4 = sportEventCount.liveEventSize;
        }
        int i6 = i4;
        int i7 = i2;
        return sportEventCount.copy(str, i, i7, i3, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAllEventSize() {
        return this.allEventSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTodayEventSize() {
        return this.todayEventSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOutrightEventSize() {
        return this.outrightEventSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLiveEventSize() {
        return this.liveEventSize;
    }

    public final SportEventCount copy(String sportId, int allEventSize, int todayEventSize, int outrightEventSize, int liveEventSize) {
        sportId.getClass();
        return new SportEventCount(sportId, allEventSize, todayEventSize, outrightEventSize, liveEventSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportEventCount)) {
            return false;
        }
        SportEventCount sportEventCount = (SportEventCount) other;
        return Intrinsics.g(this.sportId, sportEventCount.sportId) && this.allEventSize == sportEventCount.allEventSize && this.todayEventSize == sportEventCount.todayEventSize && this.outrightEventSize == sportEventCount.outrightEventSize && this.liveEventSize == sportEventCount.liveEventSize;
    }

    public final int getAllEventSize() {
        return this.allEventSize;
    }

    public final int getLiveEventSize() {
        return this.liveEventSize;
    }

    public final int getOutrightEventSize() {
        return this.outrightEventSize;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final int getTodayEventSize() {
        return this.todayEventSize;
    }

    public int hashCode() {
        return Integer.hashCode(this.liveEventSize) + gpp.a(this.outrightEventSize, gpp.a(this.todayEventSize, gpp.a(this.allEventSize, this.sportId.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        String str = this.sportId;
        int i = this.allEventSize;
        int i2 = this.todayEventSize;
        int i3 = this.outrightEventSize;
        int i4 = this.liveEventSize;
        StringBuilder sbA = ml5.a(i, "SportEventCount(sportId=", str, ", allEventSize=", ", todayEventSize=");
        d5d.a(sbA, i2, ", outrightEventSize=", i3, ", liveEventSize=");
        return zk1.a(i4, ")", sbA);
    }
}
