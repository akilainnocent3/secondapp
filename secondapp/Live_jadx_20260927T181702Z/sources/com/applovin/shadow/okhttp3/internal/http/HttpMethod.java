package com.applovin.shadow.okhttp3.internal.http;

import cs.o;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class HttpMethod {

    @l
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @o
    public static final boolean permitsRequestBody(@l String method) {
        m0.p(method, "method");
        return (m0.g(method, "GET") || m0.g(method, "HEAD")) ? false : true;
    }

    @o
    public static final boolean requiresRequestBody(@l String method) {
        m0.p(method, "method");
        return m0.g(method, "POST") || m0.g(method, "PUT") || m0.g(method, "PATCH") || m0.g(method, "PROPPATCH") || m0.g(method, "REPORT");
    }

    public final boolean invalidatesCache(@l String method) {
        m0.p(method, "method");
        return m0.g(method, "POST") || m0.g(method, "PATCH") || m0.g(method, "PUT") || m0.g(method, "DELETE") || m0.g(method, "MOVE");
    }

    public final boolean redirectsToGet(@l String method) {
        m0.p(method, "method");
        return !m0.g(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@l String method) {
        m0.p(method, "method");
        return m0.g(method, "PROPFIND");
    }
}
