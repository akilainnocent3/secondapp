package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.uif;
import defpackage.vjk0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new vjk0();

    @Deprecated
    public final String a;
    public final GoogleSignInAccount b;

    @Deprecated
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        hm20.f(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        hm20.f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 4, this.a, false);
        uif.h(parcel, 7, this.b, i, false);
        uif.i(parcel, 8, this.c, false);
        uif.n(parcel, iM);
    }
}
