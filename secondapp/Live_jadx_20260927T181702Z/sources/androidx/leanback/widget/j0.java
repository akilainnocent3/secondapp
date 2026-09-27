package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends d {
    public static final long A = -6;
    public static final long B = -7;
    public static final long C = -8;
    public static final long D = -9;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 1;
    public static final int J = 2;
    public static final int K = 4;
    public static final int L = 8;
    public static final int M = 16;
    public static final int N = 32;
    public static final int O = 64;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f12676s = "GuidedAction";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f12677t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f12678u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f12679v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f12680w = -2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f12681x = -3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final long f12682y = -4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final long f12683z = -5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f12685h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f12686i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12687j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12688k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12689l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f12690m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f12692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List<j0> f12694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Intent f12695r;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends b<a> {
        @Deprecated
        public a() {
            super(null);
        }

        public j0 J() {
            j0 j0Var = new j0();
            a(j0Var);
            return j0Var;
        }

        public a(Context context) {
            super(context);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b<B extends b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f12696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f12697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f12698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f12699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public CharSequence f12700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f12701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String[] f12702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Drawable f12703h;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public List<j0> f12711p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Intent f12712q;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f12705j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f12706k = 524289;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f12707l = 524289;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f12708m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f12709n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f12710o = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f12704i = 112;

        public b(Context context) {
            this.f12696a = context;
        }

        public B A(boolean z10) {
            F(z10 ? 8 : 0, 8);
            return this;
        }

        public B B(int i10) {
            this.f12706k = i10;
            return this;
        }

        public B C(Intent intent) {
            this.f12712q = intent;
            return this;
        }

        public final boolean D() {
            return (this.f12704i & 1) == 1;
        }

        public B E(boolean z10) {
            F(z10 ? 2 : 0, 2);
            return this;
        }

        public final void F(int i10, int i11) {
            this.f12704i = (i10 & i11) | (this.f12704i & (~i11));
        }

        public B G(List<j0> list) {
            this.f12711p = list;
            return this;
        }

        public B H(@k.b1 int i10) {
            this.f12698c = t().getString(i10);
            return this;
        }

        public B I(CharSequence charSequence) {
            this.f12698c = charSequence;
            return this;
        }

        public final void a(j0 j0Var) {
            j0Var.i(this.f12697b);
            j0Var.j(this.f12698c);
            j0Var.S(this.f12699d);
            j0Var.k(this.f12700e);
            j0Var.R(this.f12701f);
            j0Var.h(this.f12703h);
            j0Var.f12695r = this.f12712q;
            j0Var.f12687j = this.f12705j;
            j0Var.f12688k = this.f12706k;
            j0Var.f12689l = this.f12707l;
            j0Var.f12692o = this.f12702g;
            j0Var.f12690m = this.f12708m;
            j0Var.f12691n = this.f12709n;
            j0Var.f12684g = this.f12704i;
            j0Var.f12693p = this.f12710o;
            j0Var.f12694q = this.f12711p;
        }

        public B b(boolean z10) {
            F(z10 ? 64 : 0, 64);
            return this;
        }

        public B c(String... strArr) {
            this.f12702g = strArr;
            return this;
        }

        public B d(int i10) {
            this.f12710o = i10;
            if (this.f12705j == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be in check sets");
        }

        public B e(boolean z10) {
            F(z10 ? 1 : 0, 1);
            if (this.f12705j == 0) {
                return this;
            }
            throw new IllegalArgumentException("Editable actions cannot also be checked");
        }

        public B f(long j10) {
            if (j10 == -4) {
                this.f12697b = -4L;
                this.f12698c = this.f12696a.getString(R.string.ok);
                return this;
            }
            if (j10 == -5) {
                this.f12697b = -5L;
                this.f12698c = this.f12696a.getString(R.string.cancel);
                return this;
            }
            if (j10 == -6) {
                this.f12697b = -6L;
                this.f12698c = this.f12696a.getString(s3.a.l.f128859d);
                return this;
            }
            if (j10 == -7) {
                this.f12697b = -7L;
                this.f12698c = this.f12696a.getString(s3.a.l.f128858c);
                return this;
            }
            if (j10 == -8) {
                this.f12697b = -8L;
                this.f12698c = this.f12696a.getString(R.string.ok);
                return this;
            }
            if (j10 == -9) {
                this.f12697b = -9L;
                this.f12698c = this.f12696a.getString(R.string.cancel);
            }
            return this;
        }

        public B g(@k.b1 int i10) {
            this.f12700e = t().getString(i10);
            return this;
        }

        public B h(CharSequence charSequence) {
            this.f12700e = charSequence;
            return this;
        }

        public B i(int i10) {
            this.f12709n = i10;
            return this;
        }

        public B j(boolean z10) {
            if (z10) {
                this.f12705j = 2;
                if (D() || this.f12710o != 0) {
                    throw new IllegalArgumentException("Editable actions cannot also be checked");
                }
            } else if (this.f12705j == 2) {
                this.f12705j = 0;
                return this;
            }
            return this;
        }

        public B k(int i10) {
            this.f12707l = i10;
            return this;
        }

        public B l(@k.b1 int i10) {
            this.f12701f = t().getString(i10);
            return this;
        }

        public B m(CharSequence charSequence) {
            this.f12701f = charSequence;
            return this;
        }

        public B n(int i10) {
            this.f12708m = i10;
            return this;
        }

        public B o(@k.b1 int i10) {
            this.f12699d = t().getString(i10);
            return this;
        }

        public B p(CharSequence charSequence) {
            this.f12699d = charSequence;
            return this;
        }

        public B q(boolean z10) {
            if (z10) {
                this.f12705j = 1;
                if (D() || this.f12710o != 0) {
                    throw new IllegalArgumentException("Editable actions cannot also be checked");
                }
            } else if (this.f12705j == 1) {
                this.f12705j = 0;
                return this;
            }
            return this;
        }

        public B r(boolean z10) {
            F(z10 ? 16 : 0, 16);
            return this;
        }

        public B s(boolean z10) {
            F(z10 ? 32 : 0, 32);
            return this;
        }

        public Context t() {
            return this.f12696a;
        }

        public B u(boolean z10) {
            if (z10) {
                this.f12705j = 3;
                if (D() || this.f12710o != 0) {
                    throw new IllegalArgumentException("Editable actions cannot also be checked");
                }
            } else if (this.f12705j == 3) {
                this.f12705j = 0;
                return this;
            }
            return this;
        }

        public B v(boolean z10) {
            F(z10 ? 4 : 0, 4);
            return this;
        }

        public B w(@k.u int i10) {
            return (B) x(f1.d.getDrawable(t(), i10));
        }

        public B x(Drawable drawable) {
            this.f12703h = drawable;
            return this;
        }

        @Deprecated
        public B y(@k.u int i10, Context context) {
            return (B) x(f1.d.getDrawable(context, i10));
        }

        public B z(long j10) {
            this.f12697b = j10;
            return this;
        }
    }

    public j0() {
        super(0L);
    }

    public static boolean K(int i10) {
        int i11 = i10 & 4080;
        return i11 == 128 || i11 == 144 || i11 == 224;
    }

    public boolean A() {
        return this.f12694q != null;
    }

    public boolean B() {
        int i10 = this.f12687j;
        return i10 == 1 || i10 == 2;
    }

    public boolean C() {
        return (this.f12684g & 8) == 8;
    }

    public final boolean D() {
        return (this.f12684g & 64) == 64;
    }

    public boolean E() {
        return (this.f12684g & 1) == 1;
    }

    public boolean F() {
        return this.f12687j == 2;
    }

    public boolean G() {
        return this.f12685h != null;
    }

    public boolean H() {
        return this.f12687j == 1;
    }

    public boolean I() {
        return (this.f12684g & 16) == 16;
    }

    public boolean J() {
        return (this.f12684g & 32) == 32;
    }

    public final boolean L() {
        return F() && !K(o());
    }

    public final boolean M() {
        return H() && !K(r());
    }

    public void N(Bundle bundle, String str) {
        if (M()) {
            String string = bundle.getString(str);
            if (string != null) {
                Y(string);
                return;
            }
            return;
        }
        if (!L()) {
            if (m() != 0) {
                P(bundle.getBoolean(str, E()));
            }
        } else {
            String string2 = bundle.getString(str);
            if (string2 != null) {
                Q(string2);
            }
        }
    }

    public void O(Bundle bundle, String str) {
        if (M() && w() != null) {
            bundle.putString(str, w().toString());
            return;
        }
        if (L() && n() != null) {
            bundle.putString(str, n().toString());
        } else if (m() != 0) {
            bundle.putBoolean(str, E());
        }
    }

    public void P(boolean z10) {
        U(z10 ? 1 : 0, 1);
    }

    public void Q(CharSequence charSequence) {
        k(charSequence);
    }

    public void R(CharSequence charSequence) {
        this.f12686i = charSequence;
    }

    public void S(CharSequence charSequence) {
        this.f12685h = charSequence;
    }

    public void T(boolean z10) {
        U(z10 ? 16 : 0, 16);
    }

    public final void U(int i10, int i11) {
        this.f12684g = (i10 & i11) | (this.f12684g & (~i11));
    }

    public void V(boolean z10) {
        U(z10 ? 32 : 0, 32);
    }

    public void W(Intent intent) {
        this.f12695r = intent;
    }

    public void X(List<j0> list) {
        this.f12694q = list;
    }

    public void Y(CharSequence charSequence) {
        j(charSequence);
    }

    public String[] l() {
        return this.f12692o;
    }

    public int m() {
        return this.f12693p;
    }

    public CharSequence n() {
        return e();
    }

    public int o() {
        return this.f12691n;
    }

    public int p() {
        return this.f12689l;
    }

    public CharSequence q() {
        return this.f12686i;
    }

    public int r() {
        return this.f12690m;
    }

    public CharSequence s() {
        return this.f12685h;
    }

    public int t() {
        return this.f12688k;
    }

    public Intent u() {
        return this.f12695r;
    }

    @SuppressLint({"NullableCollection"})
    public List<j0> v() {
        return this.f12694q;
    }

    public CharSequence w() {
        return d();
    }

    public boolean x() {
        return this.f12687j == 3;
    }

    public boolean y() {
        return (this.f12684g & 2) == 2;
    }

    public boolean z() {
        return (this.f12684g & 4) == 4;
    }
}
