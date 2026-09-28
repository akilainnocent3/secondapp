package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import defpackage.hm20;
import defpackage.mlk0;
import defpackage.scy;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInCredential> CREATOR = new mlk0();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Uri e;
    public final String f;
    public final String i;
    public final String v;
    public final PublicKeyCredential w;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        hm20.h(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.i = str6;
        this.v = str7;
        this.w = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return scy.a(this.a, signInCredential.a) && scy.a(this.b, signInCredential.b) && scy.a(this.c, signInCredential.c) && scy.a(this.d, signInCredential.d) && scy.a(this.e, signInCredential.e) && scy.a(this.f, signInCredential.f) && scy.a(this.i, signInCredential.i) && scy.a(this.v, signInCredential.v) && scy.a(this.w, signInCredential.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.i(parcel, 3, this.c, false);
        uif.i(parcel, 4, this.d, false);
        uif.h(parcel, 5, this.e, i, false);
        uif.i(parcel, 6, this.f, false);
        uif.i(parcel, 7, this.i, false);
        uif.i(parcel, 8, this.v, false);
        uif.h(parcel, 9, this.w, i, false);
        uif.n(parcel, iM);
    }
}
