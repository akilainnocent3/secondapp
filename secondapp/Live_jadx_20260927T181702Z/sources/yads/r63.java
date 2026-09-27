package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class r63 implements xq {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f154773s = new Object();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object f154774t = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final fm1 f154775u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final wq f154776v;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f154778c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f154780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f154781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f154782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f154783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f154784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f154785j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f154786k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public yl1 f154787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f154788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f154789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f154790o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f154791p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f154792q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f154793r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f154777b = f154773s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fm1 f154779d = f154775u;

    static {
        am1 am1Var;
        sl1 sl1Var = new sl1();
        vl1 vl1Var = new vl1();
        List list = Collections.EMPTY_LIST;
        sm2 sm2Var = sm2.f155489f;
        cm1 cm1Var = cm1.f147776d;
        Uri uri = Uri.EMPTY;
        if (vl1Var.f157005b != null && vl1Var.f157004a == null) {
            throw new IllegalStateException();
        }
        wl1 wl1Var = null;
        if (uri != null) {
            if (vl1Var.f157004a != null) {
                wl1Var = new wl1(vl1Var);
            }
            am1Var = new am1(uri, null, wl1Var, list, null, sm2Var, null);
        } else {
            am1Var = null;
        }
        f154775u = new fm1("com.monetization.ads.exoplayer2.Timeline", new ul1(sl1Var), am1Var, new yl1(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), jm1.H, cm1Var);
        f154776v = new wq() { // from class: yads.m94
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return r63.a(bundle);
            }
        };
    }

    public static r63 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(1, 36));
        fm1 fm1Var = bundle2 != null ? (fm1) fm1.f149163h.fromBundle(bundle2) : null;
        long j10 = bundle.getLong(Integer.toString(2, 36), -9223372036854775807L);
        long j11 = bundle.getLong(Integer.toString(3, 36), -9223372036854775807L);
        long j12 = bundle.getLong(Integer.toString(4, 36), -9223372036854775807L);
        boolean z10 = bundle.getBoolean(Integer.toString(5, 36), false);
        boolean z11 = bundle.getBoolean(Integer.toString(6, 36), false);
        Bundle bundle3 = bundle.getBundle(Integer.toString(7, 36));
        yl1 yl1Var = bundle3 != null ? (yl1) yl1.f158397h.fromBundle(bundle3) : null;
        boolean z12 = bundle.getBoolean(Integer.toString(8, 36), false);
        long j13 = bundle.getLong(Integer.toString(9, 36), 0L);
        long j14 = bundle.getLong(Integer.toString(10, 36), -9223372036854775807L);
        int i10 = bundle.getInt(Integer.toString(11, 36), 0);
        int i11 = bundle.getInt(Integer.toString(12, 36), 0);
        long j15 = bundle.getLong(Integer.toString(13, 36), 0L);
        r63 r63Var = new r63();
        r63Var.a(f154774t, fm1Var, null, j10, j11, j12, z10, z11, yl1Var, j13, j14, i10, i11, j15);
        r63Var.f154788m = z12;
        return r63Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r63.class.equals(obj.getClass())) {
            r63 r63Var = (r63) obj;
            if (ib3.a(this.f154777b, r63Var.f154777b) && ib3.a(this.f154779d, r63Var.f154779d) && ib3.a(this.f154780e, r63Var.f154780e) && ib3.a(this.f154787l, r63Var.f154787l) && this.f154781f == r63Var.f154781f && this.f154782g == r63Var.f154782g && this.f154783h == r63Var.f154783h && this.f154784i == r63Var.f154784i && this.f154785j == r63Var.f154785j && this.f154788m == r63Var.f154788m && this.f154789n == r63Var.f154789n && this.f154790o == r63Var.f154790o && this.f154791p == r63Var.f154791p && this.f154792q == r63Var.f154792q && this.f154793r == r63Var.f154793r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f154779d.hashCode() + ((this.f154777b.hashCode() + 217) * 31)) * 31;
        Object obj = this.f154780e;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        yl1 yl1Var = this.f154787l;
        int iHashCode3 = (iHashCode2 + (yl1Var != null ? yl1Var.hashCode() : 0)) * 31;
        long j10 = this.f154781f;
        int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f154782g;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f154783h;
        int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f154784i ? 1 : 0)) * 31) + (this.f154785j ? 1 : 0)) * 31) + (this.f154788m ? 1 : 0)) * 31;
        long j13 = this.f154789n;
        int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f154790o;
        int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f154791p) * 31) + this.f154792q) * 31;
        long j15 = this.f154793r;
        return i14 + ((int) (j15 ^ (j15 >>> 32)));
    }

    public final boolean a() {
        boolean z10 = this.f154786k;
        yl1 yl1Var = this.f154787l;
        if (z10 == (yl1Var != null)) {
            return yl1Var != null;
        }
        throw new IllegalStateException();
    }

    public final r63 a(Object obj, fm1 fm1Var, Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, yl1 yl1Var, long j13, long j14, int i10, int i11, long j15) {
        am1 am1Var;
        this.f154777b = obj;
        this.f154779d = fm1Var != null ? fm1Var : f154775u;
        this.f154778c = (fm1Var == null || (am1Var = fm1Var.f149165c) == null) ? null : am1Var.f158903g;
        this.f154780e = obj2;
        this.f154781f = j10;
        this.f154782g = j11;
        this.f154783h = j12;
        this.f154784i = z10;
        this.f154785j = z11;
        this.f154786k = yl1Var != null;
        this.f154787l = yl1Var;
        this.f154789n = j13;
        this.f154790o = j14;
        this.f154791p = i10;
        this.f154792q = i11;
        this.f154793r = j15;
        this.f154788m = false;
        return this;
    }
}
