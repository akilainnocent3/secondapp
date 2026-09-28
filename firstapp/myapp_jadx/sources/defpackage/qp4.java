package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u000bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u001f\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\r\u0010\u001e¨\u0006 "}, d2 = {"Lqp4;", "", "", "a", "J", "b", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "Ljava/lang/String;", "getPatronId", "()Ljava/lang/String;", "patronId", "c", "getPhone", "phone", "d", "getEmail", "email", "e", "getNickName", "nickName", "f", "getAvatarUrl", "avatarUrl", "g", "countryCode", "", "h", "Z", "()Z", "isBlocked", "game-bonuscup_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class qp4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("patronId")
    private final String patronId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("phone")
    private final String phone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("email")
    private final String email;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("nickName")
    private final String nickName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("avatarUrl")
    private final String avatarUrl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("countryCode")
    private final String countryCode;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName("isBlocked")
    private final boolean isBlocked;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp4)) {
            return false;
        }
        qp4 qp4Var = (qp4) obj;
        return this.id == qp4Var.id && Intrinsics.g(this.patronId, qp4Var.patronId) && Intrinsics.g(this.phone, qp4Var.phone) && Intrinsics.g(this.email, qp4Var.email) && Intrinsics.g(this.nickName, qp4Var.nickName) && Intrinsics.g(this.avatarUrl, qp4Var.avatarUrl) && Intrinsics.g(this.countryCode, qp4Var.countryCode) && this.isBlocked == qp4Var.isBlocked;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.patronId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.nickName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatarUrl;
        return Boolean.hashCode(this.isBlocked) + gmf0.a((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.countryCode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusCupValidateUser(id=");
        sb.append(this.id);
        sb.append(", patronId=");
        sb.append(this.patronId);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", email=");
        sb.append(this.email);
        sb.append(", nickName=");
        sb.append(this.nickName);
        sb.append(", avatarUrl=");
        sb.append(this.avatarUrl);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", isBlocked=");
        return ruw.a(sb, this.isBlocked, ')');
    }
}
