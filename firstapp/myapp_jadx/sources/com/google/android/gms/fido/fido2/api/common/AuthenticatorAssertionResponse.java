package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fal0;
import defpackage.hm20;
import defpackage.ksk0;
import defpackage.lok0;
import defpackage.qok0;
import defpackage.uif;
import defpackage.xsk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new fal0();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;
    public final byte[] e;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        hm20.h(bArr);
        this.a = bArr;
        hm20.h(bArr2);
        this.b = bArr2;
        hm20.h(bArr3);
        this.c = bArr3;
        hm20.h(bArr4);
        this.d = bArr4;
        this.e = bArr5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.a, authenticatorAssertionResponse.a) && Arrays.equals(this.b, authenticatorAssertionResponse.b) && Arrays.equals(this.c, authenticatorAssertionResponse.c) && Arrays.equals(this.d, authenticatorAssertionResponse.d) && Arrays.equals(this.e, authenticatorAssertionResponse.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e))});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        ksk0 ksk0Var = xsk0.a;
        byte[] bArr = this.a;
        lok0VarA.a(ksk0Var.b(bArr.length, bArr), "keyHandle");
        byte[] bArr2 = this.b;
        lok0VarA.a(ksk0Var.b(bArr2.length, bArr2), "clientDataJSON");
        byte[] bArr3 = this.c;
        lok0VarA.a(ksk0Var.b(bArr3.length, bArr3), "authenticatorData");
        byte[] bArr4 = this.d;
        lok0VarA.a(ksk0Var.b(bArr4.length, bArr4), "signature");
        byte[] bArr5 = this.e;
        if (bArr5 != null) {
            lok0VarA.a(ksk0Var.b(bArr5.length, bArr5), "userHandle");
        }
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.b(parcel, 3, this.b, false);
        uif.b(parcel, 4, this.c, false);
        uif.b(parcel, 5, this.d, false);
        uif.b(parcel, 6, this.e, false);
        uif.n(parcel, iM);
    }
}
