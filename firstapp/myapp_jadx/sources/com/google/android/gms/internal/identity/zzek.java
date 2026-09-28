package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.b0l0;
import defpackage.hb5;
import defpackage.t7l;
import defpackage.uif;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class zzek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzek> CREATOR = new b0l0();
    public final String a;
    public final long b;
    public final short c;
    public final double d;
    public final double e;
    public final float f;
    public final int i;
    public final int v;
    public final int w;

    public zzek(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            hb5.a("requestId is null or too long: ".concat(String.valueOf(str)));
            throw null;
        }
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 16);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 18);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(d2).length() + 19);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            hb5.a(t7l.b(i, "No supported transition specified: ", new StringBuilder(String.valueOf(i).length() + 35)));
            throw null;
        }
        this.c = s;
        this.a = str;
        this.d = d;
        this.e = d2;
        this.f = f;
        this.b = j;
        this.i = i4;
        this.v = i2;
        this.w = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.f == zzekVar.f && this.d == zzekVar.d && this.e == zzekVar.e && this.c == zzekVar.c && this.i == zzekVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return ((((Float.floatToIntBits(this.f) + ((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31)) * 31) + this.c) * 31) + this.i;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.c;
        if (s != -1) {
            str = s != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.a.replaceAll("\\p{C}", "?"), Integer.valueOf(this.i), Double.valueOf(this.d), Double.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.v / 1000), Integer.valueOf(this.w), Long.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        uif.o(parcel, 3, 4);
        parcel.writeInt(this.c);
        uif.o(parcel, 4, 8);
        parcel.writeDouble(this.d);
        uif.o(parcel, 5, 8);
        parcel.writeDouble(this.e);
        uif.o(parcel, 6, 4);
        parcel.writeFloat(this.f);
        uif.o(parcel, 7, 4);
        parcel.writeInt(this.i);
        uif.o(parcel, 8, 4);
        parcel.writeInt(this.v);
        uif.o(parcel, 9, 4);
        parcel.writeInt(this.w);
        uif.n(parcel, iM);
    }
}
