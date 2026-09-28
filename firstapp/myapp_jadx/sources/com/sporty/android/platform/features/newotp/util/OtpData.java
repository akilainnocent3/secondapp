package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common.util.EmptyParcelable;
import com.sporty.android.core.model.account.AccountActivationData;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyOTPResult;
import com.sporty.android.core.model.security.biometric.BioAuthRegisterResponse;
import com.sporty.android.core.model.security.otp.OTPCompleteResult;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.ReactivateAccountResult;
import com.sporty.android.core.model.security.otp.RegisterBrOtpVerifyResult;
import com.sporty.android.core.model.security.otp.ResetSportyPINResult;
import com.sporty.android.core.model.security.otp.TradingOTPResult;
import com.sporty.android.platform.features.newotp.feature.register.revamp.RegisterRevampConfig;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.j6c;
import defpackage.mtg0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData;", "Landroid/os/Parcelable;", "Register", "RegisterBrazil", "RestPassword", "ResetPin", "Deactivate", "Reactivate", "NameUpdate", "PrimaryPhone", "BioAuth", "PhoneMigration", "PaymentCommonOtpData", "EmailChange", "DeviceBlocking", "DeviceLogout", "VerifyPrimaryPhone", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface OtpData extends Parcelable {

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$BioAuth;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class BioAuth implements OtpData {
        public static final Parcelable.Creator<BioAuth> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final OTPResult<BioAuthRegisterResponse> d;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator<BioAuth> {
            @Override // android.os.Parcelable.Creator
            public final BioAuth createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BioAuth(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (OTPResult) parcel.readParcelable(BioAuth.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final BioAuth[] newArray(int i) {
                return new BioAuth[i];
            }
        }

        public BioAuth(String str, String str2, j6c j6cVar, OTPResult<BioAuthRegisterResponse> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = oTPResult;
        }

        public static BioAuth a(BioAuth bioAuth, OTPResult oTPResult) {
            String str = bioAuth.a;
            String str2 = bioAuth.b;
            j6c j6cVar = bioAuth.c;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            return new BioAuth(str, str2, j6cVar, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BioAuth)) {
                return false;
            }
            BioAuth bioAuth = (BioAuth) obj;
            return Intrinsics.g(this.a, bioAuth.a) && Intrinsics.g(this.b, bioAuth.b) && this.c == bioAuth.c && Intrinsics.g(this.d, bioAuth.d);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BioAuth(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", result=");
            sbA.append(this.d);
            sbA.append(jbkEboCkTqmGf.oMsGegtGUUET);
            return sbA.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$Deactivate;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Deactivate implements OtpData {
        public static final Parcelable.Creator<Deactivate> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final AccountActivationData d;
        public final OTPResult<EmptyParcelable> e;

        public static final class a implements Parcelable.Creator<Deactivate> {
            @Override // android.os.Parcelable.Creator
            public final Deactivate createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Deactivate(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (AccountActivationData) parcel.readParcelable(Deactivate.class.getClassLoader()), (OTPResult) parcel.readParcelable(Deactivate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Deactivate[] newArray(int i) {
                return new Deactivate[i];
            }
        }

        public Deactivate(String str, String str2, j6c j6cVar, AccountActivationData accountActivationData, OTPResult<EmptyParcelable> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            accountActivationData.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = accountActivationData;
            this.e = oTPResult;
        }

        public static Deactivate a(Deactivate deactivate, OTPResult oTPResult) {
            String str = deactivate.a;
            String str2 = deactivate.b;
            j6c j6cVar = deactivate.c;
            AccountActivationData accountActivationData = deactivate.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            accountActivationData.getClass();
            return new Deactivate(str, str2, j6cVar, accountActivationData, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Deactivate)) {
                return false;
            }
            Deactivate deactivate = (Deactivate) obj;
            return Intrinsics.g(this.a, deactivate.a) && Intrinsics.g(this.b, deactivate.b) && this.c == deactivate.c && Intrinsics.g(this.d, deactivate.d) && Intrinsics.g(this.e, deactivate.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Deactivate(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", data=");
            sbA.append(this.d);
            sbA.append(", result=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceBlocking;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DeviceBlocking implements OtpData {
        public static final Parcelable.Creator<DeviceBlocking> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final OTPResult<OTPGeneralResult> e;

        public static final class a implements Parcelable.Creator<DeviceBlocking> {
            @Override // android.os.Parcelable.Creator
            public final DeviceBlocking createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DeviceBlocking(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), (OTPResult) parcel.readParcelable(DeviceBlocking.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeviceBlocking[] newArray(int i) {
                return new DeviceBlocking[i];
            }
        }

        public DeviceBlocking(String str, String str2, j6c j6cVar, String str3, OTPResult<OTPGeneralResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = oTPResult;
        }

        public static DeviceBlocking a(DeviceBlocking deviceBlocking, OTPResult oTPResult) {
            String str = deviceBlocking.a;
            String str2 = deviceBlocking.b;
            j6c j6cVar = deviceBlocking.c;
            String str3 = deviceBlocking.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            return new DeviceBlocking(str, str2, j6cVar, str3, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceBlocking)) {
                return false;
            }
            DeviceBlocking deviceBlocking = (DeviceBlocking) obj;
            return Intrinsics.g(this.a, deviceBlocking.a) && Intrinsics.g(this.b, deviceBlocking.b) && this.c == deviceBlocking.c && Intrinsics.g(this.d, deviceBlocking.d) && Intrinsics.g(this.e, deviceBlocking.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("DeviceBlocking(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", token=");
            sbA.append(this.d);
            sbA.append(", otpVerifiedResult=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$DeviceLogout;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DeviceLogout implements OtpData {
        public static final Parcelable.Creator<DeviceLogout> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final OTPResult<OTPGeneralResult> e;

        public static final class a implements Parcelable.Creator<DeviceLogout> {
            @Override // android.os.Parcelable.Creator
            public final DeviceLogout createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DeviceLogout(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), (OTPResult) parcel.readParcelable(DeviceLogout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final DeviceLogout[] newArray(int i) {
                return new DeviceLogout[i];
            }
        }

        public DeviceLogout(String str, String str2, j6c j6cVar, String str3, OTPResult<OTPGeneralResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = oTPResult;
        }

        public static DeviceLogout a(DeviceLogout deviceLogout, OTPResult oTPResult) {
            String str = deviceLogout.a;
            String str2 = deviceLogout.b;
            j6c j6cVar = deviceLogout.c;
            String str3 = deviceLogout.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            return new DeviceLogout(str, str2, j6cVar, str3, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeviceLogout)) {
                return false;
            }
            DeviceLogout deviceLogout = (DeviceLogout) obj;
            return Intrinsics.g(this.a, deviceLogout.a) && Intrinsics.g(this.b, deviceLogout.b) && this.c == deviceLogout.c && Intrinsics.g(this.d, deviceLogout.d) && Intrinsics.g(this.e, deviceLogout.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("DeviceLogout(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", token=");
            sbA.append(this.d);
            sbA.append(", otpVerifiedResult=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$EmailChange;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class EmailChange implements OtpData {
        public static final Parcelable.Creator<EmailChange> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final OTPResult<OTPGeneralResult> e;

        public static final class a implements Parcelable.Creator<EmailChange> {
            @Override // android.os.Parcelable.Creator
            public final EmailChange createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new EmailChange(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), (OTPResult) parcel.readParcelable(EmailChange.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EmailChange[] newArray(int i) {
                return new EmailChange[i];
            }
        }

        public EmailChange(String str, String str2, j6c j6cVar, String str3, OTPResult<OTPGeneralResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = oTPResult;
        }

        public static EmailChange a(EmailChange emailChange, OTPResult oTPResult) {
            String str = emailChange.a;
            String str2 = emailChange.b;
            j6c j6cVar = emailChange.c;
            String str3 = emailChange.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            return new EmailChange(str, str2, j6cVar, str3, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmailChange)) {
                return false;
            }
            EmailChange emailChange = (EmailChange) obj;
            return Intrinsics.g(this.a, emailChange.a) && Intrinsics.g(this.b, emailChange.b) && this.c == emailChange.c && Intrinsics.g(this.d, emailChange.d) && Intrinsics.g(this.e, emailChange.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("EmailChange(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", token=");
            sbA.append(this.d);
            sbA.append(", otpVerifiedResult=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NameUpdate implements OtpData {
        public static final Parcelable.Creator<NameUpdate> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final String e;
        public final OTPResult<OTPUpdateNameResult> f;

        public static final class a implements Parcelable.Creator<NameUpdate> {
            @Override // android.os.Parcelable.Creator
            public final NameUpdate createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new NameUpdate(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), (OTPResult) parcel.readParcelable(NameUpdate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final NameUpdate[] newArray(int i) {
                return new NameUpdate[i];
            }
        }

        public NameUpdate(String str, String str2, j6c j6cVar, String str3, String str4, OTPResult<OTPUpdateNameResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            str4.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = str4;
            this.f = oTPResult;
        }

        public static NameUpdate a(NameUpdate nameUpdate, OTPResult oTPResult) {
            String str = nameUpdate.a;
            String str2 = nameUpdate.b;
            j6c j6cVar = nameUpdate.c;
            String str3 = nameUpdate.d;
            String str4 = nameUpdate.e;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            str4.getClass();
            return new NameUpdate(str, str2, j6cVar, str3, str4, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NameUpdate)) {
                return false;
            }
            NameUpdate nameUpdate = (NameUpdate) obj;
            return Intrinsics.g(this.a, nameUpdate.a) && Intrinsics.g(this.b, nameUpdate.b) && this.c == nameUpdate.c && Intrinsics.g(this.d, nameUpdate.d) && Intrinsics.g(this.e, nameUpdate.e) && Intrinsics.g(this.f, nameUpdate.f);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.f.hashCode() + gmf0.a(gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("NameUpdate(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", sessionToken=");
            sbA.append(this.d);
            sbA.append(", callbackName=");
            sbA.append(this.e);
            sbA.append(", result=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$PhoneMigration;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PhoneMigration implements OtpData {
        public static final Parcelable.Creator<PhoneMigration> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final boolean e;
        public final OTPResult<OTPGeneralResult> f;

        public static final class a implements Parcelable.Creator<PhoneMigration> {
            @Override // android.os.Parcelable.Creator
            public final PhoneMigration createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PhoneMigration(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, (OTPResult) parcel.readParcelable(PhoneMigration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PhoneMigration[] newArray(int i) {
                return new PhoneMigration[i];
            }
        }

        public PhoneMigration(String str, String str2, j6c j6cVar, String str3, boolean z, OTPResult<OTPGeneralResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = z;
            this.f = oTPResult;
        }

        public static PhoneMigration a(PhoneMigration phoneMigration, OTPResult oTPResult) {
            String str = phoneMigration.a;
            String str2 = phoneMigration.b;
            j6c j6cVar = phoneMigration.c;
            String str3 = phoneMigration.d;
            boolean z = phoneMigration.e;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            return new PhoneMigration(str, str2, j6cVar, str3, z, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PhoneMigration)) {
                return false;
            }
            PhoneMigration phoneMigration = (PhoneMigration) obj;
            return Intrinsics.g(this.a, phoneMigration.a) && Intrinsics.g(this.b, phoneMigration.b) && this.c == phoneMigration.c && Intrinsics.g(this.d, phoneMigration.d) && this.e == phoneMigration.e && Intrinsics.g(this.f, phoneMigration.f);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.f.hashCode() + mtg0.a(gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("PhoneMigration(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", token=");
            sbA.append(this.d);
            sbA.append(", isMain=");
            sbA.append(this.e);
            sbA.append(", otpVerifiedResult=");
            sbA.append(this.f);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeParcelable(this.f, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$PrimaryPhone;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PrimaryPhone implements OtpData {
        public static final Parcelable.Creator<PrimaryPhone> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final boolean d;
        public final int e;
        public final String f;
        public final OTPResult<PrimaryPhoneVerifyOTPResult> i;

        public static final class a implements Parcelable.Creator<PrimaryPhone> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryPhone createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PrimaryPhone(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), (OTPResult) parcel.readParcelable(PrimaryPhone.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryPhone[] newArray(int i) {
                return new PrimaryPhone[i];
            }
        }

        public PrimaryPhone(String str, String str2, j6c j6cVar, boolean z, int i, String str3, OTPResult<PrimaryPhoneVerifyOTPResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = z;
            this.e = i;
            this.f = str3;
            this.i = oTPResult;
        }

        public static PrimaryPhone a(PrimaryPhone primaryPhone, OTPResult oTPResult) {
            String str = primaryPhone.a;
            String str2 = primaryPhone.b;
            j6c j6cVar = primaryPhone.c;
            boolean z = primaryPhone.d;
            int i = primaryPhone.e;
            String str3 = primaryPhone.f;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            return new PrimaryPhone(str, str2, j6cVar, z, i, str3, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryPhone)) {
                return false;
            }
            PrimaryPhone primaryPhone = (PrimaryPhone) obj;
            return Intrinsics.g(this.a, primaryPhone.a) && Intrinsics.g(this.b, primaryPhone.b) && this.c == primaryPhone.c && this.d == primaryPhone.d && this.e == primaryPhone.e && Intrinsics.g(this.f, primaryPhone.f) && Intrinsics.g(this.i, primaryPhone.i);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.i.hashCode() + gmf0.a(gpp.a(this.e, mtg0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("PrimaryPhone(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", isNewPhone=");
            sbA.append(this.d);
            sbA.append(", otpSelectionTitleRes=");
            f78.b(this.e, ", token=", this.f, ", result=", sbA);
            sbA.append(this.i);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeInt(this.e);
            parcel.writeString(this.f);
            parcel.writeParcelable(this.i, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$Reactivate;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Reactivate implements OtpData {
        public static final Parcelable.Creator<Reactivate> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final AccountActivationData d;
        public final OTPResult<ReactivateAccountResult> e;

        public static final class a implements Parcelable.Creator<Reactivate> {
            @Override // android.os.Parcelable.Creator
            public final Reactivate createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Reactivate(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (AccountActivationData) parcel.readParcelable(Reactivate.class.getClassLoader()), (OTPResult) parcel.readParcelable(Reactivate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Reactivate[] newArray(int i) {
                return new Reactivate[i];
            }
        }

        public Reactivate(String str, String str2, j6c j6cVar, AccountActivationData accountActivationData, OTPResult<ReactivateAccountResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            accountActivationData.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = accountActivationData;
            this.e = oTPResult;
        }

        public static Reactivate a(Reactivate reactivate, OTPResult oTPResult) {
            String str = reactivate.a;
            String str2 = reactivate.b;
            j6c j6cVar = reactivate.c;
            AccountActivationData accountActivationData = reactivate.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            accountActivationData.getClass();
            return new Reactivate(str, str2, j6cVar, accountActivationData, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reactivate)) {
                return false;
            }
            Reactivate reactivate = (Reactivate) obj;
            return Intrinsics.g(this.a, reactivate.a) && Intrinsics.g(this.b, reactivate.b) && this.c == reactivate.c && Intrinsics.g(this.d, reactivate.d) && Intrinsics.g(this.e, reactivate.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Reactivate(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", data=");
            sbA.append(this.d);
            sbA.append(", result=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }
    }

    /* JADX INFO: renamed from: a0 */
    j6c getC();

    /* JADX INFO: renamed from: getCountryCode */
    String getA();

    /* JADX INFO: renamed from: getPhone */
    String getB();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$PaymentCommonOtpData;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PaymentCommonOtpData implements OtpData {
        public static final Parcelable.Creator<PaymentCommonOtpData> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public OTPResult<TradingOTPResult> d;

        public static final class a implements Parcelable.Creator<PaymentCommonOtpData> {
            @Override // android.os.Parcelable.Creator
            public final PaymentCommonOtpData createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PaymentCommonOtpData(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (OTPResult) parcel.readParcelable(PaymentCommonOtpData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final PaymentCommonOtpData[] newArray(int i) {
                return new PaymentCommonOtpData[i];
            }
        }

        public PaymentCommonOtpData(String str, String str2, j6c j6cVar, OTPResult<TradingOTPResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = oTPResult;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentCommonOtpData)) {
                return false;
            }
            PaymentCommonOtpData paymentCommonOtpData = (PaymentCommonOtpData) obj;
            return Intrinsics.g(this.a, paymentCommonOtpData.a) && Intrinsics.g(this.b, paymentCommonOtpData.b) && this.c == paymentCommonOtpData.c && Intrinsics.g(this.d, paymentCommonOtpData.d);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            OTPResult<TradingOTPResult> oTPResult = this.d;
            StringBuilder sbA = ux5.a("PaymentCommonOtpData(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", result=");
            sbA.append(oTPResult);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
        }

        public /* synthetic */ PaymentCommonOtpData(String str, String str2, j6c j6cVar) {
            this(str, str2, j6cVar, OTPResult.NoResult.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$ResetPin;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class ResetPin implements OtpData {
        public static final Parcelable.Creator<ResetPin> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final OTPResult<ResetSportyPINResult> d;

        public static final class a implements Parcelable.Creator<ResetPin> {
            @Override // android.os.Parcelable.Creator
            public final ResetPin createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ResetPin(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (OTPResult) parcel.readParcelable(ResetPin.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ResetPin[] newArray(int i) {
                return new ResetPin[i];
            }
        }

        public ResetPin(String str, String str2, j6c j6cVar, OTPResult<ResetSportyPINResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = oTPResult;
        }

        public static ResetPin a(ResetPin resetPin, OTPResult oTPResult) {
            String str = resetPin.a;
            String str2 = resetPin.b;
            j6c j6cVar = resetPin.c;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            return new ResetPin(str, str2, j6cVar, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ResetPin)) {
                return false;
            }
            ResetPin resetPin = (ResetPin) obj;
            return Intrinsics.g(this.a, resetPin.a) && Intrinsics.g(this.b, resetPin.b) && this.c == resetPin.c && Intrinsics.g(this.d, resetPin.d);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("ResetPin(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", result=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ResetPin() {
            String str = null;
            this(str, str, 15);
        }

        public /* synthetic */ ResetPin(String str, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j6c.RESET_PIN, OTPResult.NoResult.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$RestPassword;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RestPassword implements OtpData {
        public static final Parcelable.Creator<RestPassword> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final OTPResult<OTPGeneralResult> d;

        public static final class a implements Parcelable.Creator<RestPassword> {
            @Override // android.os.Parcelable.Creator
            public final RestPassword createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RestPassword(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (OTPResult) parcel.readParcelable(RestPassword.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RestPassword[] newArray(int i) {
                return new RestPassword[i];
            }
        }

        public RestPassword(String str, String str2, j6c j6cVar, OTPResult<OTPGeneralResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = oTPResult;
        }

        public static RestPassword a(RestPassword restPassword, OTPResult oTPResult) {
            String str = restPassword.a;
            String str2 = restPassword.b;
            j6c j6cVar = restPassword.c;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            return new RestPassword(str, str2, j6cVar, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestPassword)) {
                return false;
            }
            RestPassword restPassword = (RestPassword) obj;
            return Intrinsics.g(this.a, restPassword.a) && Intrinsics.g(this.b, restPassword.b) && this.c == restPassword.c && Intrinsics.g(this.d, restPassword.d);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RestPassword(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", result=");
            sbA.append(this.d);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RestPassword() {
            String str = null;
            this(str, str, 15);
        }

        public /* synthetic */ RestPassword(String str, String str2, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j6c.RESET_PASSWORD, OTPResult.NoResult.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$VerifyPrimaryPhone;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VerifyPrimaryPhone implements OtpData {
        public static final Parcelable.Creator<VerifyPrimaryPhone> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final int d;
        public final OTPResult<TradingOTPResult> e;

        public static final class a implements Parcelable.Creator<VerifyPrimaryPhone> {
            @Override // android.os.Parcelable.Creator
            public final VerifyPrimaryPhone createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new VerifyPrimaryPhone(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readInt(), (OTPResult) parcel.readParcelable(VerifyPrimaryPhone.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final VerifyPrimaryPhone[] newArray(int i) {
                return new VerifyPrimaryPhone[i];
            }
        }

        public VerifyPrimaryPhone(String str, String str2, j6c j6cVar, int i, OTPResult<TradingOTPResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = i;
            this.e = oTPResult;
        }

        public static VerifyPrimaryPhone a(VerifyPrimaryPhone verifyPrimaryPhone, OTPResult oTPResult) {
            String str = verifyPrimaryPhone.a;
            String str2 = verifyPrimaryPhone.b;
            j6c j6cVar = verifyPrimaryPhone.c;
            int i = verifyPrimaryPhone.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            return new VerifyPrimaryPhone(str, str2, j6cVar, i, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyPrimaryPhone)) {
                return false;
            }
            VerifyPrimaryPhone verifyPrimaryPhone = (VerifyPrimaryPhone) obj;
            return Intrinsics.g(this.a, verifyPrimaryPhone.a) && Intrinsics.g(this.b, verifyPrimaryPhone.b) && this.c == verifyPrimaryPhone.c && this.d == verifyPrimaryPhone.d && Intrinsics.g(this.e, verifyPrimaryPhone.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.a;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final int hashCode() {
            return this.e.hashCode() + gpp.a(this.d, (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("VerifyPrimaryPhone(countryCode=", this.a, ", phone=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", otpSelectionTitleRes=");
            sbA.append(this.d);
            sbA.append(", result=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, i);
        }

        public /* synthetic */ VerifyPrimaryPhone(String str, String str2, int i) {
            this(str, str2, j6c.BIND_PHONE_PRIMARY, (i & 8) != 0 ? R.string.common_otp_verify__verify_mobile_number : R.string.page_login__claim_welcome_bonus, OTPResult.NoResult.a);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$RegisterBrazil;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RegisterBrazil implements OtpData {
        public static final Parcelable.Creator<RegisterBrazil> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final String d;
        public final OTPResult<RegisterBrOtpVerifyResult> e;

        public static final class a implements Parcelable.Creator<RegisterBrazil> {
            @Override // android.os.Parcelable.Creator
            public final RegisterBrazil createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RegisterBrazil(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), parcel.readString(), (OTPResult) parcel.readParcelable(RegisterBrazil.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RegisterBrazil[] newArray(int i) {
                return new RegisterBrazil[i];
            }
        }

        public /* synthetic */ RegisterBrazil(String str, String str2, String str3, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j6c.REGISTER, (i & 8) != 0 ? "" : str3, OTPResult.NoResult.a);
        }

        public static RegisterBrazil a(RegisterBrazil registerBrazil, OTPResult oTPResult) {
            String str = registerBrazil.a;
            String str2 = registerBrazil.b;
            j6c j6cVar = registerBrazil.c;
            String str3 = registerBrazil.d;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            return new RegisterBrazil(str, str2, j6cVar, str3, oTPResult);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterBrazil)) {
                return false;
            }
            RegisterBrazil registerBrazil = (RegisterBrazil) obj;
            return Intrinsics.g(this.a, registerBrazil.a) && Intrinsics.g(this.b, registerBrazil.b) && this.c == registerBrazil.c && Intrinsics.g(this.d, registerBrazil.d) && Intrinsics.g(this.e, registerBrazil.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("RegisterBrazil(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", email=");
            sbA.append(this.d);
            sbA.append(", otpCompleteResult=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RegisterBrazil(String str, String str2, j6c j6cVar, String str3, OTPResult<? extends RegisterBrOtpVerifyResult> oTPResult) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            str3.getClass();
            oTPResult.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = str3;
            this.e = oTPResult;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public RegisterBrazil() {
            String str = null;
            this(str, str, str, 31);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OtpData$Register;", "Lcom/sporty/android/platform/features/newotp/util/OtpData;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Register implements OtpData {
        public static final Parcelable.Creator<Register> CREATOR = new a();
        public final String a;
        public final String b;
        public final j6c c;
        public final OTPResult<OTPCompleteResult> d;
        public final RegisterRevampConfig e;

        public static final class a implements Parcelable.Creator<Register> {
            @Override // android.os.Parcelable.Creator
            public final Register createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Register(parcel.readString(), parcel.readString(), j6c.valueOf(parcel.readString()), (OTPResult<OTPCompleteResult>) parcel.readParcelable(Register.class.getClassLoader()), (RegisterRevampConfig) parcel.readParcelable(Register.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Register[] newArray(int i) {
                return new Register[i];
            }
        }

        public /* synthetic */ Register(String str, String str2, OTPResult.Success success, RegisterRevampConfig registerRevampConfig, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, j6c.REGISTER, (OTPResult<OTPCompleteResult>) ((i & 8) != 0 ? OTPResult.NoResult.a : success), (i & 16) != 0 ? RegisterRevampConfig.Default.a : registerRevampConfig);
        }

        public static Register a(Register register, OTPResult oTPResult) {
            String str = register.a;
            String str2 = register.b;
            j6c j6cVar = register.c;
            RegisterRevampConfig registerRevampConfig = register.e;
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            registerRevampConfig.getClass();
            return new Register(str, str2, j6cVar, (OTPResult<OTPCompleteResult>) oTPResult, registerRevampConfig);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: a0, reason: from getter */
        public final j6c getC() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Register)) {
                return false;
            }
            Register register = (Register) obj;
            return Intrinsics.g(this.a, register.a) && Intrinsics.g(this.b, register.b) && this.c == register.c && Intrinsics.g(this.d, register.d) && Intrinsics.g(this.e, register.e);
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getCountryCode, reason: from getter */
        public final String getA() {
            return this.b;
        }

        @Override // com.sporty.android.platform.features.newotp.util.OtpData
        /* JADX INFO: renamed from: getPhone, reason: from getter */
        public final String getB() {
            return this.a;
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Register(phone=", this.a, ", countryCode=", this.b, ", otpActionType=");
            sbA.append(this.c);
            sbA.append(", otpCompleteResult=");
            sbA.append(this.d);
            sbA.append(", config=");
            sbA.append(this.e);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }

        public Register(String str, String str2, j6c j6cVar, OTPResult<OTPCompleteResult> oTPResult, RegisterRevampConfig registerRevampConfig) {
            str.getClass();
            str2.getClass();
            j6cVar.getClass();
            oTPResult.getClass();
            registerRevampConfig.getClass();
            this.a = str;
            this.b = str2;
            this.c = j6cVar;
            this.d = oTPResult;
            this.e = registerRevampConfig;
        }

        public Register() {
            this((String) null, (String) null, (OTPResult.Success) null, (RegisterRevampConfig) null, 31);
        }
    }
}
