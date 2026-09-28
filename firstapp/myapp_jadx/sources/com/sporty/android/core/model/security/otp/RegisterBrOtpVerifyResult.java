package com.sporty.android.core.model.security.otp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult;", "Landroid/os/Parcelable;", "VerifiedWithoutData", "VerifiedWithData", "Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult$VerifiedWithData;", "Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult$VerifiedWithoutData;", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface RegisterBrOtpVerifyResult extends Parcelable {

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u000bHÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult$VerifiedWithData;", "Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult;", "data", "Lcom/sporty/android/core/model/security/otp/OTPCompleteResult;", "<init>", "(Lcom/sporty/android/core/model/security/otp/OTPCompleteResult;)V", "getData", "()Lcom/sporty/android/core/model/security/otp/OTPCompleteResult;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VerifiedWithData implements RegisterBrOtpVerifyResult {
        public static final Parcelable.Creator<VerifiedWithData> CREATOR = new Creator();
        private final OTPCompleteResult data;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifiedWithData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifiedWithData createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new VerifiedWithData(OTPCompleteResult.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifiedWithData[] newArray(int i) {
                return new VerifiedWithData[i];
            }
        }

        public VerifiedWithData(OTPCompleteResult oTPCompleteResult) {
            oTPCompleteResult.getClass();
            this.data = oTPCompleteResult;
        }

        public static /* synthetic */ VerifiedWithData copy$default(VerifiedWithData verifiedWithData, OTPCompleteResult oTPCompleteResult, int i, Object obj) {
            if ((i & 1) != 0) {
                oTPCompleteResult = verifiedWithData.data;
            }
            return verifiedWithData.copy(oTPCompleteResult);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final OTPCompleteResult getData() {
            return this.data;
        }

        public final VerifiedWithData copy(OTPCompleteResult data) {
            data.getClass();
            return new VerifiedWithData(data);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VerifiedWithData) && Intrinsics.g(this.data, ((VerifiedWithData) other).data);
        }

        public final OTPCompleteResult getData() {
            return this.data;
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "VerifiedWithData(data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            this.data.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005Ê\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult$VerifiedWithoutData;", "Lcom/sporty/android/core/model/security/otp/RegisterBrOtpVerifyResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class VerifiedWithoutData implements RegisterBrOtpVerifyResult {
        public static final VerifiedWithoutData INSTANCE = new VerifiedWithoutData();
        public static final Parcelable.Creator<VerifiedWithoutData> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerifiedWithoutData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifiedWithoutData createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return VerifiedWithoutData.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerifiedWithoutData[] newArray(int i) {
                return new VerifiedWithoutData[i];
            }
        }

        private VerifiedWithoutData() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof VerifiedWithoutData);
        }

        public int hashCode() {
            return -1833983630;
        }

        public String toString() {
            return "VerifiedWithoutData";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }
    }
}
