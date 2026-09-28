package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.scy;
import defpackage.uif;
import defpackage.yuk0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new yuk0();
    public final String a;

    @Deprecated
    public final int b;
    public final long c;

    public Feature(String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }

    public final long G0() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = feature.a;
            String str2 = this.a;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && G0() == feature.G0()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(G0())});
    }

    public final String toString() {
        scy.a aVar = new scy.a(this);
        aVar.a(this.a, "name");
        aVar.a(Long.valueOf(G0()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.i(parcel, 1, this.a, false);
        uif.o(parcel, 2, 4);
        parcel.writeInt(this.b);
        long jG0 = G0();
        uif.o(parcel, 3, 8);
        parcel.writeLong(jG0);
        uif.n(parcel, iM);
    }

    public Feature(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }
}
