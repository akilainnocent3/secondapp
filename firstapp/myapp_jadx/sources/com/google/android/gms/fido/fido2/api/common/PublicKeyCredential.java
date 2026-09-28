package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.scy;
import defpackage.uif;
import defpackage.xok0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredential> CREATOR = new xok0();
    public final String a;
    public final String b;
    public final byte[] c;
    public final AuthenticatorAttestationResponse d;
    public final AuthenticatorAssertionResponse e;
    public final AuthenticatorErrorResponse f;
    public final AuthenticationExtensionsClientOutputs i;
    public final String v;

    public PublicKeyCredential(String str, String str2, byte[] bArr, AuthenticatorAttestationResponse authenticatorAttestationResponse, AuthenticatorAssertionResponse authenticatorAssertionResponse, AuthenticatorErrorResponse authenticatorErrorResponse, AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs, String str3) {
        boolean z = true;
        if ((authenticatorAttestationResponse == null || authenticatorAssertionResponse != null || authenticatorErrorResponse != null) && ((authenticatorAttestationResponse != null || authenticatorAssertionResponse == null || authenticatorErrorResponse != null) && (authenticatorAttestationResponse != null || authenticatorAssertionResponse != null || authenticatorErrorResponse == null))) {
            z = false;
        }
        hm20.b(z);
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = authenticatorAttestationResponse;
        this.e = authenticatorAssertionResponse;
        this.f = authenticatorErrorResponse;
        this.i = authenticationExtensionsClientOutputs;
        this.v = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        return scy.a(this.a, publicKeyCredential.a) && scy.a(this.b, publicKeyCredential.b) && Arrays.equals(this.c, publicKeyCredential.c) && scy.a(this.d, publicKeyCredential.d) && scy.a(this.e, publicKeyCredential.e) && scy.a(this.f, publicKeyCredential.f) && scy.a(this.i, publicKeyCredential.i) && scy.a(this.v, publicKeyCredential.v);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.e, this.d, this.f, this.i, this.v});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.b(parcel, 3, this.c, false);
        uif.h(parcel, 4, this.d, i, false);
        uif.h(parcel, 5, this.e, i, false);
        uif.h(parcel, 6, this.f, i, false);
        uif.h(parcel, 7, this.i, i, false);
        uif.i(parcel, 8, this.v, false);
        uif.n(parcel, iM);
    }
}
