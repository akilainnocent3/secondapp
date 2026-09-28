package okhttp3.logging;

import com.twilio.voice.EventKeys;
import defpackage.cc5;
import defpackage.fae;
import defpackage.ft7;
import defpackage.k9e0;
import defpackage.lb5;
import defpackage.mq0;
import defpackage.nrz;
import defpackage.p48;
import defpackage.q6a0;
import defpackage.t3g;
import defpackage.tag;
import defpackage.uag;
import defpackage.ual;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0003#$\"B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u000b\"\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0014\u0010\u0013\"\u0004\b\u000f\u0010!¨\u0006%"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "", "name", "", "redactHeader", "(Ljava/lang/String;)V", "", "redactQueryParams", "([Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/HttpUrl;", "url", "redactUrl$logging_interceptor", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "redactUrl", "d", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Companion", "Level", "Logger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {
    public final Logger a;
    public volatile Set<String> b;
    public volatile Set<String> c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public volatile Level level;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "NONE", "BASIC", "HEADERS", "BODY", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Level {
        public static final Level BASIC;
        public static final Level BODY;
        public static final Level HEADERS;
        public static final Level NONE;
        public static final /* synthetic */ Level[] a;
        public static final /* synthetic */ uag b;

        static {
            Level level = new Level("NONE", 0);
            NONE = level;
            Level level2 = new Level("BASIC", 1);
            BASIC = level2;
            Level level3 = new Level("HEADERS", 2);
            HEADERS = level3;
            Level level4 = new Level("BODY", 3);
            BODY = level4;
            Level[] levelArr = {level, level2, level3, level4};
            a = levelArr;
            b = new uag(levelArr);
        }

        public Level() {
            throw null;
        }

        public static tag<Level> getEntries() {
            return b;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) a.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", EventKeys.ERROR_MESSAGE, "", "Companion", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.a;
        public static final Logger DEFAULT = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "<init>", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public static final /* synthetic */ Companion a = new Companion();

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "<init>", "()V", "log", "", EventKeys.ERROR_MESSAGE, "", "logging-interceptor"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public void log(String message) {
                    message.getClass();
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }
        }

        void log(String message);
    }

    public HttpLoggingInterceptor(Logger logger) {
        logger.getClass();
        this.a = logger;
        t3g t3gVar = t3g.a;
        this.b = t3gVar;
        this.c = t3gVar;
        this.level = Level.NONE;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    public final void a(Headers headers, int i) {
        String strValue = this.b.contains(headers.name(i)) ? "██" : headers.value(i);
        this.a.log(headers.name(i) + ": " + strValue);
    }

    public final Level getLevel() {
        return this.level;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0352  */
    /* JADX WARN: Code duplicated, block: B:42:0x0103 A[LOOP:0: B:41:0x0101->B:42:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x010f  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x02db  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x031d  */
    /* JADX WARN: Code duplicated, block: B:97:0x033f  */
    /* JADX WARN: Code duplicated, block: B:99:0x034a A[LOOP:1: B:98:0x0348->B:99:0x034a, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x02a0, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x02db, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x031d, please report this as an issue */
    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws Exception {
        boolean z;
        String str;
        long jNanoTime;
        Response responseProceed;
        long c;
        String str2;
        StringBuilder sb;
        String str3;
        Headers headers;
        int size;
        int i;
        int size2;
        int i2;
        Long lValueOf;
        chain.getClass();
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z2 = true;
        boolean z3 = level == Level.BODY;
        if (!z3 && level != Level.HEADERS) {
            z2 = false;
        }
        RequestBody requestBodyBody = request.body();
        Connection connection = chain.connection();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(request.method());
        sb2.append(' ');
        sb2.append(redactUrl$logging_interceptor(request.url()));
        String str4 = " ";
        sb2.append(connection != null ? " " + connection.getI() : "");
        String string = sb2.toString();
        if (!z2 && requestBodyBody != null) {
            StringBuilder sbB = mq0.b(string, " (");
            sbB.append(requestBodyBody.contentLength());
            sbB.append("-byte body)");
            string = sbB.toString();
        }
        this.a.log(string);
        Long lValueOf2 = null;
        try {
            if (z2) {
                Headers headers2 = request.headers();
                if (requestBodyBody != null) {
                    MediaType d = requestBodyBody.getA();
                    z = z3;
                    if (d != null && headers2.get("Content-Type") == null) {
                        this.a.log("Content-Type: " + d);
                    }
                    if (requestBodyBody.contentLength() != -1 && headers2.get("Content-Length") == null) {
                        this.a.log("Content-Length: " + requestBodyBody.contentLength());
                    }
                    size2 = headers2.size();
                    for (i2 = 0; i2 < size2; i2++) {
                        a(headers2, i2);
                    }
                    if (z || requestBodyBody == null) {
                        this.a.log("--> END " + request.method());
                    } else {
                        String str5 = request.headers().get("Content-Encoding");
                        if (str5 != null && !str5.equalsIgnoreCase("identity") && !str5.equalsIgnoreCase("gzip")) {
                            this.a.log("--> END " + request.method() + " (encoded body omitted)");
                        } else if (requestBodyBody.isDuplex()) {
                            this.a.log("--> END " + request.method() + " (duplex request body omitted)");
                        } else if (requestBodyBody.isOneShot()) {
                            this.a.log("--> END " + request.method() + " (one-shot body omitted)");
                        } else {
                            lb5 lb5Var = new lb5();
                            requestBodyBody.writeTo(lb5Var);
                            if ("gzip".equalsIgnoreCase(headers2.get("Content-Encoding"))) {
                                lValueOf = Long.valueOf(lb5Var.b);
                                ual ualVar = new ual(lb5Var);
                                try {
                                    lb5Var = new lb5();
                                    lb5Var.R0(ualVar);
                                    ualVar.close();
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        ft7.a(ualVar, th);
                                        throw th2;
                                    }
                                }
                            } else {
                                lValueOf = null;
                            }
                            Charset charsetCharsetOrUtf8 = Internal.charsetOrUtf8(requestBodyBody.getA());
                            this.a.log("");
                            boolean zIsProbablyUtf8 = IsProbablyUtf8Kt.isProbablyUtf8(lb5Var, 16L);
                            Logger logger = this.a;
                            if (!zIsProbablyUtf8) {
                                logger.log("--> END " + request.method() + " (binary " + requestBodyBody.contentLength() + "-byte body omitted)");
                                str = " (";
                            } else if (lValueOf != null) {
                                StringBuilder sb3 = new StringBuilder("--> END ");
                                sb3.append(request.method());
                                str = " (";
                                sb3.append(str);
                                sb3.append(lb5Var.b);
                                sb3.append("-byte, ");
                                sb3.append(lValueOf.longValue());
                                sb3.append("-gzipped-byte body)");
                                logger.log(sb3.toString());
                            } else {
                                str = " (";
                                logger.log(lb5Var.i1(charsetCharsetOrUtf8));
                                this.a.log("--> END " + request.method() + str + requestBodyBody.contentLength() + "-byte body)");
                            }
                        }
                    }
                    jNanoTime = System.nanoTime();
                    responseProceed = chain.proceed(request);
                    long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
                    ResponseBody responseBodyBody = responseProceed.body();
                    responseBodyBody.getClass();
                    c = responseBodyBody.getC();
                    if (c != -1) {
                        str2 = c + "-byte";
                    } else {
                        str2 = "unknown-length";
                    }
                    Logger logger2 = this.a;
                    sb = new StringBuilder("<-- " + responseProceed.code());
                    if (responseProceed.message().length() > 0) {
                        str3 = str4;
                        sb.append(str3 + responseProceed.message());
                    } else {
                        str3 = str4;
                    }
                    sb.append(str3 + redactUrl$logging_interceptor(responseProceed.request().url()) + str + jNanoTime2 + "ms");
                    if (!z2) {
                        sb.append(", " + str2 + " body");
                    }
                    sb.append(")");
                    logger2.log(sb.toString());
                    if (z2) {
                        headers = responseProceed.headers();
                        size = headers.size();
                        for (i = 0; i < size; i++) {
                            a(headers, i);
                        }
                        if (!z && HttpHeaders.promisesBody(responseProceed)) {
                            String str6 = responseProceed.headers().get("Content-Encoding");
                            if (str6 != null && !str6.equalsIgnoreCase("identity") && !str6.equalsIgnoreCase("gzip")) {
                                this.a.log("<-- END HTTP (encoded body omitted)");
                                return responseProceed;
                            }
                            MediaType b = responseProceed.body().getB();
                            if (b != null && Intrinsics.g(b.type(), "text") && Intrinsics.g(b.subtype(), "event-stream")) {
                                this.a.log("<-- END HTTP (streaming)");
                                return responseProceed;
                            }
                            cc5 d2 = responseBodyBody.getD();
                            d2.request(Long.MAX_VALUE);
                            long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                            lb5 lb5VarE = d2.e();
                            if ("gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
                                lValueOf2 = Long.valueOf(lb5VarE.b);
                                ual ualVar2 = new ual(lb5VarE.g());
                                try {
                                    lb5VarE = new lb5();
                                    lb5VarE.R0(ualVar2);
                                    ualVar2.close();
                                } catch (Throwable th3) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th4) {
                                        ft7.a(ualVar2, th3);
                                        throw th4;
                                    }
                                }
                            }
                            Charset charsetCharsetOrUtf9 = Internal.charsetOrUtf8(responseBodyBody.getB());
                            if (!IsProbablyUtf8Kt.isProbablyUtf8(lb5VarE, 16L)) {
                                this.a.log("");
                                Logger logger3 = this.a;
                                StringBuilder sbA = q6a0.a(jNanoTime3, "<-- END HTTP (", "ms, binary ");
                                sbA.append(lb5VarE.b);
                                sbA.append("-byte body omitted)");
                                logger3.log(sbA.toString());
                                return responseProceed;
                            }
                            if (c != 0) {
                                this.a.log("");
                                this.a.log(lb5VarE.g().i1(charsetCharsetOrUtf9));
                            }
                            Logger logger4 = this.a;
                            StringBuilder sb4 = new StringBuilder(nrz.a(lb5VarE.b, "-byte", q6a0.a(jNanoTime3, "<-- END HTTP (", "ms, ")));
                            if (lValueOf2 != null) {
                                sb4.append(", " + lValueOf2.longValue() + "-gzipped-byte");
                            }
                            sb4.append(" body)");
                            logger4.log(sb4.toString());
                            return responseProceed;
                        }
                        this.a.log("<-- END HTTP");
                    }
                    return responseProceed;
                }
                z = z3;
                z2 = z2;
                str4 = " ";
                size2 = headers2.size();
                while (i2 < size2) {
                    a(headers2, i2);
                }
                if (z) {
                    this.a.log("--> END " + request.method());
                } else {
                    this.a.log("--> END " + request.method());
                }
                jNanoTime = System.nanoTime();
                responseProceed = chain.proceed(request);
                long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
                ResponseBody responseBodyBody2 = responseProceed.body();
                responseBodyBody2.getClass();
                c = responseBodyBody2.getC();
                if (c != -1) {
                    str2 = c + "-byte";
                } else {
                    str2 = "unknown-length";
                }
                Logger logger5 = this.a;
                sb = new StringBuilder("<-- " + responseProceed.code());
                if (responseProceed.message().length() > 0) {
                    str3 = str4;
                    sb.append(str3 + responseProceed.message());
                } else {
                    str3 = str4;
                }
                sb.append(str3 + redactUrl$logging_interceptor(responseProceed.request().url()) + str + jNanoTime4 + "ms");
                if (!z2) {
                    sb.append(", " + str2 + " body");
                }
                sb.append(")");
                logger5.log(sb.toString());
                if (z2) {
                    headers = responseProceed.headers();
                    size = headers.size();
                    while (i < size) {
                        a(headers, i);
                    }
                    if (!z) {
                    }
                    this.a.log("<-- END HTTP");
                }
                return responseProceed;
            }
            z = z3;
            z2 = z2;
            str4 = " ";
            str = " (";
            responseProceed = chain.proceed(request);
            long jNanoTime5 = (System.nanoTime() - jNanoTime) / 1000000;
            ResponseBody responseBodyBody3 = responseProceed.body();
            responseBodyBody3.getClass();
            c = responseBodyBody3.getC();
            if (c != -1) {
                str2 = c + "-byte";
            } else {
                str2 = "unknown-length";
            }
            Logger logger6 = this.a;
            sb = new StringBuilder("<-- " + responseProceed.code());
            if (responseProceed.message().length() > 0) {
                str3 = str4;
                sb.append(str3 + responseProceed.message());
            } else {
                str3 = str4;
            }
            sb.append(str3 + redactUrl$logging_interceptor(responseProceed.request().url()) + str + jNanoTime5 + "ms");
            if (!z2) {
                sb.append(", " + str2 + " body");
            }
            sb.append(")");
            logger6.log(sb.toString());
            if (z2) {
                headers = responseProceed.headers();
                size = headers.size();
                while (i < size) {
                    a(headers, i);
                }
                if (!z) {
                }
                this.a.log("<-- END HTTP");
            }
            return responseProceed;
        } catch (Exception e) {
            this.a.log(("<-- HTTP FAILED: " + e + '.').concat(str4 + redactUrl$logging_interceptor(request.url()) + str + ((System.nanoTime() - jNanoTime) / 1000000) + "ms)"));
            throw e;
        }
        jNanoTime = System.nanoTime();
    }

    public final void level(Level level) {
        level.getClass();
        this.level = level;
    }

    public final void redactHeader(String name) {
        name.getClass();
        k9e0.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        p48.w(this.b, treeSet);
        treeSet.add(name);
        this.b = treeSet;
    }

    public final void redactQueryParams(String... name) {
        name.getClass();
        k9e0.a.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        TreeSet treeSet = new TreeSet(comparator);
        p48.w(this.c, treeSet);
        p48.x(treeSet, name);
        this.c = treeSet;
    }

    public final String redactUrl$logging_interceptor(HttpUrl url) {
        url.getClass();
        if (this.c.isEmpty() || url.querySize() == 0) {
            return url.getI();
        }
        HttpUrl.Builder builderQuery = url.newBuilder().query(null);
        int iQuerySize = url.querySize();
        for (int i = 0; i < iQuerySize; i++) {
            String strQueryParameterName = url.queryParameterName(i);
            builderQuery.addEncodedQueryParameter(strQueryParameterName, this.c.contains(strQueryParameterName) ? "██" : url.queryParameterValue(i));
        }
        return builderQuery.toString();
    }

    public final HttpLoggingInterceptor setLevel(Level level) {
        level.getClass();
        this.level = level;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
