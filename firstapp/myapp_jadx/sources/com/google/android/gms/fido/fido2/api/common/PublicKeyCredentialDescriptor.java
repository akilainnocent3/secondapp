package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.fqk0;
import defpackage.hm20;
import defpackage.m8j;
import defpackage.q5l0;
import defpackage.uif;
import defpackage.yok0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final PublicKeyCredentialType a;
    public final byte[] b;
    public final List c;

    static {
        fqk0.f(2, q5l0.a, q5l0.b);
        CREATOR = new yok0();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, ArrayList arrayList) {
        hm20.h(str);
        try {
            this.a = PublicKeyCredentialType.a(str);
            hm20.h(bArr);
            this.b = bArr;
            this.c = arrayList;
        } catch (PublicKeyCredentialType.a e) {
            m8j.a(e);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        List list = publicKeyCredentialDescriptor.c;
        if (!this.a.equals(publicKeyCredentialDescriptor.a) || !Arrays.equals(this.b, publicKeyCredentialDescriptor.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(Arrays.hashCode(this.b)), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        this.a.getClass();
        uif.i(parcel, 2, "public-key", false);
        uif.b(parcel, 3, this.b, false);
        uif.l(parcel, 4, this.c, false);
        uif.n(parcel, iM);
    }
}
