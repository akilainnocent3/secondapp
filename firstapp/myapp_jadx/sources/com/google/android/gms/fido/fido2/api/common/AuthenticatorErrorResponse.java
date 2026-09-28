package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lok0;
import defpackage.m8j;
import defpackage.qok0;
import defpackage.rel0;
import defpackage.scy;
import defpackage.tnk0;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new rel0();
    public final ErrorCode a;
    public final String b;
    public final int c;

    public AuthenticatorErrorResponse(int i, int i2, String str) {
        try {
            this.a = ErrorCode.a(i);
            this.b = str;
            this.c = i2;
        } catch (ErrorCode.a e) {
            m8j.a(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        return scy.a(this.a, authenticatorErrorResponse.a) && scy.a(this.b, authenticatorErrorResponse.b) && scy.a(Integer.valueOf(this.c), Integer.valueOf(authenticatorErrorResponse.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        String strValueOf = String.valueOf(this.a.a);
        tnk0 tnk0Var = new tnk0();
        lok0VarA.c.c = tnk0Var;
        lok0VarA.c = tnk0Var;
        tnk0Var.b = strValueOf;
        tnk0Var.a = "errorCode";
        String str = this.b;
        if (str != null) {
            lok0VarA.a(str, "errorMessage");
        }
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        int i2 = this.a.a;
        uif.o(parcel, 2, 4);
        parcel.writeInt(i2);
        uif.i(parcel, 3, this.b, false);
        uif.o(parcel, 4, 4);
        parcel.writeInt(this.c);
        uif.n(parcel, iM);
    }
}
