package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final a f19910a = a.f19911a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f19912b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f19911a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oy.m
        public static final String f19913c = m1.d(a0.class).K();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @oy.l
        public static b0 f19914d = n.f19939a;

        @cs.j(name = "getOrCreate")
        @oy.l
        @cs.o
        public final a0 a(@oy.l Context context) {
            m0.p(context, "context");
            return f19914d.a(new c0(k0.f19936b, d(context)));
        }

        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public final void b(@oy.l b0 overridingDecorator) {
            m0.p(overridingDecorator, "overridingDecorator");
            f19914d = overridingDecorator;
        }

        @cs.o
        @y0({y0.a.LIBRARY_GROUP})
        public final void c() {
            f19914d = n.f19939a;
        }

        @oy.l
        public final y d(@oy.l Context context) {
            m0.p(context, "context");
            p pVar = null;
            try {
                WindowLayoutComponent windowLayoutComponentM = t.f19969a.m();
                if (windowLayoutComponentM != null) {
                    pVar = new p(windowLayoutComponentM);
                }
            } catch (Throwable unused) {
                if (f19912b) {
                    Log.d(f19913c, "Failed to load WindowExtensions");
                }
            }
            return pVar == null ? w.f19983c.a(context) : pVar;
        }
    }

    @oy.l
    nv.i<e0> a(@oy.l Activity activity);
}
