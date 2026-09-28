package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hm20;
import defpackage.ksk0;
import defpackage.lok0;
import defpackage.qok0;
import defpackage.scy;
import defpackage.sel0;
import defpackage.uif;
import defpackage.xsk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class SignResponseData extends ResponseData {
    public static final Parcelable.Creator<SignResponseData> CREATOR = new sel0();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        hm20.h(bArr);
        this.a = bArr;
        hm20.h(str);
        this.b = str;
        hm20.h(bArr2);
        this.c = bArr2;
        hm20.h(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && scy.a(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        lok0 lok0VarA = qok0.a(this);
        ksk0 ksk0Var = xsk0.a;
        byte[] bArr = this.a;
        lok0VarA.a(ksk0Var.b(bArr.length, bArr), "keyHandle");
        lok0VarA.a(this.b, "clientDataString");
        byte[] bArr2 = this.c;
        lok0VarA.a(ksk0Var.b(bArr2.length, bArr2), "signatureData");
        byte[] bArr3 = this.d;
        lok0VarA.a(ksk0Var.b(bArr3.length, bArr3), "application");
        return lok0VarA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.b(parcel, 2, this.a, false);
        uif.i(parcel, 3, this.b, false);
        uif.b(parcel, 4, this.c, false);
        uif.b(parcel, 5, this.d, false);
        uif.n(parcel, iM);
    }
}
