package i9;

import android.view.View;
import cs.j;
import ds.l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import oy.m;
import zu.k0;
import zu.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@j(name = "ViewTreeSavedStateRegistryOwner")
public final class f {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends o0 implements l<View, View> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f90567g = new a();

        public a() {
            super(1);
        }

        @Override // ds.l
        @m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final View invoke(@oy.l View view) {
            m0.p(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends o0 implements l<View, d> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f90568g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        @m
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final d invoke(@oy.l View view) {
            m0.p(view, "view");
            Object tag = view.getTag(i9.a.C0896a.f90561a);
            if (tag instanceof d) {
                return (d) tag;
            }
            return null;
        }
    }

    @j(name = "get")
    @m
    public static final d a(@oy.l View view) {
        m0.p(view, "<this>");
        return (d) k0.i1(k0.S1(x.v(view, a.f90567g), b.f90568g));
    }

    @j(name = "set")
    public static final void b(@oy.l View view, @m d dVar) {
        m0.p(view, "<this>");
        view.setTag(i9.a.C0896a.f90561a, dVar);
    }
}
