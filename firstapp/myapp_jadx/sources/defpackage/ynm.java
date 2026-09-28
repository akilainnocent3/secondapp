package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes8.dex */
public final class ynm<REQUEST, RESPONSE> implements vqa0, o21<Object, Object> {
    public static final HashSet f = new HashSet(Arrays.asList("AWSAccessKeyId", "Signature", "sig", "X-Goog-Signature"));
    public final String[] a;
    public final String[] b;
    public final HashSet c;
    public final znm d;
    public final boolean e;

    public ynm(aom<REQUEST, RESPONSE> aomVar) {
        List list = Collections.EMPTY_LIST;
        Set<String> set = aomVar.d;
        List list2 = Collections.EMPTY_LIST;
        ConcurrentHashMap concurrentHashMap = zf6.a;
        this.a = (String[]) ((List) list2.stream().map(new wf6()).collect(Collectors.toList())).toArray(new String[0]);
        this.b = (String[]) ((List) list2.stream().map(new wf6()).collect(Collectors.toList())).toArray(new String[0]);
        this.c = new HashSet(set);
        we80 we80Var = aomVar.a;
        this.d = aomVar.e;
        this.e = false;
    }

    @Override // defpackage.o21
    public final void a(wgh0 wgh0Var, m0b m0bVar, Interceptor.Chain chain) {
        int iIndexOf;
        char cCharAt;
        int length;
        int i;
        amy amyVar = amy.a;
        String strF = amyVar.f(chain);
        if (strF == null || this.c.contains(strF)) {
            p21.a(wgh0Var, xnm.a, strF);
        } else {
            wgh0Var.put(xnm.a, "_OTHER");
            wgh0Var.put(xnm.b, strF);
        }
        for (String str : this.a) {
            List listE = amyVar.e(chain, str);
            if (!listE.isEmpty()) {
                wgh0Var.put((e21) zf6.a.computeIfAbsent(str, new xf6()), listE);
            }
        }
        String strHost = chain.request().url().host();
        int iPort = chain.request().url().port();
        if (strHost != null) {
            wgh0Var.put(xe80.a, strHost);
            if (iPort > 0) {
                wgh0Var.put(xe80.b, Long.valueOf(iPort));
            }
        }
        String strA = amyVar.a(chain);
        if (strA != null && !strA.isEmpty()) {
            int iIndexOf2 = strA.indexOf(58);
            if (iIndexOf2 != -1 && (length = strA.length()) > (i = iIndexOf2 + 2) && strA.charAt(iIndexOf2 + 1) == '/' && strA.charAt(i) == '/') {
                int i2 = iIndexOf2 + 3;
                int i3 = -1;
                for (int i4 = i2; i4 < length; i4++) {
                    char cCharAt2 = strA.charAt(i4);
                    if (cCharAt2 == '@') {
                        i3 = i4;
                    }
                    if (cCharAt2 == '/' || cCharAt2 == '?' || cCharAt2 == '#') {
                        break;
                    }
                }
                if (i3 != -1 && i3 != length - 1) {
                    strA = strA.substring(0, i2) + "REDACTED:REDACTED" + strA.substring(i3);
                }
            }
            if (this.e && (iIndexOf = strA.indexOf(63)) != -1) {
                HashSet hashSet = f;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (strA.contains((String) it.next())) {
                        StringBuilder sb = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        int i5 = iIndexOf + 1;
                        while (i5 < strA.length()) {
                            char cCharAt3 = strA.charAt(i5);
                            if (cCharAt3 == '=') {
                                sb.append('=');
                                if (hashSet.contains(sb2.toString())) {
                                    sb.append("REDACTED");
                                    while (true) {
                                        int i6 = i5 + 1;
                                        if (i6 >= strA.length() || (cCharAt = strA.charAt(i6)) == '&' || cCharAt == '#') {
                                            break;
                                        } else {
                                            i5 = i6;
                                        }
                                    }
                                }
                            } else if (cCharAt3 == '&') {
                                sb.append(cCharAt3);
                                sb2.setLength(0);
                            } else if (cCharAt3 == '#') {
                                sb.append(strA.substring(i5));
                                break;
                            } else {
                                sb2.append(cCharAt3);
                                sb.append(cCharAt3);
                            }
                            i5++;
                        }
                        strA = strA.substring(0, iIndexOf) + "?" + ((Object) sb);
                        break;
                    }
                }
            }
        }
        p21.a(wgh0Var, smh0.a, strA);
        int iApplyAsInt = this.d.applyAsInt(m0bVar);
        if (iApplyAsInt > 0) {
            wgh0Var.put(xnm.c, Long.valueOf(iApplyAsInt));
        }
    }

    @Override // defpackage.o21
    public final void b(wgh0 wgh0Var, m0b m0bVar, Interceptor.Chain chain, Object obj, Throwable th) {
        Integer numH;
        String name;
        InetAddress address;
        amy amyVar = amy.a;
        if (obj != null) {
            numH = amyVar.h(chain, obj);
            if (numH.intValue() > 0) {
                wgh0Var.put(xnm.d, Long.valueOf(numH.intValue()));
            }
            for (String str : this.b) {
                List<String> listHeaders = ((Response) obj).headers(str);
                if (!listHeaders.isEmpty()) {
                    wgh0Var.put((e21) zf6.b.computeIfAbsent(str, new yf6()), listHeaders);
                }
            }
        } else {
            numH = null;
        }
        if (numH == null || numH.intValue() <= 0) {
            name = th != null ? th.getClass().getName() : null;
            if (name == null) {
                name = "_OTHER";
            }
        } else {
            name = fqm.a.a(numH.intValue()) ? numH.toString() : null;
        }
        p21.a(wgh0Var, lbg.a, name);
        String strD = amyVar.d(chain, obj);
        String lowerCase = strD == null ? null : strD.toLowerCase(Locale.ROOT);
        String strC = amyVar.c(chain, obj);
        String lowerCase2 = strC == null ? null : strC.toLowerCase(Locale.ROOT);
        if (lowerCase2 != null) {
            if (!"http".equals(lowerCase)) {
                p21.a(wgh0Var, vlx.c, lowerCase);
            }
            wgh0Var.put(vlx.d, lowerCase2);
        }
        InetSocketAddress inetSocketAddressI = amyVar.i(chain, obj);
        String hostAddress = (inetSocketAddressI == null || (address = inetSocketAddressI.getAddress()) == null) ? null : address.getHostAddress();
        if (hostAddress != null) {
            wgh0Var.put(vlx.a, hostAddress);
            InetSocketAddress inetSocketAddressI2 = amyVar.i(chain, obj);
            Integer numValueOf = inetSocketAddressI2 != null ? Integer.valueOf(inetSocketAddressI2.getPort()) : null;
            if (numValueOf == null || numValueOf.intValue() <= 0) {
                return;
            }
            wgh0Var.put(vlx.b, Long.valueOf(numValueOf.intValue()));
        }
    }
}
