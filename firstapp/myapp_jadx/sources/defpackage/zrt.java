package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0003\u0010\u000f¨\u0006\u0011"}, d2 = {"Lzrt;", "", "Lwrt;", "a", "Lwrt;", "b", "()Lwrt;", "challengeConfig", "Ljava/lang/Object;", "getChallenge", "()Ljava/lang/Object;", "challenge", "", "c", "Z", "()Z", "canParticipate", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class zrt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("challengeConfig")
    private final wrt challengeConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("challenge")
    private final Object challenge;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("canParticipate")
    private final boolean canParticipate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getCanParticipate() {
        return this.canParticipate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final wrt getChallengeConfig() {
        return this.challengeConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrt)) {
            return false;
        }
        zrt zrtVar = (zrt) obj;
        return Intrinsics.g(this.challengeConfig, zrtVar.challengeConfig) && Intrinsics.g(this.challenge, zrtVar.challenge) && this.canParticipate == zrtVar.canParticipate;
    }

    public final int hashCode() {
        int iHashCode = this.challengeConfig.hashCode() * 31;
        Object obj = this.challenge;
        return Boolean.hashCode(this.canParticipate) + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        wrt wrtVar = this.challengeConfig;
        Object obj = this.challenge;
        boolean z = this.canParticipate;
        StringBuilder sb = new StringBuilder("LoyaltyChallengeParticipateDto(challengeConfig=");
        sb.append(wrtVar);
        sb.append(", challenge=");
        sb.append(obj);
        sb.append(", canParticipate=");
        return mq0.a(sb, z, ")");
    }
}
