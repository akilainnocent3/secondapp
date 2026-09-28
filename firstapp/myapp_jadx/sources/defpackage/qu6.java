package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.work.impl.eLa.LhMGMAwwhzjwfz;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class qu6 implements nug0 {
    public final jcp a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ss7 e;
    public final ss7 f;

    public static final class a {
        public final URL a;
        public final lg1 b;
        public final String c;

        public a(URL url, lg1 lg1Var, String str) {
            this.a = url;
            this.b = lg1Var;
            this.c = str;
        }
    }

    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public qu6(Context context, ss7 ss7Var, ss7 ss7Var2) {
        kcp kcpVar = new kcp();
        y41 y41Var = y41.a;
        kcpVar.a(nd2.class, y41Var);
        kcpVar.a(lg1.class, y41Var);
        f51 f51Var = f51.a;
        kcpVar.a(vft.class, f51Var);
        kcpVar.a(lj1.class, f51Var);
        z41 z41Var = z41.a;
        kcpVar.a(cs7.class, z41Var);
        kcpVar.a(tg1.class, z41Var);
        x41 x41Var = x41.a;
        kcpVar.a(j40.class, x41Var);
        kcpVar.a(gg1.class, x41Var);
        e51 e51Var = e51.a;
        kcpVar.a(gft.class, e51Var);
        kcpVar.a(jj1.class, e51Var);
        a51 a51Var = a51.a;
        kcpVar.a(in8.class, a51Var);
        kcpVar.a(ug1.class, a51Var);
        d51 d51Var = d51.a;
        kcpVar.a(h4h.class, d51Var);
        kcpVar.a(ki1.class, d51Var);
        c51 c51Var = c51.a;
        kcpVar.a(g4h.class, c51Var);
        kcpVar.a(ji1.class, c51Var);
        g51 g51Var = g51.a;
        kcpVar.a(jmx.class, g51Var);
        kcpVar.a(rj1.class, g51Var);
        b51 b51Var = b51.a;
        kcpVar.a(wzg.class, b51Var);
        kcpVar.a(hi1.class, b51Var);
        kcpVar.d = true;
        this.a = new jcp(kcpVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(bm5.c);
        this.e = ss7Var2;
        this.f = ss7Var;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(inm.a("Invalid url: ", str), e);
        }
    }

    @Override // defpackage.nug0
    public final kg1 b(jg1 jg1Var) {
        String str;
        b bVarB;
        String str2;
        Integer numValueOf;
        Iterator it;
        jj1.a aVar;
        hs1.a aVar2 = hs1.a.b;
        HashMap map = new HashMap();
        ArrayList arrayList = jg1Var.a;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            lpg lpgVar = (lpg) obj;
            String strK = lpgVar.k();
            if (map.containsKey(strK)) {
                ((List) map.get(strK)).add(lpgVar);
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(lpgVar);
                map.put(strK, arrayList2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            lpg lpgVar2 = (lpg) ((List) entry.getValue()).get(i);
            ab30 ab30Var = ab30.a;
            long jB = this.f.b();
            long jB2 = this.e.b();
            tg1 tg1Var = new tg1(new gg1(Integer.valueOf(lpgVar2.h("sdk-version")), lpgVar2.a("model"), lpgVar2.a("hardware"), lpgVar2.a(LastLoginDeviceInfo.KEY_DEVICE), lpgVar2.a("product"), lpgVar2.a("os-uild"), lpgVar2.a("manufacturer"), lpgVar2.a("fingerprint"), lpgVar2.a("locale"), lpgVar2.a("country"), lpgVar2.a("mcc_mnc"), lpgVar2.a("application_build")));
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                str2 = null;
            } catch (NumberFormatException unused) {
                str2 = (String) entry.getKey();
                numValueOf = null;
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = ((List) entry.getValue()).iterator();
            while (it3.hasNext()) {
                lpg lpgVar3 = (lpg) it3.next();
                d4g d4gVarD = lpgVar3.d();
                j4g j4gVar = d4gVarD.a;
                byte[] bArr = d4gVarD.b;
                Iterator it4 = it2;
                if (j4gVar.equals(new j4g("proto"))) {
                    aVar = new jj1.a();
                    aVar.e = bArr;
                } else {
                    if (j4gVar.equals(new j4g("json"))) {
                        String str3 = new String(bArr, Charset.forName("UTF-8"));
                        jj1.a aVar3 = new jj1.a();
                        aVar3.f = str3;
                        aVar = aVar3;
                    } else {
                        it = it3;
                        String strC = tgt.c("CctTransportBackend");
                        if (Log.isLoggable(strC, 5)) {
                            Log.w(strC, "Received event of unsupported encoding " + j4gVar + ". Skipping...");
                        }
                    }
                    it2 = it4;
                    it3 = it;
                }
                aVar.a = Long.valueOf(lpgVar3.e());
                aVar.d = Long.valueOf(lpgVar3.l());
                String str4 = lpgVar3.b().get("tz-offset");
                aVar.g = Long.valueOf(str4 == null ? 0L : Long.valueOf(str4).longValue());
                aVar.h = new rj1(jmx.b.a.get(lpgVar3.h("net-type")), jmx.a.a.get(lpgVar3.h("mobile-subtype")));
                if (lpgVar3.c() != null) {
                    aVar.b = lpgVar3.c();
                }
                if (lpgVar3.i() != null) {
                    ki1 ki1Var = new ki1(new ji1(lpgVar3.i()));
                    in8.a aVar4 = in8.a.a;
                    aVar.c = new ug1(ki1Var);
                }
                if (lpgVar3.f() != null || lpgVar3.g() != null) {
                    aVar.i = new hi1(lpgVar3.f() != null ? lpgVar3.f() : null, lpgVar3.g() != null ? lpgVar3.g() : null);
                }
                String strConcat = aVar.a == null ? " eventTimeMs" : "";
                if (aVar.d == null) {
                    strConcat = strConcat.concat(" eventUptimeMs");
                }
                if (aVar.g == null) {
                    strConcat = strConcat.concat(" timezoneOffsetSeconds");
                }
                if (!strConcat.isEmpty()) {
                    ib5.a("Missing required properties:".concat(strConcat));
                    return null;
                }
                it = it3;
                arrayList4.add(new jj1(aVar.a.longValue(), aVar.b, aVar.c, aVar.d.longValue(), aVar.e, aVar.f, aVar.g.longValue(), aVar.h, aVar.i));
                it2 = it4;
                it3 = it;
            }
            arrayList3.add(new lj1(jB, jB2, tg1Var, numValueOf, str2, arrayList4));
            i = 0;
        }
        int i3 = 5;
        lg1 lg1Var = new lg1(arrayList3);
        byte[] bArr2 = jg1Var.b;
        hs1.a aVar5 = hs1.a.c;
        URL urlC = this.d;
        if (bArr2 != null) {
            try {
                bm5 bm5VarA = bm5.a(bArr2);
                str = bm5VarA.b;
                if (str == null) {
                    str = null;
                }
                String str5 = bm5VarA.a;
                if (str5 != null) {
                    urlC = c(str5);
                }
            } catch (IllegalArgumentException unused2) {
                return new kg1(aVar5, -1L);
            }
        } else {
            str = null;
        }
        try {
            a aVar6 = new a(urlC, lg1Var, str);
            pu6 pu6Var = new pu6(this);
            do {
                bVarB = pu6Var.b(aVar6);
                URL url = bVarB.b;
                if (url != null) {
                    tgt.a(url, "CctTransportBackend", "Following redirect to: %s");
                    aVar6 = new a(url, aVar6.b, aVar6.c);
                } else {
                    aVar6 = null;
                }
                if (aVar6 == null) {
                    break;
                }
                i3--;
            } while (i3 >= 1);
            int i4 = bVarB.a;
            if (i4 == 200) {
                return new kg1(hs1.a.a, bVarB.c);
            }
            if (i4 < 500 && i4 != 404) {
                return i4 == 400 ? new kg1(hs1.a.d, -1L) : new kg1(aVar5, -1L);
            }
            return new kg1(aVar2, -1L);
        } catch (IOException e) {
            tgt.b("CctTransportBackend", "Could not make request to the backend", e);
            return new kg1(aVar2, -1L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    @Override // defpackage.nug0
    public final fi1 a(fi1 fi1Var) {
        int type;
        int subtype;
        HashMap map;
        String simOperator;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        fi1.a aVarM = fi1Var.m();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = aVarM.f;
        if (map2 == null) {
            ib5.a("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        aVarM.a("model", Build.MODEL);
        aVarM.a("hardware", Build.HARDWARE);
        aVarM.a(LastLoginDeviceInfo.KEY_DEVICE, Build.DEVICE);
        aVarM.a("product", Build.PRODUCT);
        aVarM.a(LhMGMAwwhzjwfz.ReyMumKuL, Build.ID);
        aVarM.a("manufacturer", Build.MANUFACTURER);
        aVarM.a("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = aVarM.f;
        if (map3 == null) {
            ib5.a("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray<jmx.b> sparseArray = jmx.b.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = aVarM.f;
        if (map4 == null) {
            ib5.a("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray<jmx.a> sparseArray2 = jmx.a.a;
                subtype = 100;
            } else if (jmx.a.a.get(subtype) == null) {
            }
            map = aVarM.f;
            if (map != null) {
                ib5.a("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            aVarM.a("country", Locale.getDefault().getCountry());
            aVarM.a("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (simOperator == null) {
                simOperator = "";
            }
            aVarM.a("mcc_mnc", simOperator);
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                tgt.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            aVarM.a("application_build", Integer.toString(i2));
            return aVarM.b();
        }
        SparseArray<jmx.a> sparseArray3 = jmx.a.a;
        subtype = 0;
        map = aVarM.f;
        if (map != null) {
            ib5.a("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        aVarM.a("country", Locale.getDefault().getCountry());
        aVarM.a("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        simOperator = ((TelephonyManager) context2.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        aVarM.a("mcc_mnc", simOperator);
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        aVarM.a("application_build", Integer.toString(i2));
        return aVarM.b();
    }
}
