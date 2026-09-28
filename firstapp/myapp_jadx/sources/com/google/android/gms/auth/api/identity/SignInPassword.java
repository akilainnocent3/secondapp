package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.nlk0;
import defpackage.scy;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInPassword> CREATOR = new nlk0();
    public final String a;
    public final String b;

    public SignInPassword(String str, String str2) {
        hm20.i(str, "Account identifier cannot be null");
        String strTrim = str.trim();
        hm20.f(strTrim, "Account identifier cannot be empty");
        this.a = strTrim;
        hm20.e(str2);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInPassword)) {
            return false;
        }
        SignInPassword signInPassword = (SignInPassword) obj;
        return scy.a(this.a, signInPassword.a) && scy.a(this.b, signInPassword.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.n(parcel, iM);
    }
}
