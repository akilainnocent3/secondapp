package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.protobuf.Reader;
import defpackage.d580;
import defpackage.e0l0;
import defpackage.fdv;
import defpackage.he4;
import defpackage.hm20;
import defpackage.nwj0;
import defpackage.scy;
import defpackage.uif;
import defpackage.vnk0;
import defpackage.y4s;
import java.util.Arrays;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new vnk0();
    public final boolean A;
    public final WorkSource B;
    public final ClientIdentity C;
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final float i;
    public final boolean v;
    public final long w;
    public final int y;
    public final int z;

    public static final class a {
        public final int a;
        public final long b;
        public long c = -1;
        public long d = 0;
        public long e = Long.MAX_VALUE;
        public int f = Reader.READ_DONE;
        public float g = 0.0f;
        public boolean h = true;
        public long i = -1;
        public int j = 0;
        public int k = 0;
        public boolean l = false;
        public WorkSource m = null;
        public ClientIdentity n = null;

        public a(int i, long j) {
            this.a = HttpStatusCodesKt.HTTP_PROCESSING;
            hm20.a("intervalMillis must be greater than or equal to 0", j >= 0);
            this.b = j;
            fdv.c(i);
            this.a = i;
        }

        public final LocationRequest a() {
            long jMin = this.c;
            int i = this.a;
            long j = this.b;
            if (jMin == -1) {
                jMin = j;
            } else if (i != 105) {
                jMin = Math.min(jMin, j);
            }
            long jMax = Math.max(this.d, this.b);
            long j2 = this.e;
            int i2 = this.f;
            float f = this.g;
            boolean z = this.h;
            long j3 = this.i;
            if (j3 == -1) {
                j3 = this.b;
            }
            return new LocationRequest(i, j, jMin, jMax, Long.MAX_VALUE, j2, i2, f, z, j3, this.j, this.k, this.l, new WorkSource(this.m), this.n);
        }

        public final void b(int i) {
            int i2;
            boolean z = true;
            if (i == 0 || i == 1) {
                i2 = i;
            } else {
                i2 = 2;
                if (i != 2) {
                    z = false;
                    i2 = i;
                }
            }
            hm20.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i2));
            this.j = i;
        }

        public final void c(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            hm20.a("maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE", z);
            this.i = j;
        }
    }

    public LocationRequest(int i, long j, long j2, long j3, long j4, long j5, int i2, float f, boolean z, long j6, int i3, int i4, boolean z2, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = i;
        if (i == 105) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = j;
        }
        this.c = j2;
        this.d = j3;
        this.e = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.f = i2;
        this.i = f;
        this.v = z;
        this.w = j6 != -1 ? j6 : j;
        this.y = i3;
        this.z = i4;
        this.A = z2;
        this.B = workSource;
        this.C = clientIdentity;
    }

    public static String K0(long j) {
        String string;
        if (j == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb = e0l0.b;
        synchronized (sb) {
            sb.setLength(0);
            e0l0.a(j, sb);
            string = sb.toString();
        }
        return string;
    }

    public final boolean G0() {
        long j = this.d;
        return j > 0 && (j >> 1) >= this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        int i = locationRequest.a;
        int i2 = this.a;
        if (i2 != i) {
            return false;
        }
        if ((i2 == 105 || this.b == locationRequest.b) && this.c == locationRequest.c && G0() == locationRequest.G0()) {
            return (!G0() || this.d == locationRequest.d) && this.e == locationRequest.e && this.f == locationRequest.f && this.i == locationRequest.i && this.v == locationRequest.v && this.y == locationRequest.y && this.z == locationRequest.z && this.A == locationRequest.A && this.B.equals(locationRequest.B) && scy.a(this.C, locationRequest.C);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), this.B});
    }

    public final String toString() {
        String str;
        StringBuilder sbA = y4s.a("Request[");
        int i = this.a;
        long j = this.b;
        long j2 = this.d;
        if (i == 105) {
            sbA.append(fdv.d(i));
            if (j2 > 0) {
                sbA.append("/");
                e0l0.a(j2, sbA);
            }
        } else {
            sbA.append("@");
            if (G0()) {
                e0l0.a(j, sbA);
                sbA.append("/");
                e0l0.a(j2, sbA);
            } else {
                e0l0.a(j, sbA);
            }
            sbA.append(" ");
            sbA.append(fdv.d(i));
        }
        long j3 = this.c;
        if (i == 105 || j3 != j) {
            sbA.append(", minUpdateInterval=");
            sbA.append(K0(j3));
        }
        float f = this.i;
        if (f > 0.0d) {
            sbA.append(", minUpdateDistance=");
            sbA.append(f);
        }
        long j4 = this.w;
        if (i != 105 ? j4 != j : j4 != Long.MAX_VALUE) {
            sbA.append(", maxUpdateAge=");
            sbA.append(K0(j4));
        }
        long j5 = this.e;
        if (j5 != Long.MAX_VALUE) {
            sbA.append(", duration=");
            e0l0.a(j5, sbA);
        }
        int i2 = this.f;
        if (i2 != Integer.MAX_VALUE) {
            sbA.append(", maxUpdates=");
            sbA.append(i2);
        }
        int i3 = this.z;
        if (i3 != 0) {
            sbA.append(", ");
            if (i3 == 0) {
                str = "THROTTLE_BACKGROUND";
            } else if (i3 == 1) {
                str = "THROTTLE_ALWAYS";
            } else {
                if (i3 != 2) {
                    d580.a();
                    return null;
                }
                str = "THROTTLE_NEVER";
            }
            sbA.append(str);
        }
        int i4 = this.y;
        if (i4 != 0) {
            sbA.append(", ");
            sbA.append(he4.e(i4));
        }
        if (this.v) {
            sbA.append(", waitForAccurateLocation");
        }
        if (this.A) {
            sbA.append(", bypass");
        }
        WorkSource workSource = this.B;
        if (!nwj0.b(workSource)) {
            sbA.append(", ");
            sbA.append(workSource);
        }
        ClientIdentity clientIdentity = this.C;
        if (clientIdentity != null) {
            sbA.append(", impersonation=");
            sbA.append(clientIdentity);
        }
        sbA.append(']');
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM = uif.m(parcel, 20293);
        uif.o(parcel, 1, 4);
        parcel.writeInt(this.a);
        uif.o(parcel, 2, 8);
        parcel.writeLong(this.b);
        uif.o(parcel, 3, 8);
        parcel.writeLong(this.c);
        uif.o(parcel, 6, 4);
        parcel.writeInt(this.f);
        uif.o(parcel, 7, 4);
        parcel.writeFloat(this.i);
        uif.o(parcel, 8, 8);
        parcel.writeLong(this.d);
        uif.o(parcel, 9, 4);
        parcel.writeInt(this.v ? 1 : 0);
        uif.o(parcel, 10, 8);
        parcel.writeLong(this.e);
        uif.o(parcel, 11, 8);
        parcel.writeLong(this.w);
        uif.o(parcel, 12, 4);
        parcel.writeInt(this.y);
        uif.o(parcel, 13, 4);
        parcel.writeInt(this.z);
        uif.o(parcel, 15, 4);
        parcel.writeInt(this.A ? 1 : 0);
        uif.h(parcel, 16, this.B, i, false);
        uif.h(parcel, 17, this.C, i, false);
        uif.n(parcel, iM);
    }

    @Deprecated
    public LocationRequest() {
        this(HttpStatusCodesKt.HTTP_PROCESSING, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Reader.READ_DONE, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
