package com.sportygames.commons.tournament.model;

import defpackage.k800;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012JV\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\tHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, d2 = {"Lcom/sportygames/commons/tournament/model/LeaderboardRecord;", "", "patronId", "", "avatarURL", "nickName", "score", "", "rank", "", "prize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)V", "getPatronId", "()Ljava/lang/String;", "getAvatarURL", "getNickName", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRank", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPrize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Double;)Lcom/sportygames/commons/tournament/model/LeaderboardRecord;", "equals", "", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LeaderboardRecord {
    public static final int $stable = 0;
    private final String avatarURL;
    private final String nickName;
    private final String patronId;
    private final Double prize;
    private final Integer rank;
    private final Double score;

    public LeaderboardRecord(String str, String str2, String str3, Double d, Integer num, Double d2) {
        this.patronId = str;
        this.avatarURL = str2;
        this.nickName = str3;
        this.score = d;
        this.rank = num;
        this.prize = d2;
    }

    public static /* synthetic */ LeaderboardRecord copy$default(LeaderboardRecord leaderboardRecord, String str, String str2, String str3, Double d, Integer num, Double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaderboardRecord.patronId;
        }
        if ((i & 2) != 0) {
            str2 = leaderboardRecord.avatarURL;
        }
        if ((i & 4) != 0) {
            str3 = leaderboardRecord.nickName;
        }
        if ((i & 8) != 0) {
            d = leaderboardRecord.score;
        }
        if ((i & 16) != 0) {
            num = leaderboardRecord.rank;
        }
        if ((i & 32) != 0) {
            d2 = leaderboardRecord.prize;
        }
        Integer num2 = num;
        Double d3 = d2;
        return leaderboardRecord.copy(str, str2, str3, d, num2, d3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPatronId() {
        return this.patronId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatarURL() {
        return this.avatarURL;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getPrize() {
        return this.prize;
    }

    public final LeaderboardRecord copy(String patronId, String avatarURL, String nickName, Double score, Integer rank, Double prize) {
        return new LeaderboardRecord(patronId, avatarURL, nickName, score, rank, prize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeaderboardRecord)) {
            return false;
        }
        LeaderboardRecord leaderboardRecord = (LeaderboardRecord) other;
        return Intrinsics.g(this.patronId, leaderboardRecord.patronId) && Intrinsics.g(this.avatarURL, leaderboardRecord.avatarURL) && Intrinsics.g(this.nickName, leaderboardRecord.nickName) && Intrinsics.g(this.score, leaderboardRecord.score) && Intrinsics.g(this.rank, leaderboardRecord.rank) && Intrinsics.g(this.prize, leaderboardRecord.prize);
    }

    public final String getAvatarURL() {
        return this.avatarURL;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPatronId() {
        return this.patronId;
    }

    public final Double getPrize() {
        return this.prize;
    }

    public final Integer getRank() {
        return this.rank;
    }

    public final Double getScore() {
        return this.score;
    }

    public int hashCode() {
        String str = this.patronId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.avatarURL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Double d = this.score;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.rank;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d2 = this.prize;
        return iHashCode5 + (d2 != null ? d2.hashCode() : 0);
    }

    public String toString() {
        String str = this.patronId;
        String str2 = this.avatarURL;
        String str3 = this.nickName;
        Double d = this.score;
        Integer num = this.rank;
        Double d2 = this.prize;
        StringBuilder sbA = ux5.a("LeaderboardRecord(patronId=", str, ", avatarURL=", str2, ", nickName=");
        k800.a(d, str3, ", score=", ", rank=", sbA);
        sbA.append(num);
        sbA.append(", prize=");
        sbA.append(d2);
        sbA.append(")");
        return sbA.toString();
    }
}
