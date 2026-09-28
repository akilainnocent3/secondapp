package com.sporty.android.core.model.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.hxa;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 42\u00020\u0001:\u00014BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J\u0016\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0014\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0083\u0004J\n\u0010-\u001a\u00020(HÖ\u0081\u0004J\n\u0010.\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bÊ\u0001\u0002\b6¨\u00065"}, d2 = {"Lcom/sporty/android/core/model/account/AccountActivationData;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_STATUS, "", "phoneCountryCode", "phoneNumber", "reasonId", "reactivateToken", "reactivateResult", "Lcom/sporty/android/core/model/account/ReactivateResult;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/account/ReactivateResult;)V", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "getPhoneCountryCode", "setPhoneCountryCode", "getPhoneNumber", "setPhoneNumber", "getReasonId", "setReasonId", "getReactivateToken", "setReactivateToken", "getReactivateResult", "()Lcom/sporty/android/core/model/account/ReactivateResult;", "setReactivateResult", "(Lcom/sporty/android/core/model/account/ReactivateResult;)V", "genRequestBodyForDeactivateAccount", "token", "otpCode", "genRequestBodyForReactivateAccount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AccountActivationData implements Parcelable {
    private String phoneCountryCode;
    private String phoneNumber;
    private ReactivateResult reactivateResult;
    private String reactivateToken;
    private String reasonId;
    private String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<AccountActivationData> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/sporty/android/core/model/account/AccountActivationData$Companion;", "", "<init>", "()V", "create", "Lcom/sporty/android/core/model/account/AccountActivationData;", AnalyticsParam.EVENT_STATUS, "", "phoneCountryCode", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccountActivationData create(String status, String phoneCountryCode) {
            status.getClass();
            return new AccountActivationData(status, phoneCountryCode, null, null, null, null, 60, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AccountActivationData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountActivationData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AccountActivationData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ReactivateResult.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountActivationData[] newArray(int i) {
            return new AccountActivationData[i];
        }
    }

    public /* synthetic */ AccountActivationData(String str, String str2, String str3, String str4, String str5, ReactivateResult reactivateResult, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : reactivateResult);
    }

    public static /* synthetic */ AccountActivationData copy$default(AccountActivationData accountActivationData, String str, String str2, String str3, String str4, String str5, ReactivateResult reactivateResult, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountActivationData.status;
        }
        if ((i & 2) != 0) {
            str2 = accountActivationData.phoneCountryCode;
        }
        if ((i & 4) != 0) {
            str3 = accountActivationData.phoneNumber;
        }
        if ((i & 8) != 0) {
            str4 = accountActivationData.reasonId;
        }
        if ((i & 16) != 0) {
            str5 = accountActivationData.reactivateToken;
        }
        if ((i & 32) != 0) {
            reactivateResult = accountActivationData.reactivateResult;
        }
        String str6 = str5;
        ReactivateResult reactivateResult2 = reactivateResult;
        return accountActivationData.copy(str, str2, str3, str4, str6, reactivateResult2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getReasonId() {
        return this.reasonId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getReactivateToken() {
        return this.reactivateToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ReactivateResult getReactivateResult() {
        return this.reactivateResult;
    }

    public final AccountActivationData copy(String status, String phoneCountryCode, String phoneNumber, String reasonId, String reactivateToken, ReactivateResult reactivateResult) {
        status.getClass();
        return new AccountActivationData(status, phoneCountryCode, phoneNumber, reasonId, reactivateToken, reactivateResult);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountActivationData)) {
            return false;
        }
        AccountActivationData accountActivationData = (AccountActivationData) other;
        return Intrinsics.g(this.status, accountActivationData.status) && Intrinsics.g(this.phoneCountryCode, accountActivationData.phoneCountryCode) && Intrinsics.g(this.phoneNumber, accountActivationData.phoneNumber) && Intrinsics.g(this.reasonId, accountActivationData.reasonId) && Intrinsics.g(this.reactivateToken, accountActivationData.reactivateToken) && Intrinsics.g(this.reactivateResult, accountActivationData.reactivateResult);
    }

    public final String genRequestBodyForDeactivateAccount(String token, String otpCode) throws JSONException {
        token.getClass();
        otpCode.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", token);
        jSONObject.put("phone", this.phoneNumber);
        jSONObject.put("phoneCountryCode", this.phoneCountryCode);
        jSONObject.put(EventKeys.ERROR_CODE, otpCode);
        jSONObject.put("reason", this.reasonId);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final String genRequestBodyForReactivateAccount(String token, String otpCode) throws JSONException {
        token.getClass();
        otpCode.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", token);
        jSONObject.put("phone", this.phoneNumber);
        jSONObject.put("phoneCountryCode", this.phoneCountryCode);
        jSONObject.put(EventKeys.ERROR_CODE, otpCode);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final ReactivateResult getReactivateResult() {
        return this.reactivateResult;
    }

    public final String getReactivateToken() {
        return this.reactivateToken;
    }

    public final String getReasonId() {
        return this.reasonId;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        String str = this.phoneCountryCode;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reasonId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reactivateToken;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ReactivateResult reactivateResult = this.reactivateResult;
        return iHashCode5 + (reactivateResult != null ? reactivateResult.hashCode() : 0);
    }

    public final void setPhoneCountryCode(String str) {
        this.phoneCountryCode = str;
    }

    public final void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public final void setReactivateResult(ReactivateResult reactivateResult) {
        this.reactivateResult = reactivateResult;
    }

    public final void setReactivateToken(String str) {
        this.reactivateToken = str;
    }

    public final void setReasonId(String str) {
        this.reasonId = str;
    }

    public final void setStatus(String str) {
        str.getClass();
        this.status = str;
    }

    public String toString() {
        String str = this.status;
        String str2 = this.phoneCountryCode;
        String str3 = this.phoneNumber;
        String str4 = this.reasonId;
        String str5 = this.reactivateToken;
        ReactivateResult reactivateResult = this.reactivateResult;
        StringBuilder sbA = ux5.a("AccountActivationData(status=", str, ", phoneCountryCode=", str2, ", phoneNumber=");
        hxa.c(sbA, str3, ", reasonId=", str4, ", reactivateToken=");
        sbA.append(str5);
        sbA.append(", reactivateResult=");
        sbA.append(reactivateResult);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.status);
        dest.writeString(this.phoneCountryCode);
        dest.writeString(this.phoneNumber);
        dest.writeString(this.reasonId);
        dest.writeString(this.reactivateToken);
        ReactivateResult reactivateResult = this.reactivateResult;
        if (reactivateResult == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            reactivateResult.writeToParcel(dest, flags);
        }
    }

    public AccountActivationData(String str, String str2, String str3, String str4, String str5, ReactivateResult reactivateResult) {
        str.getClass();
        this.status = str;
        this.phoneCountryCode = str2;
        this.phoneNumber = str3;
        this.reasonId = str4;
        this.reactivateToken = str5;
        this.reactivateResult = reactivateResult;
    }
}
