package com.sportybet.feature.payment.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007Ê\u0001\u0002\b\t¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult;", "Landroid/os/Parcelable;", "Success", "Failed", "Canceled", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Canceled;", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Failed;", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Success;", "api", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BindNewPhoneResult extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Canceled;", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult;", "<init>", "()V", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Canceled implements BindNewPhoneResult {
        public static final Canceled a = new Canceled();
        public static final Parcelable.Creator<Canceled> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Canceled> {
            @Override // android.os.Parcelable.Creator
            public final Canceled createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Canceled.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Canceled[] newArray(int i) {
                return new Canceled[i];
            }
        }

        private Canceled() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Failed;", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult;", "<init>", "()V", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Failed implements BindNewPhoneResult {
        public static final Failed a = new Failed();
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Failed> {
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Failed.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        private Failed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult$Success;", "Lcom/sportybet/feature/payment/api/model/BindNewPhoneResult;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success implements BindNewPhoneResult {
        public static final Parcelable.Creator<Success> CREATOR = new a();
        public final String a;
        public final String b;

        public static final class a implements Parcelable.Creator<Success> {
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Success(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.g(this.a, success.a) && Intrinsics.g(this.b, success.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Success(phoneCountryCode=", this.a, ", phone=", this.b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }
}
