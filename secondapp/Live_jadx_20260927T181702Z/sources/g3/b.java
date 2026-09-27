package g3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import f2.z1;
import g3.b;
import java.util.ArrayList;
import jg.b0;
import k.w;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends b<T>> implements g3.a.b {
    public static final float A = 1.0f;
    public static final float B = 0.1f;
    public static final float C = 0.00390625f;
    public static final float D = 0.002f;
    public static final float E = Float.MAX_VALUE;
    public static final float F = 0.75f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final s f85972m = new g("translationX");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f85973n = new h("translationY");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f85974o = new i("translationZ");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f85975p = new j("scaleX");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f85976q = new k("scaleY");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f85977r = new l(w0.f.f141740i);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f85978s = new m("rotationX");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f85979t = new n("rotationY");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f85980u = new o("x");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f85981v = new a("y");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f85982w = new C0843b(b0.f100177r);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f85983x = new c("alpha");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f85984y = new d("scrollX");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f85985z = new e("scrollY");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f85986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f85987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f85988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f85989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g3.g f85990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f85992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f85993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f85994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f85995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList<q> f85996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList<r> f85997l;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getY();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setY(f10);
        }
    }

    /* JADX INFO: renamed from: g3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0843b extends s {
        public C0843b(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return z1.I0(view);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            z1.J2(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getAlpha();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollX();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScrollY();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f extends g3.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g3.h f85998b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, g3.h hVar) {
            super(str);
            this.f85998b = hVar;
        }

        @Override // g3.g
        public float b(Object obj) {
            return this.f85998b.a();
        }

        @Override // g3.g
        public void c(Object obj, float f10) {
            this.f85998b.b(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationX();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getTranslationY();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return z1.D0(view);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            z1.F2(view, f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleX();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getScaleY();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotation();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotation(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationX();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getRotationY();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // g3.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public float b(View view) {
            return view.getX();
        }

        @Override // g3.g
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(View view, float f10) {
            view.setX(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f86000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f86001b;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface q {
        void a(b bVar, boolean z10, float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface r {
        void g(b bVar, float f10, float f11);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class s extends g3.g<View> {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(g3.h hVar) {
        this.f85986a = 0.0f;
        this.f85987b = Float.MAX_VALUE;
        this.f85988c = false;
        this.f85991f = false;
        this.f85992g = Float.MAX_VALUE;
        this.f85993h = -Float.MAX_VALUE;
        this.f85994i = 0L;
        this.f85996k = new ArrayList<>();
        this.f85997l = new ArrayList<>();
        this.f85989d = null;
        this.f85990e = new f("FloatValueHolder", hVar);
        this.f85995j = 1.0f;
    }

    public static <T> void m(ArrayList<T> arrayList, T t10) {
        int iIndexOf = arrayList.indexOf(t10);
        if (iIndexOf >= 0) {
            arrayList.set(iIndexOf, null);
        }
    }

    public static <T> void n(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // g3.a.b
    @y0({y0.a.LIBRARY})
    public boolean a(long j10) {
        long j11 = this.f85994i;
        if (j11 == 0) {
            this.f85994i = j10;
            s(this.f85987b);
            return false;
        }
        this.f85994i = j10;
        boolean zY = y(j10 - j11);
        float fMin = Math.min(this.f85987b, this.f85992g);
        this.f85987b = fMin;
        float fMax = Math.max(fMin, this.f85993h);
        this.f85987b = fMax;
        s(fMax);
        if (zY) {
            e(false);
        }
        return zY;
    }

    public T b(q qVar) {
        if (!this.f85996k.contains(qVar)) {
            this.f85996k.add(qVar);
        }
        return this;
    }

    public T c(r rVar) {
        if (k()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f85997l.contains(rVar)) {
            this.f85997l.add(rVar);
        }
        return this;
    }

    public void d() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
        }
        if (this.f85991f) {
            e(true);
        }
    }

    public final void e(boolean z10) {
        this.f85991f = false;
        g3.a.e().h(this);
        this.f85994i = 0L;
        this.f85988c = false;
        for (int i10 = 0; i10 < this.f85996k.size(); i10++) {
            if (this.f85996k.get(i10) != null) {
                this.f85996k.get(i10).a(this, z10, this.f85987b, this.f85986a);
            }
        }
        n(this.f85996k);
    }

    public abstract float f(float f10, float f11);

    public float g() {
        return this.f85995j;
    }

    public final float h() {
        return this.f85990e.b(this.f85989d);
    }

    public float i() {
        return this.f85995j * 0.75f;
    }

    public abstract boolean j(float f10, float f11);

    public boolean k() {
        return this.f85991f;
    }

    public void l(q qVar) {
        m(this.f85996k, qVar);
    }

    public void o(r rVar) {
        m(this.f85997l, rVar);
    }

    public T p(float f10) {
        this.f85992g = f10;
        return this;
    }

    public T q(float f10) {
        this.f85993h = f10;
        return this;
    }

    public T r(@w(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f85995j = f10;
        v(f10 * 0.75f);
        return this;
    }

    public void s(float f10) {
        this.f85990e.c(this.f85989d, f10);
        for (int i10 = 0; i10 < this.f85997l.size(); i10++) {
            if (this.f85997l.get(i10) != null) {
                this.f85997l.get(i10).g(this, this.f85987b, this.f85986a);
            }
        }
        n(this.f85997l);
    }

    public T t(float f10) {
        this.f85987b = f10;
        this.f85988c = true;
        return this;
    }

    public T u(float f10) {
        this.f85986a = f10;
        return this;
    }

    public abstract void v(float f10);

    public void w() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f85991f) {
            return;
        }
        x();
    }

    public final void x() {
        if (this.f85991f) {
            return;
        }
        this.f85991f = true;
        if (!this.f85988c) {
            this.f85987b = h();
        }
        float f10 = this.f85987b;
        if (f10 > this.f85992g || f10 < this.f85993h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        g3.a.e().a(this, 0L);
    }

    public abstract boolean y(long j10);

    public <K> b(K k10, g3.g<K> gVar) {
        this.f85986a = 0.0f;
        this.f85987b = Float.MAX_VALUE;
        this.f85988c = false;
        this.f85991f = false;
        this.f85992g = Float.MAX_VALUE;
        this.f85993h = -Float.MAX_VALUE;
        this.f85994i = 0L;
        this.f85996k = new ArrayList<>();
        this.f85997l = new ArrayList<>();
        this.f85989d = k10;
        this.f85990e = gVar;
        if (gVar != f85977r && gVar != f85978s && gVar != f85979t) {
            if (gVar == f85983x) {
                this.f85995j = 0.00390625f;
                return;
            } else if (gVar != f85975p && gVar != f85976q) {
                this.f85995j = 1.0f;
                return;
            } else {
                this.f85995j = 0.00390625f;
                return;
            }
        }
        this.f85995j = 0.1f;
    }
}
