package qw;

import cs.o;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final g f123078a = new g();

    @o
    public static final boolean a(@oy.l String method) {
        m0.p(method, "method");
        return m0.g(method, "POST") || m0.g(method, "PATCH") || m0.g(method, "PUT") || m0.g(method, "DELETE") || m0.g(method, "MOVE");
    }

    @o
    public static final boolean b(@oy.l String method) {
        m0.p(method, "method");
        return (m0.g(method, "GET") || m0.g(method, "HEAD")) ? false : true;
    }

    @o
    public static final boolean e(@oy.l String method) {
        m0.p(method, "method");
        return m0.g(method, "POST") || m0.g(method, "PUT") || m0.g(method, "PATCH") || m0.g(method, "PROPPATCH") || m0.g(method, "REPORT");
    }

    public final boolean c(@oy.l String method) {
        m0.p(method, "method");
        return !m0.g(method, "PROPFIND");
    }

    public final boolean d(@oy.l String method) {
        m0.p(method, "method");
        return m0.g(method, "PROPFIND");
    }
}
