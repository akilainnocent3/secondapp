package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.scy;
import defpackage.uif;
import defpackage.ztl0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new ztl0();
    public final String a;
    public final String b;
    public final byte[] c;
    public final byte[] d;
    public final boolean e;
    public final boolean f;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = bArr;
        this.d = bArr2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return scy.a(this.a, fidoCredentialDetails.a) && scy.a(this.b, fidoCredentialDetails.b) && Arrays.equals(this.c, fidoCredentialDetails.c) && Arrays.equals(this.d, fidoCredentialDetails.d) && this.e == fidoCredentialDetails.e && this.f == fidoCredentialDetails.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.i(parcel, 2, this.b, false);
        uif.b(parcel, 3, this.c, false);
        uif.b(parcel, 4, this.d, false);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uif.o(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        uif.n(parcel, iM);
    }
}
