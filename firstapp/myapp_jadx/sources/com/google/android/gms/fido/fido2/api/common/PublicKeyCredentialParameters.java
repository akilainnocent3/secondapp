package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.hpk0;
import defpackage.m8j;
import defpackage.uif;
import java.util.Arrays;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new hpk0();
    public final PublicKeyCredentialType a;
    public final COSEAlgorithmIdentifier b;

    public PublicKeyCredentialParameters(String str, int i) {
        hm20.h(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            try {
                this.b = COSEAlgorithmIdentifier.a(i);
            } catch (COSEAlgorithmIdentifier.a e) {
                m8j.a(e);
                throw null;
            }
        } catch (PublicKeyCredentialType.a e2) {
            m8j.a(e2);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.a.equals(publicKeyCredentialParameters.a) && this.b.equals(publicKeyCredentialParameters.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        this.a.getClass();
        uif.i(parcel, 2, Chyeyik.yshPC, false);
        uif.f(parcel, 3, Integer.valueOf(this.b.a.a()));
        uif.n(parcel, iM);
    }
}
