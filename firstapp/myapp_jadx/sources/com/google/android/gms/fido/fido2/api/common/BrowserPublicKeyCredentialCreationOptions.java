package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fjl0;
import defpackage.hm20;
import defpackage.scy;
import defpackage.uif;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new fjl0();
    public final PublicKeyCredentialCreationOptions a;
    public final Uri b;
    public final byte[] c;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        hm20.h(publicKeyCredentialCreationOptions);
        this.a = publicKeyCredentialCreationOptions;
        hm20.h(uri);
        hm20.a("origin scheme must be non-empty", uri.getScheme() != null);
        hm20.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.b = uri;
        hm20.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return scy.a(this.a, browserPublicKeyCredentialCreationOptions.a) && scy.a(this.b, browserPublicKeyCredentialCreationOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 2, this.a, i, false);
        uif.h(parcel, 3, this.b, i, false);
        uif.b(parcel, 4, this.c, false);
        uif.n(parcel, iM);
    }
}
