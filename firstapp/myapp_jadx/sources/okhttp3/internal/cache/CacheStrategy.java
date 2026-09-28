package okhttp3.internal.cache;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.c;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.DateFormattingKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0010B\u001d\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Lokhttp3/Request;", "networkRequest", "Lokhttp3/Response;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lokhttp3/Response;)V", "a", "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", "b", "Lokhttp3/Response;", "getCacheResponse", "()Lokhttp3/Response;", "Companion", "Factory", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CacheStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Request networkRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Response cacheResponse;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "isCacheable", "", "response", "Lokhttp3/Response;", "request", "Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0037  */
        public final boolean isCacheable(Response response, Request request) {
            response.getClass();
            request.getClass();
            int iCode = response.code();
            if (iCode != 200 && iCode != 410 && iCode != 414 && iCode != 501 && iCode != 203 && iCode != 204) {
                if (iCode == 307) {
                    if (Response.header$default(response, "Expires", null, 2, null) == null && response.cacheControl().maxAgeSeconds() == -1 && !response.cacheControl().getIsPublic() && !response.cacheControl().getIsPrivate()) {
                        return false;
                    }
                } else if (iCode != 308 && iCode != 404 && iCode != 405) {
                    switch (iCode) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (Response.header$default(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.cacheControl().noStore() || request.cacheControl().noStore()) ? false : true;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "", "nowMillis", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "cacheResponse", "<init>", "(JLokhttp3/Request;Lokhttp3/Response;)V", "Lokhttp3/internal/cache/CacheStrategy;", "compute", "()Lokhttp3/internal/cache/CacheStrategy;", "b", "Lokhttp3/Request;", "getRequest$okhttp", "()Lokhttp3/Request;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Factory {
        public final long a;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final Request request;
        public final Response c;
        public final Date d;
        public final String e;
        public final Date f;
        public final String g;
        public final Date h;
        public final long i;
        public final long j;
        public final String k;
        public final int l;

        public Factory(long j, Request request, Response response) {
            request.getClass();
            this.a = j;
            this.request = request;
            this.c = response;
            this.l = -1;
            if (response != null) {
                this.i = response.sentRequestAtMillis();
                this.j = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i = 0; i < size; i++) {
                    String strName = headers.name(i);
                    String strValue = headers.value(i);
                    if (c.l(strName, "Date", true)) {
                        this.d = DateFormattingKt.toHttpDateOrNull(strValue);
                        this.e = strValue;
                    } else if (c.l(strName, "Expires", true)) {
                        this.h = DateFormattingKt.toHttpDateOrNull(strValue);
                    } else if (c.l(strName, "Last-Modified", true)) {
                        this.f = DateFormattingKt.toHttpDateOrNull(strValue);
                        this.g = strValue;
                    } else if (c.l(strName, "ETag", true)) {
                        this.k = strValue;
                    } else if (c.l(strName, "Age", true)) {
                        this.l = _UtilCommonKt.toNonNegativeInt(strValue, -1);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:54:0x010f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0119  */
        /* JADX WARN: Code duplicated, block: B:63:0x0138  */
        /* JADX WARN: Code duplicated, block: B:65:0x013f  */
        /* JADX WARN: Code duplicated, block: B:67:0x0149  */
        /* JADX WARN: Code duplicated, block: B:75:0x0175  */
        /* JADX WARN: Code duplicated, block: B:77:0x0179  */
        /* JADX WARN: Code duplicated, block: B:78:0x017b A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:79:0x017d  */
        /* JADX WARN: Code duplicated, block: B:81:0x0182 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:82:0x0184  */
        /* JADX WARN: Code duplicated, block: B:84:0x01af  */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r2v6 */
        /* JADX WARN: Type inference failed for: r2v7, types: [okhttp3.Request, okhttp3.Response] */
        /* JADX WARN: Type inference failed for: r2v8 */
        public final CacheStrategy compute() {
            ?? r2;
            Request request;
            CacheStrategy cacheStrategy;
            long millis;
            long time;
            long millis2;
            String str;
            String str2;
            long j;
            Response.Builder builderNewBuilder;
            Request request2 = this.request;
            Response response = this.c;
            if (response != null) {
                if (!(request2.isHttps() && response.handshake() == null) && CacheStrategy.INSTANCE.isCacheable(response, request2)) {
                    CacheControl cacheControl = request2.cacheControl();
                    if (!cacheControl.noCache() && request2.header("If-Modified-Since") == null && request2.header("If-None-Match") == null) {
                        CacheControl cacheControl2 = response.cacheControl();
                        long time2 = this.j;
                        Date date = this.d;
                        long jMax = date != null ? Math.max(0L, time2 - date.getTime()) : 0L;
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        int i = this.l;
                        if (i != -1) {
                            jMax = Math.max(jMax, timeUnit.toMillis(i));
                        }
                        long time3 = this.i;
                        long jMax2 = jMax + Math.max(0L, time2 - time3) + Math.max(0L, this.a - time2);
                        CacheControl cacheControl3 = response.cacheControl();
                        int iMaxAgeSeconds = cacheControl3.maxAgeSeconds();
                        Date date2 = this.h;
                        Date date3 = this.f;
                        if (iMaxAgeSeconds != -1) {
                            time = timeUnit.toMillis(cacheControl3.maxAgeSeconds());
                        } else {
                            if (date2 != null) {
                                if (date != null) {
                                    time2 = date.getTime();
                                }
                                time = date2.getTime() - time2;
                                if (time <= 0) {
                                    time = 0;
                                }
                            } else {
                                if (date3 == null || response.request().url().query() != null) {
                                    millis = 0;
                                } else {
                                    if (date != null) {
                                        time3 = date.getTime();
                                    }
                                    long time4 = time3 - date3.getTime();
                                    millis = 0;
                                    if (time4 > 0) {
                                        time = time4 / 10;
                                    }
                                }
                                time = millis;
                            }
                            if (cacheControl.maxAgeSeconds() != -1) {
                                time = Math.min(time, timeUnit.toMillis(cacheControl.maxAgeSeconds()));
                            }
                            if (cacheControl.minFreshSeconds() != -1) {
                                millis2 = timeUnit.toMillis(cacheControl.minFreshSeconds());
                            } else {
                                millis2 = millis;
                            }
                            if (!cacheControl2.mustRevalidate() && cacheControl.maxStaleSeconds() != -1) {
                                millis = timeUnit.toMillis(cacheControl.maxStaleSeconds());
                            }
                            if (cacheControl2.noCache()) {
                                str = this.k;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.g;
                                    } else if (date != null) {
                                        str = this.e;
                                    } else {
                                        request = request2;
                                        r2 = 0;
                                        cacheStrategy = new CacheStrategy(request, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                Headers.Builder builderNewBuilder2 = request2.headers().newBuilder();
                                str.getClass();
                                builderNewBuilder2.addLenient$okhttp(str2, str);
                                cacheStrategy = new CacheStrategy(request2.newBuilder().headers(builderNewBuilder2.build()).build(), response);
                                request = request2;
                                r2 = 0;
                            } else {
                                j = millis2 + jMax2;
                                if (j < time + millis) {
                                    builderNewBuilder = response.newBuilder();
                                    if (j >= time) {
                                        builderNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (jMax2 > 86400000 && response.cacheControl().maxAgeSeconds() == -1 && date2 == null) {
                                        builderNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r2 = 0;
                                    cacheStrategy = new CacheStrategy(null, builderNewBuilder.build());
                                    request = request2;
                                } else {
                                    str = this.k;
                                    if (str != null) {
                                        str2 = "If-None-Match";
                                    } else {
                                        if (date3 != null) {
                                            str = this.g;
                                        } else if (date != null) {
                                            str = this.e;
                                        } else {
                                            request = request2;
                                            r2 = 0;
                                            cacheStrategy = new CacheStrategy(request, null);
                                        }
                                        str2 = "If-Modified-Since";
                                    }
                                    Headers.Builder builderNewBuilder3 = request2.headers().newBuilder();
                                    str.getClass();
                                    builderNewBuilder3.addLenient$okhttp(str2, str);
                                    cacheStrategy = new CacheStrategy(request2.newBuilder().headers(builderNewBuilder3.build()).build(), response);
                                    request = request2;
                                    r2 = 0;
                                }
                            }
                        }
                        millis = 0;
                        if (cacheControl.maxAgeSeconds() != -1) {
                            time = Math.min(time, timeUnit.toMillis(cacheControl.maxAgeSeconds()));
                        }
                        if (cacheControl.minFreshSeconds() != -1) {
                            millis2 = timeUnit.toMillis(cacheControl.minFreshSeconds());
                        } else {
                            millis2 = millis;
                        }
                        if (!cacheControl2.mustRevalidate()) {
                            millis = timeUnit.toMillis(cacheControl.maxStaleSeconds());
                        }
                        if (cacheControl2.noCache()) {
                            j = millis2 + jMax2;
                            if (j < time + millis) {
                                builderNewBuilder = response.newBuilder();
                                if (j >= time) {
                                    builderNewBuilder.addHeader("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (jMax2 > 86400000) {
                                    builderNewBuilder.addHeader("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                r2 = 0;
                                cacheStrategy = new CacheStrategy(null, builderNewBuilder.build());
                                request = request2;
                            } else {
                                str = this.k;
                                if (str != null) {
                                    str2 = "If-None-Match";
                                } else {
                                    if (date3 != null) {
                                        str = this.g;
                                    } else if (date != null) {
                                        str = this.e;
                                    } else {
                                        request = request2;
                                        r2 = 0;
                                        cacheStrategy = new CacheStrategy(request, null);
                                    }
                                    str2 = "If-Modified-Since";
                                }
                                Headers.Builder builderNewBuilder4 = request2.headers().newBuilder();
                                str.getClass();
                                builderNewBuilder4.addLenient$okhttp(str2, str);
                                cacheStrategy = new CacheStrategy(request2.newBuilder().headers(builderNewBuilder4.build()).build(), response);
                                request = request2;
                                r2 = 0;
                            }
                        } else {
                            str = this.k;
                            if (str != null) {
                                str2 = "If-None-Match";
                            } else {
                                if (date3 != null) {
                                    str = this.g;
                                } else if (date != null) {
                                    str = this.e;
                                } else {
                                    request = request2;
                                    r2 = 0;
                                    cacheStrategy = new CacheStrategy(request, null);
                                }
                                str2 = "If-Modified-Since";
                            }
                            Headers.Builder builderNewBuilder5 = request2.headers().newBuilder();
                            str.getClass();
                            builderNewBuilder5.addLenient$okhttp(str2, str);
                            cacheStrategy = new CacheStrategy(request2.newBuilder().headers(builderNewBuilder5.build()).build(), response);
                            request = request2;
                            r2 = 0;
                        }
                    } else {
                        r2 = 0;
                        request = request2;
                        cacheStrategy = new CacheStrategy(request, null);
                    }
                } else {
                    cacheStrategy = new CacheStrategy(request2, null);
                }
                return (cacheStrategy.getNetworkRequest() == null || !request.cacheControl().onlyIfCached()) ? cacheStrategy : new CacheStrategy(r2, r2);
            }
            cacheStrategy = new CacheStrategy(request2, null);
            r2 = 0;
            request = request2;
            if (cacheStrategy.getNetworkRequest() == null) {
                return cacheStrategy;
            }
        }

        /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
        public final Request getRequest() {
            return this.request;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    public final Response getCacheResponse() {
        return this.cacheResponse;
    }

    public final Request getNetworkRequest() {
        return this.networkRequest;
    }
}
