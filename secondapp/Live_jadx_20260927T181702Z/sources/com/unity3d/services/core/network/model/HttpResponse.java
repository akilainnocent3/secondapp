package com.unity3d.services.core.network.model;

import cs.k;
import f0.p;
import fr.n1;
import java.util.List;
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
    private final String client;
    private final long contentSize;

    @l
    private final Map<String, List<String>> headers;

    @l
    private final String protocol;
    private final int statusCode;

    @l
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        m0.p(body, "body");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, Object obj2) {
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
        if ((i11 & 16) != 0) {
            str2 = httpResponse.protocol;
        }
        if ((i11 & 32) != 0) {
            str3 = httpResponse.client;
        }
        if ((i11 & 64) != 0) {
            j10 = httpResponse.contentSize;
        }
        long j11 = j10;
        String str4 = str2;
        String str5 = str3;
        return httpResponse.copy(obj, i10, map, str, str4, str5, j11);
    }

    @l
    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    @l
    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    @l
    public final String component4() {
        return this.urlString;
    }

    @l
    public final String component5() {
        return this.protocol;
    }

    @l
    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    @l
    public final HttpResponse copy(@l Object body, int i10, @l Map<String, ? extends List<String>> headers, @l String urlString, @l String protocol, @l String client, long j10) {
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        m0.p(protocol, "protocol");
        m0.p(client, "client");
        return new HttpResponse(body, i10, headers, urlString, protocol, client, j10);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return m0.g(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && m0.g(this.headers, httpResponse.headers) && m0.g(this.urlString, httpResponse.urlString) && m0.g(this.protocol, httpResponse.protocol) && m0.g(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    @l
    public final Object getBody() {
        return this.body;
    }

    @l
    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    @l
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @l
    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    @l
    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + p.a(this.contentSize);
    }

    @l
    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10) {
        this(body, i10, null, null, null, null, 0L, 124, null);
        m0.p(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends List<String>> headers) {
        this(body, i10, headers, null, null, null, 0L, 120, null);
        m0.p(body, "body");
        m0.p(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends List<String>> headers, @l String urlString) {
        this(body, i10, headers, urlString, null, null, 0L, 112, null);
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends List<String>> headers, @l String urlString, @l String protocol) {
        this(body, i10, headers, urlString, protocol, null, 0L, 96, null);
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        m0.p(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends List<String>> headers, @l String urlString, @l String protocol, @l String client) {
        this(body, i10, headers, urlString, protocol, client, 0L, 64, null);
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        m0.p(protocol, "protocol");
        m0.p(client, "client");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public HttpResponse(@l Object body, int i10, @l Map<String, ? extends List<String>> headers, @l String urlString, @l String protocol, @l String client, long j10) {
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(urlString, "urlString");
        m0.p(protocol, "protocol");
        m0.p(client, "client");
        this.body = body;
        this.statusCode = i10;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j10;
    }

    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, x xVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? n1.z() : map, (i11 & 8) != 0 ? "" : str, (i11 & 16) == 0 ? str2 : "", (i11 & 32) != 0 ? "unknown" : str3, (i11 & 64) != 0 ? -1L : j10);
    }
}
