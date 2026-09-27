package zl;

import cs.o;
import k.h1;
import kotlin.jvm.internal.m0;
import oy.l;
import yl.w0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f161996a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w0 f161997b;

    @o
    public static final void c() {
        try {
            if (f161997b == null) {
                f161996a.d(w0.f159716a.a());
            }
            a aVar = f161996a;
            if (aVar.a().b()) {
                aVar.a().c();
            }
        } catch (Exception unused) {
        }
    }

    @l
    public final w0 a() {
        w0 w0Var = f161997b;
        if (w0Var != null) {
            return w0Var;
        }
        m0.S("sharedSessionRepository");
        return null;
    }

    public final void d(@l w0 w0Var) {
        m0.p(w0Var, "<set-?>");
        f161997b = w0Var;
    }

    @h1
    public static /* synthetic */ void b() {
    }
}
