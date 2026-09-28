package com.sporty.android.platform.features.account.verifiedemailchange.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sporty/android/platform/features/account/verifiedemailchange/model/EmailChangeVerificationArgs;", "Landroid/os/Parcelable;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EmailChangeVerificationArgs implements Parcelable {
    public static final Parcelable.Creator<EmailChangeVerificationArgs> CREATOR = new a();
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public static final class a implements Parcelable.Creator<EmailChangeVerificationArgs> {
        @Override // android.os.Parcelable.Creator
        public final EmailChangeVerificationArgs createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new EmailChangeVerificationArgs(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EmailChangeVerificationArgs[] newArray(int i) {
            return new EmailChangeVerificationArgs[i];
        }
    }

    public EmailChangeVerificationArgs(boolean z, boolean z2, boolean z3, String str) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailChangeVerificationArgs)) {
            return false;
        }
        EmailChangeVerificationArgs emailChangeVerificationArgs = (EmailChangeVerificationArgs) obj;
        return Intrinsics.g(this.a, emailChangeVerificationArgs.a) && this.b == emailChangeVerificationArgs.b && this.c == emailChangeVerificationArgs.c && this.d == emailChangeVerificationArgs.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return lng.a(", shouldPassPin=", ")", z620.a("EmailChangeVerificationArgs(token=", this.a, ", shouldPassOtp=", ", shouldPassPassword=", this.b), this.c, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
