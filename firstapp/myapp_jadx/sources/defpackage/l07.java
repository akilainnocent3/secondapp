package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll07;", "", "Llz6;", "a", "Llz6;", "getChallengeConfig", "()Llz6;", "challengeConfig", "Lg1s;", "b", "Lg1s;", "()Lg1s;", "selfRanking", "Ll1s;", "c", "Ll1s;", "()Ll1s;", "rankingList", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class l07 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("challengeConfig")
    private final lz6 challengeConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("selfRanking")
    private final g1s selfRanking;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("rankingList")
    private final l1s rankingList;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l1s getRankingList() {
        return this.rankingList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g1s getSelfRanking() {
        return this.selfRanking;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l07)) {
            return false;
        }
        l07 l07Var = (l07) obj;
        return Intrinsics.g(this.challengeConfig, l07Var.challengeConfig) && Intrinsics.g(this.selfRanking, l07Var.selfRanking) && Intrinsics.g(this.rankingList, l07Var.rankingList);
    }

    public final int hashCode() {
        lz6 lz6Var = this.challengeConfig;
        int iHashCode = (lz6Var == null ? 0 : lz6Var.hashCode()) * 31;
        g1s g1sVar = this.selfRanking;
        return this.rankingList.hashCode() + ((iHashCode + (g1sVar != null ? g1sVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ChallengeLeaderboardResponseDto(challengeConfig=" + this.challengeConfig + ", selfRanking=" + this.selfRanking + ", rankingList=" + this.rankingList + ")";
    }
}
