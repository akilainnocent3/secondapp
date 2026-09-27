package com.facebook.ads.redexgen.core;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.vungle.ads.internal.protos.Sdk;
import f6.q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import javax.net.ssl.HttpsURLConnection;
import rg.a;
import zi.c;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1887Cl implements InterfaceC2851fv {
    public static byte[] A07;
    public static String[] A08 = {"QhNFYJC9gEUd0JRpeTZcIYaCPwaofmcY", "H7lFuH2c6lRKE1KzrEc8woYXA3m4qwgD", "VasthUCsKtAfJQ49O69n9k2VDB8sk6Ry", "CLNAbcda3kskZ9l1P61KK9o7E81JDy0P", "FTSbac7VR6oRDuoXxASKkUBG2ay4Jl1O", "oDWQMCtwqliv6oQHoqRk4BTd2HTxQUcC", "maa7C87UpzAlS2qduOc8uqrscl2NkhxH", ""};
    public static final String A09;
    public InterfaceC2311Tc A00;
    public Executor A01;
    public boolean A02;
    public C2856g0 A03;
    public final InterfaceC2861g5 A04 = new C1895Cu();
    public final InterfaceC2866gA A05;
    public final InterfaceC2867gB A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private final InterfaceC2850fu A01(AbstractC2863g7 abstractC2863g7) throws C2864g8 {
        C2864g8 c2864g8;
        String strA07 = A07(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 7, 86);
        HttpURLConnection httpURLConnection = null;
        C1888Cm c1888CmA05 = null;
        boolean z10 = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection httpURLConnectionA08 = A08(abstractC2863g7.A05(), XD.A04() ? A09() : null);
                A0H(httpURLConnectionA08, abstractC2863g7);
                A0G(httpURLConnectionA08, abstractC2863g7);
                if (this.A06.AAZ()) {
                    this.A06.ABt(httpURLConnectionA08, abstractC2863g7.A06());
                }
                httpURLConnectionA08.connect();
                this.A02 = true;
                Set<String> setA01 = this.A03.A01();
                Set<String> setA02 = this.A03.A02();
                boolean z11 = (setA01 == null || setA01.isEmpty()) ? false : true;
                if (setA02 != null && !setA02.isEmpty()) {
                    z10 = true;
                }
                if ((httpURLConnectionA08 instanceof HttpsURLConnection) && (z11 || z10)) {
                    try {
                        AbstractC2868gC.A03((HttpsURLConnection) httpURLConnectionA08, setA01, setA02);
                    } catch (CertificateException e10) {
                        this.A00.ABz(strA07, AbstractC2312Td.A1z, new C2313Te(e10));
                    } catch (Exception e11) {
                        this.A00.ABz(strA07, AbstractC2312Td.A1y, new C2313Te(e11));
                    }
                }
                if (httpURLConnectionA08.getDoOutput() && abstractC2863g7.A06() != null) {
                    A00(httpURLConnectionA08, abstractC2863g7.A06());
                }
                C1888Cm c1888CmA06 = httpURLConnectionA08.getDoInput() ? A06(httpURLConnectionA08) : new C1888Cm(httpURLConnectionA08, null);
                if (this.A06.AAZ()) {
                    this.A06.ABu(c1888CmA06);
                }
                if (httpURLConnectionA08 != null) {
                    httpURLConnectionA08.disconnect();
                }
                return c1888CmA06;
            } catch (Throwable th2) {
                if (this.A06.AAZ()) {
                    this.A06.ABu(c1888CmA05);
                }
                if (0 != 0) {
                    httpURLConnection.disconnect();
                }
                throw th2;
            }
        } catch (Exception e12) {
            try {
                try {
                    c1888CmA05 = A05(null);
                    if (A08[7].length() == 19) {
                        throw new RuntimeException();
                    }
                    A08[5] = "6Q02gTcavt1J3D6llCgnQfsLExV7BLlB";
                    if (c1888CmA05 == null || c1888CmA05.A9C() <= 0) {
                        c2864g8 = new C2864g8(e12, c1888CmA05);
                        throw c2864g8;
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c1888CmA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c1888CmA05;
                } catch (Throwable unused) {
                    if (c1888CmA05 == null || c1888CmA05.A9C() <= 0) {
                        throw new C2864g8(e12, c1888CmA05);
                    }
                    if (this.A06.AAZ()) {
                        this.A06.ABu(c1888CmA05);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return c1888CmA05;
                }
            } catch (Exception unused2) {
                Log.e(getClass().getSimpleName(), A07(117, 13, 98), e12);
                if (0 != 0 && c1888CmA05.A9C() > 0) {
                    if (this.A06.AAZ()) {
                        this.A06.ABu(null);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return null;
                }
                c2864g8 = new C2864g8(e12, null);
            }
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{59, 57, 102, 107, c.f161638p, 102, q.f83619w, 77, 64, 9, 77, 79, c.H, 93, 75, 76, 82, c.H, 42, 99, 121, 42, q.f83619w, 101, 126, 42, 107, 42, 124, 107, 102, 99, 110, 42, 95, 88, 70, 80, 31, c.f161648z, 80, 75, a.f127263w, 116, c.A, 0, 116, 105, 116, 55, 59, 73, 79, 59, 38, 59, 38, 42, 126, a.f127263w, 115, 99, q.f83619w, 109, 42, 94, 4, 34, 43, 38, 55, 52, 34, 35, 71, 51, 46, 42, 34, 71, 90, 71, 71, 101, 116, 116, 105, 110, 103, 32, 116, 104, 101, 32, 104, 116, 116, 112, 32, 114, 101, 115, 112, 111, 110, 115, 101, 32, 116, 105, 109, 101, q.f83619w, 32, 111, 117, 116, yr.a.f159811k, c.f161648z, 7, 4, 28, 1, c.B, 83, c.f161648z, 1, 1, 28, 1, c.A, c.f161648z, 4, 111, 122, c.f161648z, 7, 7, c.E, c.H, c.f161646x, c.f161648z, 3, c.H, c.B, c.C, 88, c.f161639q, 90, 0, 0, 0, 90, 17, c.B, 5, c.D, 90, 2, 5, c.E, c.f161643u, c.C, c.f161646x, c.B, 19, c.f161643u, 19, 76, c.f161646x, 31, c.f161648z, 5, 4, c.f161643u, 3, 74, 34, 35, 49, 90, 79, 89, 79, 72, 86, c.D, c.A, 81, c.D, c.A, 83, a.f127263w, q.f83619w, q.f83619w, 96, 62, 96, 98, 127, 104, 105, 88, 127, 99, q.f83619w, c.E, 7, 7, 3, 93, 3, 1, 28, c.f161635m, 10, 35, 28, 1, 7, 41, 34, 51, 48, 40, 53, 44};
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:43:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0133  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0144  */
    /* JADX WARN: Code duplicated, block: B:57:0x0149  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150  */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public final InterfaceC2850fu A0J(AbstractC2863g7 abstractC2863g7) throws C2864g8 {
        InterfaceC2850fu interfaceC2850fuA00;
        long length;
        long length2;
        int iA9C;
        int i10 = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iA01 = abstractC2863g7.A02().A01();
        long jA03 = abstractC2863g7.A02().A03();
        long jCurrentTimeMillis2 = System.currentTimeMillis() + ((long) abstractC2863g7.A02().A04());
        while (true) {
            if (i10 >= iA01 || jCurrentTimeMillis2 <= System.currentTimeMillis()) {
                break;
            }
            try {
                if (this.A06.AAZ()) {
                    String str = (i10 + 1) + A07(37, 4, 97) + iA01 + A07(56, 9, 27) + abstractC2863g7.A05();
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                InterfaceC2850fu interfaceC2850fuA01 = A01(abstractC2863g7);
                if (interfaceC2850fuA01 != null) {
                    this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, interfaceC2850fuA01.A72().length, abstractC2863g7.A04 == null ? 0L : abstractC2863g7.A04.length, interfaceC2850fuA01.A9C(), null);
                    return interfaceC2850fuA01;
                }
                continue;
            } catch (C2864g8 e10) {
                if (!A0I(e10, jCurrentTimeMillis, abstractC2863g7)) {
                    if (this.A05.ADs(e10)) {
                    }
                    interfaceC2850fuA00 = e10.A00();
                    InterfaceC2311Tc interfaceC2311Tc = this.A00;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (A08[1].charAt(0) != 'l') {
                        A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                        if (interfaceC2850fuA00 != null) {
                            if (interfaceC2850fuA00.A72() == null) {
                                length = interfaceC2850fuA00.A72().length;
                            }
                        }
                        if (abstractC2863g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC2863g7.A04.length;
                        }
                        if (interfaceC2850fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC2850fuA00.A9C();
                        }
                        interfaceC2311Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e10);
                        throw e10;
                    }
                    A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                    if (interfaceC2850fuA00 != null) {
                        if (interfaceC2850fuA00.A72() == null) {
                            length = interfaceC2850fuA00.A72().length;
                        }
                    }
                    if (abstractC2863g7.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = abstractC2863g7.A04.length;
                    }
                    if (interfaceC2850fuA00 == null) {
                        iA9C = 0;
                    } else {
                        iA9C = interfaceC2850fuA00.A9C();
                    }
                    interfaceC2311Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e10);
                    throw e10;
                    length = 0;
                    if (abstractC2863g7.A04 == null) {
                        length2 = 0;
                    } else {
                        length2 = abstractC2863g7.A04.length;
                    }
                    if (interfaceC2850fuA00 == null) {
                        iA9C = 0;
                    } else {
                        iA9C = interfaceC2850fuA00.A9C();
                    }
                    interfaceC2311Tc.ABo(jCurrentTimeMillis, jCurrentTimeMillis3, length, length2, iA9C, e10);
                    throw e10;
                }
                int i11 = iA01 - 1;
                if (A08[1].charAt(0) == 'l') {
                    throw new RuntimeException();
                }
                A08[1] = "iDEOxz3pTPjJqVLmMx3mPs9K2XOoyKBI";
                if (i10 < i11) {
                    continue;
                } else {
                    if (this.A05.ADs(e10) || i10 >= iA01 - 1) {
                        interfaceC2850fuA00 = e10.A00();
                        InterfaceC2311Tc interfaceC2311Tc2 = this.A00;
                        long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis;
                        if (A08[1].charAt(0) != 'l') {
                            A08[4] = "ETXEAYq6mx6OG4ZVoxEdED8XICrn9DEf";
                            if (interfaceC2850fuA00 != null) {
                                if (interfaceC2850fuA00.A72() == null) {
                                    length = interfaceC2850fuA00.A72().length;
                                }
                            }
                            if (abstractC2863g7.A04 == null) {
                                length2 = 0;
                            } else {
                                length2 = abstractC2863g7.A04.length;
                            }
                            if (interfaceC2850fuA00 == null) {
                                iA9C = 0;
                            } else {
                                iA9C = interfaceC2850fuA00.A9C();
                            }
                            interfaceC2311Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e10);
                            throw e10;
                        }
                        A08[1] = "GUaOJDLzyYCGW5Cxc7undAaXJNT5GVew";
                        if (interfaceC2850fuA00 != null) {
                            if (interfaceC2850fuA00.A72() == null) {
                                length = interfaceC2850fuA00.A72().length;
                            }
                        }
                        if (abstractC2863g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC2863g7.A04.length;
                        }
                        if (interfaceC2850fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC2850fuA00.A9C();
                        }
                        interfaceC2311Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e10);
                        throw e10;
                        length = 0;
                        if (abstractC2863g7.A04 == null) {
                            length2 = 0;
                        } else {
                            length2 = abstractC2863g7.A04.length;
                        }
                        if (interfaceC2850fuA00 == null) {
                            iA9C = 0;
                        } else {
                            iA9C = interfaceC2850fuA00.A9C();
                        }
                        interfaceC2311Tc2.ABo(jCurrentTimeMillis, jCurrentTimeMillis4, length, length2, iA9C, e10);
                        throw e10;
                    }
                    if (jA03 > 0) {
                        try {
                            Thread.sleep(jA03);
                        } catch (InterruptedException e11) {
                            this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC2863g7.A04 != null ? abstractC2863g7.A04.length : 0L, 0, e11);
                            throw e10;
                        }
                    } else {
                        continue;
                    }
                }
            }
            i10++;
        }
        this.A00.ABo(jCurrentTimeMillis, System.currentTimeMillis() - jCurrentTimeMillis, 0L, abstractC2863g7.A04 == null ? 0L : abstractC2863g7.A04.length, 0, new TimeoutException(A07(82, 35, 17)));
        return null;
    }

    static {
        A0A();
        A09 = InterfaceC2851fv.class.getSimpleName();
    }

    public C1887Cl(C2856g0 c2856g0, InterfaceC2311Tc interfaceC2311Tc, Executor executor) {
        A0B();
        this.A03 = c2856g0;
        this.A06 = new C1886Ck(c2856g0.A04());
        final InterfaceC2867gB interfaceC2867gB = this.A06;
        this.A05 = new AbstractC1894Ct(interfaceC2867gB) { // from class: com.facebook.ads.redexgen.X.2i
        };
        this.A01 = executor;
        this.A00 = interfaceC2311Tc;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStreamAGn = null;
        try {
            outputStreamAGn = this.A05.AGn(httpURLConnection);
            if (outputStreamAGn != null) {
                this.A05.AL8(outputStreamAGn, bArr);
            }
            return httpURLConnection.getResponseCode();
        } finally {
            if (outputStreamAGn != null) {
                try {
                    outputStreamAGn.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final InterfaceC2850fu A02(AbstractC2863g7 abstractC2863g7) {
        if (this.A03.A04()) {
            A0C(abstractC2863g7);
        }
        InterfaceC2850fu interfaceC2850fuA01 = null;
        try {
            interfaceC2850fuA01 = A01(abstractC2863g7);
            return interfaceC2850fuA01;
        } catch (C2864g8 hre) {
            this.A05.ADs(hre);
            return interfaceC2850fuA01;
        } catch (Exception e10) {
            this.A05.ADs(new C2864g8(e10, interfaceC2850fuA01));
            return interfaceC2850fuA01;
        }
    }

    private final InterfaceC2850fu A03(String str, C2865g9 c2865g9, C2859g3 c2859g3) {
        return A02(new C1890Co(str, c2865g9, c2859g3));
    }

    private final InterfaceC2850fu A04(String str, String str2, byte[] bArr, C2859g3 c2859g3) {
        return A02(new C1889Cn(str, null, str2, bArr, c2859g3));
    }

    private final C1888Cm A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream errorStream = null;
        byte[] responseBody = null;
        try {
            errorStream = httpURLConnection.getErrorStream();
            if (errorStream != null) {
                responseBody = this.A05.AHT(errorStream);
            }
            return new C1888Cm(httpURLConnection, responseBody);
        } finally {
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused) {
                }
            }
        }
    }

    private final C1888Cm A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStreamAGm = null;
        byte[] responseBody = null;
        try {
            inputStreamAGm = this.A05.AGm(httpURLConnection);
            if (inputStreamAGm != null) {
                responseBody = this.A05.AHT(inputStreamAGm);
            }
            C1888Cm c1888Cm = new C1888Cm(httpURLConnection, responseBody);
            if (inputStreamAGm != null) {
                try {
                    inputStreamAGm.close();
                } catch (Exception unused) {
                }
            }
            return c1888Cm;
        } catch (Throwable th2) {
            String[] strArr = A08;
            if (strArr[3].charAt(2) != strArr[0].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "UXNjV4lzV2ywD4tdDbD0LjxSkhTqZWDx";
            strArr2[0] = "ckNMQEffDKJwLTwRJSWHE7UL6GsW6bMO";
            if (inputStreamAGm != null) {
                try {
                    inputStreamAGm.close();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.AGl(str, proxy);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(str + A07(18, 19, 27), e10);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 1));
        String proxyAddress = System.getProperty(A07(206, 14, 98));
        int port = -1;
        if (proxyAddress != null) {
            try {
                port = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        if (!TextUtils.isEmpty(property) && port > 0 && port <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, port));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager());
        }
    }

    private void A0C(AbstractC2863g7 abstractC2863g7) {
        StringBuilder sb2 = new StringBuilder(A07(182, 10, 43));
        boolean zEquals = abstractC2863g7.A03().equals(EnumC2862g6.A06);
        String strA07 = A07(41, 1, 120);
        if (zEquals) {
            byte[] bArrA06 = abstractC2863g7.A06();
            if (A08[1].charAt(0) == 'l') {
                throw new RuntimeException();
            }
            A08[4] = "MgpsgMtpOSh21D9UNcI3ZUtvoefc4JIC";
            if (bArrA06 != null) {
                sb2.append(A07(7, 5, 124));
                sb2.append(new String(abstractC2863g7.A06(), Charset.forName(A07(130, 5, 83))));
                sb2.append(strA07);
            }
        }
        for (Map.Entry<String, String> entry : abstractC2863g7.A02().A06().entrySet()) {
            sb2.append(A07(2, 5, 87));
            sb2.append(entry.getKey());
            sb2.append(A07(66, 1, 47));
            sb2.append(entry.getValue());
            sb2.append(strA07);
        }
        sb2.append(A07(0, 2, 10));
        sb2.append(abstractC2863g7.A05());
        sb2.append(strA07);
        String string = sb2.toString();
        A0E(string, 1, (string.length() / 4000) + 1);
    }

    private void A0D(AbstractC2863g7 abstractC2863g7, InterfaceC2852fw interfaceC2852fw) {
        this.A04.A6y(this, interfaceC2852fw, this.A01).A04(abstractC2863g7);
        if (this.A03.A04()) {
            A0C(abstractC2863g7);
        }
    }

    private void A0E(String str, int i10, int i11) {
        String str2 = A09 + A07(12, 6, 47) + i10 + A07(65, 1, 96) + i11;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i10 + 1, i11);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC2852fw interfaceC2852fw, C2859g3 c2859g3) {
        C1889Cn req = new C1889Cn(str, null, str2, bArr, c2859g3);
        A0D(req, interfaceC2852fw);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC2863g7 abstractC2863g7) {
        Map<String, String> mapA06 = abstractC2863g7.A02().A06();
        InterfaceC2849ft interfaceC2849ftA05 = abstractC2863g7.A02().A05();
        for (String str : mapA06.keySet()) {
            httpURLConnection.setRequestProperty(str, mapA06.get(str));
        }
        if (interfaceC2849ftA05 != null) {
            Map<String, String> mapA6g = interfaceC2849ftA05.A6g(this.A03.A03());
            for (String str2 : mapA6g.keySet()) {
                httpURLConnection.setRequestProperty(str2, mapA6g.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC2863g7 abstractC2863g7) throws IOException {
        C2859g3 c2859g3A02 = abstractC2863g7.A02();
        httpURLConnection.setConnectTimeout(c2859g3A02.A00());
        httpURLConnection.setReadTimeout(c2859g3A02.A02());
        this.A05.AH6(httpURLConnection, abstractC2863g7.A03(), abstractC2863g7.A04());
    }

    private final boolean A0I(Throwable th2, long j10, AbstractC2863g7 abstractC2863g7) {
        C2859g3 c2859g3A02 = abstractC2863g7.A02();
        long jCurrentTimeMillis = (System.currentTimeMillis() - j10) + 10;
        if (this.A06.AAZ()) {
            String str = A07(67, 15, 118) + jCurrentTimeMillis + A07(42, 7, 69) + c2859g3A02.A00() + A07(49, 7, 10) + c2859g3A02.A02();
        }
        if (this.A02) {
            long jA02 = c2859g3A02.A02();
            if (A08[4].charAt(1) == 'Y') {
                throw new RuntimeException();
            }
            A08[7] = "tgQXMymp9cIZW";
            return jCurrentTimeMillis >= jA02;
        }
        long elapsedTime = c2859g3A02.A00();
        return jCurrentTimeMillis >= elapsedTime;
    }

    public final C2856g0 A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2851fv
    @Deprecated
    public final InterfaceC2850fu AGw(String str, Map<String, String> parameters) {
        return A03(str, new C2865g9(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2851fv
    @Deprecated
    public final InterfaceC2850fu AGx(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 102), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2851fv
    public final void AGy(String str, byte[] bArr, InterfaceC2852fw interfaceC2852fw) {
        A0F(str, A07(135, 47, 102), bArr, interfaceC2852fw, this.A03.A00());
    }
}
