package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0017\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lhqh0;", "", "", "a", "I", "getId", "()I", AnalyticsParam.EVENT_PARAM_ID, "", "b", "Ljava/lang/String;", "getPatronId", "()Ljava/lang/String;", "patronId", "c", "getPhone", "phone", "d", "nickname", "e", "avatar", "f", "getCurrencyCode", AppsFlyerProperties.CURRENCY_CODE, "", "g", "Z", "()Z", "isActive", "game-piggybash_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hqh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("patronId")
    private final String patronId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("phone")
    private final String phone;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("nickName")
    private final String nickname;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("avatar")
    private final String avatar;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName(AppsFlyerProperties.CURRENCY_CODE)
    private final String currencyCode;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("isActive")
    private final boolean isActive;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqh0)) {
            return false;
        }
        hqh0 hqh0Var = (hqh0) obj;
        return this.id == hqh0Var.id && Intrinsics.g(this.patronId, hqh0Var.patronId) && Intrinsics.g(this.phone, hqh0Var.phone) && Intrinsics.g(this.nickname, hqh0Var.nickname) && Intrinsics.g(this.avatar, hqh0Var.avatar) && Intrinsics.g(this.currencyCode, hqh0Var.currencyCode) && this.isActive == hqh0Var.isActive;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.patronId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nickname;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.avatar;
        return Boolean.hashCode(this.isActive) + gmf0.a((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.currencyCode);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserValidateResponse(id=");
        sb.append(this.id);
        sb.append(", patronId=");
        sb.append(this.patronId);
        sb.append(", phone=");
        sb.append(this.phone);
        sb.append(", nickname=");
        sb.append(this.nickname);
        sb.append(", avatar=");
        sb.append(this.avatar);
        sb.append(", currencyCode=");
        sb.append(this.currencyCode);
        sb.append(", isActive=");
        return ruw.a(sb, this.isActive, ')');
    }
}
