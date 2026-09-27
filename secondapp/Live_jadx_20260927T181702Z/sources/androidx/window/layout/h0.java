package androidx.window.layout;

import android.app.Activity;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f19931a = a.f19932a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f19932a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.l
        public static ds.l<? super h0, ? extends h0> f19933b = C0174a.f19934g;

        /* JADX INFO: renamed from: androidx.window.layout.h0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0174a extends o0 implements ds.l<h0, h0> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final C0174a f19934g = new C0174a();

            public C0174a() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@oy.l h0 it) {
                m0.p(it, "it");
                return it;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public /* synthetic */ class b extends kotlin.jvm.internal.i0 implements ds.l<h0, h0> {
            public b(Object obj) {
                super(1, obj, l0.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@oy.l h0 p10) {
                m0.p(p10, "p0");
                return ((l0) this.receiver).a(p10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class c extends o0 implements ds.l<h0, h0> {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final c f19935g = new c();

            public c() {
                super(1);
            }

            @Override // ds.l
            @oy.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@oy.l h0 it) {
                m0.p(it, "it");
                return it;
            }
        }

        @oy.l
        @cs.o
        public final h0 a() {
            return f19933b.invoke(k0.f19936b);
        }

        @cs.o
        @da.d
        @y0({y0.a.TESTS})
        public final void b(@oy.l l0 overridingDecorator) {
            m0.p(overridingDecorator, "overridingDecorator");
            f19933b = new b(overridingDecorator);
        }

        @cs.o
        @da.d
        @y0({y0.a.TESTS})
        public final void c() {
            f19933b = c.f19935g;
        }
    }

    @oy.l
    f0 a(@oy.l Activity activity);

    @oy.l
    f0 b(@oy.l Activity activity);
}
