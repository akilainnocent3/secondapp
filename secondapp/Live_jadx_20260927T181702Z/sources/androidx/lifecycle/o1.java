package androidx.lifecycle;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@cs.j(name = "ViewTreeLifecycleOwner")
public final class o1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<View, View> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f13403g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final View invoke(@oy.l View currentView) {
            kotlin.jvm.internal.m0.p(currentView, "currentView");
            Object parent = currentView.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<View, b0> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f13404g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final b0 invoke(@oy.l View viewParent) {
            kotlin.jvm.internal.m0.p(viewParent, "viewParent");
            Object tag = viewParent.getTag(i4.a.C0893a.f90405a);
            if (tag instanceof b0) {
                return (b0) tag;
            }
            return null;
        }
    }

    @cs.j(name = "get")
    @oy.m
    public static final b0 a(@oy.l View view) {
        kotlin.jvm.internal.m0.p(view, "<this>");
        return (b0) zu.k0.i1(zu.k0.S1(zu.x.v(view, a.f13403g), b.f13404g));
    }

    @cs.j(name = "set")
    public static final void b(@oy.l View view, @oy.m b0 b0Var) {
        kotlin.jvm.internal.m0.p(view, "<this>");
        view.setTag(i4.a.C0893a.f90405a, b0Var);
    }
}
