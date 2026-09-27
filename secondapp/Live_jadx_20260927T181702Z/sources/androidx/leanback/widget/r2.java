package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f12980i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12981j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f12982k = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12983a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12990h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f12991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f12992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f12993c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f12995e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12994d = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f12996f = b.f12997d;

        public r2 a(Context context) {
            r2 r2Var = new r2();
            r2Var.f12984b = this.f12991a;
            boolean z10 = false;
            r2Var.f12985c = this.f12992b && r2.r();
            r2Var.f12986d = this.f12993c && r2.s();
            if (r2Var.f12985c) {
                r2Var.o(this.f12996f, context);
            }
            if (!r2Var.f12986d) {
                r2Var.f12983a = 1;
                if ((!r2.q() || this.f12995e) && r2Var.f12984b) {
                    z10 = true;
                }
                r2Var.f12987e = z10;
                return r2Var;
            }
            if (!this.f12994d || !r2.p()) {
                r2Var.f12983a = 2;
                r2Var.f12987e = true;
                return r2Var;
            }
            r2Var.f12983a = 3;
            r2Var.n(this.f12996f, context);
            if ((!r2.q() || this.f12995e) && r2Var.f12984b) {
                z10 = true;
            }
            r2Var.f12987e = z10;
            return r2Var;
        }

        public a b(boolean z10) {
            this.f12995e = z10;
            return this;
        }

        public a c(boolean z10) {
            this.f12991a = z10;
            return this;
        }

        public a d(boolean z10) {
            this.f12992b = z10;
            return this;
        }

        public a e(boolean z10) {
            this.f12993c = z10;
            return this;
        }

        public a f(b bVar) {
            this.f12996f = bVar;
            return this;
        }

        public a g(boolean z10) {
            this.f12994d = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f12997d = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12998a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f12999b = -1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f13000c = -1.0f;

        public b a(float f10, float f11) {
            this.f12999b = f10;
            this.f13000c = f11;
            return this;
        }

        public final float b() {
            return this.f13000c;
        }

        public final float c() {
            return this.f12999b;
        }

        public final int d() {
            return this.f12998a;
        }

        public b e(int i10) {
            this.f12998a = i10;
            return this;
        }
    }

    public static Object b(View view) {
        return view.getTag(s3.a.h.f128769t1);
    }

    public static void i(View view, int i10) {
        Drawable drawableA = d0.a(view);
        if (drawableA instanceof ColorDrawable) {
            ((ColorDrawable) drawableA).setColor(i10);
        } else {
            d0.b(view, new ColorDrawable(i10));
        }
    }

    public static void j(View view, float f10) {
        m(b(view), 3, f10);
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0007 A[PHI: r0
      0x0007: PHI (r0v4 float) = (r0v0 float), (r0v1 float) binds: [B:4:0x0005, B:7:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    public static void m(Object obj, int i10, float f10) {
        if (obj != null) {
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                f10 = f11;
            } else {
                f11 = 1.0f;
                if (f10 > 1.0f) {
                    f10 = f11;
                }
            }
            if (i10 == 2) {
                y2.c(obj, f10);
            } else {
                if (i10 != 3) {
                    return;
                }
                o2.b(obj, f10);
            }
        }
    }

    public static boolean p() {
        return o2.c();
    }

    public static boolean q() {
        return d0.c();
    }

    public static boolean r() {
        return f2.c();
    }

    public static boolean s() {
        return y2.d();
    }

    public q2 a(Context context) {
        if (f()) {
            return new q2(context, this.f12983a, this.f12984b, this.f12989g, this.f12990h, this.f12988f);
        }
        throw new IllegalArgumentException();
    }

    public int c() {
        return this.f12983a;
    }

    public boolean d() {
        return this.f12984b;
    }

    public boolean e() {
        return this.f12985c;
    }

    public boolean f() {
        return this.f12987e;
    }

    public void g(View view) {
        if (f()) {
            return;
        }
        if (!this.f12986d) {
            if (this.f12985c) {
                f2.b(view, true, this.f12988f);
            }
        } else if (this.f12983a == 3) {
            view.setTag(s3.a.h.f128769t1, o2.a(view, this.f12989g, this.f12990h, this.f12988f));
        } else if (this.f12985c) {
            f2.b(view, true, this.f12988f);
        }
    }

    public void h(ViewGroup viewGroup) {
        if (this.f12983a == 2) {
            y2.b(viewGroup);
        }
    }

    public void k(View view, int i10) {
        if (f()) {
            ((q2) view).setOverlayColor(i10);
        } else {
            i(view, i10);
        }
    }

    public void l(View view, float f10) {
        if (f()) {
            ((q2) view).setShadowFocusLevel(f10);
        } else {
            m(b(view), 3, f10);
        }
    }

    public void n(b bVar, Context context) {
        if (bVar.c() >= 0.0f) {
            this.f12990h = bVar.b();
            this.f12989g = bVar.c();
        } else {
            Resources resources = context.getResources();
            this.f12990h = resources.getDimension(s3.a.e.M1);
            this.f12989g = resources.getDimension(s3.a.e.N1);
        }
    }

    public void o(b bVar, Context context) {
        if (bVar.d() == 0) {
            this.f12988f = context.getResources().getDimensionPixelSize(s3.a.e.f128534b3);
        } else {
            this.f12988f = bVar.d();
        }
    }
}
