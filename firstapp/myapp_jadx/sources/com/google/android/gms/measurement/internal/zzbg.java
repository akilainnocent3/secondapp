package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dtk0;
import defpackage.hm20;
import defpackage.hxa;
import defpackage.uf80;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new dtk0();
    public final String a;
    public final zzbe b;
    public final String c;
    public final long d;

    public zzbg(zzbg zzbgVar, long j) {
        hm20.h(zzbgVar);
        this.a = zzbgVar.a;
        this.b = zzbgVar.b;
        this.c = zzbgVar.c;
        this.d = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        hxa.c(sb, "origin=", str, ",name=", str2);
        return uf80.a(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dtk0.a(this, parcel, i);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j) {
        this.a = str;
        this.b = zzbeVar;
        this.c = str2;
        this.d = j;
    }
}
