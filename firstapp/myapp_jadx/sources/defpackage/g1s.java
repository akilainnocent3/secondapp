package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0003\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u001d\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001e"}, d2 = {"Lg1s;", "", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "userId", "", "b", "D", "()D", "accumulatedAmount", "", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "ranking", "d", "nickname", "e", "phone", "email", "avatar", "", "h", "Z", "()Z", "isSelf", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class g1s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("accumulatedAmount")
    private final double accumulatedAmount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("ranking")
    private final Integer ranking;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("nickname")
    private final String nickname;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("phone")
    private final String phone;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("email")
    private final String email;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("avatar")
    private final String avatar;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("isSelf")
    private final boolean isSelf;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final double getAccumulatedAmount() {
        return this.accumulatedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1s)) {
            return false;
        }
        g1s g1sVar = (g1s) obj;
        return Intrinsics.g(this.userId, g1sVar.userId) && Double.compare(this.accumulatedAmount, g1sVar.accumulatedAmount) == 0 && Intrinsics.g(this.ranking, g1sVar.ranking) && Intrinsics.g(this.nickname, g1sVar.nickname) && Intrinsics.g(this.phone, g1sVar.phone) && Intrinsics.g(this.email, g1sVar.email) && Intrinsics.g(this.avatar, g1sVar.avatar) && this.isSelf == g1sVar.isSelf;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getRanking() {
        return this.ranking;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsSelf() {
        return this.isSelf;
    }

    public final int hashCode() {
        int iA = nrg0.a(this.userId.hashCode() * 31, 31, this.accumulatedAmount);
        Integer num = this.ranking;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nickname;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatar;
        return Boolean.hashCode(this.isSelf) + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.userId;
        double d = this.accumulatedAmount;
        Integer num = this.ranking;
        String str2 = this.nickname;
        String str3 = this.phone;
        String str4 = this.email;
        String str5 = this.avatar;
        boolean z = this.isSelf;
        StringBuilder sb = new StringBuilder("LeaderboardEntryDto(userId=");
        sb.append(str);
        sb.append(", accumulatedAmount=");
        sb.append(d);
        sb.append(", ranking=");
        sb.append(num);
        sb.append(", nickname=");
        sb.append(str2);
        hxa.c(sb, ", phone=", str3, ", email=", str4);
        sb.append(", avatar=");
        sb.append(str5);
        sb.append(", isSelf=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
