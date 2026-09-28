package com.sportybet.android.account.international.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0080\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00101J\u0006\u00102\u001a\u00020\u0003J\u0014\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106HÖ\u0083\u0004J\n\u00107\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00108\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R'\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b$\u0010%Ê\u0001\u0002\b?Ê\u0001\f\b@\u0012\b\bA\u0012\u0004\b\u0003\u0010\u0000¨\u0006>"}, d2 = {"Lcom/sportybet/android/account/international/data/model/RegistrationStatusResponse;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_STATUS, "", "cpf", "", "phone", "phoneCountryCode", "fullName", "dateOfBirth", "", "zipcode", "street", "city", "state", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()I", "getCpf", "()Ljava/lang/String;", "getPhone", "getPhoneCountryCode", "getFullName", "getDateOfBirth", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getZipcode", "Lcom/google/gson/annotations/SerializedName;", "value", "cep", "getStreet", "getCity", "getState", "statusCode", "Lcom/sportybet/android/account/international/data/model/RegistrationStatusCode;", "getStatusCode", "()Lcom/sportybet/android/account/international/data/model/RegistrationStatusCode;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sportybet/android/account/international/data/model/RegistrationStatusResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RegistrationStatusResponse implements Parcelable {
    private final String city;
    private final String cpf;
    private final Long dateOfBirth;
    private final String fullName;
    private final String phone;
    private final String phoneCountryCode;
    private final String state;
    private final int status;
    private final String street;

    @SerializedName("cep")
    private final String zipcode;
    public static final Parcelable.Creator<RegistrationStatusResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegistrationStatusResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistrationStatusResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RegistrationStatusResponse(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RegistrationStatusResponse[] newArray(int i) {
            return new RegistrationStatusResponse[i];
        }
    }

    public /* synthetic */ RegistrationStatusResponse(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? null : l, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : str7, (i2 & 512) != 0 ? null : str8);
    }

    public static /* synthetic */ RegistrationStatusResponse copy$default(RegistrationStatusResponse registrationStatusResponse, int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = registrationStatusResponse.status;
        }
        if ((i2 & 2) != 0) {
            str = registrationStatusResponse.cpf;
        }
        if ((i2 & 4) != 0) {
            str2 = registrationStatusResponse.phone;
        }
        if ((i2 & 8) != 0) {
            str3 = registrationStatusResponse.phoneCountryCode;
        }
        if ((i2 & 16) != 0) {
            str4 = registrationStatusResponse.fullName;
        }
        if ((i2 & 32) != 0) {
            l = registrationStatusResponse.dateOfBirth;
        }
        if ((i2 & 64) != 0) {
            str5 = registrationStatusResponse.zipcode;
        }
        if ((i2 & 128) != 0) {
            str6 = registrationStatusResponse.street;
        }
        if ((i2 & 256) != 0) {
            str7 = registrationStatusResponse.city;
        }
        if ((i2 & 512) != 0) {
            str8 = registrationStatusResponse.state;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        Long l2 = l;
        return registrationStatusResponse.copy(i, str, str2, str3, str13, l2, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCpf() {
        return this.cpf;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Long getDateOfBirth() {
        return this.dateOfBirth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getZipcode() {
        return this.zipcode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStreet() {
        return this.street;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final RegistrationStatusResponse copy(int status, String cpf, String phone, String phoneCountryCode, String fullName, Long dateOfBirth, String zipcode, String street, String city, String state) {
        cpf.getClass();
        fullName.getClass();
        return new RegistrationStatusResponse(status, cpf, phone, phoneCountryCode, fullName, dateOfBirth, zipcode, street, city, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationStatusResponse)) {
            return false;
        }
        RegistrationStatusResponse registrationStatusResponse = (RegistrationStatusResponse) other;
        return this.status == registrationStatusResponse.status && Intrinsics.g(this.cpf, registrationStatusResponse.cpf) && Intrinsics.g(this.phone, registrationStatusResponse.phone) && Intrinsics.g(this.phoneCountryCode, registrationStatusResponse.phoneCountryCode) && Intrinsics.g(this.fullName, registrationStatusResponse.fullName) && Intrinsics.g(this.dateOfBirth, registrationStatusResponse.dateOfBirth) && Intrinsics.g(this.zipcode, registrationStatusResponse.zipcode) && Intrinsics.g(this.street, registrationStatusResponse.street) && Intrinsics.g(this.city, registrationStatusResponse.city) && Intrinsics.g(this.state, registrationStatusResponse.state);
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCpf() {
        return this.cpf;
    }

    public final Long getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final String getState() {
        return this.state;
    }

    public final int getStatus() {
        return this.status;
    }

    public final RegistrationStatusCode getStatusCode() {
        return RegistrationStatusCode.INSTANCE.fromCode(this.status);
    }

    public final String getStreet() {
        return this.street;
    }

    public final String getZipcode() {
        return this.zipcode;
    }

    public int hashCode() {
        int iA = gmf0.a(Integer.hashCode(this.status) * 31, 31, this.cpf);
        String str = this.phone;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneCountryCode;
        int iA2 = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.fullName);
        Long l = this.dateOfBirth;
        int iHashCode2 = (iA2 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.zipcode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.street;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.city;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.state;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        int i = this.status;
        String str = this.cpf;
        String str2 = this.phone;
        String str3 = this.phoneCountryCode;
        String str4 = this.fullName;
        Long l = this.dateOfBirth;
        String str5 = this.zipcode;
        String str6 = this.street;
        String str7 = this.city;
        String str8 = this.state;
        StringBuilder sbA = uqe0.a(i, "RegistrationStatusResponse(status=", ", cpf=", str, ", phone=");
        hxa.c(sbA, str2, ", phoneCountryCode=", str3, ", fullName=");
        sbA.append(str4);
        sbA.append(", dateOfBirth=");
        sbA.append(l);
        sbA.append(", zipcode=");
        hxa.c(sbA, str5, ", street=", str6, ", city=");
        return kwi.a(sbA, str7, ", state=", str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.status);
        dest.writeString(this.cpf);
        dest.writeString(this.phone);
        dest.writeString(this.phoneCountryCode);
        dest.writeString(this.fullName);
        Long l = this.dateOfBirth;
        if (l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l.longValue());
        }
        dest.writeString(this.zipcode);
        dest.writeString(this.street);
        dest.writeString(this.city);
        dest.writeString(this.state);
    }

    public RegistrationStatusResponse(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8) {
        str.getClass();
        str4.getClass();
        this.status = i;
        this.cpf = str;
        this.phone = str2;
        this.phoneCountryCode = str3;
        this.fullName = str4;
        this.dateOfBirth = l;
        this.zipcode = str5;
        this.street = str6;
        this.city = str7;
        this.state = str8;
    }
}
