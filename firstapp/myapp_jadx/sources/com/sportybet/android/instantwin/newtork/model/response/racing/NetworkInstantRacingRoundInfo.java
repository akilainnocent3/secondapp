package com.sportybet.android.instantwin.newtork.model.response.racing;

import com.appsflyer.internal.l;
import com.google.gson.annotations.SerializedName;
import defpackage.f87;
import defpackage.g41;
import defpackage.zug;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J[\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R%\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R%\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R%\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R%\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017Ê\u0001\f\b*\u0012\b\b+\u0012\u0004\b\u0003\u0010\u0000¨\u0006)"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingRoundInfo;", "", "roundId", "", "leagues", "", "Lcom/sportybet/android/instantwin/newtork/model/response/racing/NetworkInstantRacingLeague;", "roundTag", "bdMinStake", "", "bdMaxStake", "bdMaxPayout", "userSettledRound", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;JJJJ)V", "getRoundId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getLeagues", "()Ljava/util/List;", "getRoundTag", "getBdMinStake", "()J", "getBdMaxStake", "getBdMaxPayout", "getUserSettledRound", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkInstantRacingRoundInfo {
    public static final int $stable = 8;

    @SerializedName("bdMaxPayout")
    private final long bdMaxPayout;

    @SerializedName("bdMaxStake")
    private final long bdMaxStake;

    @SerializedName("bdMinStake")
    private final long bdMinStake;

    @SerializedName("leagues")
    private final List<NetworkInstantRacingLeague> leagues;

    @SerializedName("roundId")
    private final String roundId;

    @SerializedName("roundTag")
    private final String roundTag;

    @SerializedName("userSettledRound")
    private final long userSettledRound;

    public NetworkInstantRacingRoundInfo(String str, List<NetworkInstantRacingLeague> list, String str2, long j, long j2, long j3, long j4) {
        this.roundId = str;
        this.leagues = list;
        this.roundTag = str2;
        this.bdMinStake = j;
        this.bdMaxStake = j2;
        this.bdMaxPayout = j3;
        this.userSettledRound = j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkInstantRacingRoundInfo copy$default(NetworkInstantRacingRoundInfo networkInstantRacingRoundInfo, String str, List list, String str2, long j, long j2, long j3, long j4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkInstantRacingRoundInfo.roundId;
        }
        if ((i & 2) != 0) {
            list = networkInstantRacingRoundInfo.leagues;
        }
        if ((i & 4) != 0) {
            str2 = networkInstantRacingRoundInfo.roundTag;
        }
        if ((i & 8) != 0) {
            j = networkInstantRacingRoundInfo.bdMinStake;
        }
        if ((i & 16) != 0) {
            j2 = networkInstantRacingRoundInfo.bdMaxStake;
        }
        if ((i & 32) != 0) {
            j3 = networkInstantRacingRoundInfo.bdMaxPayout;
        }
        if ((i & 64) != 0) {
            j4 = networkInstantRacingRoundInfo.userSettledRound;
        }
        long j5 = j4;
        long j6 = j3;
        long j7 = j2;
        String str3 = str2;
        return networkInstantRacingRoundInfo.copy(str, list, str3, j, j7, j6, j5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    public final List<NetworkInstantRacingLeague> component2() {
        return this.leagues;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRoundTag() {
        return this.roundTag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getBdMinStake() {
        return this.bdMinStake;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBdMaxStake() {
        return this.bdMaxStake;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getBdMaxPayout() {
        return this.bdMaxPayout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getUserSettledRound() {
        return this.userSettledRound;
    }

    public final NetworkInstantRacingRoundInfo copy(String roundId, List<NetworkInstantRacingLeague> leagues, String roundTag, long bdMinStake, long bdMaxStake, long bdMaxPayout, long userSettledRound) {
        return new NetworkInstantRacingRoundInfo(roundId, leagues, roundTag, bdMinStake, bdMaxStake, bdMaxPayout, userSettledRound);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkInstantRacingRoundInfo)) {
            return false;
        }
        NetworkInstantRacingRoundInfo networkInstantRacingRoundInfo = (NetworkInstantRacingRoundInfo) other;
        return Intrinsics.g(this.roundId, networkInstantRacingRoundInfo.roundId) && Intrinsics.g(this.leagues, networkInstantRacingRoundInfo.leagues) && Intrinsics.g(this.roundTag, networkInstantRacingRoundInfo.roundTag) && this.bdMinStake == networkInstantRacingRoundInfo.bdMinStake && this.bdMaxStake == networkInstantRacingRoundInfo.bdMaxStake && this.bdMaxPayout == networkInstantRacingRoundInfo.bdMaxPayout && this.userSettledRound == networkInstantRacingRoundInfo.userSettledRound;
    }

    public final long getBdMaxPayout() {
        return this.bdMaxPayout;
    }

    public final long getBdMaxStake() {
        return this.bdMaxStake;
    }

    public final long getBdMinStake() {
        return this.bdMinStake;
    }

    public final List<NetworkInstantRacingLeague> getLeagues() {
        return this.leagues;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getRoundTag() {
        return this.roundTag;
    }

    public final long getUserSettledRound() {
        return this.userSettledRound;
    }

    public int hashCode() {
        String str = this.roundId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkInstantRacingLeague> list = this.leagues;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.roundTag;
        return Long.hashCode(this.userSettledRound) + f87.a(f87.a(f87.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, this.bdMinStake, 31), this.bdMaxStake, 31), this.bdMaxPayout, 31);
    }

    public String toString() {
        String str = this.roundId;
        List<NetworkInstantRacingLeague> list = this.leagues;
        String str2 = this.roundTag;
        long j = this.bdMinStake;
        long j2 = this.bdMaxStake;
        long j3 = this.bdMaxPayout;
        long j4 = this.userSettledRound;
        StringBuilder sb = new StringBuilder("NetworkInstantRacingRoundInfo(roundId=");
        sb.append(str);
        sb.append(", leagues=");
        sb.append(list);
        sb.append(", roundTag=");
        l.a(j, str2, ", bdMinStake=", sb);
        g41.a(j2, ", bdMaxStake=", ", bdMaxPayout=", sb);
        sb.append(j3);
        return zug.a(j4, ", userSettledRound=", ")", sb);
    }
}
