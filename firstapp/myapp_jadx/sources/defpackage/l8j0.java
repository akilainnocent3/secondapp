package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l8j0 {
    public static final l8j0 b;
    public final l a;

    public static final class m {
        public static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            if (i == 512) {
                return 9;
            }
            hb5.a(hce0.a(i, "type needs to be >= FIRST and <= LAST, type="));
            return 0;
        }
    }

    public static final class n {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    public static final class o {
        public static int a(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            b = k.s;
        } else if (i2 >= 30) {
            b = j.r;
        } else {
            b = l.b;
        }
    }

    public l8j0(l8j0 l8j0Var) {
        if (l8j0Var == null) {
            this.a = new l(this);
            return;
        }
        l lVar = l8j0Var.a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && (lVar instanceof k)) {
            this.a = new k(this, (k) lVar);
        } else if (i2 >= 30 && (lVar instanceof j)) {
            this.a = new j(this, (j) lVar);
        } else if (i2 >= 29 && (lVar instanceof i)) {
            this.a = new i(this, (i) lVar);
        } else if (i2 >= 28 && (lVar instanceof h)) {
            this.a = new h(this, (h) lVar);
        } else if (lVar instanceof g) {
            this.a = new g(this, (g) lVar);
        } else if (lVar instanceof f) {
            this.a = new f(this, (f) lVar);
        } else {
            this.a = new l(this);
        }
        lVar.e(this);
    }

    public static ymn e(ymn ymnVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, ymnVar.a - i2);
        int iMax2 = Math.max(0, ymnVar.b - i3);
        int iMax3 = Math.max(0, ymnVar.c - i4);
        int iMax4 = Math.max(0, ymnVar.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? ymnVar : ymn.c(iMax, iMax2, iMax3, iMax4);
    }

    public static l8j0 h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        l8j0 l8j0Var = new l8j0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            l8j0 l8j0VarA = r6i0.e.a(view);
            l lVar = l8j0Var.a;
            lVar.t(l8j0VarA);
            lVar.d(view.getRootView());
            lVar.v(view.getWindowSystemUiVisibility());
        }
        return l8j0Var;
    }

    @Deprecated
    public final int a() {
        return this.a.l().d;
    }

    @Deprecated
    public final int b() {
        return this.a.l().a;
    }

    @Deprecated
    public final int c() {
        return this.a.l().c;
    }

    @Deprecated
    public final int d() {
        return this.a.l().b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l8j0) {
            return Objects.equals(this.a, ((l8j0) obj).a);
        }
        return false;
    }

    @Deprecated
    public final l8j0 f(int i2, int i3, int i4, int i5) {
        e bVar;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            bVar = new d(this);
        } else if (i6 >= 30) {
            bVar = new c(this);
        } else {
            bVar = i6 >= 29 ? new b(this) : new a(this);
        }
        bVar.g(ymn.c(i2, i3, i4, i5));
        return bVar.b();
    }

    public final WindowInsets g() {
        l lVar = this.a;
        if (lVar instanceof f) {
            return ((f) lVar).c;
        }
        return null;
    }

    public final int hashCode() {
        l lVar = this.a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public static class c extends b {
        public c() {
        }

        @Override // l8j0.e
        public void c(int i, ymn ymnVar) {
            this.c.setInsets(n.a(i), ymnVar.e());
        }

        public c(l8j0 l8j0Var) {
            super(l8j0Var);
        }
    }

    public static class d extends c {
        public d() {
        }

        @Override // l8j0.c, l8j0.e
        public void c(int i, ymn ymnVar) {
            this.c.setInsets(o.a(i), ymnVar.e());
        }

        public d(l8j0 l8j0Var) {
            super(l8j0Var);
        }
    }

    public static class h extends g {
        public h(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var, windowInsets);
        }

        @Override // l8j0.l
        public l8j0 a() {
            return l8j0.h(null, this.c.consumeDisplayCutout());
        }

        @Override // l8j0.f, l8j0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.c, hVar.c) && Objects.equals(this.g, hVar.g) && f.C(this.h, hVar.h);
        }

        @Override // l8j0.l
        public ise f() {
            DisplayCutout displayCutout = this.c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new ise(displayCutout);
        }

        @Override // l8j0.l
        public int hashCode() {
            return this.c.hashCode();
        }

        public h(l8j0 l8j0Var, h hVar) {
            super(l8j0Var, hVar);
        }
    }

    public static class j extends i {
        public static final l8j0 r = l8j0.h(null, WindowInsets.CONSUMED);

        public j(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var, windowInsets);
        }

        @Override // l8j0.f, l8j0.l
        public ymn g(int i) {
            return ymn.d(this.c.getInsets(n.a(i)));
        }

        @Override // l8j0.f, l8j0.l
        public ymn h(int i) {
            return ymn.d(this.c.getInsetsIgnoringVisibility(n.a(i)));
        }

        @Override // l8j0.f, l8j0.l
        public boolean q(int i) {
            return this.c.isVisible(n.a(i));
        }

        public j(l8j0 l8j0Var, j jVar) {
            super(l8j0Var, jVar);
        }

        @Override // l8j0.f, l8j0.l
        public final void d(View view) {
        }
    }

    public static class k extends j {
        public static final l8j0 s = l8j0.h(null, WindowInsets.CONSUMED);

        public k(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var, windowInsets);
        }

        @Override // l8j0.j, l8j0.f, l8j0.l
        public ymn g(int i) {
            return ymn.d(this.c.getInsets(o.a(i)));
        }

        @Override // l8j0.j, l8j0.f, l8j0.l
        public ymn h(int i) {
            return ymn.d(this.c.getInsetsIgnoringVisibility(o.a(i)));
        }

        @Override // l8j0.j, l8j0.f, l8j0.l
        public boolean q(int i) {
            return this.c.isVisible(o.a(i));
        }

        public k(l8j0 l8j0Var, k kVar) {
            super(l8j0Var, kVar);
        }
    }

    public static class a extends e {
        public static Field e = null;
        public static boolean f = false;
        public static Constructor<WindowInsets> g = null;
        public static boolean h = false;
        public WindowInsets c;
        public ymn d;

        public a() {
            this.c = i();
        }

        private static WindowInsets i() {
            if (!f) {
                try {
                    e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!h) {
                try {
                    g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                h = true;
            }
            Constructor<WindowInsets> constructor = g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // l8j0.e
        public l8j0 b() {
            a();
            l8j0 l8j0VarH = l8j0.h(null, this.c);
            ymn[] ymnVarArr = this.b;
            l lVar = l8j0VarH.a;
            lVar.r(ymnVarArr);
            lVar.u(this.d);
            return l8j0VarH;
        }

        @Override // l8j0.e
        public void e(ymn ymnVar) {
            this.d = ymnVar;
        }

        @Override // l8j0.e
        public void g(ymn ymnVar) {
            WindowInsets windowInsets = this.c;
            if (windowInsets != null) {
                this.c = windowInsets.replaceSystemWindowInsets(ymnVar.a, ymnVar.b, ymnVar.c, ymnVar.d);
            }
        }

        public a(l8j0 l8j0Var) {
            super(l8j0Var);
            this.c = l8j0Var.g();
        }
    }

    public static class e {
        public final l8j0 a;
        public ymn[] b;

        public e() {
            this(new l8j0((l8j0) null));
        }

        public final void a() {
            ymn[] ymnVarArr = this.b;
            if (ymnVarArr != null) {
                ymn ymnVarG = ymnVarArr[0];
                ymn ymnVarG2 = ymnVarArr[1];
                l8j0 l8j0Var = this.a;
                if (ymnVarG2 == null) {
                    ymnVarG2 = l8j0Var.a.g(2);
                }
                if (ymnVarG == null) {
                    ymnVarG = l8j0Var.a.g(1);
                }
                g(ymn.a(ymnVarG, ymnVarG2));
                ymn ymnVar = this.b[m.a(16)];
                if (ymnVar != null) {
                    f(ymnVar);
                }
                ymn ymnVar2 = this.b[m.a(32)];
                if (ymnVar2 != null) {
                    d(ymnVar2);
                }
                ymn ymnVar3 = this.b[m.a(64)];
                if (ymnVar3 != null) {
                    h(ymnVar3);
                }
            }
        }

        public l8j0 b() {
            throw null;
        }

        public void c(int i, ymn ymnVar) {
            if (this.b == null) {
                this.b = new ymn[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[m.a(i2)] = ymnVar;
                }
            }
        }

        public void e(ymn ymnVar) {
            throw null;
        }

        public void g(ymn ymnVar) {
            throw null;
        }

        public e(l8j0 l8j0Var) {
            this.a = l8j0Var;
        }

        public void d(ymn ymnVar) {
        }

        public void f(ymn ymnVar) {
        }

        public void h(ymn ymnVar) {
        }
    }

    public static class f extends l {
        public static boolean i = false;
        public static Method j;
        public static Class<?> k;
        public static Field l;
        public static Field m;
        public final WindowInsets c;
        public ymn[] d;
        public ymn e;
        public l8j0 f;
        public ymn g;
        public int h;

        public f(l8j0 l8j0Var, f fVar) {
            this(l8j0Var, new WindowInsets(fVar.c));
        }

        private static void B() {
            try {
                j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                k = cls;
                l = cls.getDeclaredField("mVisibleInsets");
                m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                l.setAccessible(true);
                m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            i = true;
        }

        public static boolean C(int i2, int i3) {
            return (i2 & 6) == (i3 & 6);
        }

        private ymn w(int i2, boolean z) {
            ymn ymnVarA = ymn.e;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    ymnVarA = ymn.a(ymnVarA, x(i3, z));
                }
            }
            return ymnVarA;
        }

        private ymn y() {
            l8j0 l8j0Var = this.f;
            return l8j0Var != null ? l8j0Var.a.j() : ymn.e;
        }

        private ymn z(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                zkh.a("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!i) {
                B();
            }
            Method method = j;
            if (method != null && k != null && l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) l.get(m.get(objInvoke));
                    if (rect != null) {
                        return ymn.c(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        public boolean A(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !x(i2, false).equals(ymn.e);
        }

        @Override // l8j0.l
        public void d(View view) {
            ymn ymnVarZ = z(view);
            if (ymnVarZ == null) {
                ymnVarZ = ymn.e;
            }
            s(ymnVarZ);
        }

        @Override // l8j0.l
        public void e(l8j0 l8j0Var) {
            l8j0Var.a.t(this.f);
            ymn ymnVar = this.g;
            l lVar = l8j0Var.a;
            lVar.s(ymnVar);
            lVar.v(this.h);
        }

        @Override // l8j0.l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            f fVar = (f) obj;
            return Objects.equals(this.g, fVar.g) && C(this.h, fVar.h);
        }

        @Override // l8j0.l
        public ymn g(int i2) {
            return w(i2, false);
        }

        @Override // l8j0.l
        public ymn h(int i2) {
            return w(i2, true);
        }

        @Override // l8j0.l
        public final ymn l() {
            ymn ymnVar = this.e;
            if (ymnVar != null) {
                return ymnVar;
            }
            WindowInsets windowInsets = this.c;
            ymn ymnVarC = ymn.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            this.e = ymnVarC;
            return ymnVarC;
        }

        @Override // l8j0.l
        public l8j0 n(int i2, int i3, int i4, int i5) {
            e bVar;
            l8j0 l8j0VarH = l8j0.h(null, this.c);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34) {
                bVar = new d(l8j0VarH);
            } else if (i6 >= 30) {
                bVar = new c(l8j0VarH);
            } else {
                bVar = i6 >= 29 ? new b(l8j0VarH) : new a(l8j0VarH);
            }
            bVar.g(l8j0.e(l(), i2, i3, i4, i5));
            bVar.e(l8j0.e(j(), i2, i3, i4, i5));
            return bVar.b();
        }

        @Override // l8j0.l
        public boolean p() {
            return this.c.isRound();
        }

        @Override // l8j0.l
        public boolean q(int i2) {
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i2 & i3) != 0 && !A(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // l8j0.l
        public void r(ymn[] ymnVarArr) {
            this.d = ymnVarArr;
        }

        @Override // l8j0.l
        public void s(ymn ymnVar) {
            this.g = ymnVar;
        }

        @Override // l8j0.l
        public void t(l8j0 l8j0Var) {
            this.f = l8j0Var;
        }

        @Override // l8j0.l
        public void v(int i2) {
            this.h = i2;
        }

        public ymn x(int i2, boolean z) {
            ymn ymnVarJ;
            int i3;
            ymn ymnVar = ymn.e;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 8) {
                        ymn[] ymnVarArr = this.d;
                        ymnVarJ = ymnVarArr != null ? ymnVarArr[m.a(8)] : null;
                        if (ymnVarJ != null) {
                            return ymnVarJ;
                        }
                        ymn ymnVarL = l();
                        ymn ymnVarY = y();
                        int i4 = ymnVarL.d;
                        if (i4 > ymnVarY.d) {
                            return ymn.c(0, 0, 0, i4);
                        }
                        ymn ymnVar2 = this.g;
                        if (ymnVar2 != null && !ymnVar2.equals(ymnVar) && (i3 = this.g.d) > ymnVarY.d) {
                            return ymn.c(0, 0, 0, i3);
                        }
                    } else {
                        if (i2 == 16) {
                            return k();
                        }
                        if (i2 == 32) {
                            return i();
                        }
                        if (i2 == 64) {
                            return m();
                        }
                        if (i2 == 128) {
                            l8j0 l8j0Var = this.f;
                            ise iseVarF = l8j0Var != null ? l8j0Var.a.f() : f();
                            if (iseVarF != null) {
                                int i5 = Build.VERSION.SDK_INT;
                                return ymn.c(i5 >= 28 ? ise.a.c(iseVarF.a) : 0, i5 >= 28 ? ise.a.e(iseVarF.a) : 0, i5 >= 28 ? ise.a.d(iseVarF.a) : 0, i5 >= 28 ? ise.a.b(iseVarF.a) : 0);
                            }
                        }
                    }
                } else {
                    if (z) {
                        ymn ymnVarY2 = y();
                        ymn ymnVarJ2 = j();
                        return ymn.c(Math.max(ymnVarY2.a, ymnVarJ2.a), 0, Math.max(ymnVarY2.c, ymnVarJ2.c), Math.max(ymnVarY2.d, ymnVarJ2.d));
                    }
                    if ((this.h & 2) == 0) {
                        ymn ymnVarL2 = l();
                        l8j0 l8j0Var2 = this.f;
                        ymnVarJ = l8j0Var2 != null ? l8j0Var2.a.j() : null;
                        int iMin = ymnVarL2.d;
                        if (ymnVarJ != null) {
                            iMin = Math.min(iMin, ymnVarJ.d);
                        }
                        return ymn.c(ymnVarL2.a, 0, ymnVarL2.c, iMin);
                    }
                }
            } else {
                if (z) {
                    return ymn.c(0, Math.max(y().b, l().b), 0, 0);
                }
                if ((this.h & 4) == 0) {
                    return ymn.c(0, l().b, 0, 0);
                }
            }
            return ymnVar;
        }

        public f(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var);
            this.e = null;
            this.c = windowInsets;
        }
    }

    public static class g extends f {
        public ymn n;

        public g(l8j0 l8j0Var, g gVar) {
            super(l8j0Var, gVar);
            this.n = null;
            this.n = gVar.n;
        }

        @Override // l8j0.l
        public l8j0 b() {
            return l8j0.h(null, this.c.consumeStableInsets());
        }

        @Override // l8j0.l
        public l8j0 c() {
            return l8j0.h(null, this.c.consumeSystemWindowInsets());
        }

        @Override // l8j0.l
        public final ymn j() {
            ymn ymnVar = this.n;
            if (ymnVar != null) {
                return ymnVar;
            }
            WindowInsets windowInsets = this.c;
            ymn ymnVarC = ymn.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.n = ymnVarC;
            return ymnVarC;
        }

        @Override // l8j0.l
        public boolean o() {
            return this.c.isConsumed();
        }

        @Override // l8j0.l
        public void u(ymn ymnVar) {
            this.n = ymnVar;
        }

        public g(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var, windowInsets);
            this.n = null;
        }
    }

    public static class i extends h {
        public ymn o;
        public ymn p;
        public ymn q;

        public i(l8j0 l8j0Var, WindowInsets windowInsets) {
            super(l8j0Var, windowInsets);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        @Override // l8j0.l
        public ymn i() {
            ymn ymnVar = this.p;
            if (ymnVar != null) {
                return ymnVar;
            }
            ymn ymnVarD = ymn.d(this.c.getMandatorySystemGestureInsets());
            this.p = ymnVarD;
            return ymnVarD;
        }

        @Override // l8j0.l
        public ymn k() {
            ymn ymnVar = this.o;
            if (ymnVar != null) {
                return ymnVar;
            }
            ymn ymnVarD = ymn.d(this.c.getSystemGestureInsets());
            this.o = ymnVarD;
            return ymnVarD;
        }

        @Override // l8j0.l
        public ymn m() {
            ymn ymnVar = this.q;
            if (ymnVar != null) {
                return ymnVar;
            }
            ymn ymnVarD = ymn.d(this.c.getTappableElementInsets());
            this.q = ymnVarD;
            return ymnVarD;
        }

        @Override // l8j0.f, l8j0.l
        public l8j0 n(int i, int i2, int i3, int i4) {
            return l8j0.h(null, this.c.inset(i, i2, i3, i4));
        }

        public i(l8j0 l8j0Var, i iVar) {
            super(l8j0Var, iVar);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        @Override // l8j0.g, l8j0.l
        public void u(ymn ymnVar) {
        }
    }

    public static class b extends e {
        public final WindowInsets.Builder c;

        public b(l8j0 l8j0Var) {
            super(l8j0Var);
            WindowInsets windowInsetsG = l8j0Var.g();
            this.c = windowInsetsG != null ? m8j0.a(windowInsetsG) : jdb0.a();
        }

        @Override // l8j0.e
        public l8j0 b() {
            a();
            l8j0 l8j0VarH = l8j0.h(null, this.c.build());
            l8j0VarH.a.r(this.b);
            return l8j0VarH;
        }

        @Override // l8j0.e
        public void d(ymn ymnVar) {
            this.c.setMandatorySystemGestureInsets(ymnVar.e());
        }

        @Override // l8j0.e
        public void e(ymn ymnVar) {
            this.c.setStableInsets(ymnVar.e());
        }

        @Override // l8j0.e
        public void f(ymn ymnVar) {
            this.c.setSystemGestureInsets(ymnVar.e());
        }

        @Override // l8j0.e
        public void g(ymn ymnVar) {
            this.c.setSystemWindowInsets(ymnVar.e());
        }

        @Override // l8j0.e
        public void h(ymn ymnVar) {
            this.c.setTappableElementInsets(ymnVar.e());
        }

        public b() {
            this.c = jdb0.a();
        }
    }

    public static class l {
        public static final l8j0 b;
        public final l8j0 a;

        static {
            e bVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                bVar = new d();
            } else if (i >= 30) {
                bVar = new c();
            } else {
                bVar = i >= 29 ? new b() : new a();
            }
            b = bVar.b().a.a().a.b().a.c();
        }

        public l(l8j0 l8j0Var) {
            this.a = l8j0Var;
        }

        public l8j0 a() {
            return this.a;
        }

        public l8j0 b() {
            return this.a;
        }

        public l8j0 c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && Objects.equals(l(), lVar.l()) && Objects.equals(j(), lVar.j()) && Objects.equals(f(), lVar.f());
        }

        public ise f() {
            return null;
        }

        public ymn g(int i) {
            return ymn.e;
        }

        public ymn h(int i) {
            if ((i & 8) == 0) {
                return ymn.e;
            }
            hb5.a("Unable to query the maximum insets for IME");
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public ymn i() {
            return l();
        }

        public ymn j() {
            return ymn.e;
        }

        public ymn k() {
            return l();
        }

        public ymn l() {
            return ymn.e;
        }

        public ymn m() {
            return l();
        }

        public l8j0 n(int i, int i2, int i3, int i4) {
            return b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i) {
            return true;
        }

        public void d(View view) {
        }

        public void e(l8j0 l8j0Var) {
        }

        public void r(ymn[] ymnVarArr) {
        }

        public void s(ymn ymnVar) {
        }

        public void t(l8j0 l8j0Var) {
        }

        public void u(ymn ymnVar) {
        }

        public void v(int i) {
        }
    }

    public l8j0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            this.a = new k(this, windowInsets);
            return;
        }
        if (i2 >= 30) {
            this.a = new j(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.a = new i(this, windowInsets);
        } else if (i2 >= 28) {
            this.a = new h(this, windowInsets);
        } else {
            this.a = new g(this, windowInsets);
        }
    }
}
