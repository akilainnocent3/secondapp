package r1;

import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.os.Build;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Iterator;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY})
public class o extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f123448n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f123449o = 32;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f123450p = 33;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f123451q = 64;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f123452r = -87;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f123453s = 64;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f123454t = 24;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f123455u = 193;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f123456v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f123457w = 200;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f123458x = 35;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final GpsStatus f123459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @k.a0("mWrapped")
    public int f123460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @k.a0("mWrapped")
    public Iterator<GpsSatellite> f123461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @k.a0("mWrapped")
    public int f123462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @k.a0("mWrapped")
    public GpsSatellite f123463m;

    public o(GpsStatus gpsStatus) {
        GpsStatus gpsStatus2 = (GpsStatus) e2.x.l(gpsStatus);
        this.f123459i = gpsStatus2;
        this.f123460j = -1;
        this.f123461k = gpsStatus2.getSatellites().iterator();
        this.f123462l = -1;
        this.f123463m = null;
    }

    public static int p(int i10) {
        if (i10 > 0 && i10 <= 32) {
            return 1;
        }
        if (i10 >= 33 && i10 <= 64) {
            return 2;
        }
        if (i10 > 64 && i10 <= 88) {
            return 3;
        }
        if (i10 <= 200 || i10 > 235) {
            return (i10 < 193 || i10 > 200) ? 0 : 4;
        }
        return 5;
    }

    public static int r(int i10) {
        int iP = p(i10);
        if (iP == 2) {
            return i10 + 87;
        }
        if (iP != 3) {
            return iP != 5 ? i10 : i10 + AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
        }
        return i10 - 64;
    }

    @Override // r1.a
    public float a(int i10) {
        return q(i10).getAzimuth();
    }

    @Override // r1.a
    public float b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r1.a
    public float c(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // r1.a
    public float d(int i10) {
        return q(i10).getSnr();
    }

    @Override // r1.a
    public int e(int i10) {
        if (Build.VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(q(i10).getPrn());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            return this.f123459i.equals(((o) obj).f123459i);
        }
        return false;
    }

    @Override // r1.a
    public float f(int i10) {
        return q(i10).getElevation();
    }

    @Override // r1.a
    public int g() {
        int i10;
        synchronized (this.f123459i) {
            try {
                if (this.f123460j == -1) {
                    for (GpsSatellite gpsSatellite : this.f123459i.getSatellites()) {
                        this.f123460j++;
                    }
                    this.f123460j++;
                }
                i10 = this.f123460j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // r1.a
    public int h(int i10) {
        return Build.VERSION.SDK_INT < 24 ? q(i10).getPrn() : r(q(i10).getPrn());
    }

    public int hashCode() {
        return this.f123459i.hashCode();
    }

    @Override // r1.a
    public boolean i(int i10) {
        return q(i10).hasAlmanac();
    }

    @Override // r1.a
    public boolean j(int i10) {
        return false;
    }

    @Override // r1.a
    public boolean k(int i10) {
        return false;
    }

    @Override // r1.a
    public boolean l(int i10) {
        return q(i10).hasEphemeris();
    }

    @Override // r1.a
    public boolean m(int i10) {
        return q(i10).usedInFix();
    }

    public final GpsSatellite q(int i10) {
        GpsSatellite gpsSatellite;
        synchronized (this.f123459i) {
            try {
                if (i10 < this.f123462l) {
                    this.f123461k = this.f123459i.getSatellites().iterator();
                    this.f123462l = -1;
                }
                while (true) {
                    int i11 = this.f123462l;
                    if (i11 >= i10) {
                        break;
                    }
                    this.f123462l = i11 + 1;
                    if (!this.f123461k.hasNext()) {
                        this.f123463m = null;
                        break;
                    }
                    this.f123463m = this.f123461k.next();
                }
                gpsSatellite = this.f123463m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (GpsSatellite) e2.x.l(gpsSatellite);
    }
}
