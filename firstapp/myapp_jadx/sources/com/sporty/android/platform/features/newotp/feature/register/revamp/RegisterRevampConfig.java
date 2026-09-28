package com.sporty.android.platform.features.newotp.feature.register.revamp;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fv40;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig;", "Landroid/os/Parcelable;", "Default", "Revamp", "Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig$Default;", "Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig$Revamp;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface RegisterRevampConfig extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig$Default;", "Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Default implements RegisterRevampConfig {
        public static final Default a = new Default();
        public static final Parcelable.Creator<Default> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Default.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i) {
                return new Default[i];
            }
        }

        private Default() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return -1656707195;
        }

        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig$Revamp;", "Lcom/sporty/android/platform/features/newotp/feature/register/revamp/RegisterRevampConfig;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Revamp implements RegisterRevampConfig {
        public static final Parcelable.Creator<Revamp> CREATOR = new a();
        public final fv40 a;

        public static final class a implements Parcelable.Creator<Revamp> {
            @Override // android.os.Parcelable.Creator
            public final Revamp createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Revamp(fv40.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Revamp[] newArray(int i) {
                return new Revamp[i];
            }
        }

        public Revamp(fv40 fv40Var) {
            fv40Var.getClass();
            this.a = fv40Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Revamp) && this.a == ((Revamp) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Revamp(startDestination=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
        }

        public Revamp() {
            this(fv40.a);
        }
    }
}
