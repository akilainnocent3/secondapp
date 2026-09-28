package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.lmk0;
import defpackage.ml5;
import defpackage.uif;
import defpackage.wxa;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new lmk0();
    public final String A;
    public final float B;
    public final long C;
    public final boolean D;
    public final int a;
    public final long b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final int i;
    public final List v;
    public final String w;
    public final long y;
    public final int z;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, ArrayList arrayList, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5, boolean z) {
        this.a = i;
        this.b = j;
        this.c = i2;
        this.d = str;
        this.e = str3;
        this.f = str5;
        this.i = i3;
        this.v = arrayList;
        this.w = str2;
        this.y = j2;
        this.z = i4;
        this.A = str4;
        this.B = f;
        this.C = j3;
        this.D = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int G0() {
        return this.c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long K0() {
        return this.b;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String O0() {
        List list = this.v;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        StringBuilder sbA = ml5.a(this.i, "\t", this.d, "\t", "\t");
        wxa.b(this.z, strJoin, "\t", "\t", sbA);
        String str = this.e;
        if (str == null) {
            str = "";
        }
        sbA.append(str);
        sbA.append("\t");
        String str2 = this.A;
        if (str2 == null) {
            str2 = "";
        }
        sbA.append(str2);
        sbA.append("\t");
        sbA.append(this.B);
        sbA.append("\t");
        String str3 = this.f;
        sbA.append(str3 != null ? str3 : "");
        sbA.append("\t");
        sbA.append(this.D);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        uif.i(parcel, 4, this.d, false);
        uif.o(parcel, 5, 4);
        parcel.writeInt(this.i);
        uif.j(parcel, 6, this.v);
        uif.o(parcel, 8, 8);
        parcel.writeLong(this.y);
        uif.i(parcel, 10, this.e, false);
        uif.o(parcel, 11, 4);
        parcel.writeInt(this.c);
        uif.i(parcel, 12, this.w, false);
        uif.i(parcel, 13, this.A, false);
        uif.o(parcel, 14, 4);
        parcel.writeInt(this.z);
        uif.o(parcel, 15, 4);
        parcel.writeFloat(this.B);
        uif.o(parcel, 16, 8);
        parcel.writeLong(this.C);
        uif.i(parcel, 17, this.f, false);
        uif.o(parcel, 18, 4);
        parcel.writeInt(this.D ? 1 : 0);
        uif.n(parcel, iM);
    }
}
