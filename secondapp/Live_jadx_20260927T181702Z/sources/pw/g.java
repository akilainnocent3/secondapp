package pw;

import java.io.IOException;
import jw.p0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final b f121161a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public static final g f121162b = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends g {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final g a() {
            return g.f121162b;
        }

        public b() {
        }
    }

    public void b(@oy.l jw.k connection, @oy.l p0 route, @oy.l jw.e call) {
        m0.p(connection, "connection");
        m0.p(route, "route");
        m0.p(call, "call");
    }

    public void c(@oy.l p0 route, @oy.l jw.e call, @oy.l IOException failure) {
        m0.p(route, "route");
        m0.p(call, "call");
        m0.p(failure, "failure");
    }

    public void d(@oy.l p0 route, @oy.l jw.e call) {
        m0.p(route, "route");
        m0.p(call, "call");
    }

    public void e(@oy.l jw.k connection, @oy.l jw.e call) {
        m0.p(connection, "connection");
        m0.p(call, "call");
    }

    public void f(@oy.l jw.k connection) {
        m0.p(connection, "connection");
    }

    public void g(@oy.l jw.k connection, @oy.l jw.e call) {
        m0.p(connection, "connection");
        m0.p(call, "call");
    }

    public void h(@oy.l jw.k connection) {
        m0.p(connection, "connection");
    }
}
