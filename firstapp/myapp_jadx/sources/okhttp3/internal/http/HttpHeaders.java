package okhttp3.internal.http;

import defpackage.fae;
import defpackage.hb5;
import defpackage.lb5;
import defpackage.o2g;
import defpackage.rl5;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.c;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "", "receiveHeaders", "(Lokhttp3/CookieJar;Lokhttp3/HttpUrl;Lokhttp3/Headers;)V", "Lokhttp3/Response;", "", "promisesBody", "(Lokhttp3/Response;)Z", "response", "hasBody", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class HttpHeaders {
    public static final rl5 a;
    public static final rl5 b;

    static {
        rl5 rl5Var = rl5.d;
        a = rl5.a.c("\"\\");
        b = rl5.a.c("\t ,=");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:76:0x0108 A[EDGE_INSN: B:76:0x0108->B:64:0x0108 BREAK  A[LOOP:2: B:22:0x0073->B:63:0x0105], SYNTHETIC] */
    public static final void a(lb5 lb5Var, ArrayList arrayList) throws EOFException {
        String strB;
        while (true) {
            String strB2 = null;
            while (true) {
                if (strB2 == null) {
                    c(lb5Var);
                    strB2 = b(lb5Var);
                    if (strB2 == null) {
                        return;
                    }
                }
                boolean zC = c(lb5Var);
                String strB3 = b(lb5Var);
                if (strB3 == null) {
                    if (lb5Var.N0()) {
                        o2g o2gVar = o2g.a;
                        o2gVar.getClass();
                        arrayList.add(new Challenge(strB2, o2gVar));
                        return;
                    }
                    return;
                }
                int iSkipAll = _UtilCommonKt.skipAll(lb5Var, (byte) 61);
                boolean zC2 = c(lb5Var);
                if (zC || !(zC2 || lb5Var.N0())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int iSkipAll2 = _UtilCommonKt.skipAll(lb5Var, (byte) 61) + iSkipAll;
                    while (true) {
                        if (strB3 != null) {
                            if (iSkipAll2 != 0) {
                                break;
                                break;
                            }
                            if (iSkipAll2 <= 1) {
                                return;
                            }
                            if (lb5Var.N0()) {
                                strB = b(lb5Var);
                            } else {
                                strB = b(lb5Var);
                            }
                            if (strB != null) {
                                return;
                            }
                            if (c(lb5Var)) {
                            }
                            strB3 = null;
                        } else {
                            strB3 = b(lb5Var);
                            if (!c(lb5Var)) {
                                iSkipAll2 = _UtilCommonKt.skipAll(lb5Var, (byte) 61);
                                if (iSkipAll2 != 0) {
                                    break;
                                }
                                if (iSkipAll2 <= 1 || c(lb5Var)) {
                                    return;
                                }
                                if (lb5Var.N0() || lb5Var.m(0L) != 34) {
                                    strB = b(lb5Var);
                                } else {
                                    if (lb5Var.readByte() != 34) {
                                        hb5.a("Failed requirement.");
                                        return;
                                    }
                                    lb5 lb5Var2 = new lb5();
                                    while (true) {
                                        long jS = lb5Var.S(a);
                                        if (jS != -1) {
                                            if (lb5Var.m(jS) == 34) {
                                                lb5Var2.write(lb5Var, jS);
                                                lb5Var.readByte();
                                                strB = lb5Var2.Y();
                                                break;
                                            } else if (lb5Var.b != jS + 1) {
                                                lb5Var2.write(lb5Var, jS);
                                                lb5Var.readByte();
                                                lb5Var2.write(lb5Var, 1L);
                                            }
                                        }
                                        strB = null;
                                        break;
                                    }
                                }
                                if (strB != null || ((String) linkedHashMap.put(strB3, strB)) != null) {
                                    return;
                                }
                                if (c(lb5Var) && !lb5Var.N0()) {
                                    return;
                                } else {
                                    strB3 = null;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    arrayList.add(new Challenge(strB2, linkedHashMap));
                    strB2 = strB3;
                } else {
                    Map mapSingletonMap = Collections.singletonMap(null, strB3 + c.o(iSkipAll, "="));
                    mapSingletonMap.getClass();
                    arrayList.add(new Challenge(strB2, (Map<String, String>) mapSingletonMap));
                }
            }
        }
    }

    public static final String b(lb5 lb5Var) {
        long jS = lb5Var.S(b);
        if (jS == -1) {
            jS = lb5Var.b;
        }
        if (jS != 0) {
            return lb5Var.V(jS, Charsets.UTF_8);
        }
        return null;
    }

    public static final boolean c(lb5 lb5Var) throws EOFException {
        boolean z = false;
        while (!lb5Var.N0()) {
            byte bM = lb5Var.m(0L);
            if (bM != 44) {
                if (bM != 32 && bM != 9) {
                    break;
                }
                lb5Var.readByte();
            } else {
                lb5Var.readByte();
                z = true;
            }
        }
        return z;
    }

    @fae
    public static final boolean hasBody(Response response) {
        response.getClass();
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        headers.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(headers.name(i))) {
                lb5 lb5Var = new lb5();
                lb5Var.z0(headers.value(i));
                try {
                    a(lb5Var, arrayList);
                } catch (EOFException e) {
                    Platform.INSTANCE.get().log("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        response.getClass();
        if (Intrinsics.g(response.request().method(), "HEAD")) {
            return false;
        }
        int iCode = response.code();
        return (((iCode >= 100 && iCode < 200) || iCode == 204 || iCode == 304) && _UtilJvmKt.headersContentLength(response) == -1 && !"chunked".equalsIgnoreCase(Response.header$default(response, "Transfer-Encoding", null, 2, null))) ? false : true;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        cookieJar.getClass();
        httpUrl.getClass();
        headers.getClass();
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> all = Cookie.INSTANCE.parseAll(httpUrl, headers);
        if (all.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, all);
    }
}
