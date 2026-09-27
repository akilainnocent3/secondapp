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
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class r<T extends View, Z> extends mc.b<Z> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f107226h = "ViewTarget";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f107227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f107228j = com.bumptech.glide.j.h.f30868u0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T f107229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f107230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public View.OnAttachStateChangeListener f107231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f107232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f107233g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            r.this.p();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            r.this.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f107235e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        @h1
        public static Integer f107236f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f107237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<o> f107238b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f107239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public a f107240d;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final WeakReference<b> f107241b;

            public a(@NonNull b bVar) {
                this.f107241b = new WeakReference<>(bVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable(r.f107226h, 2)) {
                    Log.v(r.f107226h, "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                b bVar = this.f107241b.get();
                if (bVar == null) {
                    return true;
                }
                bVar.a();
                return true;
            }
        }

        public b(@NonNull View view) {
            this.f107237a = view;
        }

        public static int c(@NonNull Context context) {
            if (f107236f == null) {
                Display defaultDisplay = ((WindowManager) pc.m.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f107236f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f107236f.intValue();
        }

        public void a() {
            if (this.f107238b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f107237a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f107240d);
            }
            this.f107240d = null;
            this.f107238b.clear();
        }

        public void d(@NonNull o oVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                oVar.d(iG, iF);
                return;
            }
            if (!this.f107238b.contains(oVar)) {
                this.f107238b.add(oVar);
            }
            if (this.f107240d == null) {
                ViewTreeObserver viewTreeObserver = this.f107237a.getViewTreeObserver();
                a aVar = new a(this);
                this.f107240d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        public final int e(int i10, int i11, int i12) {
            int i13 = i11 - i12;
            if (i13 > 0) {
                return i13;
            }
            if (this.f107239c && this.f107237a.isLayoutRequested()) {
                return 0;
            }
            int i14 = i10 - i12;
            if (i14 > 0) {
                return i14;
            }
            if (this.f107237a.isLayoutRequested() || i11 != -2) {
                return 0;
            }
            if (Log.isLoggable(r.f107226h, 4)) {
                Log.i(r.f107226h, "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f107237a.getContext());
        }

        public final int f() {
            int paddingTop = this.f107237a.getPaddingTop() + this.f107237a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f107237a.getLayoutParams();
            return e(this.f107237a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        public final int g() {
            int paddingLeft = this.f107237a.getPaddingLeft() + this.f107237a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f107237a.getLayoutParams();
            return e(this.f107237a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        public final boolean h(int i10) {
            return i10 > 0 || i10 == Integer.MIN_VALUE;
        }

        public final boolean i(int i10, int i11) {
            return h(i10) && h(i11);
        }

        public final void j(int i10, int i11) {
            Iterator it = new ArrayList(this.f107238b).iterator();
            while (it.hasNext()) {
                ((o) it.next()).d(i10, i11);
            }
        }

        public void k(@NonNull o oVar) {
            this.f107238b.remove(oVar);
        }
    }

    public r(@NonNull T t10) {
        this.f107229c = (T) pc.m.e(t10);
        this.f107230d = new b(t10);
    }

    @Deprecated
    public static void r(int i10) {
        if (f107227i) {
            throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
        }
        f107228j = i10;
    }

    @NonNull
    public final r<T, Z> c() {
        if (this.f107231e != null) {
            return this;
        }
        this.f107231e = new a();
        j();
        return this;
    }

    @Override // mc.p
    @k.i
    public void d(@NonNull o oVar) {
        this.f107230d.d(oVar);
    }

    @Override // mc.b, mc.p
    @Nullable
    public lc.e e() {
        Object objI = i();
        if (objI == null) {
            return null;
        }
        if (objI instanceof lc.e) {
            return (lc.e) objI;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // mc.b, mc.p
    @k.i
    public void f(@Nullable Drawable drawable) {
        super.f(drawable);
        this.f107230d.b();
        if (this.f107232f) {
            return;
        }
        m();
    }

    @Override // mc.b, mc.p
    public void g(@Nullable lc.e eVar) {
        q(eVar);
    }

    @NonNull
    public T getView() {
        return this.f107229c;
    }

    @Override // mc.p
    @k.i
    public void h(@NonNull o oVar) {
        this.f107230d.k(oVar);
    }

    @Nullable
    public final Object i() {
        return this.f107229c.getTag(f107228j);
    }

    public final void j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f107231e;
        if (onAttachStateChangeListener == null || this.f107233g) {
            return;
        }
        this.f107229c.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f107233g = true;
    }

    @Override // mc.b, mc.p
    @k.i
    public void k(@Nullable Drawable drawable) {
        super.k(drawable);
        j();
    }

    public final void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f107231e;
        if (onAttachStateChangeListener == null || !this.f107233g) {
            return;
        }
        this.f107229c.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f107233g = false;
    }

    public void o() {
        lc.e eVarE = e();
        if (eVarE != null) {
            this.f107232f = true;
            eVarE.clear();
            this.f107232f = false;
        }
    }

    public void p() {
        lc.e eVarE = e();
        if (eVarE == null || !eVarE.e()) {
            return;
        }
        eVarE.j();
    }

    public final void q(@Nullable Object obj) {
        f107227i = true;
        this.f107229c.setTag(f107228j, obj);
    }

    @NonNull
    public final r<T, Z> s() {
        this.f107230d.f107239c = true;
        return this;
    }

    public String toString() {
        return "Target for: " + this.f107229c;
    }

    @Deprecated
    public r(@NonNull T t10, boolean z10) {
        this(t10);
        if (z10) {
            s();
        }
    }
}
