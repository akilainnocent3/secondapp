package defpackage;

import com.appsflyer.internal.x;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.twilio.voice.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;

/* JADX INFO: loaded from: classes8.dex */
public final class u950 implements Interceptor {
    public final k650 a;
    public final JsonSerializeService b;
    public final wsm c;
    public volatile Set<String> d;
    public final mpe0 e;
    public final mpe0 f;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"u950$a", "Lcom/google/gson/reflect/TypeToken;", "", "", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<List<? extends String>> {
    }

    public u950(k650 k650Var, JsonSerializeService jsonSerializeService, wsm wsmVar) {
        k650Var.getClass();
        jsonSerializeService.getClass();
        wsmVar.getClass();
        this.a = k650Var;
        this.b = jsonSerializeService;
        this.c = wsmVar;
        this.d = wi80.b("Authorization");
        this.e = hwr.b(new Function0() { // from class: s950
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(this.a.a.b("enable_report_bad_api"));
            }
        });
        this.f = hwr.b(new Function0() { // from class: t950
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object bVar;
                u950 u950Var = this.a;
                try {
                    zi50.a aVar = zi50.b;
                    bVar = (List) u950Var.b.fromJson(u950Var.a.g("report_bad_api_paths"), new u950.a().getType());
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                List list = (List) bVar;
                return list == null ? m2g.a : list;
            }
        });
    }

    public static boolean a(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || str.equalsIgnoreCase("identity") || str.equalsIgnoreCase("gzip")) ? false : true;
    }

    public static boolean b(Response response) throws EOFException {
        Charset charset;
        ResponseBody responseBodyBody = response.body();
        responseBodyBody.getClass();
        long c = responseBodyBody.getC();
        Headers headers = response.headers();
        if (HttpHeaders.promisesBody(response) && !a(response.headers())) {
            cc5 d = responseBodyBody.getD();
            d.request(Long.MAX_VALUE);
            lb5 lb5VarE = d.e();
            if (!"gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
                MediaType b = responseBodyBody.getB();
                if (b == null || (charset = b.charset(StandardCharsets.UTF_8)) == null) {
                    charset = StandardCharsets.UTF_8;
                    charset.getClass();
                }
                if (hn9.j(lb5VarE) && c != 0) {
                    lb5 lb5VarG = lb5VarE.g();
                    String strV = lb5VarG.V(lb5VarG.b, charset);
                    boolean z = false;
                    if (!StringsKt.U(strV)) {
                        try {
                            wbp.a aVar = wbp.d;
                            aVar.getClass();
                            z = true;
                        } catch (Exception unused) {
                        }
                    }
                    return !z;
                }
            }
        }
        return true;
    }

    public static void d(u950 u950Var, String str, long j, Request request, Response response, Throwable th, int i) throws IOException {
        String strConcat;
        Long l;
        Charset charset;
        Object bVar;
        Request request2;
        Request request3 = (i & 4) != 0 ? null : request;
        Response response2 = (i & 8) != 0 ? null : response;
        Throwable th2 = (i & 16) != 0 ? null : th;
        if (response2 != null && (request2 = response2.request()) != null) {
            request3 = request2;
        } else if (request3 == null) {
            return;
        }
        String strA = lx5.a("Bad API ", request3.method(), " ", CollectionsKt.a0(request3.url().pathSegments(), "/", null, null, null, 62));
        Exception exc = new Exception(tug.a(strA, ". ", str));
        StackTraceElement[] stackTrace = th2 != null ? th2.getStackTrace() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StackTraceElement(tug.a(strA, ". ", str), "", "", 0));
        if (response2 != null) {
            ArrayList arrayList2 = new ArrayList();
            long jNanoTime = (System.nanoTime() - j) / 1000000;
            arrayList2.addAll(u950Var.c(response2.request()));
            arrayList2.add("");
            ResponseBody responseBodyBody = response2.body();
            responseBodyBody.getClass();
            long c = responseBodyBody.getC();
            int iCode = response2.code();
            String strA2 = response2.message().length() == 0 ? "" : inm.a(" ", response2.message());
            HttpUrl httpUrlUrl = response2.request().url();
            Response response3 = response2;
            StringBuilder sb = new StringBuilder("<-- ");
            sb.append(iCode);
            sb.append(strA2);
            sb.append(" ");
            sb.append(httpUrlUrl);
            arrayList2.add(zug.a(jNanoTime, " (", "ms)", sb));
            Headers headers = response3.headers();
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strValue = u950Var.d.contains(headers.name(i2)) ? "██" : headers.value(i2);
                arrayList2.add(headers.name(i2) + ": " + strValue);
            }
            if (!HttpHeaders.promisesBody(response3)) {
                arrayList2.add("<-- END HTTP");
            } else if (a(response3.headers())) {
                arrayList2.add("<-- END HTTP (encoded body omitted)");
            } else {
                cc5 d = responseBodyBody.getD();
                d.request(Long.MAX_VALUE);
                lb5 lb5VarE = d.e();
                if ("gzip".equalsIgnoreCase(headers.get("Content-Encoding"))) {
                    Long lValueOf = Long.valueOf(lb5VarE.b);
                    ual ualVar = new ual(lb5VarE.g());
                    try {
                        lb5VarE = new lb5();
                        lb5VarE.R0(ualVar);
                        ualVar.close();
                        l = lValueOf;
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            ft7.a(ualVar, th3);
                            throw th4;
                        }
                    }
                } else {
                    l = null;
                }
                MediaType b = responseBodyBody.getB();
                if (b == null || (charset = b.charset(StandardCharsets.UTF_8)) == null) {
                    charset = StandardCharsets.UTF_8;
                    charset.getClass();
                }
                if (hn9.j(lb5VarE)) {
                    if (c != 0) {
                        arrayList2.add("");
                        try {
                            zi50.a aVar = zi50.b;
                            lb5 lb5VarG = lb5VarE.g();
                            bVar = Boolean.valueOf(arrayList2.add(lb5VarG.V(lb5VarG.b, charset)));
                        } catch (Throwable th5) {
                            zi50.a aVar2 = zi50.b;
                            bVar = new zi50.b(th5);
                        }
                        Throwable thA = zi50.a(bVar);
                        if (thA != null) {
                            arrayList2.add("Read body with failure. (" + thA + ")");
                        }
                    }
                    long j2 = lb5VarE.b;
                    if (l != null) {
                        arrayList2.add("<-- END HTTP (" + j2 + "-byte, " + l + "-gzipped-byte body)");
                    } else {
                        arrayList2.add("<-- END HTTP (" + j2 + "-byte body)");
                    }
                } else {
                    arrayList2.add("");
                    arrayList2.add("<-- END HTTP (binary " + lb5VarE.b + "-byte body omitted)");
                }
            }
            strConcat = CollectionsKt.a0(arrayList2, "\n", null, null, null, 62);
        } else {
            strConcat = CollectionsKt.a0(u950Var.c(request3), "\n", null, null, null, 62).concat("\n<-- HTTP FAILED");
        }
        arrayList.add(new StackTraceElement("", "\n".concat(strConcat), "", 0));
        if (th2 != 0) {
            arrayList.add(new StackTraceElement(th2.toString(), "", "", 0));
        }
        if (stackTrace != null) {
            p48.x(arrayList, stackTrace);
        }
        exc.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        itf0.a aVar3 = itf0.a;
        aVar3.q("reportBadAPI");
        aVar3.e(exc);
        wsm.d(u950Var.c, exc);
    }

    public final ArrayList c(Request request) {
        Charset charset;
        ArrayList arrayList = new ArrayList();
        RequestBody requestBodyBody = request.body();
        arrayList.add("--> " + request.method() + " " + request.url());
        Headers headers = request.headers();
        if (requestBodyBody != null) {
            MediaType d = requestBodyBody.getD();
            if (d != null && headers.get("Content-Type") == null) {
                arrayList.add("Content-Type: " + d);
            }
            if (requestBodyBody.contentLength() != -1 && headers.get("Content-Length") == null) {
                arrayList.add("Content-Length: " + requestBodyBody.contentLength());
            }
        }
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String strValue = this.d.contains(headers.name(i)) ? "██" : headers.value(i);
            arrayList.add(headers.name(i) + ": " + strValue);
        }
        if (requestBodyBody == null) {
            arrayList.add("--> END " + request.method());
            return arrayList;
        }
        if (a(request.headers())) {
            arrayList.add("--> END " + request.method() + " (encoded body omitted)");
            return arrayList;
        }
        if (requestBodyBody.isDuplex()) {
            arrayList.add("--> END " + request.method() + " (duplex request body omitted)");
            return arrayList;
        }
        if (requestBodyBody.isOneShot()) {
            arrayList.add("--> END " + request.method() + " (one-shot body omitted)");
            return arrayList;
        }
        lb5 lb5Var = new lb5();
        requestBodyBody.writeTo(lb5Var);
        MediaType d2 = requestBodyBody.getD();
        if (d2 == null || (charset = d2.charset(StandardCharsets.UTF_8)) == null) {
            charset = StandardCharsets.UTF_8;
            charset.getClass();
        }
        arrayList.add("");
        if (!hn9.j(lb5Var)) {
            StringBuilder sbA = x.a(requestBodyBody.contentLength(), "--> END ", request.method(), " (binary ");
            sbA.append("-byte body omitted)");
            arrayList.add(sbA.toString());
            return arrayList;
        }
        arrayList.add(lb5Var.V(lb5Var.b, charset));
        StringBuilder sbA2 = x.a(requestBodyBody.contentLength(), "--> END ", request.method(), " (");
        sbA2.append("-byte body)");
        arrayList.add(sbA2.toString());
        return arrayList;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object bVar;
        u950 u950Var;
        Object bVar2;
        chain.getClass();
        Request request = chain.request();
        if (!((Boolean) this.e.getValue()).booleanValue()) {
            return chain.proceed(request);
        }
        String strA0 = CollectionsKt.a0(request.url().pathSegments(), "/", null, null, null, 62);
        List list = (List) this.f.getValue();
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.M(strA0, (String) it.next(), false)) {
                    long jNanoTime = System.nanoTime();
                    try {
                        zi50.a aVar = zi50.b;
                        bVar = chain.proceed(request);
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        bVar = new zi50.b(th);
                    }
                    Throwable thA = zi50.a(bVar);
                    if (thA != null) {
                        d(this, "Proceed request failed", jNanoTime, request, null, thA, 8);
                        u950Var = this;
                        jNanoTime = jNanoTime;
                    } else {
                        u950Var = this;
                    }
                    uj50.b(bVar);
                    Response response = (Response) bVar;
                    try {
                        if (!response.getIsSuccessful()) {
                            d(u950Var, "Http status: " + response.code(), jNanoTime, null, response, null, 20);
                        } else if (!Intrinsics.g(response.headers().get("content-type"), Constants.APP_JSON_PAYLOAD_TYPE)) {
                            d(u950Var, "Content-Type is not JSON", jNanoTime, null, response, null, 20);
                        } else {
                            if (!b(response)) {
                                bVar2 = Unit.a;
                                Throwable thA2 = zi50.a(bVar2);
                                if (thA2 != null) {
                                    itf0.a aVar3 = itf0.a;
                                    aVar3.q(MyLog.TAG_API);
                                    aVar3.o(thA2);
                                }
                                return response;
                            }
                            d(u950Var, "Response body is malformed JSON", jNanoTime, null, response, null, 20);
                        }
                        return response;
                    } catch (Throwable th2) {
                        zi50.a aVar4 = zi50.b;
                        bVar2 = new zi50.b(th2);
                    }
                }
            }
        }
        return chain.proceed(request);
    }
}
