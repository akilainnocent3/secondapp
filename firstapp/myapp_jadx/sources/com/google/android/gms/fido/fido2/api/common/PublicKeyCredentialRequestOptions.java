package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hm20;
import defpackage.kpk0;
import defpackage.m8j;
import defpackage.scy;
import defpackage.uif;
import defpackage.vqk0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new kpk0();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final zzay i;
    public final AuthenticationExtensions v;
    public final Long w;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l) {
        hm20.h(bArr);
        this.a = bArr;
        this.b = d;
        hm20.h(str);
        this.c = str;
        this.d = arrayList;
        this.e = num;
        this.f = tokenBinding;
        this.w = l;
        if (str2 != null) {
            try {
                this.i = zzay.a(str2);
            } catch (vqk0 e) {
                m8j.a(e);
                throw null;
            }
        } else {
            this.i = null;
        }
        this.v = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.d;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && scy.a(this.b, publicKeyCredentialRequestOptions.b) && scy.a(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && scy.a(this.e, publicKeyCredentialRequestOptions.e) && scy.a(this.f, publicKeyCredentialRequestOptions.f) && scy.a(this.i, publicKeyCredentialRequestOptions.i) && scy.a(this.v, publicKeyCredentialRequestOptions.v) && scy.a(this.w, publicKeyCredentialRequestOptions.w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.c(parcel, 3, this.b);
        uif.i(parcel, 4, this.c, false);
        uif.l(parcel, 5, this.d, false);
        uif.f(parcel, 6, this.e);
        uif.h(parcel, 7, this.f, i, false);
        zzay zzayVar = this.i;
        uif.i(parcel, 8, zzayVar == null ? null : zzayVar.a, false);
        uif.h(parcel, 9, this.v, i, false);
        uif.g(parcel, 10, this.w);
        uif.n(parcel, iM);
    }
}
