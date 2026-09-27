package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import cs.k;
import fr.n1;
import java.io.File;
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
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;

    @l
    private final String baseURL;

    @m
    private final Object body;

    @l
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;

    @m
    private final File downloadDestination;

    @l
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;

    @l
    private final RequestType method;

    @l
    private final OperationType operationType;

    @l
    private final Map<String, String> parameters;

    @l
    private final String path;

    @m
    private final Integer port;
    private final int priority;
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
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        m0.p(baseURL, "baseURL");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, Object obj2) {
        int i16;
        File file2;
        String str4 = (i15 & 1) != 0 ? httpRequest.baseURL : str;
        String str5 = (i15 & 2) != 0 ? httpRequest.path : str2;
        RequestType requestType2 = (i15 & 4) != 0 ? httpRequest.method : requestType;
        Object obj3 = (i15 & 8) != 0 ? httpRequest.body : obj;
        Map map3 = (i15 & 16) != 0 ? httpRequest.headers : map;
        Map map4 = (i15 & 32) != 0 ? httpRequest.parameters : map2;
        BodyType bodyType2 = (i15 & 64) != 0 ? httpRequest.bodyType : bodyType;
        String str6 = (i15 & 128) != 0 ? httpRequest.scheme : str3;
        Integer num2 = (i15 & 256) != 0 ? httpRequest.port : num;
        int i17 = (i15 & 512) != 0 ? httpRequest.connectTimeout : i10;
        int i18 = (i15 & 1024) != 0 ? httpRequest.readTimeout : i11;
        int i19 = (i15 & 2048) != 0 ? httpRequest.writeTimeout : i12;
        int i20 = (i15 & 4096) != 0 ? httpRequest.callTimeout : i13;
        boolean z11 = (i15 & 8192) != 0 ? httpRequest.isProtobuf : z10;
        String str7 = str4;
        OperationType operationType2 = (i15 & 16384) != 0 ? httpRequest.operationType : operationType;
        File file3 = (i15 & 32768) != 0 ? httpRequest.downloadDestination : file;
        if ((i15 & 65536) != 0) {
            file2 = file3;
            i16 = httpRequest.priority;
        } else {
            i16 = i14;
            file2 = file3;
        }
        return httpRequest.copy(str7, str5, requestType2, obj3, map3, map4, bodyType2, str6, num2, i17, i18, i19, i20, z11, operationType2, file2, i16);
    }

    @l
    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    @l
    public final OperationType component15() {
        return this.operationType;
    }

    @m
    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    @l
    public final String component2() {
        return this.path;
    }

    @l
    public final RequestType component3() {
        return this.method;
    }

    @m
    public final Object component4() {
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
    public final BodyType component7() {
        return this.bodyType;
    }

    @l
    public final String component8() {
        return this.scheme;
    }

    @m
    public final Integer component9() {
        return this.port;
    }

    @l
    public final HttpRequest copy(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13, boolean z10, @l OperationType operationType, @m File file, int i14) {
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
        m0.p(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, i14);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return m0.g(this.baseURL, httpRequest.baseURL) && m0.g(this.path, httpRequest.path) && this.method == httpRequest.method && m0.g(this.body, httpRequest.body) && m0.g(this.headers, httpRequest.headers) && m0.g(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && m0.g(this.scheme, httpRequest.scheme) && m0.g(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && m0.g(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    @l
    public final String getBaseURL() {
        return this.baseURL;
    }

    @m
    public final Object getBody() {
        return this.body;
    }

    @l
    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    @m
    public final File getDownloadDestination() {
        return this.downloadDestination;
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
    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v31 */
    public int hashCode() {
        int iHashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int iHashCode2 = (((((((((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int iHashCode3 = (((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z10 = this.isProtobuf;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iHashCode4 = (((iHashCode3 + r10) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        return ((iHashCode4 + (file != null ? file.hashCode() : 0)) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    @l
    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, 0, 0, 0, false, null, null, 0, 130048, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, 0, 0, false, null, null, 0, 129024, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, 0, false, null, null, 0, 126976, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, false, null, null, 0, 122880, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, null, null, 0, 114688, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13, boolean z10, @l OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, null, 0, 98304, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
        m0.p(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13, boolean z10, @l OperationType operationType, @m File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i10, i11, i12, i13, z10, operationType, file, 0, 65536, null);
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
        m0.p(operationType, "operationType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public HttpRequest(@l String baseURL, @l String path, @l RequestType method, @m Object obj, @l Map<String, ? extends List<String>> headers, @l Map<String, String> parameters, @l BodyType bodyType, @l String scheme, @m Integer num, int i10, int i11, int i12, int i13, boolean z10, @l OperationType operationType, @m File file, int i14) {
        m0.p(baseURL, "baseURL");
        m0.p(path, "path");
        m0.p(method, "method");
        m0.p(headers, "headers");
        m0.p(parameters, "parameters");
        m0.p(bodyType, "bodyType");
        m0.p(scheme, "scheme");
        m0.p(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType, File file, int i14, int i15, x xVar) {
        this(str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? RequestType.GET : requestType, (i15 & 8) != 0 ? null : obj, (i15 & 16) != 0 ? n1.z() : map, (i15 & 32) != 0 ? n1.z() : map2, (i15 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i15 & 128) != 0 ? "https" : str3, (i15 & 256) != 0 ? null : num, (i15 & 512) != 0 ? 30000 : i10, (i15 & 1024) != 0 ? 30000 : i11, (i15 & 2048) != 0 ? 30000 : i12, (i15 & 4096) == 0 ? i13 : 30000, (i15 & 8192) != 0 ? false : z10, (i15 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i15 & 32768) != 0 ? null : file, (i15 & 65536) != 0 ? 0 : i14);
    }
}
