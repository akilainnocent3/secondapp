package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.a8l0;
import defpackage.hxa;
import defpackage.pr0;
import defpackage.scy;
import defpackage.uif;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR;
    public static final List d = Collections.EMPTY_LIST;
    public static final DeviceOrientationRequest e;
    public final DeviceOrientationRequest a;
    public final List b;
    public final String c;

    static {
        new StringBuilder(String.valueOf(20000L).length() + HttpStatusCodesKt.HTTP_PROCESSING).append("Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        e = new DeviceOrientationRequest(20000L, false);
        CREATOR = new a8l0();
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.a = deviceOrientationRequest;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return scy.a(this.a, zzhVar.a) && scy.a(this.b, zzhVar.b) && scy.a(this.c, zzhVar.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        hxa.c(sb, "DeviceOrientationRequestInternal[deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return pr0.a(sb, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.l(parcel, 2, this.b, false);
        uif.i(parcel, 3, this.c, false);
        uif.n(parcel, iM);
    }
}
