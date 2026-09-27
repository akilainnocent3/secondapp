package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jm1 implements xq {
    public static final jm1 H = new jm1(new im1());
    public static final wq I = new wq() { // from class: yads.b34
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return jm1.a(bundle);
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f151160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CharSequence f151161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f151162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CharSequence f151163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f151164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CharSequence f151165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CharSequence f151166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ql2 f151167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ql2 f151168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f151169k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f151170l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f151171m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f151172n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Integer f151173o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Integer f151174p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Boolean f151175q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Integer f151176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f151177s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Integer f151178t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Integer f151179u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Integer f151180v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Integer f151181w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Integer f151182x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CharSequence f151183y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CharSequence f151184z;

    public jm1(im1 im1Var) {
        this.f151160b = im1Var.f150677a;
        this.f151161c = im1Var.f150678b;
        this.f151162d = im1Var.f150679c;
        this.f151163e = im1Var.f150680d;
        this.f151164f = im1Var.f150681e;
        this.f151165g = im1Var.f150682f;
        this.f151166h = im1Var.f150683g;
        this.f151167i = im1Var.f150684h;
        this.f151168j = im1Var.f150685i;
        this.f151169k = im1Var.f150686j;
        this.f151170l = im1Var.f150687k;
        this.f151171m = im1Var.f150688l;
        this.f151172n = im1Var.f150689m;
        this.f151173o = im1Var.f150690n;
        this.f151174p = im1Var.f150691o;
        this.f151175q = im1Var.f150692p;
        Integer num = im1Var.f150693q;
        this.f151176r = num;
        this.f151177s = num;
        this.f151178t = im1Var.f150694r;
        this.f151179u = im1Var.f150695s;
        this.f151180v = im1Var.f150696t;
        this.f151181w = im1Var.f150697u;
        this.f151182x = im1Var.f150698v;
        this.f151183y = im1Var.f150699w;
        this.f151184z = im1Var.f150700x;
        this.A = im1Var.f150701y;
        this.B = im1Var.f150702z;
        this.C = im1Var.A;
        this.D = im1Var.B;
        this.E = im1Var.C;
        this.F = im1Var.D;
        this.G = im1Var.E;
    }

    public static jm1 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        im1 im1Var = new im1();
        im1Var.f150677a = bundle.getCharSequence(Integer.toString(0, 36));
        im1Var.f150678b = bundle.getCharSequence(Integer.toString(1, 36));
        im1Var.f150679c = bundle.getCharSequence(Integer.toString(2, 36));
        im1Var.f150680d = bundle.getCharSequence(Integer.toString(3, 36));
        im1Var.f150681e = bundle.getCharSequence(Integer.toString(4, 36));
        im1Var.f150682f = bundle.getCharSequence(Integer.toString(5, 36));
        im1Var.f150683g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer numValueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        im1Var.f150686j = byteArray != null ? (byte[]) byteArray.clone() : null;
        im1Var.f150687k = numValueOf;
        im1Var.f150688l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        im1Var.f150699w = bundle.getCharSequence(Integer.toString(22, 36));
        im1Var.f150700x = bundle.getCharSequence(Integer.toString(23, 36));
        im1Var.f150701y = bundle.getCharSequence(Integer.toString(24, 36));
        im1Var.B = bundle.getCharSequence(Integer.toString(27, 36));
        im1Var.C = bundle.getCharSequence(Integer.toString(28, 36));
        im1Var.D = bundle.getCharSequence(Integer.toString(30, 36));
        im1Var.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            im1Var.f150684h = (ql2) ql2.f154502b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            im1Var.f150685i = (ql2) ql2.f154502b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            im1Var.f150689m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            im1Var.f150690n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            im1Var.f150691o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            im1Var.f150692p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            im1Var.f150693q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            im1Var.f150694r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            im1Var.f150695s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            im1Var.f150696t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            im1Var.f150697u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            im1Var.f150698v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            im1Var.f150702z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            im1Var.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new jm1(im1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jm1.class == obj.getClass()) {
            jm1 jm1Var = (jm1) obj;
            if (ib3.a(this.f151160b, jm1Var.f151160b) && ib3.a(this.f151161c, jm1Var.f151161c) && ib3.a(this.f151162d, jm1Var.f151162d) && ib3.a(this.f151163e, jm1Var.f151163e) && ib3.a(this.f151164f, jm1Var.f151164f) && ib3.a(this.f151165g, jm1Var.f151165g) && ib3.a(this.f151166h, jm1Var.f151166h) && ib3.a(this.f151167i, jm1Var.f151167i) && ib3.a(this.f151168j, jm1Var.f151168j) && Arrays.equals(this.f151169k, jm1Var.f151169k) && ib3.a(this.f151170l, jm1Var.f151170l) && ib3.a(this.f151171m, jm1Var.f151171m) && ib3.a(this.f151172n, jm1Var.f151172n) && ib3.a(this.f151173o, jm1Var.f151173o) && ib3.a(this.f151174p, jm1Var.f151174p) && ib3.a(this.f151175q, jm1Var.f151175q) && ib3.a(this.f151177s, jm1Var.f151177s) && ib3.a(this.f151178t, jm1Var.f151178t) && ib3.a(this.f151179u, jm1Var.f151179u) && ib3.a(this.f151180v, jm1Var.f151180v) && ib3.a(this.f151181w, jm1Var.f151181w) && ib3.a(this.f151182x, jm1Var.f151182x) && ib3.a(this.f151183y, jm1Var.f151183y) && ib3.a(this.f151184z, jm1Var.f151184z) && ib3.a(this.A, jm1Var.A) && ib3.a(this.B, jm1Var.B) && ib3.a(this.C, jm1Var.C) && ib3.a(this.D, jm1Var.D) && ib3.a(this.E, jm1Var.E) && ib3.a(this.F, jm1Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f151160b, this.f151161c, this.f151162d, this.f151163e, this.f151164f, this.f151165g, this.f151166h, this.f151167i, this.f151168j, Integer.valueOf(Arrays.hashCode(this.f151169k)), this.f151170l, this.f151171m, this.f151172n, this.f151173o, this.f151174p, this.f151175q, this.f151177s, this.f151178t, this.f151179u, this.f151180v, this.f151181w, this.f151182x, this.f151183y, this.f151184z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
