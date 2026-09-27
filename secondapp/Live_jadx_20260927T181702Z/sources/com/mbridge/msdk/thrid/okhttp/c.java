package com.mbridge.msdk.thrid.okhttp;

import io.appmetrica.analytics.BuildConfig;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f69500n = new a().b().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f69501o = new a().c().a(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f69502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f69503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f69504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f69505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f69506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f69507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f69508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f69509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f69510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f69511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f69512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f69513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @zq.h
    String f69514m;

    private c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, @zq.h String str) {
        this.f69502a = z10;
        this.f69503b = z11;
        this.f69504c = i10;
        this.f69505d = i11;
        this.f69506e = z12;
        this.f69507f = z13;
        this.f69508g = z14;
        this.f69509h = i12;
        this.f69510i = i13;
        this.f69511j = z15;
        this.f69512k = z16;
        this.f69513l = z17;
        this.f69514m = str;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0109  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111  */
    /* JADX WARN: Code duplicated, block: B:57:0x0119  */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0130  */
    /* JADX WARN: Code duplicated, block: B:65:0x0138  */
    /* JADX WARN: Code duplicated, block: B:83:0x013a A[SYNTHETIC] */
    public static c a(r rVar) {
        int i10;
        int iA;
        String strTrim;
        int iA2;
        String strTrim2;
        r rVar2 = rVar;
        int iB = rVar2.b();
        int i11 = 0;
        boolean z10 = true;
        String str = null;
        boolean z11 = false;
        boolean z12 = false;
        int iA3 = -1;
        int iA4 = -1;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int iA5 = -1;
        int iA6 = -1;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        while (i11 < iB) {
            String strA = rVar2.a(i11);
            String strB = rVar2.b(i11);
            if (strA.equalsIgnoreCase("Cache-Control")) {
                if (str == null) {
                    str = strB;
                }
                for (i10 = 0; i10 < strB.length(); i10 = iA2) {
                    iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                    strTrim = strB.substring(i10, iA).trim();
                    if (iA != strB.length() || strB.charAt(iA) == ',' || strB.charAt(iA) == ';') {
                        iA2 = iA + 1;
                        strTrim2 = null;
                    } else {
                        int iB2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.b(strB, iA + 1);
                        if (iB2 >= strB.length() || strB.charAt(iB2) != '\"') {
                            iA2 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, iB2, ",;");
                            strTrim2 = strB.substring(iB2, iA2).trim();
                        } else {
                            int i12 = iB2 + 1;
                            int iA7 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i12, "\"");
                            strTrim2 = strB.substring(i12, iA7);
                            iA2 = iA7 + 1;
                        }
                    }
                    if (jl.c.f100615u.equalsIgnoreCase(strTrim)) {
                        z11 = true;
                    } else if ("no-store".equalsIgnoreCase(strTrim)) {
                        z12 = true;
                    } else {
                        if ("max-age".equalsIgnoreCase(strTrim)) {
                            iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                            iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("private".equalsIgnoreCase(strTrim)) {
                            z13 = true;
                        } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(strTrim)) {
                            z14 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                            z15 = true;
                        } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                            iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                            iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                            z16 = true;
                        } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                            z17 = true;
                        } else if ("immutable".equalsIgnoreCase(strTrim)) {
                            z18 = true;
                        }
                    }
                }
                i11++;
                rVar2 = rVar;
            } else {
                if (strA.equalsIgnoreCase(kj.d.f102461e)) {
                }
                i11++;
                rVar2 = rVar;
            }
            z10 = false;
            while (i10 < strB.length()) {
                iA = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strB, i10, "=,;");
                strTrim = strB.substring(i10, iA).trim();
                if (iA != strB.length()) {
                    iA2 = iA + 1;
                    strTrim2 = null;
                } else {
                    iA2 = iA + 1;
                    strTrim2 = null;
                }
                if (jl.c.f100615u.equalsIgnoreCase(strTrim)) {
                    z11 = true;
                } else if ("no-store".equalsIgnoreCase(strTrim)) {
                    z12 = true;
                } else {
                    if ("max-age".equalsIgnoreCase(strTrim)) {
                        iA3 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(strTrim)) {
                        iA4 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("private".equalsIgnoreCase(strTrim)) {
                        z13 = true;
                    } else if (BuildConfig.SDK_BUILD_FLAVOR.equalsIgnoreCase(strTrim)) {
                        z14 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(strTrim)) {
                        z15 = true;
                    } else if ("max-stale".equalsIgnoreCase(strTrim)) {
                        iA5 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, Integer.MAX_VALUE);
                    } else if ("min-fresh".equalsIgnoreCase(strTrim)) {
                        iA6 = com.mbridge.msdk.thrid.okhttp.internal.http.e.a(strTrim2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(strTrim)) {
                        z16 = true;
                    } else if ("no-transform".equalsIgnoreCase(strTrim)) {
                        z17 = true;
                    } else if ("immutable".equalsIgnoreCase(strTrim)) {
                        z18 = true;
                    }
                }
            }
            i11++;
            rVar2 = rVar;
        }
        return new c(z11, z12, iA3, iA4, z13, z14, z15, iA5, iA6, z16, z17, z18, !z10 ? null : str);
    }

    public boolean b() {
        return this.f69506e;
    }

    public boolean c() {
        return this.f69507f;
    }

    public int d() {
        return this.f69504c;
    }

    public int e() {
        return this.f69509h;
    }

    public int f() {
        return this.f69510i;
    }

    public boolean g() {
        return this.f69508g;
    }

    public boolean h() {
        return this.f69502a;
    }

    public boolean i() {
        return this.f69503b;
    }

    public boolean j() {
        return this.f69511j;
    }

    public String toString() {
        String str = this.f69514m;
        if (str != null) {
            return str;
        }
        String strA = a();
        this.f69514m = strA;
        return strA;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f69515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f69516b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f69517c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f69518d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69519e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f69520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f69521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f69522h;

        public a a(int i10, TimeUnit timeUnit) {
            if (i10 >= 0) {
                long seconds = timeUnit.toSeconds(i10);
                this.f69518d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i10);
        }

        public a b() {
            this.f69515a = true;
            return this;
        }

        public a c() {
            this.f69520f = true;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c(a aVar) {
        this.f69502a = aVar.f69515a;
        this.f69503b = aVar.f69516b;
        this.f69504c = aVar.f69517c;
        this.f69505d = -1;
        this.f69506e = false;
        this.f69507f = false;
        this.f69508g = false;
        this.f69509h = aVar.f69518d;
        this.f69510i = aVar.f69519e;
        this.f69511j = aVar.f69520f;
        this.f69512k = aVar.f69521g;
        this.f69513l = aVar.f69522h;
    }

    private String a() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f69502a) {
            sb2.append("no-cache, ");
        }
        if (this.f69503b) {
            sb2.append("no-store, ");
        }
        if (this.f69504c != -1) {
            sb2.append("max-age=");
            sb2.append(this.f69504c);
            sb2.append(", ");
        }
        if (this.f69505d != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.f69505d);
            sb2.append(", ");
        }
        if (this.f69506e) {
            sb2.append("private, ");
        }
        if (this.f69507f) {
            sb2.append("public, ");
        }
        if (this.f69508g) {
            sb2.append("must-revalidate, ");
        }
        if (this.f69509h != -1) {
            sb2.append("max-stale=");
            sb2.append(this.f69509h);
            sb2.append(", ");
        }
        if (this.f69510i != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.f69510i);
            sb2.append(", ");
        }
        if (this.f69511j) {
            sb2.append("only-if-cached, ");
        }
        if (this.f69512k) {
            sb2.append("no-transform, ");
        }
        if (this.f69513l) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        return sb2.toString();
    }
}
