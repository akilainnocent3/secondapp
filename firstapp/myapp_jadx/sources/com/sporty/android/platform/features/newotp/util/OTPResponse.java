package com.sporty.android.platform.features.newotp.util;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.pe4;
import defpackage.ux5;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResponse;", "Landroid/os/Parcelable;", "NoResponse", "OTP", "Reverse", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse$NoResponse;", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse$OTP;", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse$Reverse;", "sportyplatform", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface OTPResponse extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResponse$NoResponse;", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class NoResponse implements OTPResponse {
        public static final NoResponse a = new NoResponse();
        public static final Parcelable.Creator<NoResponse> CREATOR = new a();

        public static final class a implements Parcelable.Creator<NoResponse> {
            @Override // android.os.Parcelable.Creator
            public final NoResponse createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return NoResponse.a;
            }

            @Override // android.os.Parcelable.Creator
            public final NoResponse[] newArray(int i) {
                return new NoResponse[i];
            }
        }

        private NoResponse() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NoResponse);
        }

        public final int hashCode() {
            return -1745295906;
        }

        public final String toString() {
            return "NoResponse";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResponse$OTP;", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class OTP implements OTPResponse {
        public static final Parcelable.Creator<OTP> CREATOR = new a();
        public final int a;

        public static final class a implements Parcelable.Creator<OTP> {
            @Override // android.os.Parcelable.Creator
            public final OTP createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OTP(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final OTP[] newArray(int i) {
                return new OTP[i];
            }
        }

        public OTP(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OTP) && this.a == ((OTP) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "OTP(remaining=", ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
        }

        public OTP() {
            this(0);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/util/OTPResponse$Reverse;", "Lcom/sporty/android/platform/features/newotp/util/OTPResponse;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Reverse implements OTPResponse {
        public static final Parcelable.Creator<Reverse> CREATOR = new a();
        public final String a;
        public final String b;
        public final long c;
        public final long d;

        public static final class a implements Parcelable.Creator<Reverse> {
            @Override // android.os.Parcelable.Creator
            public final Reverse createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Reverse(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Reverse[] newArray(int i) {
                return new Reverse[i];
            }
        }

        public Reverse(String str, String str2, long j, long j2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = j;
            this.d = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Reverse)) {
                return false;
            }
            Reverse reverse = (Reverse) obj;
            return Intrinsics.g(this.a, reverse.a) && Intrinsics.g(this.b, reverse.b) && this.c == reverse.c && this.d == reverse.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + f87.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("Reverse(code=", this.a, ", providerPhone=", this.b, ", localStartTime=");
            sbA.append(this.c);
            return zug.a(this.d, ", serverStartTime=", ")", sbA);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
        }

        public Reverse() {
            this(0);
        }

        public /* synthetic */ Reverse(int i) {
            this("", "", 0L, 0L);
        }
    }
}
