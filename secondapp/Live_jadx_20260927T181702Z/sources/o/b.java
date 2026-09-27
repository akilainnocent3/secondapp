package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.k;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f118510n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f118511o = "DrawableContainerCompat";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f118512p = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f118513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f118514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f118515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f118516e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f118518g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f118520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f118521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f118522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f118523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f118524m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f118517f = 255;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f118519h = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @t0(21)
    public static class C1108b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f118527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Resources f118528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f118529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f118530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f118531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f118532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Drawable[] f118533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f118534h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f118535i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f118536j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Rect f118537k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f118538l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f118539m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f118540n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f118541o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f118542p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f118543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f118544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f118545s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f118546t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f118547u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f118548v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f118549w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f118550x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f118551y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f118552z;

        public d(d dVar, b bVar, Resources resources) {
            this.f118535i = false;
            this.f118538l = false;
            this.f118550x = true;
            this.A = 0;
            this.B = 0;
            this.f118527a = bVar;
            this.f118528b = resources != null ? resources : dVar != null ? dVar.f118528b : null;
            int iG = b.g(resources, dVar != null ? dVar.f118529c : 0);
            this.f118529c = iG;
            if (dVar == null) {
                this.f118533g = new Drawable[10];
                this.f118534h = 0;
                return;
            }
            this.f118530d = dVar.f118530d;
            this.f118531e = dVar.f118531e;
            this.f118548v = true;
            this.f118549w = true;
            this.f118535i = dVar.f118535i;
            this.f118538l = dVar.f118538l;
            this.f118550x = dVar.f118550x;
            this.f118551y = dVar.f118551y;
            this.f118552z = dVar.f118552z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f118529c == iG) {
                if (dVar.f118536j) {
                    this.f118537k = dVar.f118537k != null ? new Rect(dVar.f118537k) : null;
                    this.f118536j = true;
                }
                if (dVar.f118539m) {
                    this.f118540n = dVar.f118540n;
                    this.f118541o = dVar.f118541o;
                    this.f118542p = dVar.f118542p;
                    this.f118543q = dVar.f118543q;
                    this.f118539m = true;
                }
            }
            if (dVar.f118544r) {
                this.f118545s = dVar.f118545s;
                this.f118544r = true;
            }
            if (dVar.f118546t) {
                this.f118547u = dVar.f118547u;
                this.f118546t = true;
            }
            Drawable[] drawableArr = dVar.f118533g;
            this.f118533g = new Drawable[drawableArr.length];
            this.f118534h = dVar.f118534h;
            SparseArray<Drawable.ConstantState> sparseArray = dVar.f118532f;
            if (sparseArray != null) {
                this.f118532f = sparseArray.clone();
            } else {
                this.f118532f = new SparseArray<>(this.f118534h);
            }
            int i10 = this.f118534h;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f118532f.put(i11, constantState);
                    } else {
                        this.f118533g[i11] = drawableArr[i11];
                    }
                }
            }
        }

        public final boolean A(int i10, int i11) {
            int i12 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            boolean z10 = false;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    boolean zM = l1.d.m(drawable, i10);
                    if (i13 == i11) {
                        z10 = zM;
                    }
                }
            }
            this.f118552z = i10;
            return z10;
        }

        public final void B(boolean z10) {
            this.f118535i = z10;
        }

        public final void C(Resources resources) {
            if (resources != null) {
                this.f118528b = resources;
                int iG = b.g(resources, this.f118529c);
                int i10 = this.f118529c;
                this.f118529c = iG;
                if (i10 != iG) {
                    this.f118539m = false;
                    this.f118536j = false;
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f118534h;
            if (i10 >= this.f118533g.length) {
                r(i10, i10 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f118527a);
            this.f118533g[i10] = drawable;
            this.f118534h++;
            this.f118531e = drawable.getChangingConfigurations() | this.f118531e;
            s();
            this.f118537k = null;
            this.f118536j = false;
            this.f118539m = false;
            this.f118548v = false;
            return i10;
        }

        @t0(21)
        public final void b(Resources.Theme theme) {
            if (theme != null) {
                f();
                int i10 = this.f118534h;
                Drawable[] drawableArr = this.f118533g;
                for (int i11 = 0; i11 < i10; i11++) {
                    Drawable drawable = drawableArr[i11];
                    if (drawable != null && l1.d.b(drawable)) {
                        l1.d.a(drawableArr[i11], theme);
                        this.f118531e |= drawableArr[i11].getChangingConfigurations();
                    }
                }
                C(C1108b.c(theme));
            }
        }

        public boolean c() {
            if (this.f118548v) {
                return this.f118549w;
            }
            f();
            this.f118548v = true;
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getConstantState() == null) {
                    this.f118549w = false;
                    return false;
                }
            }
            this.f118549w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @t0(21)
        public boolean canApplyTheme() {
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f118532f.get(i11);
                    if (constantState != null && C1108b.a(constantState)) {
                        return true;
                    }
                } else if (l1.d.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        public final void d() {
            this.f118551y = false;
        }

        public void e() {
            this.f118539m = true;
            f();
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            this.f118541o = -1;
            this.f118540n = -1;
            this.f118543q = 0;
            this.f118542p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f118540n) {
                    this.f118540n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f118541o) {
                    this.f118541o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f118542p) {
                    this.f118542p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f118543q) {
                    this.f118543q = minimumHeight;
                }
            }
        }

        public final void f() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f118532f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f118533g[this.f118532f.keyAt(i10)] = w(this.f118532f.valueAt(i10).newDrawable(this.f118528b));
                }
                this.f118532f = null;
            }
        }

        public final int g() {
            return this.f118533g.length;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f118530d | this.f118531e;
        }

        public final Drawable h(int i10) {
            int iIndexOfKey;
            Drawable drawable = this.f118533g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f118532f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable drawableW = w(this.f118532f.valueAt(iIndexOfKey).newDrawable(this.f118528b));
            this.f118533g[i10] = drawableW;
            this.f118532f.removeAt(iIndexOfKey);
            if (this.f118532f.size() == 0) {
                this.f118532f = null;
            }
            return drawableW;
        }

        public final int i() {
            return this.f118534h;
        }

        public final int j() {
            if (!this.f118539m) {
                e();
            }
            return this.f118541o;
        }

        public final int k() {
            if (!this.f118539m) {
                e();
            }
            return this.f118543q;
        }

        public final int l() {
            if (!this.f118539m) {
                e();
            }
            return this.f118542p;
        }

        public final Rect m() {
            Rect rect = null;
            if (this.f118535i) {
                return null;
            }
            Rect rect2 = this.f118537k;
            if (rect2 != null || this.f118536j) {
                return rect2;
            }
            f();
            Rect rect3 = new Rect();
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i12 = rect3.left;
                    if (i12 > rect.left) {
                        rect.left = i12;
                    }
                    int i13 = rect3.top;
                    if (i13 > rect.top) {
                        rect.top = i13;
                    }
                    int i14 = rect3.right;
                    if (i14 > rect.right) {
                        rect.right = i14;
                    }
                    int i15 = rect3.bottom;
                    if (i15 > rect.bottom) {
                        rect.bottom = i15;
                    }
                }
            }
            this.f118536j = true;
            this.f118537k = rect;
            return rect;
        }

        public final int n() {
            if (!this.f118539m) {
                e();
            }
            return this.f118540n;
        }

        public final int o() {
            return this.A;
        }

        public final int p() {
            return this.B;
        }

        public final int q() {
            if (this.f118544r) {
                return this.f118545s;
            }
            f();
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
            }
            this.f118545s = opacity;
            this.f118544r = true;
            return opacity;
        }

        public void r(int i10, int i11) {
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f118533g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f118533g = drawableArr;
        }

        public void s() {
            this.f118544r = false;
            this.f118546t = false;
        }

        public final boolean t() {
            return this.f118538l;
        }

        public final boolean u() {
            if (this.f118546t) {
                return this.f118547u;
            }
            f();
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            boolean z10 = false;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11].isStateful()) {
                    z10 = true;
                    break;
                }
            }
            this.f118547u = z10;
            this.f118546t = true;
            return z10;
        }

        public void v() {
            int i10 = this.f118534h;
            Drawable[] drawableArr = this.f118533g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable != null) {
                    drawable.mutate();
                }
            }
            this.f118551y = true;
        }

        public final Drawable w(Drawable drawable) {
            l1.d.m(drawable, this.f118552z);
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f118527a);
            return drawableMutate;
        }

        public final void x(boolean z10) {
            this.f118538l = z10;
        }

        public final void y(int i10) {
            this.A = i10;
        }

        public final void z(int i10) {
            this.B = i10;
        }
    }

    public static int g(@Nullable Resources resources, int i10) {
        if (resources != null) {
            i10 = resources.getDisplayMetrics().densityDpi;
        }
        if (i10 == 0) {
            return 160;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        long j10;
        boolean z12 = true;
        this.f118518g = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            long j11 = this.f118522k;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f118517f);
                    this.f118522k = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f118513b.A)) * this.f118517f) / 255);
                    z11 = true;
                }
            }
            drawable = this.f118516e;
            if (drawable != null) {
                j10 = this.f118523l;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f118516e = null;
                        this.f118523l = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f118513b.B) * this.f118517f) / 255);
                    }
                }
                if (z10 || !z12) {
                }
                scheduleSelf(this.f118521j, jUptimeMillis + 16);
                return;
            }
            this.f118523l = 0L;
            z12 = z11;
            if (z10) {
            }
        }
        this.f118522k = 0L;
        z11 = false;
        drawable = this.f118516e;
        if (drawable != null) {
            j10 = this.f118523l;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f118516e = null;
                    this.f118523l = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f118513b.B) * this.f118517f) / 255);
                }
            }
            if (z10) {
            }
        }
        this.f118523l = 0L;
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    @t0(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f118513b.b(theme);
    }

    public void b() {
        this.f118513b.d();
        this.f118520i = false;
    }

    public d c() {
        return this.f118513b;
    }

    @Override // android.graphics.drawable.Drawable
    @t0(21)
    public boolean canApplyTheme() {
        return this.f118513b.canApplyTheme();
    }

    public int d() {
        return this.f118519h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f118516e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e(Drawable drawable) {
        if (this.f118524m == null) {
            this.f118524m = new c();
        }
        drawable.setCallback(this.f118524m.b(drawable.getCallback()));
        try {
            if (this.f118513b.A <= 0 && this.f118518g) {
                drawable.setAlpha(this.f118517f);
            }
            d dVar = this.f118513b;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    l1.d.o(drawable, dVar.F);
                }
                d dVar2 = this.f118513b;
                if (dVar2.I) {
                    l1.d.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f118513b.f118550x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            l1.d.m(drawable, l1.d.f(this));
            l1.d.j(drawable, this.f118513b.C);
            Rect rect = this.f118514c;
            if (rect != null) {
                l1.d.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f118524m.a());
        }
    }

    public final boolean f() {
        return isAutoMirrored() && l1.d.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f118517f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f118513b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f118513b.c()) {
            return null;
        }
        this.f118513b.f118530d = getChangingConfigurations();
        return this.f118513b;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f118515d;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f118514c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f118513b.t()) {
            return this.f118513b.j();
        }
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f118513b.t()) {
            return this.f118513b.n();
        }
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f118513b.t()) {
            return this.f118513b.k();
        }
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f118513b.t()) {
            return this.f118513b.l();
        }
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f118515d;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f118513b.q();
    }

    @Override // android.graphics.drawable.Drawable
    @t0(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            C1108b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect rectM = this.f118513b.m();
        if (rectM != null) {
            rect.set(rectM);
            padding = (rectM.right | ((rectM.left | rectM.top) | rectM.bottom)) != 0;
        } else {
            Drawable drawable = this.f118515d;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (f()) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public boolean h(int i10) {
        if (i10 == this.f118519h) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f118513b.B > 0) {
            Drawable drawable = this.f118516e;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f118515d;
            if (drawable2 != null) {
                this.f118516e = drawable2;
                this.f118523l = ((long) this.f118513b.B) + jUptimeMillis;
            } else {
                this.f118516e = null;
                this.f118523l = 0L;
            }
        } else {
            Drawable drawable3 = this.f118515d;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            d dVar = this.f118513b;
            if (i10 < dVar.f118534h) {
                Drawable drawableH = dVar.h(i10);
                this.f118515d = drawableH;
                this.f118519h = i10;
                if (drawableH != null) {
                    int i11 = this.f118513b.A;
                    if (i11 > 0) {
                        this.f118522k = jUptimeMillis + ((long) i11);
                    }
                    e(drawableH);
                }
            } else {
                this.f118515d = null;
                this.f118519h = -1;
            }
        } else {
            this.f118515d = null;
            this.f118519h = -1;
        }
        if (this.f118522k != 0 || this.f118523l != 0) {
            Runnable runnable = this.f118521j;
            if (runnable == null) {
                this.f118521j = new a();
            } else {
                unscheduleSelf(runnable);
            }
            a(true);
        }
        invalidateSelf();
        return true;
    }

    public void i(d dVar) {
        this.f118513b = dVar;
        int i10 = this.f118519h;
        if (i10 >= 0) {
            Drawable drawableH = dVar.h(i10);
            this.f118515d = drawableH;
            if (drawableH != null) {
                e(drawableH);
            }
        }
        this.f118516e = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        d dVar = this.f118513b;
        if (dVar != null) {
            dVar.s();
        }
        if (drawable != this.f118515d || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f118513b.C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f118513b.u();
    }

    public void j(int i10) {
        h(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f118516e;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f118516e = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f118518g) {
                this.f118515d.setAlpha(this.f118517f);
            }
        }
        if (this.f118523l != 0) {
            this.f118523l = 0L;
            z10 = true;
        }
        if (this.f118522k != 0) {
            this.f118522k = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    public void k(int i10) {
        this.f118513b.A = i10;
    }

    public void l(int i10) {
        this.f118513b.B = i10;
    }

    public final void m(Resources resources) {
        this.f118513b.C(resources);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f118520i && super.mutate() == this) {
            d dVarC = c();
            dVarC.v();
            i(dVarC);
            this.f118520i = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f118516e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return this.f118513b.A(i10, d());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f118516e;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f118516e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
        if (drawable != this.f118515d || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f118518g && this.f118517f == i10) {
            return;
        }
        this.f118518g = true;
        this.f118517f = i10;
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            if (this.f118522k == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        d dVar = this.f118513b;
        if (dVar.C != z10) {
            dVar.C = z10;
            Drawable drawable = this.f118515d;
            if (drawable != null) {
                l1.d.j(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f118513b;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f118515d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        d dVar = this.f118513b;
        if (dVar.f118550x != z10) {
            dVar.f118550x = z10;
            Drawable drawable = this.f118515d;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            l1.d.k(drawable, f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f118514c;
        if (rect == null) {
            this.f118514c = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f118515d;
        if (drawable != null) {
            l1.d.l(drawable, i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@k int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f118513b;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            l1.d.o(this.f118515d, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        d dVar = this.f118513b;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            l1.d.p(this.f118515d, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f118516e;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f118515d;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f118515d || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c implements Drawable.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Drawable.Callback f118526b;

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f118526b;
            this.f118526b = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f118526b = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j10) {
            Drawable.Callback callback = this.f118526b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f118526b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@NonNull Drawable drawable) {
        }
    }
}
