package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.newtork.model.response.recommendation.TL.UccrWswQGaIj;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0003\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lkx6;", "", "Llz6;", "a", "Llz6;", "c", "()Llz6;", "challengeConfig", "Lhoh0;", "b", "Lhoh0;", "()Lhoh0;", "challenge", "", "Z", "()Z", "canParticipate", "d", "unlockedLeaderboard", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class kx6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("challengeConfig")
    private final lz6 challengeConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("challenge")
    private final hoh0 challenge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("canParticipate")
    private final boolean canParticipate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("unlockedLeaderboard")
    private final boolean unlockedLeaderboard;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hoh0 getChallenge() {
        return this.challenge;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final lz6 getChallengeConfig() {
        return this.challengeConfig;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getUnlockedLeaderboard() {
        return this.unlockedLeaderboard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx6)) {
            return false;
        }
        kx6 kx6Var = (kx6) obj;
        return Intrinsics.g(this.challengeConfig, kx6Var.challengeConfig) && Intrinsics.g(this.challenge, kx6Var.challenge) && this.canParticipate == kx6Var.canParticipate && this.unlockedLeaderboard == kx6Var.unlockedLeaderboard;
    }

    public final int hashCode() {
        int iHashCode = this.challengeConfig.hashCode() * 31;
        hoh0 hoh0Var = this.challenge;
        return Boolean.hashCode(this.unlockedLeaderboard) + mtg0.a((iHashCode + (hoh0Var == null ? 0 : hoh0Var.hashCode())) * 31, 31, this.canParticipate);
    }

    public final String toString() {
        lz6 lz6Var = this.challengeConfig;
        hoh0 hoh0Var = this.challenge;
        boolean z = this.canParticipate;
        boolean z2 = this.unlockedLeaderboard;
        StringBuilder sb = new StringBuilder("ChallengeApplicableDto(challengeConfig=");
        sb.append(lz6Var);
        sb.append(UccrWswQGaIj.WwPUlmTVeEE);
        sb.append(hoh0Var);
        sb.append(", canParticipate=");
        return lng.a(", unlockedLeaderboard=", ")", sb, z, z2);
    }
}
