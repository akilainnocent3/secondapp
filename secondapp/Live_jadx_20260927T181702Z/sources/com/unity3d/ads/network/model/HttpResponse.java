package com.unity3d.ads.network.model;

import cs.k;
import fr.n1;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpResponse {

    @l
    private final Object body;

    @l
    private final Map<String, Object> headers;
    private final int statusCode;

    @l
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body) {
        this(body, 0, null, null, 14, null);
        m0.p(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    @l
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @l
    public final Map<String, Object> component3() {
        return this.headers;
    }

    @l
    public final String component4() {
        return this.urlString;
    }

    @l
    public final HttpResponse copy(@l Object body, int i10, @l Map<String, ? extends Object> headers, @l String urlString) {
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        return new HttpResponse(body, i10, headers, urlString);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return m0.g(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && m0.g(this.headers, httpResponse.headers) && m0.g(this.urlString, httpResponse.urlString);
    }

    @l
    public final Object getBody() {
        return this.body;
    }

    @l
    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @l
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    @l
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10) {
        this(body, i10, null, null, 12, null);
        m0.p(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends Object> headers) {
        this(body, i10, headers, null, 8, null);
        m0.p(body, "body");
        m0.p(headers, "headers");
    }

    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends Object> headers, @l String urlString) {
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, x xVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? n1.z() : map, (i11 & 8) != 0 ? "" : str);
    }
}
