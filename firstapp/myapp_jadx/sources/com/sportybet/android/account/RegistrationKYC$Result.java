package com.sportybet.android.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.account.RegistrationData;

/* JADX INFO: loaded from: classes5.dex */
public class RegistrationKYC$Result implements Parcelable {
    public static final Parcelable.Creator<RegistrationKYC$Result> CREATOR = new a();
    public String a;
    public boolean b;
    public RegistrationData c;

    public class a implements Parcelable.Creator<RegistrationKYC$Result> {
        @Override // android.os.Parcelable.Creator
        public final RegistrationKYC$Result createFromParcel(Parcel parcel) {
            RegistrationKYC$Result registrationKYC$Result = new RegistrationKYC$Result();
            registrationKYC$Result.a = parcel.readString();
            registrationKYC$Result.b = parcel.readByte() != 0;
            registrationKYC$Result.c = (RegistrationData) parcel.readParcelable(RegistrationData.class.getClassLoader());
            return registrationKYC$Result;
        }

        @Override // android.os.Parcelable.Creator
        public final RegistrationKYC$Result[] newArray(int i) {
            return new RegistrationKYC$Result[i];
        }
    }

    public RegistrationKYC$Result(String str, boolean z, RegistrationData registrationData) {
        this.a = str;
        this.b = z;
        this.c = registrationData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Result{source='" + this.a + "', confirmed=" + this.b + ", registrationData=" + this.c + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.c, i);
    }
}
