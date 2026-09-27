package r;

import android.view.View;
import android.view.animation.Interpolator;
import f2.k2;
import f2.l2;
import f2.m2;
import java.util.ArrayList;
import java.util.Iterator;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f123370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l2 f123371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f123372e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f123369b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m2 f123373f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<k2> f123368a = new ArrayList<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends m2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f123374a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f123375b = 0;

        public a() {
        }

        @Override // f2.m2, f2.l2
        public void b(View view) {
            int i10 = this.f123375b + 1;
            this.f123375b = i10;
            if (i10 == h.this.f123368a.size()) {
                l2 l2Var = h.this.f123371d;
                if (l2Var != null) {
                    l2Var.b(null);
                }
                d();
            }
        }

        @Override // f2.m2, f2.l2
        public void c(View view) {
            if (this.f123374a) {
                return;
            }
            this.f123374a = true;
            l2 l2Var = h.this.f123371d;
            if (l2Var != null) {
                l2Var.c(null);
            }
        }

        public void d() {
            this.f123375b = 0;
            this.f123374a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f123372e) {
            Iterator<k2> it = this.f123368a.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            this.f123372e = false;
        }
    }

    public void b() {
        this.f123372e = false;
    }

    public h c(k2 k2Var) {
        if (!this.f123372e) {
            this.f123368a.add(k2Var);
        }
        return this;
    }

    public h d(k2 k2Var, k2 k2Var2) {
        this.f123368a.add(k2Var);
        k2Var2.v(k2Var.e());
        this.f123368a.add(k2Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f123372e) {
            this.f123369b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f123372e) {
            this.f123370c = interpolator;
        }
        return this;
    }

    public h g(l2 l2Var) {
        if (!this.f123372e) {
            this.f123371d = l2Var;
        }
        return this;
    }

    public void h() {
        if (this.f123372e) {
            return;
        }
        for (k2 k2Var : this.f123368a) {
            long j10 = this.f123369b;
            if (j10 >= 0) {
                k2Var.r(j10);
            }
            Interpolator interpolator = this.f123370c;
            if (interpolator != null) {
                k2Var.s(interpolator);
            }
            if (this.f123371d != null) {
                k2Var.t(this.f123373f);
            }
            k2Var.x();
        }
        this.f123372e = true;
    }
}
