package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import java.io.IOException;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class ru6 implements Interceptor {
    public static final Regex b = new Regex(".*\\.(jpg|jpeg|png|webp|gif|bmp|svg|ico|xml|json|mp3)(\\?.*)?$", ns40.IGNORE_CASE);
    public final cbg a;

    public ru6(cbg cbgVar) {
        cbgVar.getClass();
        this.a = cbgVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0183 A[Catch: IOException -> 0x017d, TRY_LEAVE, TryCatch #5 {IOException -> 0x017d, blocks: (B:42:0x0157, B:44:0x0161, B:47:0x0183), top: B:77:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01be  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x0183, please report this as an issue */
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        String lowerCase;
        String lowerCase2;
        char c;
        Response responseProceed;
        int iCode;
        boolean z;
        String str = DZsoPoBl.ZiGLA;
        chain.getClass();
        Request request = chain.request();
        String i = request.url().getI();
        i.getClass();
        if (!b.f(i)) {
            return chain.proceed(request);
        }
        String strHost = request.url().host();
        int i2 = 0;
        try {
            Response responseProceed2 = chain.proceed(request);
            if (!responseProceed2.getIsSuccessful()) {
                int iCode2 = responseProceed2.code();
                if (500 <= iCode2 && iCode2 < 600) {
                    try {
                        itf0.a aVar = itf0.a;
                        aVar.q("CdnFallbackInterceptor");
                        int iCode3 = responseProceed2.code();
                        StringBuilder sb = new StringBuilder("CDN outage detected on ");
                        sb.append(strHost);
                        response = null;
                        try {
                            sb.append(" (HTTP ");
                            sb.append(iCode3);
                            sb.append(")");
                            aVar.n(sb.toString(), new Object[0]);
                            e = null;
                        } catch (IOException e) {
                            e = e;
                            itf0.a aVar2 = itf0.a;
                            aVar2.q("CdnFallbackInterceptor");
                            aVar2.n(tx5.a("CDN outage detected on ", strHost, " (", e.getMessage(), ")"), new Object[0]);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        response = null;
                    }
                    for (String str2 : this.a.b().l) {
                        String str3 = (String) CollectionsKt.T(StringsKt__StringsKt.split$default(str2, new String[]{":"}, false, i2, 6, null));
                        Locale locale = Locale.ROOT;
                        lowerCase = str3.toLowerCase(locale);
                        lowerCase.getClass();
                        lowerCase2 = ((String) CollectionsKt.T(StringsKt__StringsKt.split$default(strHost, new String[]{":"}, false, i2, 6, null))).toLowerCase(locale);
                        lowerCase2.getClass();
                        if (!lowerCase.equals(lowerCase2)) {
                            itf0.a aVar3 = itf0.a;
                            aVar3.q("CdnFallbackInterceptor");
                            aVar3.n("Skipping fallback domain " + str2 + " (same as original)", new Object[i2]);
                        } else {
                            if (responseProceed2 != null) {
                                responseProceed2.close();
                            }
                            try {
                                responseProceed = chain.proceed(request.newBuilder().url(request.url().newBuilder().host(str2).build()).removeHeader("X-Fallback-Domain").header("X-Fallback-Domain", str2).build());
                                if (responseProceed.getIsSuccessful()) {
                                    itf0.a aVar4 = itf0.a;
                                    aVar4.q("CdnFallbackInterceptor");
                                    aVar4.a("Successfully loaded from fallback domain: " + str2, new Object[i2]);
                                } else {
                                    itf0.a aVar5 = itf0.a;
                                    aVar5.q("CdnFallbackInterceptor");
                                    aVar5.n("Fallback domain " + str2 + " failed (HTTP " + responseProceed.code() + ")", new Object[0]);
                                    try {
                                        iCode = responseProceed.code();
                                        if (500 <= iCode || iCode >= 600) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (!z) {
                                            responseProceed2 = responseProceed;
                                            i2 = 0;
                                        }
                                    } catch (IOException e3) {
                                        e = e3;
                                        c = 600;
                                        responseProceed2 = responseProceed;
                                        itf0.a aVar6 = itf0.a;
                                        aVar6.q("CdnFallbackInterceptor");
                                        i2 = 0;
                                        aVar6.n(tx5.a("Fallback domain ", str2, " failed (", e.getMessage(), ")"), new Object[0]);
                                    }
                                }
                                return responseProceed;
                            } catch (IOException e4) {
                                e = e4;
                                c = 600;
                            }
                        }
                    }
                    itf0.a aVar7 = itf0.a;
                    aVar7.q("CdnFallbackInterceptor");
                    aVar7.d("All CDN domains failed for: ".concat(i), new Object[i2]);
                    if (responseProceed2 != null) {
                        responseProceed2.close();
                    }
                    if (e == null) {
                        throw e;
                    }
                    i08.a("All CDN domains failed for: ".concat(i));
                    return response;
                }
            }
            response = null;
            try {
                itf0.a aVar8 = itf0.a;
                aVar8.q("CdnFallbackInterceptor");
                aVar8.a(str + request.url(), new Object[0]);
                return responseProceed2;
            } catch (IOException e5) {
                e = e5;
                responseProceed2 = response;
                itf0.a aVar9 = itf0.a;
                aVar9.q("CdnFallbackInterceptor");
                aVar9.n(tx5.a("CDN outage detected on ", strHost, " (", e.getMessage(), ")"), new Object[0]);
                while (r5.hasNext()) {
                    String str4 = (String) CollectionsKt.T(StringsKt__StringsKt.split$default(str2, new String[]{":"}, false, i2, 6, null));
                    Locale locale2 = Locale.ROOT;
                    lowerCase = str4.toLowerCase(locale2);
                    lowerCase.getClass();
                    lowerCase2 = ((String) CollectionsKt.T(StringsKt__StringsKt.split$default(strHost, new String[]{":"}, false, i2, 6, null))).toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (!lowerCase.equals(lowerCase2)) {
                        if (responseProceed2 != null) {
                            responseProceed2.close();
                        }
                        responseProceed = chain.proceed(request.newBuilder().url(request.url().newBuilder().host(str2).build()).removeHeader("X-Fallback-Domain").header("X-Fallback-Domain", str2).build());
                        if (responseProceed.getIsSuccessful()) {
                            itf0.a aVar10 = itf0.a;
                            aVar10.q("CdnFallbackInterceptor");
                            aVar10.a("Successfully loaded from fallback domain: " + str2, new Object[i2]);
                        } else {
                            itf0.a aVar11 = itf0.a;
                            aVar11.q("CdnFallbackInterceptor");
                            aVar11.n("Fallback domain " + str2 + " failed (HTTP " + responseProceed.code() + ")", new Object[0]);
                            iCode = responseProceed.code();
                            if (500 <= iCode) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                responseProceed2 = responseProceed;
                                i2 = 0;
                            }
                        }
                        return responseProceed;
                    }
                    itf0.a aVar12 = itf0.a;
                    aVar12.q("CdnFallbackInterceptor");
                    aVar12.n("Skipping fallback domain " + str2 + " (same as original)", new Object[i2]);
                }
                itf0.a aVar13 = itf0.a;
                aVar13.q("CdnFallbackInterceptor");
                aVar13.d("All CDN domains failed for: ".concat(i), new Object[i2]);
                if (responseProceed2 != null) {
                    responseProceed2.close();
                }
                if (e == null) {
                    throw e;
                }
                i08.a("All CDN domains failed for: ".concat(i));
                return response;
            }
        } catch (IOException e6) {
            e = e6;
            response = null;
        }
    }
}
