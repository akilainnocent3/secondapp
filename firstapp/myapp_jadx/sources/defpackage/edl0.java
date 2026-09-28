package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.zzao;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class edl0 extends yqk0 {
    public final /* synthetic */ nfl0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edl0(nfl0 nfl0Var, zal0 zal0Var) {
        super(zal0Var);
        this.e = nfl0Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0144  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0163  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:61:0x0171  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x019c  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0273 A[Catch: IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, TryCatch #5 {IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, blocks: (B:78:0x022b, B:80:0x0273, B:85:0x027e, B:87:0x0284, B:89:0x028c, B:90:0x0292, B:91:0x0296), top: B:108:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0284 A[Catch: IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, TryCatch #5 {IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, blocks: (B:78:0x022b, B:80:0x0273, B:85:0x027e, B:87:0x0284, B:89:0x028c, B:90:0x0292, B:91:0x0296), top: B:108:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:89:0x028c A[Catch: IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, TryCatch #5 {IllegalArgumentException -> 0x027a, MalformedURLException -> 0x027c, blocks: (B:78:0x022b, B:80:0x0273, B:85:0x027e, B:87:0x0284, B:89:0x028c, B:90:0x0292, B:91:0x0296), top: B:108:0x022b }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02b0  */
    @Override // defpackage.yqk0
    public final void a() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        ikl0 ikl0VarO;
        k8l0 k8l0Var;
        o3l0 o3l0Var;
        zzao zzaoVarL;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        k8l0 k8l0Var2;
        URL url;
        String strConcat;
        nfl0 nfl0Var = this.e;
        final k8l0 k8l0Var3 = nfl0Var.a;
        j6l0 j6l0Var = k8l0Var3.e;
        y4l0 y4l0Var = k8l0Var3.f;
        p7l0 p7l0Var = k8l0Var3.g;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        xfl0 xfl0Var = k8l0Var3.o;
        k8l0.m(xfl0Var);
        k8l0 k8l0Var4 = xfl0Var.a;
        k8l0.m(xfl0Var);
        String strM = k8l0Var3.q().m();
        Boolean boolS = k8l0Var3.d.s("google_analytics_adid_collection_enabled");
        boolean z = false;
        if (boolS == null || boolS.booleanValue()) {
            k8l0.k(j6l0Var);
            k8l0 k8l0Var5 = j6l0Var.a;
            j6l0Var.g();
            if (j6l0Var.n().i(hbl0.AD_STORAGE)) {
                k8l0Var5.k.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String str3 = j6l0Var.h;
                if (str3 == null || jElapsedRealtime >= j6l0Var.j) {
                    j6l0Var.j = k8l0Var5.d.n(strM, v2l0.b) + jElapsedRealtime;
                    try {
                        sm.a aVarA = sm.a(k8l0Var5.a);
                        j6l0Var.h = "";
                        String str4 = aVarA.a;
                        if (str4 != null) {
                            j6l0Var.h = str4;
                        }
                        j6l0Var.i = aVarA.b;
                    } catch (Exception e) {
                        y4l0 y4l0Var2 = k8l0Var5.f;
                        k8l0.m(y4l0Var2);
                        y4l0Var2.m.b(e, "Unable to get advertising id");
                        j6l0Var.h = "";
                    }
                    pair = new Pair(j6l0Var.h, Boolean.valueOf(j6l0Var.i));
                } else {
                    pair = new Pair(str3, Boolean.valueOf(j6l0Var.i));
                }
            } else {
                pair = new Pair("", Boolean.FALSE);
            }
            if (((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
                k8l0.m(y4l0Var);
                y4l0Var.n.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            } else {
                k8l0.m(xfl0Var);
                xfl0Var.i();
                ConnectivityManager connectivityManager = (ConnectivityManager) k8l0Var4.a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    } catch (SecurityException unused) {
                        activeNetworkInfo = null;
                    }
                } else {
                    activeNetworkInfo = null;
                }
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    k8l0.m(y4l0Var);
                    y4l0Var.i.a("Network is not available for Deferred Deep Link request. Skipping");
                } else {
                    StringBuilder sb = new StringBuilder();
                    ikl0 ikl0VarO2 = k8l0Var3.o();
                    ikl0VarO2.g();
                    ikl0VarO2.h();
                    if (ikl0VarO2.n()) {
                        yol0 yol0Var = ikl0VarO2.a.i;
                        k8l0.k(yol0Var);
                        if (yol0Var.N() >= 234200) {
                            nfl0 nfl0Var2 = k8l0Var3.m;
                            k8l0.l(nfl0Var2);
                            k8l0 k8l0Var6 = nfl0Var2.a;
                            nfl0Var2.g();
                            ikl0VarO = k8l0Var6.o();
                            k8l0Var = ikl0VarO.a;
                            ikl0VarO.g();
                            ikl0VarO.h();
                            o3l0Var = ikl0VarO.d;
                            if (o3l0Var == null) {
                                ikl0VarO.m();
                                y4l0 y4l0Var3 = k8l0Var.f;
                                k8l0.m(y4l0Var3);
                                y4l0Var3.m.a("Failed to get consents; not connected to service yet.");
                            } else {
                                zzaoVarL = o3l0Var.L(ikl0VarO.w(false));
                                ikl0VarO.t();
                                if (zzaoVarL != null) {
                                    bundle = zzaoVarL.a;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = k8l0Var3.B;
                                    k8l0Var3.B = i + 1;
                                    if (i < 10) {
                                    }
                                    k8l0.m(y4l0Var);
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    y4l0Var.m.b(Integer.valueOf(k8l0Var3.B), pr0.a(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                                } else {
                                    jbl0 jbl0VarB = jbl0.b(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(jbl0VarB.f());
                                    crk0 crk0VarC = crk0.c(100, bundle);
                                    str = crk0VarC.d;
                                    sb.append("&dma=");
                                    Boolean bool2 = crk0VarC.c;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = jbl0.d(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i2 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i2);
                                    k8l0.m(y4l0Var);
                                    y4l0Var.n.b(sb, "Consent query parameters to Bow");
                                    yol0 yol0Var2 = k8l0Var3.i;
                                    k8l0.k(yol0Var2);
                                    k8l0Var3.q().a.d.l();
                                    String str5 = (String) pair.first;
                                    long jA = j6l0Var.u.a() - 1;
                                    string = sb.toString();
                                    k8l0Var2 = yol0Var2.a;
                                    hm20.e(str5);
                                    hm20.e(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + yol0Var2.N()) + "&rdid=" + str5 + "&bundleid=" + strM + "&retry=" + jA;
                                    if (strM.equals(k8l0Var2.d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        k8l0.m(xfl0Var);
                                        rfl0 rfl0Var = new rfl0() { // from class: i8l0
                                            @Override // defpackage.rfl0
                                            public final /* synthetic */ void a(String str6, int i3, Throwable th, byte[] bArr, Map map) {
                                                k8l0Var3.i(i3, th, bArr);
                                            }
                                        };
                                        xfl0Var.i();
                                        p7l0 p7l0Var2 = k8l0Var4.g;
                                        k8l0.m(p7l0Var2);
                                        p7l0Var2.s(new vfl0(xfl0Var, strM, url, null, null, rfl0Var));
                                    }
                                }
                            }
                            zzaoVarL = null;
                            if (zzaoVarL != null) {
                                bundle = zzaoVarL.a;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i = k8l0Var3.B;
                                k8l0Var3.B = i + 1;
                                if (i < 10) {
                                }
                                k8l0.m(y4l0Var);
                                if (i < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                y4l0Var.m.b(Integer.valueOf(k8l0Var3.B), pr0.a(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                            } else {
                                jbl0 jbl0VarB2 = jbl0.b(100, bundle);
                                sb.append("&gcs=");
                                sb.append(jbl0VarB2.f());
                                crk0 crk0VarC2 = crk0.c(100, bundle);
                                str = crk0VarC2.d;
                                sb.append("&dma=");
                                Boolean bool3 = crk0VarC2.c;
                                bool = Boolean.FALSE;
                                sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append("&dma_cps=");
                                    sb.append(str);
                                }
                                iOrdinal = jbl0.d(bundle.getString("ad_personalization")).ordinal();
                                if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        bool = null;
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                int i3 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                sb.append("&npa=");
                                sb.append(i3);
                                k8l0.m(y4l0Var);
                                y4l0Var.n.b(sb, "Consent query parameters to Bow");
                                yol0 yol0Var3 = k8l0Var3.i;
                                k8l0.k(yol0Var3);
                                k8l0Var3.q().a.d.l();
                                String str6 = (String) pair.first;
                                long jA2 = j6l0Var.u.a() - 1;
                                string = sb.toString();
                                k8l0Var2 = yol0Var3.a;
                                hm20.e(str6);
                                hm20.e(strM);
                                strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + yol0Var3.N()) + "&rdid=" + str6 + "&bundleid=" + strM + "&retry=" + jA2;
                                if (strM.equals(k8l0Var2.d.k("debug.deferred.deeplink"))) {
                                    strConcat = strConcat.concat("&ddl_test=1");
                                }
                                if (!string.isEmpty()) {
                                    if (string.charAt(0) != '&') {
                                        strConcat = strConcat.concat("&");
                                    }
                                    strConcat = strConcat.concat(string);
                                }
                                url = new URL(strConcat);
                                if (url != null) {
                                    k8l0.m(xfl0Var);
                                    rfl0 rfl0Var2 = new rfl0() { // from class: i8l0
                                        @Override // defpackage.rfl0
                                        public final /* synthetic */ void a(String str7, int i4, Throwable th, byte[] bArr, Map map) {
                                            k8l0Var3.i(i4, th, bArr);
                                        }
                                    };
                                    xfl0Var.i();
                                    p7l0 p7l0Var3 = k8l0Var4.g;
                                    k8l0.m(p7l0Var3);
                                    p7l0Var3.s(new vfl0(xfl0Var, strM, url, null, null, rfl0Var2));
                                }
                            }
                        } else {
                            yol0 yol0Var4 = k8l0Var3.i;
                            k8l0.k(yol0Var4);
                            k8l0Var3.q().a.d.l();
                            String str7 = (String) pair.first;
                            long jA3 = j6l0Var.u.a() - 1;
                            string = sb.toString();
                            k8l0Var2 = yol0Var4.a;
                            hm20.e(str7);
                            hm20.e(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + yol0Var4.N()) + "&rdid=" + str7 + "&bundleid=" + strM + "&retry=" + jA3;
                            if (strM.equals(k8l0Var2.d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                k8l0.m(xfl0Var);
                                rfl0 rfl0Var3 = new rfl0() { // from class: i8l0
                                    @Override // defpackage.rfl0
                                    public final /* synthetic */ void a(String str8, int i4, Throwable th, byte[] bArr, Map map) {
                                        k8l0Var3.i(i4, th, bArr);
                                    }
                                };
                                xfl0Var.i();
                                p7l0 p7l0Var4 = k8l0Var4.g;
                                k8l0.m(p7l0Var4);
                                p7l0Var4.s(new vfl0(xfl0Var, strM, url, null, null, rfl0Var3));
                            }
                        }
                    } else {
                        nfl0 nfl0Var3 = k8l0Var3.m;
                        k8l0.l(nfl0Var3);
                        k8l0 k8l0Var7 = nfl0Var3.a;
                        nfl0Var3.g();
                        ikl0VarO = k8l0Var7.o();
                        k8l0Var = ikl0VarO.a;
                        ikl0VarO.g();
                        ikl0VarO.h();
                        o3l0Var = ikl0VarO.d;
                        if (o3l0Var == null) {
                            ikl0VarO.m();
                            y4l0 y4l0Var4 = k8l0Var.f;
                            k8l0.m(y4l0Var4);
                            y4l0Var4.m.a("Failed to get consents; not connected to service yet.");
                        } else {
                            try {
                                zzaoVarL = o3l0Var.L(ikl0VarO.w(false));
                                ikl0VarO.t();
                            } catch (RemoteException e2) {
                                y4l0 y4l0Var5 = k8l0Var.f;
                                k8l0.m(y4l0Var5);
                                y4l0Var5.f.b(e2, "Failed to get consents; remote exception");
                                zzaoVarL = null;
                            }
                            if (zzaoVarL != null) {
                                bundle = zzaoVarL.a;
                            } else {
                                bundle = null;
                            }
                            if (bundle == null) {
                                i = k8l0Var3.B;
                                k8l0Var3.B = i + 1;
                                z = i < 10;
                                k8l0.m(y4l0Var);
                                if (i < 10) {
                                    str2 = "Retrying.";
                                } else {
                                    str2 = "Skipping.";
                                }
                                y4l0Var.m.b(Integer.valueOf(k8l0Var3.B), pr0.a(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                            } else {
                                jbl0 jbl0VarB3 = jbl0.b(100, bundle);
                                sb.append("&gcs=");
                                sb.append(jbl0VarB3.f());
                                crk0 crk0VarC3 = crk0.c(100, bundle);
                                str = crk0VarC3.d;
                                sb.append("&dma=");
                                Boolean bool4 = crk0VarC3.c;
                                bool = Boolean.FALSE;
                                sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                if (!TextUtils.isEmpty(str)) {
                                    sb.append("&dma_cps=");
                                    sb.append(str);
                                }
                                iOrdinal = jbl0.d(bundle.getString("ad_personalization")).ordinal();
                                if (iOrdinal != 2) {
                                    if (iOrdinal != 3) {
                                        bool = null;
                                    } else {
                                        bool = Boolean.TRUE;
                                    }
                                }
                                int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                sb.append("&npa=");
                                sb.append(i4);
                                k8l0.m(y4l0Var);
                                y4l0Var.n.b(sb, "Consent query parameters to Bow");
                                yol0 yol0Var5 = k8l0Var3.i;
                                k8l0.k(yol0Var5);
                                k8l0Var3.q().a.d.l();
                                String str8 = (String) pair.first;
                                long jA4 = j6l0Var.u.a() - 1;
                                string = sb.toString();
                                k8l0Var2 = yol0Var5.a;
                                try {
                                    hm20.e(str8);
                                    hm20.e(strM);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + yol0Var5.N()) + "&rdid=" + str8 + "&bundleid=" + strM + "&retry=" + jA4;
                                    if (strM.equals(k8l0Var2.d.k("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    y4l0 y4l0Var6 = k8l0Var2.f;
                                    k8l0.m(y4l0Var6);
                                    y4l0Var6.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                } catch (MalformedURLException e4) {
                                    e = e4;
                                    y4l0 y4l0Var7 = k8l0Var2.f;
                                    k8l0.m(y4l0Var7);
                                    y4l0Var7.f.b(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                    url = null;
                                }
                                if (url != null) {
                                    k8l0.m(xfl0Var);
                                    rfl0 rfl0Var4 = new rfl0() { // from class: i8l0
                                        @Override // defpackage.rfl0
                                        public final /* synthetic */ void a(String str9, int i5, Throwable th, byte[] bArr, Map map) {
                                            k8l0Var3.i(i5, th, bArr);
                                        }
                                    };
                                    xfl0Var.i();
                                    p7l0 p7l0Var5 = k8l0Var4.g;
                                    k8l0.m(p7l0Var5);
                                    p7l0Var5.s(new vfl0(xfl0Var, strM, url, null, null, rfl0Var4));
                                }
                            }
                        }
                        zzaoVarL = null;
                        if (zzaoVarL != null) {
                            bundle = zzaoVarL.a;
                        } else {
                            bundle = null;
                        }
                        if (bundle == null) {
                            i = k8l0Var3.B;
                            k8l0Var3.B = i + 1;
                            if (i < 10) {
                            }
                            k8l0.m(y4l0Var);
                            if (i < 10) {
                                str2 = "Retrying.";
                            } else {
                                str2 = "Skipping.";
                            }
                            y4l0Var.m.b(Integer.valueOf(k8l0Var3.B), pr0.a(new StringBuilder(str2.length() + 60), "Failed to retrieve DMA consent from the service, ", str2, " retryCount"));
                        } else {
                            jbl0 jbl0VarB4 = jbl0.b(100, bundle);
                            sb.append("&gcs=");
                            sb.append(jbl0VarB4.f());
                            crk0 crk0VarC4 = crk0.c(100, bundle);
                            str = crk0VarC4.d;
                            sb.append("&dma=");
                            Boolean bool5 = crk0VarC4.c;
                            bool = Boolean.FALSE;
                            sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                            if (!TextUtils.isEmpty(str)) {
                                sb.append("&dma_cps=");
                                sb.append(str);
                            }
                            iOrdinal = jbl0.d(bundle.getString("ad_personalization")).ordinal();
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    bool = null;
                                } else {
                                    bool = Boolean.TRUE;
                                }
                            }
                            int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                            sb.append("&npa=");
                            sb.append(i5);
                            k8l0.m(y4l0Var);
                            y4l0Var.n.b(sb, "Consent query parameters to Bow");
                            yol0 yol0Var6 = k8l0Var3.i;
                            k8l0.k(yol0Var6);
                            k8l0Var3.q().a.d.l();
                            String str9 = (String) pair.first;
                            long jA5 = j6l0Var.u.a() - 1;
                            string = sb.toString();
                            k8l0Var2 = yol0Var6.a;
                            hm20.e(str9);
                            hm20.e(strM);
                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v133005." + yol0Var6.N()) + "&rdid=" + str9 + "&bundleid=" + strM + "&retry=" + jA5;
                            if (strM.equals(k8l0Var2.d.k("debug.deferred.deeplink"))) {
                                strConcat = strConcat.concat("&ddl_test=1");
                            }
                            if (!string.isEmpty()) {
                                if (string.charAt(0) != '&') {
                                    strConcat = strConcat.concat("&");
                                }
                                strConcat = strConcat.concat(string);
                            }
                            url = new URL(strConcat);
                            if (url != null) {
                                k8l0.m(xfl0Var);
                                rfl0 rfl0Var5 = new rfl0() { // from class: i8l0
                                    @Override // defpackage.rfl0
                                    public final /* synthetic */ void a(String str10, int i6, Throwable th, byte[] bArr, Map map) {
                                        k8l0Var3.i(i6, th, bArr);
                                    }
                                };
                                xfl0Var.i();
                                p7l0 p7l0Var6 = k8l0Var4.g;
                                k8l0.m(p7l0Var6);
                                p7l0Var6.s(new vfl0(xfl0Var, strM, url, null, null, rfl0Var5));
                            }
                        }
                    }
                }
            }
        } else {
            k8l0.m(y4l0Var);
            y4l0Var.n.a("ADID collection is disabled from Manifest. Skipping");
        }
        if (z) {
            nfl0Var.t.b(2000L);
        }
    }
}
