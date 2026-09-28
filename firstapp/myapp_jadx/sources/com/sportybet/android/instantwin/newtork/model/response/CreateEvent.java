package com.sportybet.android.instantwin.newtork.model.response;

import com.appsflyer.internal.x;
import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.f87;
import defpackage.g41;
import defpackage.mtg0;
import defpackage.zk1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003J_\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0014\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010+\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004R$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0012\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0012\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0012\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000R%\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R%\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R%\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001d¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R%\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/CreateEvent;", "", "roundId", "", "roundNumber", "", "leagues", "", "Lcom/sportybet/android/instantwin/newtork/model/response/League;", "betBuilderEnable", "", "maxStake", "minStake", "maxPayout", "userSettledRound", "", "<init>", "(Ljava/lang/String;JLjava/util/List;ZJJJI)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "getBetBuilderEnable", "()Z", "getMaxStake", "()J", "bdMaxStake", "getMinStake", "bdMinStake", "getMaxPayout", "bdMaxPayout", "getUserSettledRound", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreateEvent {
    public static final int $stable = 8;

    @SerializedName("betBuilderEnable")
    private final boolean betBuilderEnable;

    @SerializedName("leagues")
    public final List<League> leagues;

    @SerializedName("bdMaxPayout")
    private final long maxPayout;

    @SerializedName("bdMaxStake")
    private final long maxStake;

    @SerializedName("bdMinStake")
    private final long minStake;

    @SerializedName("roundId")
    public final String roundId;

    @SerializedName("roundNumber")
    public final long roundNumber;

    @SerializedName("userSettledRound")
    private final int userSettledRound;

    public CreateEvent(String str, long j, List<League> list, boolean z, long j2, long j3, long j4, int i) {
        str.getClass();
        list.getClass();
        this.roundId = str;
        this.roundNumber = j;
        this.leagues = list;
        this.betBuilderEnable = z;
        this.maxStake = j2;
        this.minStake = j3;
        this.maxPayout = j4;
        this.userSettledRound = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateEvent copy$default(CreateEvent createEvent, String str, long j, List list, boolean z, long j2, long j3, long j4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createEvent.roundId;
        }
        if ((i2 & 2) != 0) {
            j = createEvent.roundNumber;
        }
        if ((i2 & 4) != 0) {
            list = createEvent.leagues;
        }
        if ((i2 & 8) != 0) {
            z = createEvent.betBuilderEnable;
        }
        if ((i2 & 16) != 0) {
            j2 = createEvent.maxStake;
        }
        if ((i2 & 32) != 0) {
            j3 = createEvent.minStake;
        }
        if ((i2 & 64) != 0) {
            j4 = createEvent.maxPayout;
        }
        if ((i2 & 128) != 0) {
            i = createEvent.userSettledRound;
        }
        int i3 = i;
        long j5 = j4;
        long j6 = j3;
        return createEvent.copy(str, j, list, z, j2, j6, j5, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRoundNumber() {
        return this.roundNumber;
    }

    public final List<League> component3() {
        return this.leagues;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getBetBuilderEnable() {
        return this.betBuilderEnable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getMaxStake() {
        return this.maxStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getMinStake() {
        return this.minStake;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getMaxPayout() {
        return this.maxPayout;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getUserSettledRound() {
        return this.userSettledRound;
    }

    public final CreateEvent copy(String roundId, long roundNumber, List<League> leagues, boolean betBuilderEnable, long maxStake, long minStake, long maxPayout, int userSettledRound) {
        roundId.getClass();
        leagues.getClass();
        return new CreateEvent(roundId, roundNumber, leagues, betBuilderEnable, maxStake, minStake, maxPayout, userSettledRound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateEvent)) {
            return false;
        }
        CreateEvent createEvent = (CreateEvent) other;
        return Intrinsics.g(this.roundId, createEvent.roundId) && this.roundNumber == createEvent.roundNumber && Intrinsics.g(this.leagues, createEvent.leagues) && this.betBuilderEnable == createEvent.betBuilderEnable && this.maxStake == createEvent.maxStake && this.minStake == createEvent.minStake && this.maxPayout == createEvent.maxPayout && this.userSettledRound == createEvent.userSettledRound;
    }

    public final boolean getBetBuilderEnable() {
        return this.betBuilderEnable;
    }

    public final long getMaxPayout() {
        return this.maxPayout;
    }

    public final long getMaxStake() {
        return this.maxStake;
    }

    public final long getMinStake() {
        return this.minStake;
    }

    public final int getUserSettledRound() {
        return this.userSettledRound;
    }

    public int hashCode() {
        return Integer.hashCode(this.userSettledRound) + f87.a(f87.a(f87.a(mtg0.a(ai50.a(f87.a(this.roundId.hashCode() * 31, this.roundNumber, 31), 31, this.leagues), 31, this.betBuilderEnable), this.maxStake, 31), this.minStake, 31), this.maxPayout, 31);
    }

    public String toString() {
        String str = this.roundId;
        long j = this.roundNumber;
        List<League> list = this.leagues;
        boolean z = this.betBuilderEnable;
        long j2 = this.maxStake;
        long j3 = this.minStake;
        long j4 = this.maxPayout;
        int i = this.userSettledRound;
        StringBuilder sbA = x.a(j, "CreateEvent(roundId=", str, ", roundNumber=");
        sbA.append(", leagues=");
        sbA.append(list);
        sbA.append(", betBuilderEnable=");
        sbA.append(z);
        g41.a(j2, ", maxStake=", ", minStake=", sbA);
        sbA.append(j3);
        g41.a(j4, ", maxPayout=", ", userSettledRound=", sbA);
        return zk1.a(i, ")", sbA);
    }
}
