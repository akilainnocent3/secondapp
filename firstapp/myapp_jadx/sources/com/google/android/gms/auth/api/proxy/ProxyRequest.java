package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.d830;
import defpackage.gmk0;
import defpackage.uif;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new gmk0();
    public final String a;
    public final int b;
    public final long c;
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = j;
        this.d = bArr;
        this.f = bundle;
    }

    public final String toString() {
        return d830.a(this.b, "ProxyRequest[ url: ", this.a, ", method: ", " ]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        uif.o(parcel, 3, 8);
        parcel.writeLong(this.c);
        uif.b(parcel, 4, this.d, false);
        uif.a(parcel, 5, this.f);
        uif.o(parcel, 1000, 4);
        parcel.writeInt(this.e);
        uif.n(parcel, iM);
    }
}
