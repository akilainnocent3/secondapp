package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hm20;
import defpackage.kcl0;
import defpackage.ksk0;
import defpackage.lok0;
import defpackage.qok0;
import defpackage.uif;
import defpackage.xsk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new kcl0();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final String[] d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        hm20.h(bArr);
        this.a = bArr;
        hm20.h(bArr2);
        this.b = bArr2;
        hm20.h(bArr3);
        this.c = bArr3;
        hm20.h(strArr);
        this.d = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.a, authenticatorAttestationResponse.a) && Arrays.equals(this.b, authenticatorAttestationResponse.b) && Arrays.equals(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        ksk0 ksk0Var = xsk0.a;
        byte[] bArr = this.a;
        lok0VarA.a(ksk0Var.b(bArr.length, bArr), "keyHandle");
        byte[] bArr2 = this.b;
        lok0VarA.a(ksk0Var.b(bArr2.length, bArr2), "clientDataJSON");
        byte[] bArr3 = this.c;
        lok0VarA.a(ksk0Var.b(bArr3.length, bArr3), "attestationObject");
        lok0VarA.a(Arrays.toString(this.d), "transports");
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.b(parcel, 3, this.b, false);
        uif.b(parcel, 4, this.c, false);
        String[] strArr = this.d;
        if (strArr != null) {
            int iM2 = uif.m(parcel, 5);
            parcel.writeStringArray(strArr);
            uif.n(parcel, iM2);
        }
        uif.n(parcel, iM);
    }
}
