package cp;

import android.content.Context;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final C0749a f77054a = new C0749a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f77055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f77056c;

    /* JADX INFO: renamed from: cp.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0749a {
        public /* synthetic */ C0749a(x xVar) {
            this();
        }

        @m
        public final Context a() {
            if (a.f77055b == null) {
                return null;
            }
            Context context = a.f77056c;
            if (context != null) {
                return context;
            }
            m0.S("applicationContext");
            return null;
        }

        public final void b(@l Context context) {
            m0.p(context, "context");
            a.f77055b = new a(null);
            Context applicationContext = context.getApplicationContext();
            m0.o(applicationContext, "getApplicationContext(...)");
            a.f77056c = applicationContext;
        }

        public C0749a() {
        }
    }

    public /* synthetic */ a(x xVar) {
        this();
    }

    public a() {
    }
}
