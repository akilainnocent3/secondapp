package androidx.leanback.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class c extends androidx.leanback.app.g {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Object f11246z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y3.b.c f11232l = new y3.b.c("START", true, false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y3.b.c f11233m = new y3.b.c("ENTRANCE_INIT");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y3.b.c f11234n = new a("ENTRANCE_ON_PREPARED", true, false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y3.b.c f11235o = new b("ENTRANCE_ON_PREPARED_ON_CREATEVIEW");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y3.b.c f11236p = new C0070c("STATE_ENTRANCE_PERFORM");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y3.b.c f11237q = new d("ENTRANCE_ON_ENDED");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y3.b.c f11238r = new y3.b.c("ENTRANCE_COMPLETE", true, false);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y3.b.C1537b f11239s = new y3.b.C1537b("onCreate");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y3.b.C1537b f11240t = new y3.b.C1537b("onCreateView");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y3.b.C1537b f11241u = new y3.b.C1537b("prepareEntranceTransition");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y3.b.C1537b f11242v = new y3.b.C1537b("startEntranceTransition");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y3.b.C1537b f11243w = new y3.b.C1537b("onEntranceTransitionEnd");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y3.b.a f11244x = new e("EntranceTransitionNotSupport");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y3.b f11245y = new y3.b();
    public final e0 A = new e0();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends y3.b.c {
        public a(String str, boolean z10, boolean z11) {
            super(str, z10, z11);
        }

        @Override // y3.b.c
        public void e() {
            c.this.A.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends y3.b.c {
        public b(String str) {
            super(str);
        }

        @Override // y3.b.c
        public void e() {
            c.this.y();
        }
    }

    /* JADX INFO: renamed from: androidx.leanback.app.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0070c extends y3.b.c {
        public C0070c(String str) {
            super(str);
        }

        @Override // y3.b.c
        public void e() {
            c.this.A.d();
            c.this.A();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d extends y3.b.c {
        public d(String str) {
            super(str);
        }

        @Override // y3.b.c
        public void e() {
            c.this.x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e extends y3.b.a {
        public e(String str) {
            super(str);
        }

        @Override // y3.b.a
        public boolean a() {
            return !androidx.leanback.transition.e.X();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f11252b;

        public f(View view) {
            this.f11252b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f11252b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (r.a(c.this) == null || c.this.getView() == null) {
                return true;
            }
            c.this.w();
            c.this.z();
            c cVar = c.this;
            Object obj = cVar.f11246z;
            if (obj != null) {
                cVar.C(obj);
                return false;
            }
            cVar.f11245y.e(cVar.f11243w);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class g extends androidx.leanback.transition.f {
        public g() {
        }

        @Override // androidx.leanback.transition.f
        public void b(Object obj) {
            c cVar = c.this;
            cVar.f11246z = null;
            cVar.f11245y.e(cVar.f11243w);
        }
    }

    @SuppressLint({"ValidFragment"})
    public c() {
    }

    public void A() {
        View view = getView();
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new f(view));
        view.invalidate();
    }

    public void B() {
        this.f11245y.e(this.f11241u);
    }

    public void D() {
        this.f11245y.e(this.f11242v);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        t();
        u();
        this.f11245y.h();
        super.onCreate(bundle);
        this.f11245y.e(this.f11239s);
    }

    @Override // androidx.leanback.app.g, android.app.Fragment
    public void onDestroyView() {
        this.A.g(null);
        this.A.f(null);
        super.onDestroyView();
    }

    @Override // androidx.leanback.app.g, android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f11245y.e(this.f11240t);
    }

    public Object s() {
        return null;
    }

    public void t() {
        this.f11245y.a(this.f11232l);
        this.f11245y.a(this.f11233m);
        this.f11245y.a(this.f11234n);
        this.f11245y.a(this.f11235o);
        this.f11245y.a(this.f11236p);
        this.f11245y.a(this.f11237q);
        this.f11245y.a(this.f11238r);
    }

    public void u() {
        this.f11245y.d(this.f11232l, this.f11233m, this.f11239s);
        this.f11245y.c(this.f11233m, this.f11238r, this.f11244x);
        this.f11245y.d(this.f11233m, this.f11238r, this.f11240t);
        this.f11245y.d(this.f11233m, this.f11234n, this.f11241u);
        this.f11245y.d(this.f11234n, this.f11235o, this.f11240t);
        this.f11245y.d(this.f11234n, this.f11236p, this.f11242v);
        this.f11245y.b(this.f11235o, this.f11236p);
        this.f11245y.d(this.f11236p, this.f11237q, this.f11243w);
        this.f11245y.b(this.f11237q, this.f11238r);
    }

    public final e0 v() {
        return this.A;
    }

    public void w() {
        Object objS = s();
        this.f11246z = objS;
        if (objS == null) {
            return;
        }
        androidx.leanback.transition.e.d(objS, new g());
    }

    public void C(Object obj) {
    }

    public void x() {
    }

    public void y() {
    }

    public void z() {
    }
}
