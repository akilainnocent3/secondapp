package com.sporty.android.core.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.twilio.voice.EventKeys;
import defpackage.f78;
import defpackage.hxa;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 32\u00020\u0001:\u00013BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJT\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0003J\u0014\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0083\u0004J\n\u0010,\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010-\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dÊ\u0001\u0002\b5¨\u00064"}, d2 = {"Lcom/sporty/android/core/model/account/ReactivateResult;", "Landroid/os/Parcelable;", "bizCode", "", EventKeys.ERROR_MESSAGE, "", "accessToken", "refreshToken", "userId", "userCert", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBizCode", "()I", "setBizCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getAccessToken", "setAccessToken", "getRefreshToken", "setRefreshToken", "getUserId", "setUserId", "getUserCert", "()Ljava/lang/Integer;", "setUserCert", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sporty/android/core/model/account/ReactivateResult;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ReactivateResult implements Parcelable {
    private String accessToken;
    private int bizCode;
    private String message;
    private String refreshToken;
    private Integer userCert;
    private String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReactivateResult> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/account/ReactivateResult$Companion;", "", "<init>", "()V", "create", "Lcom/sporty/android/core/model/account/ReactivateResult;", "bizCode", "", "userCert", "(ILjava/lang/Integer;)Lcom/sporty/android/core/model/account/ReactivateResult;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ReactivateResult create(int bizCode, Integer userCert) {
            return new ReactivateResult(bizCode, null, null, null, null, userCert, 30, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReactivateResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactivateResult createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ReactivateResult(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactivateResult[] newArray(int i) {
            return new ReactivateResult[i];
        }
    }

    public /* synthetic */ ReactivateResult(int i, String str, String str2, String str3, String str4, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, num);
    }

    public static /* synthetic */ ReactivateResult copy$default(ReactivateResult reactivateResult, int i, String str, String str2, String str3, String str4, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reactivateResult.bizCode;
        }
        if ((i2 & 2) != 0) {
            str = reactivateResult.message;
        }
        if ((i2 & 4) != 0) {
            str2 = reactivateResult.accessToken;
        }
        if ((i2 & 8) != 0) {
            str3 = reactivateResult.refreshToken;
        }
        if ((i2 & 16) != 0) {
            str4 = reactivateResult.userId;
        }
        if ((i2 & 32) != 0) {
            num = reactivateResult.userCert;
        }
        String str5 = str4;
        Integer num2 = num;
        return reactivateResult.copy(i, str, str2, str3, str5, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUserCert() {
        return this.userCert;
    }

    public final ReactivateResult copy(int bizCode, String message, String accessToken, String refreshToken, String userId, Integer userCert) {
        return new ReactivateResult(bizCode, message, accessToken, refreshToken, userId, userCert);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReactivateResult)) {
            return false;
        }
        ReactivateResult reactivateResult = (ReactivateResult) other;
        return this.bizCode == reactivateResult.bizCode && Intrinsics.g(this.message, reactivateResult.message) && Intrinsics.g(this.accessToken, reactivateResult.accessToken) && Intrinsics.g(this.refreshToken, reactivateResult.refreshToken) && Intrinsics.g(this.userId, reactivateResult.userId) && Intrinsics.g(this.userCert, reactivateResult.userCert);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public final Integer getUserCert() {
        return this.userCert;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.bizCode) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.accessToken;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.refreshToken;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userId;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.userCert;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setBizCode(int i) {
        this.bizCode = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public final void setUserCert(Integer num) {
        this.userCert = num;
    }

    public final void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        int i = this.bizCode;
        String str = this.message;
        String str2 = this.accessToken;
        String str3 = this.refreshToken;
        String str4 = this.userId;
        Integer num = this.userCert;
        StringBuilder sbA = uqe0.a(i, "ReactivateResult(bizCode=", ", message=", str, ", accessToken=");
        hxa.c(sbA, str2, ", refreshToken=", str3, ", userId=");
        sbA.append(str4);
        sbA.append(", userCert=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.bizCode);
        dest.writeString(this.message);
        dest.writeString(this.accessToken);
        dest.writeString(this.refreshToken);
        dest.writeString(this.userId);
        Integer num = this.userCert;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
    }

    public ReactivateResult(int i, String str, String str2, String str3, String str4, Integer num) {
        this.bizCode = i;
        this.message = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.userId = str4;
        this.userCert = num;
    }
}
