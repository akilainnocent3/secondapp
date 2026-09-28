package com.sporty.android.platform.features.kyc.domain.phonemigrate;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.kyc.phonemigration.MigratePhoneBody;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÊ\u0001\u0002\b\u0011¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "Landroid/os/Parcelable;", "VerifyNameMatch", "LaunchMainOTP", "LaunchSubsidiaryOTP", "MigratePhone", "Dismiss", "DepositTransferSuccess", "Cancel", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$Cancel;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$DepositTransferSuccess;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$Dismiss;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$LaunchMainOTP;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$LaunchSubsidiaryOTP;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$MigratePhone;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$VerifyNameMatch;", "sportyplatform", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface PhoneMigrateEvent extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$Cancel;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Cancel implements PhoneMigrateEvent {
        public static final Cancel a = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Cancel.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return 1166402396;
        }

        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$DepositTransferSuccess;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class DepositTransferSuccess implements PhoneMigrateEvent {
        public static final DepositTransferSuccess a = new DepositTransferSuccess();
        public static final Parcelable.Creator<DepositTransferSuccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator<DepositTransferSuccess> {
            @Override // android.os.Parcelable.Creator
            public final DepositTransferSuccess createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return DepositTransferSuccess.a;
            }

            @Override // android.os.Parcelable.Creator
            public final DepositTransferSuccess[] newArray(int i) {
                return new DepositTransferSuccess[i];
            }
        }

        private DepositTransferSuccess() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DepositTransferSuccess);
        }

        public final int hashCode() {
            return 345699324;
        }

        public final String toString() {
            return "DepositTransferSuccess";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$Dismiss;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Dismiss implements PhoneMigrateEvent {
        public static final Dismiss a = new Dismiss();
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Dismiss> {
            @Override // android.os.Parcelable.Creator
            public final Dismiss createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Dismiss.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Dismiss[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        private Dismiss() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Dismiss);
        }

        public final int hashCode() {
            return -1374774808;
        }

        public final String toString() {
            return "Dismiss";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$LaunchMainOTP;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LaunchMainOTP implements PhoneMigrateEvent {
        public static final Parcelable.Creator<LaunchMainOTP> CREATOR = new a();
        public final OtpModule<OtpData.PhoneMigration> a;

        public static final class a implements Parcelable.Creator<LaunchMainOTP> {
            @Override // android.os.Parcelable.Creator
            public final LaunchMainOTP createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LaunchMainOTP(OtpModule.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchMainOTP[] newArray(int i) {
                return new LaunchMainOTP[i];
            }
        }

        public LaunchMainOTP(OtpModule<OtpData.PhoneMigration> otpModule) {
            otpModule.getClass();
            this.a = otpModule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchMainOTP) && Intrinsics.g(this.a, ((LaunchMainOTP) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchMainOTP(module=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.a.writeToParcel(parcel, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$LaunchSubsidiaryOTP;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LaunchSubsidiaryOTP implements PhoneMigrateEvent {
        public static final Parcelable.Creator<LaunchSubsidiaryOTP> CREATOR = new a();
        public final OtpModule<OtpData.PhoneMigration> a;

        public static final class a implements Parcelable.Creator<LaunchSubsidiaryOTP> {
            @Override // android.os.Parcelable.Creator
            public final LaunchSubsidiaryOTP createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LaunchSubsidiaryOTP(OtpModule.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchSubsidiaryOTP[] newArray(int i) {
                return new LaunchSubsidiaryOTP[i];
            }
        }

        public LaunchSubsidiaryOTP(OtpModule<OtpData.PhoneMigration> otpModule) {
            otpModule.getClass();
            this.a = otpModule;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LaunchSubsidiaryOTP) && Intrinsics.g(this.a, ((LaunchSubsidiaryOTP) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "LaunchSubsidiaryOTP(module=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.a.writeToParcel(parcel, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$MigratePhone;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class MigratePhone implements PhoneMigrateEvent {
        public static final Parcelable.Creator<MigratePhone> CREATOR = new a();
        public final MigratePhoneBody a;

        public static final class a implements Parcelable.Creator<MigratePhone> {
            @Override // android.os.Parcelable.Creator
            public final MigratePhone createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MigratePhone((MigratePhoneBody) parcel.readParcelable(MigratePhone.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MigratePhone[] newArray(int i) {
                return new MigratePhone[i];
            }
        }

        public MigratePhone(MigratePhoneBody migratePhoneBody) {
            migratePhoneBody.getClass();
            this.a = migratePhoneBody;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MigratePhone) && Intrinsics.g(this.a, ((MigratePhone) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MigratePhone(params=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent$VerifyNameMatch;", "Lcom/sporty/android/platform/features/kyc/domain/phonemigrate/PhoneMigrateEvent;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VerifyNameMatch implements PhoneMigrateEvent {
        public static final Parcelable.Creator<VerifyNameMatch> CREATOR = new a();
        public final String a;

        public static final class a implements Parcelable.Creator<VerifyNameMatch> {
            @Override // android.os.Parcelable.Creator
            public final VerifyNameMatch createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new VerifyNameMatch(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VerifyNameMatch[] newArray(int i) {
                return new VerifyNameMatch[i];
            }
        }

        public VerifyNameMatch(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VerifyNameMatch) && Intrinsics.g(this.a, ((VerifyNameMatch) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("VerifyNameMatch(passwordVerifyToken=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }
}
