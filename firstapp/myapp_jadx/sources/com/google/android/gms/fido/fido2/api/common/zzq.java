package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.hm20;
import defpackage.uif;
import defpackage.wql0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new wql0();
    public final long a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public zzq(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = j;
        hm20.h(bArr);
        this.b = bArr;
        hm20.h(bArr2);
        this.c = bArr2;
        hm20.h(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzq)) {
            return false;
        }
        zzq zzqVar = (zzq) obj;
        return this.a == zzqVar.a && Arrays.equals(this.b, zzqVar.b) && Arrays.equals(this.c, zzqVar.c) && Arrays.equals(this.d, zzqVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 8);
        parcel.writeLong(this.a);
        uif.b(parcel, 2, this.b, false);
        uif.b(parcel, 3, this.c, false);
        uif.b(parcel, 4, this.d, false);
        uif.n(parcel, iM);
    }
}
