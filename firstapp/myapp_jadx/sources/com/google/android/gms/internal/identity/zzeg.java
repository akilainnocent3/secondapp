package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import defpackage.hm20;
import defpackage.nwj0;
import defpackage.scy;
import defpackage.uif;
import defpackage.yzk0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new yzk0();
    public final LocationRequest a;

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00af  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[LOOP:0: B:44:0x00c0->B:45:0x00c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ee  */
    public zzeg(LocationRequest locationRequest, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        int i;
        boolean z5;
        ClientIdentity clientIdentity;
        boolean z6;
        WorkSource workSource;
        int size;
        LocationRequest.a aVar = new LocationRequest.a(locationRequest.a, locationRequest.b);
        long j2 = locationRequest.c;
        int i2 = 0;
        hm20.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", j2 == -1 || j2 >= 0);
        aVar.c = j2;
        long j3 = locationRequest.d;
        hm20.a("maxUpdateDelayMillis must be greater than or equal to 0", j3 >= 0);
        aVar.d = j3;
        long j4 = locationRequest.e;
        hm20.a("durationMillis must be greater than 0", j4 > 0);
        aVar.e = j4;
        int i3 = locationRequest.f;
        hm20.a("maxUpdates must be greater than 0", i3 > 0);
        aVar.f = i3;
        float f = locationRequest.i;
        hm20.a("minUpdateDistanceMeters must be greater than or equal to 0", f >= 0.0f);
        aVar.g = f;
        aVar.h = locationRequest.v;
        aVar.c(locationRequest.w);
        aVar.b(locationRequest.y);
        int i4 = locationRequest.z;
        if (i4 != 0 && i4 != 1) {
            if (i4 == 2) {
                i = 2;
            } else {
                i = i4;
                z5 = false;
            }
            hm20.c(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            aVar.k = i4;
            aVar.l = locationRequest.A;
            aVar.m = locationRequest.B;
            clientIdentity = locationRequest.C;
            if (clientIdentity != null || clientIdentity.f == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            hm20.b(z6);
            aVar.n = clientIdentity;
            if (arrayList != null) {
                if (arrayList.isEmpty()) {
                    workSource = null;
                } else {
                    workSource = new WorkSource();
                    size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ClientIdentity clientIdentity2 = (ClientIdentity) obj;
                        nwj0.a(workSource, clientIdentity2.a, clientIdentity2.b);
                    }
                }
                aVar.m = workSource;
            }
            if (z) {
                aVar.b(1);
            }
            if (z2) {
                aVar.k = 2;
            }
            if (z3) {
                aVar.l = true;
            }
            if (z4) {
                aVar.h = true;
            }
            if (j != Long.MAX_VALUE) {
                aVar.c(j);
            }
            this.a = aVar.a();
        }
        i = i4;
        z5 = true;
        hm20.c(z5, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
        aVar.k = i4;
        aVar.l = locationRequest.A;
        aVar.m = locationRequest.B;
        clientIdentity = locationRequest.C;
        if (clientIdentity != null) {
            z6 = true;
        } else {
            z6 = true;
        }
        hm20.b(z6);
        aVar.n = clientIdentity;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                size = arrayList.size();
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    ClientIdentity clientIdentity3 = (ClientIdentity) obj2;
                    nwj0.a(workSource, clientIdentity3.a, clientIdentity3.b);
                }
            }
            aVar.m = workSource;
        }
        if (z) {
            aVar.b(1);
        }
        if (z2) {
            aVar.k = 2;
        }
        if (z3) {
            aVar.l = true;
        }
        if (z4) {
            aVar.h = true;
        }
        if (j != Long.MAX_VALUE) {
            aVar.c(j);
        }
        this.a = aVar.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return scy.a(this.a, ((zzeg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.h(parcel, 1, this.a, i, false);
        uif.n(parcel, iM);
    }
}
