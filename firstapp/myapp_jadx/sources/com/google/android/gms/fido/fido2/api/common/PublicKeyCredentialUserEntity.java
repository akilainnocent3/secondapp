package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.scy;
import defpackage.uif;
import defpackage.xpk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new xpk0();
    public final byte[] a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        hm20.h(bArr);
        this.a = bArr;
        hm20.h(str);
        this.b = str;
        this.c = str2;
        hm20.h(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.a, publicKeyCredentialUserEntity.a) && scy.a(this.b, publicKeyCredentialUserEntity.b) && scy.a(this.c, publicKeyCredentialUserEntity.c) && scy.a(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.i(parcel, 3, this.b, false);
        uif.i(parcel, 4, this.c, false);
        uif.i(parcel, 5, this.d, false);
        uif.n(parcel, iM);
    }
}
