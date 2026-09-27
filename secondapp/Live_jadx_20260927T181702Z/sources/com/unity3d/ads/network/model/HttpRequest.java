package com.unity3d.ads.network.model;

import androidx.media3.exoplayer.r;
import cs.k;
import fr.n1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpRequest {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;

    @l
    private final String baseURL;

    @l
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;

    @l
    private final Map<String, List<String>> headers;

    @l
    private final RequestType method;

    @l
    private final Map<String, String> parameters;

    @l
    private final String path;

    @m
    private final Integer port;
    private final int readTimeout;

    @l
    private final String scheme;
    private final int writeTimeout;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        m0.p(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = httpRequest.baseURL;
        }
        if ((i14 & 2) != 0) {
            str2 = httpRequest.path;
        }
        if ((i14 & 4) != 0) {
            requestType = httpRequest.method;
        }
        if ((i14 & 8) != 0) {
            httpBody = httpRequest.body;
        }
        if ((i14 & 16) != 0) {
            map = httpRequest.headers;
        }
        if ((i14 & 32) != 0) {
            map2 = httpRequest.parameters;
        }
        if ((i14 & 64) != 0) {
            str3 = httpRequest.scheme;
        }
        if ((i14 & 128) != 0) {
            num = httpRequest.port;
        }
        if ((i14 & 256) != 0) {
            i10 = httpRequest.connectTimeout;
        }
        if ((i14 & 512) != 0) {
            i11 = httpRequest.readTimeout;
        }
        if ((i14 & 1024) != 0) {
            i12 = httpRequest.writeTimeout;
        }
        if ((i14 & 2048) != 0) {
            i13 = httpRequest.callTimeout;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i10;
        int i18 = i11;
        String str4 = str3;
        Integer num2 = num;
        Map map3 = map;
        Map map4 = map2;
        return httpRequest.copy(str, str2, requestType, httpBody, map3, map4, str4, num2, i17, i18, i15, i16);
    }

    @l
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    @l
    public final String component2() {
        return this.path;
    }

    @l
    public final RequestType component3() {
        return this.method;
    }

    @l
    public final HttpBody component4() {
        return this.body;
    }

    @l
    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    @l
    public final Map<String, String> component6() {
        return this.parameters;
    }

    @l
    public final String component7() {
        return this.scheme;
    }

    @m
    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    @l
    public final HttpRequest copy(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13) {
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, i13);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return m0.g(this.baseURL, httpRequest.baseURL) && m0.g(this.path, httpRequest.path) && this.method == httpRequest.method && m0.g(this.body, httpRequest.body) && m0.g(this.headers, httpRequest.headers) && m0.g(this.parameters, httpRequest.parameters) && m0.g(this.scheme, httpRequest.scheme) && m0.g(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    @l
    public final String getBaseURL() {
        return this.baseURL;
    }

    @l
    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @l
    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    @l
    public final RequestType getMethod() {
        return this.method;
    }

    @l
    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    @l
    public final String getPath() {
        return this.path;
    }

    @m
    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    @l
    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    @l
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, 3968, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num, int i10) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, 0, 0, 0, r.I9, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num, int i10, int i11) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, 0, 0, 3072, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i10, i11, i12, 0, 2048, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @l HttpBody body, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13) {
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(body, "body");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, x xVar) {
        this(str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? RequestType.GET : requestType, (i14 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i14 & 16) != 0 ? n1.z() : map, (i14 & 32) != 0 ? n1.z() : map2, (i14 & 64) != 0 ? "https" : str3, (i14 & 128) != 0 ? null : num, (i14 & 256) != 0 ? 30000 : i10, (i14 & 512) != 0 ? 30000 : i11, (i14 & 1024) != 0 ? 30000 : i12, (i14 & 2048) != 0 ? 30000 : i13);
    }
}
