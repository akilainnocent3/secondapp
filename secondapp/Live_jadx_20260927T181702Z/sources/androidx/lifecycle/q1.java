package androidx.lifecycle;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@cs.j(name = "ViewTreeViewModelStoreOwner")
public final class q1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.l<View, View> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f13411g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final View invoke(@oy.l View view) {
            kotlin.jvm.internal.m0.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends kotlin.jvm.internal.o0 implements ds.l<View, m1> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f13412g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @oy.m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final m1 invoke(@oy.l View view) {
            kotlin.jvm.internal.m0.p(view, "view");
            Object tag = view.getTag(k4.f.a.f101786a);
            if (tag instanceof m1) {
                return (m1) tag;
            }
            return null;
        }
    }

    @cs.j(name = "get")
    @oy.m
    public static final m1 a(@oy.l View view) {
        kotlin.jvm.internal.m0.p(view, "<this>");
        return (m1) zu.k0.i1(zu.k0.S1(zu.x.v(view, a.f13411g), b.f13412g));
    }

    @cs.j(name = "set")
    public static final void b(@oy.l View view, @oy.m m1 m1Var) {
        kotlin.jvm.internal.m0.p(view, "<this>");
        view.setTag(k4.f.a.f101786a, m1Var);
    }
}
