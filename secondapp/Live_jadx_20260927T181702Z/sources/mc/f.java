package mc;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.c0;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f<T extends View, Z> implements p<Z> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f107189g = "CustomViewTarget";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @c0
    public static final int f107190h = com.bumptech.glide.j.h.f30868u0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f107191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f107192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f107193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f107194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f107195f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            f.this.q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            f.this.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f107197e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @h1
        public static Integer f107198f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f107199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<o> f107200b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f107201c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f107202d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakReference<b> f107203b;

            public a(@NonNull b bVar) {
                this.f107203b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(f.f107189g, 2)) {
                    Log.v(f.f107189g, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f107203b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f107199a = view;
        }

        public static int c(@NonNull Context context) {
            if (f107198f == null) {
                Display defaultDisplay = ((WindowManager) pc.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f107198f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f107198f.intValue();
        }

        public void a() {
            if (this.f107200b.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        public void b() {
            ViewTreeObserver viewTreeObserver = this.f107199a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f107202d);
            }
            this.f107202d = null;
            this.f107200b.clear();
        }

        public void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f107200b.contains(oVar)) {
                this.f107200b.add(oVar);
            }
            if (this.f107202d == null) {
                ViewTreeObserver viewTreeObserver = this.f107199a.getViewTreeObserver();
                a aVar = new a(this);
                this.f107202d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f107201c && this.f107199a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f107199a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(f.f107189g, 4)) {
                Log.i(f.f107189g, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f107199a.getContext());
        }

        public final int f() {
            int paddingTop = this.f107199a.getPaddingTop() + this.f107199a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f107199a.getLayoutParams();
            return e(this.f107199a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f107199a.getPaddingLeft() + this.f107199a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f107199a.getLayoutParams();
            return e(this.f107199a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f107200b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        public void k(@NonNull o oVar) {
            this.f107200b.remove(oVar);
        }
    }

    public f(@NonNull T t10) {
        this.f107192c = (T) pc.m.e(t10);
        this.f107191b = new b(t10);
    }

    @Nullable
    private Object b() {
        return this.f107192c.getTag(f107190h);
    }

    private void i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f107193d;
        if (onAttachStateChangeListener == null || this.f107195f) {
            return;
        }
        this.f107192c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f107195f = true;
    }

    private void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f107193d;
        if (onAttachStateChangeListener == null || !this.f107195f) {
            return;
        }
        this.f107192c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f107195f = false;
    }

    private void r(@Nullable Object obj) {
        this.f107192c.setTag(f107190h, obj);
    }

    @NonNull
    public final f<T, Z> a() {
        if (this.f107193d != null) {
            return this;
        }
        this.f107193d = new a();
        i();
        return this;
    }

    @NonNull
    public final T c() {
        return this.f107192c;
    }

    @Override // mc.p
    public final void d(@NonNull o oVar) {
        this.f107191b.d(oVar);
    }

    @Override // mc.p
    @Nullable
    public final lc.e e() {
        Object objB = b();
        if (objB == null) {
            return null;
        }
        if (objB instanceof lc.e) {
            return (lc.e) objB;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // mc.p
    public final void f(@Nullable Drawable drawable) {
        this.f107191b.b();
        m(drawable);
        if (this.f107194e) {
            return;
        }
        j();
    }

    @Override // mc.p
    public final void g(@Nullable lc.e eVar) {
        r(eVar);
    }

    @Override // mc.p
    public final void h(@NonNull o oVar) {
        this.f107191b.k(oVar);
    }

    @Override // mc.p
    public final void k(@Nullable Drawable drawable) {
        i();
        o(drawable);
    }

    public abstract void m(@Nullable Drawable drawable);

    public final void p() {
        lc.e eVarE = e();
        if (eVarE != null) {
            this.f107194e = true;
            eVarE.clear();
            this.f107194e = false;
        }
    }

    public final void q() {
        lc.e eVarE = e();
        if (eVarE == null || !eVarE.e()) {
            return;
        }
        eVarE.j();
    }

    @NonNull
    public final f<T, Z> t() {
        this.f107191b.f107201c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f107192c;
    }

    @Override // com.bumptech.glide.manager.k
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStart() {
    }

    @Override // com.bumptech.glide.manager.k
    public void onStop() {
    }

    public void o(@Nullable Drawable drawable) {
    }

    @Deprecated
    public final f<T, Z> s(@c0 int i10) {
        return this;
    }
}
