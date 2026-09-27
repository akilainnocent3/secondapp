package yads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class po2 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final km3 f154019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f154020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f154022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f154023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public tp2 f154024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f154025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cp2 f154026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f154027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f154028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f154029l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f154030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f154031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public qe0 f154032o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public lr f154033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f154034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public no2 f154035r;

    public po2(int i10, String str, tp2 tp2Var) {
        this.f154019b = km3.f151607c ? new km3() : null;
        this.f154023f = new Object();
        this.f154027j = true;
        this.f154028k = false;
        this.f154029l = false;
        this.f154030m = false;
        this.f154031n = false;
        this.f154033p = null;
        this.f154020c = i10;
        this.f154021d = str;
        this.f154024g = tp2Var;
        a(new qe0());
        this.f154022e = b(str);
    }

    public im3 a(im3 im3Var) {
        return im3Var;
    }

    public abstract vp2 a(e82 e82Var);

    public abstract void a(Object obj);

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        cp2 cp2Var = this.f154026i;
        if (cp2Var != null) {
            synchronized (cp2Var.f147851b) {
                cp2Var.f147851b.remove(this);
            }
            synchronized (cp2Var.f147859j) {
                Iterator it = cp2Var.f147859j.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
            cp2Var.a(this, 5);
        }
        if (km3.f151607c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new mo2(this, str, id2));
                return;
            }
            this.f154019b.a(str, id2);
            km3 km3Var = this.f154019b;
            toString();
            km3Var.a();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        po2 po2Var = (po2) obj;
        int iF = f();
        int iF2 = po2Var.f();
        return iF == iF2 ? this.f154025h.intValue() - po2Var.f154025h.intValue() : hg0.a(iF2) - hg0.a(iF);
    }

    public Map d() {
        return Collections.EMPTY_MAP;
    }

    public final int e() {
        return this.f154020c;
    }

    public int f() {
        return 2;
    }

    public String g() {
        return this.f154021d;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f154023f) {
            z10 = this.f154029l;
        }
        return z10;
    }

    public final boolean i() {
        boolean z10;
        synchronized (this.f154023f) {
            z10 = this.f154028k;
        }
        return z10;
    }

    public final void j() {
        no2 no2Var;
        synchronized (this.f154023f) {
            no2Var = this.f154035r;
        }
        if (no2Var != null) {
            ((en3) no2Var).b(this);
        }
    }

    public final void k() {
        this.f154027j = false;
    }

    public final void l() {
        this.f154031n = true;
    }

    public final void m() {
        this.f154030m = true;
    }

    public final String toString() {
        String str = "0x" + Integer.toHexString(this.f154022e);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i() ? "[X] " : "[ ] ");
        sb2.append(g());
        sb2.append(" ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(oo2.a(f()));
        sb2.append(" ");
        sb2.append(this.f154025h);
        return sb2.toString();
    }

    public static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void a() {
        synchronized (this.f154023f) {
            this.f154028k = true;
            this.f154024g = null;
        }
    }

    public final void a(vp2 vp2Var) {
        no2 no2Var;
        synchronized (this.f154023f) {
            no2Var = this.f154035r;
        }
        if (no2Var != null) {
            ((en3) no2Var).a(this, vp2Var);
        }
    }

    public final void a(int i10) {
        cp2 cp2Var = this.f154026i;
        if (cp2Var != null) {
            cp2Var.a(this, i10);
        }
    }

    public final void a(no2 no2Var) {
        synchronized (this.f154023f) {
            this.f154035r = no2Var;
        }
    }

    public final void a(qe0 qe0Var) {
        this.f154032o = qe0Var;
    }

    public final void a(String str) {
        if (km3.f151607c) {
            this.f154019b.a(str, Thread.currentThread().getId());
        }
    }

    public final String c() {
        String strG = g();
        int i10 = this.f154020c;
        if (i10 == 0 || i10 == -1) {
            return strG;
        }
        return Integer.toString(i10) + '-' + strG;
    }
}
