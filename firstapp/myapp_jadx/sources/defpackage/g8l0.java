package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdd;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class g8l0 implements Runnable {
    public final /* synthetic */ vbl0 a;
    public final /* synthetic */ k8l0 b;

    public g8l0(k8l0 k8l0Var, vbl0 vbl0Var) {
        this.a = vbl0Var;
        this.b = k8l0Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:105:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e3 A[EDGE_INSN: B:108:0x02e3->B:109:0x02e5 BREAK  A[LOOP:1: B:103:0x02c9->B:309:?]] */
    /* JADX WARN: Code duplicated, block: B:110:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:111:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:114:0x0310  */
    /* JADX WARN: Code duplicated, block: B:116:0x0352  */
    /* JADX WARN: Code duplicated, block: B:117:0x035b  */
    /* JADX WARN: Code duplicated, block: B:120:0x037d  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:127:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:130:0x03cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:131:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:134:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:137:0x043b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0443  */
    /* JADX WARN: Code duplicated, block: B:142:0x045b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0470 A[PHI: r28 r29
      0x0470: PHI (r28v3 u4l0) = (r28v0 u4l0), (r28v4 u4l0) binds: [B:141:0x0459, B:139:0x043e] A[DONT_GENERATE, DONT_INLINE]
      0x0470: PHI (r29v3 yol0) = (r29v0 yol0), (r29v4 yol0) binds: [B:141:0x0459, B:139:0x043e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x047e  */
    /* JADX WARN: Code duplicated, block: B:147:0x0480  */
    /* JADX WARN: Code duplicated, block: B:157:0x049f  */
    /* JADX WARN: Code duplicated, block: B:159:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:163:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:166:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x0502  */
    /* JADX WARN: Code duplicated, block: B:171:0x0510 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0526  */
    /* JADX WARN: Code duplicated, block: B:177:0x0534 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0558  */
    /* JADX WARN: Code duplicated, block: B:190:0x056f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0575  */
    /* JADX WARN: Code duplicated, block: B:194:0x0593  */
    /* JADX WARN: Code duplicated, block: B:198:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:201:0x05db  */
    /* JADX WARN: Code duplicated, block: B:206:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:208:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:210:0x0604  */
    /* JADX WARN: Code duplicated, block: B:211:0x060f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0619  */
    /* JADX WARN: Code duplicated, block: B:217:0x062f  */
    /* JADX WARN: Code duplicated, block: B:221:0x063b  */
    /* JADX WARN: Code duplicated, block: B:224:0x0649  */
    /* JADX WARN: Code duplicated, block: B:227:0x065d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0662  */
    /* JADX WARN: Code duplicated, block: B:230:0x0674  */
    /* JADX WARN: Code duplicated, block: B:232:0x0694 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:243:0x070a  */
    /* JADX WARN: Code duplicated, block: B:245:0x0726  */
    /* JADX WARN: Code duplicated, block: B:248:0x0732  */
    /* JADX WARN: Code duplicated, block: B:257:0x077c  */
    /* JADX WARN: Code duplicated, block: B:259:0x0784  */
    /* JADX WARN: Code duplicated, block: B:260:0x0786  */
    /* JADX WARN: Code duplicated, block: B:262:0x078e  */
    /* JADX WARN: Code duplicated, block: B:266:0x079b  */
    /* JADX WARN: Code duplicated, block: B:270:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:272:0x07db  */
    /* JADX WARN: Code duplicated, block: B:274:0x080c  */
    /* JADX WARN: Code duplicated, block: B:277:0x0822  */
    /* JADX WARN: Code duplicated, block: B:281:0x0833  */
    /* JADX WARN: Code duplicated, block: B:302:0x028c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0560 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:? A[LOOP:0: B:183:0x0552->B:306:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:307:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x016c A[Catch: NameNotFoundException -> 0x0189, TryCatch #0 {NameNotFoundException -> 0x0189, blocks: (B:35:0x0161, B:37:0x016c, B:39:0x0178), top: B:290:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0178 A[Catch: NameNotFoundException -> 0x0189, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x0189, blocks: (B:35:0x0161, B:37:0x016c, B:39:0x0178), top: B:290:0x0161 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x017d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:56:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:65:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x0208  */
    /* JADX WARN: Code duplicated, block: B:68:0x0213  */
    /* JADX WARN: Code duplicated, block: B:69:0x021e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0236  */
    /* JADX WARN: Code duplicated, block: B:74:0x0237  */
    /* JADX WARN: Code duplicated, block: B:77:0x023c A[Catch: IllegalStateException -> 0x024c, TRY_LEAVE, TryCatch #4 {IllegalStateException -> 0x024c, blocks: (B:71:0x022a, B:75:0x0238, B:77:0x023c), top: B:298:0x022a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x026d  */
    /* JADX WARN: Code duplicated, block: B:85:0x027b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0282  */
    /* JADX WARN: Code duplicated, block: B:92:0x029c  */
    /* JADX WARN: Code duplicated, block: B:93:0x029e A[Catch: NotFoundException -> 0x02a3, TRY_LEAVE, TryCatch #6 {NotFoundException -> 0x02a3, blocks: (B:90:0x028c, B:93:0x029e), top: B:302:0x028c }] */
    /* JADX WARN: Code duplicated, block: B:99:0x02b4  */
    /* JADX WARN: Type inference failed for: r0v41, types: [ffl0] */
    @Override // java.lang.Runnable
    public final void run() {
        b4l0 b4l0Var;
        String str;
        String string;
        int i;
        String str2;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int iG;
        k8l0 k8l0Var;
        Bundle bundleR;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        agl0 agl0Var;
        k8l0 k8l0Var2;
        u4l0 u4l0Var;
        u4l0 u4l0Var2;
        u4l0 u4l0Var3;
        u4l0 u4l0Var4;
        String strM;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final nfl0 nfl0Var;
        int iL;
        boolean zQ;
        boolean z;
        boolean z2;
        h6l0 h6l0Var;
        jbl0 jbl0VarN;
        int i3;
        dbl0 dbl0VarV;
        dbl0 dbl0VarV2;
        dbl0 dbl0Var;
        hbl0 hbl0Var;
        u4l0 u4l0Var5;
        yol0 yol0Var;
        jbl0 jbl0Var;
        jbl0 jbl0Var2;
        k8l0 k8l0Var3;
        dbl0 dbl0VarV3;
        dbl0 dbl0VarV4;
        Bundle bundle;
        crk0 crk0VarC;
        Iterator it;
        Boolean boolS;
        d6l0 d6l0Var;
        utl0 utl0Var;
        k8l0 k8l0Var4;
        yol0 yol0Var2;
        h6l0 h6l0Var2;
        y4l0 y4l0Var;
        boolean zF;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        zbl0 zbl0Var;
        u4l0 u4l0Var6;
        Context context;
        boolean z3;
        Iterator it2;
        String str3;
        yol0 yol0Var3;
        String strA;
        k8l0 k8l0Var5 = this.b;
        p7l0 p7l0Var = k8l0Var5.g;
        y4l0 y4l0Var2 = k8l0Var5.f;
        j6l0 j6l0Var = k8l0Var5.e;
        yol0 yol0Var4 = k8l0Var5.i;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        wok0 wok0Var = k8l0Var5.d;
        wok0Var.a.getClass();
        fsk0 fsk0Var = new fsk0(k8l0Var5);
        fsk0Var.a.A++;
        fsk0Var.j();
        k8l0Var5.s = fsk0Var;
        vbl0 vbl0Var = this.a;
        zzdd zzddVar = vbl0Var.d;
        b4l0 b4l0Var2 = new b4l0(k8l0Var5, vbl0Var.c, zzddVar == null ? 0L : zzddVar.a);
        b4l0Var2.i();
        k8l0Var5.t = b4l0Var2;
        h4l0 h4l0Var = new h4l0(k8l0Var5);
        h4l0Var.i();
        k8l0Var5.q = h4l0Var;
        ikl0 ikl0Var = new ikl0(k8l0Var5);
        ikl0Var.i();
        k8l0Var5.r = ikl0Var;
        boolean z4 = yol0Var4.b;
        k8l0 k8l0Var6 = yol0Var4.a;
        if (z4) {
            ib5.a("Can't initialize twice");
            return;
        }
        yol0Var4.g();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                y4l0 y4l0Var3 = yol0Var4.a.f;
                k8l0.m(y4l0Var3);
                y4l0Var3.i.a("Utils falling back to Random for random id");
            }
        }
        yol0Var4.d.set(jNextLong);
        k8l0Var6.C.incrementAndGet();
        yol0Var4.b = true;
        if (j6l0Var.b) {
            ib5.a("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = j6l0Var.a.a.getSharedPreferences(oAudzpbdOhCI.vsOcuvvagmqwbdf, 0);
        j6l0Var.c = sharedPreferences2;
        boolean z5 = sharedPreferences2.getBoolean("has_been_opened", false);
        j6l0Var.r = z5;
        if (!z5) {
            SharedPreferences.Editor editorEdit = j6l0Var.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        j6l0Var.e = new f6l0(j6l0Var, Math.max(0L, ((Long) v2l0.d.a(null)).longValue()));
        j6l0Var.a.C.incrementAndGet();
        j6l0Var.b = true;
        b4l0 b4l0Var3 = k8l0Var5.t;
        if (b4l0Var3.b) {
            ib5.a("Can't initialize twice");
            return;
        }
        k8l0 k8l0Var7 = b4l0Var3.a;
        y4l0 y4l0Var4 = k8l0Var7.f;
        y4l0 y4l0Var5 = k8l0Var7.f;
        k8l0.m(y4l0Var4);
        y4l0Var4.n.c(Long.valueOf(b4l0Var3.j), "sdkVersion bundled with app, dynamiteVersion", Long.valueOf(b4l0Var3.i));
        Context context2 = k8l0Var7.a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str4 = "";
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                b4l0Var = b4l0Var2;
                str = "Can't initialize twice";
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.f.b(y4l0.k(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str2 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str2;
                                    k8l0.m(y4l0Var5);
                                    y4l0Var5.f.c(y4l0.k(packageName), "Error retrieving package info. appId, appName", string);
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        String str7 = installerPackageName;
                        b4l0Var3.c = packageName;
                        b4l0Var3.f = str7;
                        b4l0Var3.d = str2;
                        b4l0Var3.e = i;
                        b4l0Var3.g = string;
                        b4l0Var3.h = 0L;
                        iG = k8l0Var7.g();
                        if (iG == 0) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.n.a("App measurement collection enabled");
                        } else if (iG == 1) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement deactivated via the manifest");
                        } else if (iG == 3) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iG == 4) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement disabled via the manifest");
                        } else if (iG == 6) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iG == 7) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement disabled via the global data collection setting");
                        } else if (iG != 8) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement disabled");
                            k8l0.m(y4l0Var5);
                            y4l0Var5.g.a("Invalid scion state in identity");
                        } else {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.l.a("App measurement disabled due to denied storage consent");
                        }
                        b4l0Var3.n = "";
                        strA = ggl0.a(context2, k8l0Var7.p);
                        if (!TextUtils.isEmpty(strA)) {
                            str4 = strA;
                        }
                        b4l0Var3.n = str4;
                        if (iG == 0) {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.n.c(b4l0Var3.c, "App measurement enabled for app package, google app id", b4l0Var3.n);
                        }
                        b4l0Var3.k = null;
                        wok0 wok0Var2 = k8l0Var7.d;
                        k8l0Var = wok0Var2.a;
                        hm20.e("analytics.safelisted_events");
                        bundleR = wok0Var2.r();
                        if (bundleR != null) {
                            if (bundleR.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleR.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    y4l0 y4l0Var6 = k8l0Var.f;
                                    k8l0.m(y4l0Var6);
                                    y4l0Var6.f.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                b4l0Var3.k = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it2 = listAsList.iterator();
                                do {
                                    if (it2.hasNext()) {
                                        b4l0Var3.k = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it2.next();
                                        yol0Var3 = k8l0Var7.i;
                                        k8l0.k(yol0Var3);
                                    }
                                } while (yol0Var3.i0("safelisted event", str3));
                            } else {
                                k8l0.m(y4l0Var5);
                                y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                b4l0Var3.m = bon.a(context2) ? 1 : 0;
                            } else {
                                b4l0Var3.m = 0;
                            }
                            b4l0Var3.a.C.incrementAndGet();
                            b4l0Var3.b = true;
                            agl0Var = new agl0(k8l0Var5);
                            k8l0Var2 = agl0Var.a;
                            k8l0Var2.A++;
                            agl0Var.i();
                            k8l0Var5.u = agl0Var;
                            if (!agl0Var.b) {
                                ib5.a(str);
                                return;
                            }
                            agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
                            k8l0Var2.C.incrementAndGet();
                            agl0Var.b = true;
                            k8l0.m(y4l0Var2);
                            u4l0Var = y4l0Var2.m;
                            u4l0Var2 = y4l0Var2.l;
                            u4l0Var3 = y4l0Var2.n;
                            u4l0Var4 = y4l0Var2.f;
                            wok0Var.l();
                            u4l0Var2.b(133005L, "App measurement initialized, version");
                            k8l0.m(y4l0Var2);
                            u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM = b4l0Var.m();
                            if (yol0Var4.H(strM, wok0Var.c)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                k8l0.m(y4l0Var2);
                                u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                            }
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("Debug-level message logging enabled");
                            i2 = k8l0Var5.A;
                            atomicInteger = k8l0Var5.C;
                            if (i2 != atomicInteger.get()) {
                                k8l0.m(y4l0Var2);
                                u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                            }
                            k8l0Var5.v = true;
                            j = k8l0Var5.D;
                            nfl0Var = k8l0Var5.m;
                            k8l0.m(p7l0Var);
                            p7l0Var.g();
                            k8l0.j(k8l0Var5.u);
                            iL = k8l0Var5.u.l();
                            kql0.a();
                            zQ = wok0Var.q(null, v2l0.Q0);
                            if (iL == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zQ) {
                                yol0Var4.g();
                                if (yol0Var4.C() == 1) {
                                    z2 = z;
                                } else if (z) {
                                    z2 = true;
                                }
                                yol0Var4.g();
                                IntentFilter intentFilter = new IntentFilter();
                                intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z3 = z2;
                                o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter);
                                y4l0 y4l0Var7 = k8l0Var6.f;
                                k8l0.m(y4l0Var7);
                                y4l0Var7.m.a("Registered app receiver");
                                if (z3) {
                                    k8l0.j(k8l0Var5.u);
                                    k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z2 = true;
                                yol0Var4.g();
                                IntentFilter intentFilter2 = new IntentFilter();
                                intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z3 = z2;
                                o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter2);
                                y4l0 y4l0Var8 = k8l0Var6.f;
                                k8l0.m(y4l0Var8);
                                y4l0Var8.m.a("Registered app receiver");
                                if (z3) {
                                    k8l0.j(k8l0Var5.u);
                                    k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                                }
                            }
                            h6l0Var = j6l0Var.g;
                            jbl0VarN = j6l0Var.n();
                            i3 = jbl0VarN.b;
                            dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
                            dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
                            dbl0Var = dbl0.UNINITIALIZED;
                            hbl0Var = hbl0.ANALYTICS_STORAGE;
                            if (dbl0VarV == dbl0Var || dbl0VarV2 != dbl0Var) {
                                u4l0Var5 = u4l0Var4;
                                yol0Var = yol0Var4;
                                if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(hbl0.class);
                                    enumMap.put(hbl0.AD_STORAGE, dbl0VarV);
                                    enumMap.put(hbl0Var, dbl0VarV2);
                                    jbl0Var = new jbl0(enumMap, -10);
                                }
                                if (jbl0Var != null) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.C(jbl0Var, true);
                                    jbl0Var2 = jbl0Var;
                                } else {
                                    jbl0Var2 = jbl0VarN;
                                }
                                k8l0.l(nfl0Var);
                                k8l0Var3 = nfl0Var.a;
                                nfl0Var.k(jbl0Var2);
                                j6l0Var.g();
                                int i4 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                                if (dbl0VarV3 != dbl0Var) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                                }
                                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                                if (dbl0VarV4 == dbl0Var && jbl0.l(-10, i4)) {
                                    k8l0.l(nfl0Var);
                                    EnumMap enumMap2 = new EnumMap(hbl0.class);
                                    enumMap2.put(hbl0.AD_USER_DATA, dbl0VarV4);
                                    nfl0Var.B(new crk0(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n()) && (i4 == 0 || i4 == 30)) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(new crk0((Boolean) null, -10, (Boolean) null, (String) null), true);
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n()) && zzddVar != null && (bundle = zzddVar.d) != null && jbl0.l(30, i4)) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                                if (boolS != null || boolS.booleanValue()) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var.a("TCF client enabled.");
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    y4l0 y4l0Var9 = k8l0Var3.f;
                                    k8l0.m(y4l0Var9);
                                    y4l0Var9.m.a("Register tcfPrefChangeListener.");
                                    if (nfl0Var.u == null) {
                                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                nfl0 nfl0Var2 = nfl0Var;
                                                k8l0 k8l0Var8 = nfl0Var2.a;
                                                wok0 wok0Var3 = k8l0Var8.d;
                                                y4l0 y4l0Var10 = k8l0Var8.f;
                                                if (!wok0Var3.q(null, v2l0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        k8l0.m(y4l0Var10);
                                                        y4l0Var10.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var = nfl0Var2.v;
                                                        hm20.h(vcl0Var);
                                                        vcl0Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    k8l0.m(y4l0Var10);
                                                    y4l0Var10.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                                    hm20.h(vcl0Var2);
                                                    vcl0Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    j6l0 j6l0Var2 = k8l0Var3.e;
                                    k8l0.k(j6l0Var2);
                                    j6l0Var2.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                    k8l0.l(nfl0Var);
                                    nfl0Var.m();
                                }
                                d6l0Var = j6l0Var.f;
                                if (d6l0Var.a() == 0) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                    d6l0Var.b(j);
                                }
                                k8l0.l(nfl0Var);
                                utl0Var = nfl0Var.r;
                                if (utl0Var.c() && utl0Var.b()) {
                                    j6l0 j6l0Var3 = utl0Var.a.e;
                                    k8l0.k(j6l0Var3);
                                    j6l0Var3.w.b(null);
                                }
                                if (k8l0Var5.h()) {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        h6l0Var2 = h6l0Var;
                                    } else {
                                        String strN = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        String string2 = j6l0Var.k().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            h6l0Var2 = h6l0Var;
                                        } else {
                                            hm20.h(strN);
                                            if (strN.equals(string2)) {
                                                h6l0Var2 = h6l0Var;
                                            } else {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var2.a("Rechecking which service to use due to a GMP App Id change");
                                                j6l0Var.g();
                                                j6l0Var.g();
                                                Boolean boolValueOf = j6l0Var.k().contains("measurement_enabled") ? Boolean.valueOf(j6l0Var.k().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = j6l0Var.k().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    j6l0Var.g();
                                                    SharedPreferences.Editor editorEdit3 = j6l0Var.k().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                k8l0Var4.n().k();
                                                k8l0Var4.r.o();
                                                k8l0Var4.r.m();
                                                d6l0Var.b(j);
                                                h6l0Var2 = h6l0Var;
                                                h6l0Var2.b(null);
                                            }
                                        }
                                        String strN2 = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        SharedPreferences.Editor editorEdit4 = j6l0Var.k().edit();
                                        editorEdit4.putString("gmp_app_id", strN2);
                                        editorEdit4.apply();
                                    }
                                    if (!j6l0Var.n().i(hbl0Var)) {
                                        h6l0Var2.b(null);
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g.set(h6l0Var2.a());
                                    try {
                                        k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        h6l0 h6l0Var3 = j6l0Var.v;
                                        if (!TextUtils.isEmpty(h6l0Var3.a())) {
                                            k8l0.m(y4l0Var2);
                                            y4l0Var = y4l0Var2;
                                            y4l0Var.i.a("Remote config removed with active feature rollouts");
                                            h6l0Var3.b(null);
                                        }
                                        if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                            zF = k8l0Var4.f();
                                            sharedPreferences = j6l0Var.c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                j6l0Var.p(!zF);
                                            }
                                            if (zF) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.s();
                                            }
                                            wll0 wll0Var = k8l0Var4.h;
                                            k8l0.l(wll0Var);
                                            wll0Var.e.a();
                                            k8l0Var4.o().k(new AtomicReference());
                                            k8l0Var4.o().l(j6l0Var.y.a());
                                        }
                                        kql0.a();
                                        if (wok0Var.q(null, v2l0.Q0)) {
                                            yol0Var2.g();
                                            if (yol0Var2.C() == 1) {
                                                long jIntValue = ((Integer) v2l0.x0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                k8l0Var4.k.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    k8l0.m(y4l0Var);
                                                    u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                k8l0.l(nfl0Var);
                                                nfl0Var.g();
                                                zbl0Var = nfl0Var.l;
                                                if (zbl0Var == null) {
                                                    zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                                    nfl0Var.l = zbl0Var;
                                                }
                                                zbl0Var.b(jMax);
                                            }
                                        }
                                        j6l0Var.o.b(true);
                                    }
                                    y4l0Var = y4l0Var2;
                                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        zF = k8l0Var4.f();
                                        sharedPreferences = j6l0Var.c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !wok0Var.t()) {
                                            j6l0Var.p(!zF);
                                        }
                                        if (zF) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.s();
                                        }
                                        wll0 wll0Var2 = k8l0Var4.h;
                                        k8l0.l(wll0Var2);
                                        wll0Var2.e.a();
                                        k8l0Var4.o().k(new AtomicReference());
                                        k8l0Var4.o().l(j6l0Var.y.a());
                                    }
                                } else {
                                    if (k8l0Var5.f()) {
                                        yol0Var2 = yol0Var;
                                        if (yol0Var2.E("android.permission.INTERNET")) {
                                            u4l0Var6 = u4l0Var5;
                                        } else {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6 = u4l0Var5;
                                            u4l0Var6.a("App is missing INTERNET permission");
                                        }
                                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        k8l0Var4 = k8l0Var5;
                                        context = k8l0Var4.a;
                                        if (!r7k0.a(context).c() && !wok0Var.j()) {
                                            if (!yol0.X(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!yol0.z(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        k8l0Var4 = k8l0Var5;
                                        yol0Var2 = yol0Var;
                                    }
                                    y4l0Var = y4l0Var2;
                                }
                                kql0.a();
                                if (wok0Var.q(null, v2l0.Q0)) {
                                    yol0Var2.g();
                                    if (yol0Var2.C() == 1) {
                                        long jIntValue2 = ((Integer) v2l0.x0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        k8l0Var4.k.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            k8l0.m(y4l0Var);
                                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g();
                                        zbl0Var = nfl0Var.l;
                                        if (zbl0Var == null) {
                                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                            nfl0Var.l = zbl0Var;
                                        }
                                        zbl0Var.b(jMax);
                                    }
                                }
                                j6l0Var.o.b(true);
                            }
                            u4l0Var5 = u4l0Var4;
                            yol0Var = yol0Var4;
                            if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (i3 == 0 && i3 != 30 && i3 != 10 && i3 != 40) {
                                    jbl0Var = null;
                                    if (jbl0Var != null) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.C(jbl0Var, true);
                                        jbl0Var2 = jbl0Var;
                                    } else {
                                        jbl0Var2 = jbl0VarN;
                                    }
                                    k8l0.l(nfl0Var);
                                    k8l0Var3 = nfl0Var.a;
                                    nfl0Var.k(jbl0Var2);
                                    j6l0Var.g();
                                    int i5 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                                    dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                                    if (dbl0VarV3 != dbl0Var) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                                    }
                                    dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                                    if (dbl0VarV4 == dbl0Var) {
                                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                                crk0VarC = crk0.c(30, bundle);
                                                it = crk0VarC.e.values().iterator();
                                                while (it.hasNext()) {
                                                    if (((dbl0) it.next()) != dbl0Var) {
                                                        k8l0.l(nfl0Var);
                                                        nfl0Var.B(crk0VarC, true);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                            crk0VarC = crk0.c(30, bundle);
                                            it = crk0VarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((dbl0) it.next()) != dbl0Var) {
                                                    k8l0.l(nfl0Var);
                                                    nfl0Var.B(crk0VarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                            crk0VarC = crk0.c(30, bundle);
                                            it = crk0VarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((dbl0) it.next()) != dbl0Var) {
                                                    k8l0.l(nfl0Var);
                                                    nfl0Var.B(crk0VarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                    boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                                    if (boolS != null) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var.a("TCF client enabled.");
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g();
                                        y4l0 y4l0Var10 = k8l0Var3.f;
                                        k8l0.m(y4l0Var10);
                                        y4l0Var10.m.a("Register tcfPrefChangeListener.");
                                        if (nfl0Var.u == null) {
                                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    nfl0 nfl0Var2 = nfl0Var;
                                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                                    wok0 wok0Var3 = k8l0Var8.d;
                                                    y4l0 y4l0Var11 = k8l0Var8.f;
                                                    if (!wok0Var3.q(null, v2l0.Z0)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            k8l0.m(y4l0Var11);
                                                            y4l0Var11.n.a("IABTCF_TCString change picked up in listener.");
                                                            vcl0 vcl0Var = nfl0Var2.v;
                                                            hm20.h(vcl0Var);
                                                            vcl0Var.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        k8l0.m(y4l0Var11);
                                                        y4l0Var11.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                                        hm20.h(vcl0Var2);
                                                        vcl0Var2.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        j6l0 j6l0Var4 = k8l0Var3.e;
                                        k8l0.k(j6l0Var4);
                                        j6l0Var4.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                        k8l0.l(nfl0Var);
                                        nfl0Var.m();
                                    } else {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var.a("TCF client enabled.");
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g();
                                        y4l0 y4l0Var11 = k8l0Var3.f;
                                        k8l0.m(y4l0Var11);
                                        y4l0Var11.m.a("Register tcfPrefChangeListener.");
                                        if (nfl0Var.u == null) {
                                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                    nfl0 nfl0Var2 = nfl0Var;
                                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                                    wok0 wok0Var3 = k8l0Var8.d;
                                                    y4l0 y4l0Var12 = k8l0Var8.f;
                                                    if (!wok0Var3.q(null, v2l0.Z0)) {
                                                        if (Objects.equals(str8, "IABTCF_TCString")) {
                                                            k8l0.m(y4l0Var12);
                                                            y4l0Var12.n.a("IABTCF_TCString change picked up in listener.");
                                                            vcl0 vcl0Var = nfl0Var2.v;
                                                            hm20.h(vcl0Var);
                                                            vcl0Var.b(500L);
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                        k8l0.m(y4l0Var12);
                                                        y4l0Var12.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                                        hm20.h(vcl0Var2);
                                                        vcl0Var2.b(500L);
                                                    }
                                                }
                                            };
                                        }
                                        j6l0 j6l0Var5 = k8l0Var3.e;
                                        k8l0.k(j6l0Var5);
                                        j6l0Var5.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                        k8l0.l(nfl0Var);
                                        nfl0Var.m();
                                    }
                                    d6l0Var = j6l0Var.f;
                                    if (d6l0Var.a() == 0) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                        d6l0Var.b(j);
                                    }
                                    k8l0.l(nfl0Var);
                                    utl0Var = nfl0Var.r;
                                    if (utl0Var.c()) {
                                        j6l0 j6l0Var6 = utl0Var.a.e;
                                        k8l0.k(j6l0Var6);
                                        j6l0Var6.w.b(null);
                                    }
                                    if (k8l0Var5.h()) {
                                        if (k8l0Var5.f()) {
                                            yol0Var2 = yol0Var;
                                            if (yol0Var2.E("android.permission.INTERNET")) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6 = u4l0Var5;
                                                u4l0Var6.a("App is missing INTERNET permission");
                                            } else {
                                                u4l0Var6 = u4l0Var5;
                                            }
                                            if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                            }
                                            k8l0Var4 = k8l0Var5;
                                            context = k8l0Var4.a;
                                            if (!r7k0.a(context).c()) {
                                                if (!yol0.X(context)) {
                                                    k8l0.m(y4l0Var2);
                                                    u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                                }
                                                if (!yol0.z(context)) {
                                                    k8l0.m(y4l0Var2);
                                                    u4l0Var6.a("AppMeasurementService not registered/enabled");
                                                }
                                            }
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                        } else {
                                            k8l0Var4 = k8l0Var5;
                                            yol0Var2 = yol0Var;
                                        }
                                        y4l0Var = y4l0Var2;
                                    } else {
                                        k8l0Var4 = k8l0Var5;
                                        yol0Var2 = yol0Var;
                                        if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                            String strN3 = k8l0Var4.q().n();
                                            j6l0Var.g();
                                            String string3 = j6l0Var.k().getString("gmp_app_id", null);
                                            zIsEmpty = TextUtils.isEmpty(strN3);
                                            boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                            if (zIsEmpty) {
                                                h6l0Var2 = h6l0Var;
                                            } else {
                                                h6l0Var2 = h6l0Var;
                                            }
                                            String strN4 = k8l0Var4.q().n();
                                            j6l0Var.g();
                                            SharedPreferences.Editor editorEdit5 = j6l0Var.k().edit();
                                            editorEdit5.putString("gmp_app_id", strN4);
                                            editorEdit5.apply();
                                        } else {
                                            h6l0Var2 = h6l0Var;
                                        }
                                        if (!j6l0Var.n().i(hbl0Var)) {
                                            h6l0Var2.b(null);
                                        }
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g.set(h6l0Var2.a());
                                        k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                        y4l0Var = y4l0Var2;
                                        if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                            zF = k8l0Var4.f();
                                            sharedPreferences = j6l0Var.c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                j6l0Var.p(!zF);
                                            }
                                            if (zF) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.s();
                                            }
                                            wll0 wll0Var3 = k8l0Var4.h;
                                            k8l0.l(wll0Var3);
                                            wll0Var3.e.a();
                                            k8l0Var4.o().k(new AtomicReference());
                                            k8l0Var4.o().l(j6l0Var.y.a());
                                        }
                                    }
                                    kql0.a();
                                    if (wok0Var.q(null, v2l0.Q0)) {
                                        yol0Var2.g();
                                        if (yol0Var2.C() == 1) {
                                            long jIntValue3 = ((Integer) v2l0.x0.a(null)).intValue();
                                            long jNextInt3 = new Random().nextInt(5000);
                                            k8l0Var4.k.getClass();
                                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                            if (jMax > 500) {
                                                k8l0.m(y4l0Var);
                                                u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                            }
                                            k8l0.l(nfl0Var);
                                            nfl0Var.g();
                                            zbl0Var = nfl0Var.l;
                                            if (zbl0Var == null) {
                                                zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                                nfl0Var.l = zbl0Var;
                                            }
                                            zbl0Var.b(jMax);
                                        }
                                    }
                                    j6l0Var.o.b(true);
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.C(new jbl0(-10), false);
                            }
                            jbl0Var = null;
                            if (jbl0Var != null) {
                                k8l0.l(nfl0Var);
                                nfl0Var.C(jbl0Var, true);
                                jbl0Var2 = jbl0Var;
                            } else {
                                jbl0Var2 = jbl0VarN;
                            }
                            k8l0.l(nfl0Var);
                            k8l0Var3 = nfl0Var.a;
                            nfl0Var.k(jbl0Var2);
                            j6l0Var.g();
                            int i6 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                            dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                            if (dbl0VarV3 != dbl0Var) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                            }
                            dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                            if (dbl0VarV4 == dbl0Var) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                            boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                            if (boolS != null) {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var12 = k8l0Var3.f;
                                k8l0.m(y4l0Var12);
                                y4l0Var12.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var3 = k8l0Var8.d;
                                            y4l0 y4l0Var13 = k8l0Var8.f;
                                            if (!wok0Var3.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var13);
                                                    y4l0Var13.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var13);
                                                y4l0Var13.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var7 = k8l0Var3.e;
                                k8l0.k(j6l0Var7);
                                j6l0Var7.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            } else {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var13 = k8l0Var3.f;
                                k8l0.m(y4l0Var13);
                                y4l0Var13.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var3 = k8l0Var8.d;
                                            y4l0 y4l0Var14 = k8l0Var8.f;
                                            if (!wok0Var3.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str8, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var14);
                                                    y4l0Var14.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var14);
                                                y4l0Var14.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var8 = k8l0Var3.e;
                                k8l0.k(j6l0Var8);
                                j6l0Var8.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            }
                            d6l0Var = j6l0Var.f;
                            if (d6l0Var.a() == 0) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                d6l0Var.b(j);
                            }
                            k8l0.l(nfl0Var);
                            utl0Var = nfl0Var.r;
                            if (utl0Var.c()) {
                                j6l0 j6l0Var9 = utl0Var.a.e;
                                k8l0.k(j6l0Var9);
                                j6l0Var9.w.b(null);
                            }
                            if (k8l0Var5.h()) {
                                if (k8l0Var5.f()) {
                                    yol0Var2 = yol0Var;
                                    if (yol0Var2.E("android.permission.INTERNET")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6 = u4l0Var5;
                                        u4l0Var6.a("App is missing INTERNET permission");
                                    } else {
                                        u4l0Var6 = u4l0Var5;
                                    }
                                    if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    k8l0Var4 = k8l0Var5;
                                    context = k8l0Var4.a;
                                    if (!r7k0.a(context).c()) {
                                        if (!yol0.X(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!yol0.z(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                }
                                y4l0Var = y4l0Var2;
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                                if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    String strN5 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    String string4 = j6l0Var.k().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN5);
                                    boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                    if (zIsEmpty) {
                                        h6l0Var2 = h6l0Var;
                                    } else {
                                        h6l0Var2 = h6l0Var;
                                    }
                                    String strN6 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    SharedPreferences.Editor editorEdit6 = j6l0Var.k().edit();
                                    editorEdit6.putString("gmp_app_id", strN6);
                                    editorEdit6.apply();
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                if (!j6l0Var.n().i(hbl0Var)) {
                                    h6l0Var2.b(null);
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g.set(h6l0Var2.a());
                                k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                y4l0Var = y4l0Var2;
                                if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    zF = k8l0Var4.f();
                                    sharedPreferences = j6l0Var.c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        j6l0Var.p(!zF);
                                    }
                                    if (zF) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.s();
                                    }
                                    wll0 wll0Var4 = k8l0Var4.h;
                                    k8l0.l(wll0Var4);
                                    wll0Var4.e.a();
                                    k8l0Var4.o().k(new AtomicReference());
                                    k8l0Var4.o().l(j6l0Var.y.a());
                                }
                            }
                            kql0.a();
                            if (wok0Var.q(null, v2l0.Q0)) {
                                yol0Var2.g();
                                if (yol0Var2.C() == 1) {
                                    long jIntValue4 = ((Integer) v2l0.x0.a(null)).intValue();
                                    long jNextInt4 = new Random().nextInt(5000);
                                    k8l0Var4.k.getClass();
                                    jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        k8l0.m(y4l0Var);
                                        u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    zbl0Var = nfl0Var.l;
                                    if (zbl0Var == null) {
                                        zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                        nfl0Var.l = zbl0Var;
                                    }
                                    zbl0Var.b(jMax);
                                }
                            }
                            j6l0Var.o.b(true);
                        }
                        y4l0 y4l0Var14 = k8l0Var.f;
                        k8l0.m(y4l0Var14);
                        y4l0Var14.f.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            b4l0Var3.k = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it2 = listAsList.iterator();
                            do {
                                if (it2.hasNext()) {
                                    b4l0Var3.k = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it2.next();
                                    yol0Var3 = k8l0Var7.i;
                                    k8l0.k(yol0Var3);
                                }
                            } while (yol0Var3.i0("safelisted event", str3));
                        } else {
                            k8l0.m(y4l0Var5);
                            y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            b4l0Var3.m = bon.a(context2) ? 1 : 0;
                        } else {
                            b4l0Var3.m = 0;
                        }
                        b4l0Var3.a.C.incrementAndGet();
                        b4l0Var3.b = true;
                        agl0Var = new agl0(k8l0Var5);
                        k8l0Var2 = agl0Var.a;
                        k8l0Var2.A++;
                        agl0Var.i();
                        k8l0Var5.u = agl0Var;
                        if (!agl0Var.b) {
                            ib5.a(str);
                            return;
                        }
                        agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
                        k8l0Var2.C.incrementAndGet();
                        agl0Var.b = true;
                        k8l0.m(y4l0Var2);
                        u4l0Var = y4l0Var2.m;
                        u4l0Var2 = y4l0Var2.l;
                        u4l0Var3 = y4l0Var2.n;
                        u4l0Var4 = y4l0Var2.f;
                        wok0Var.l();
                        u4l0Var2.b(133005L, "App measurement initialized, version");
                        k8l0.m(y4l0Var2);
                        u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM = b4l0Var.m();
                        if (yol0Var4.H(strM, wok0Var.c)) {
                            k8l0.m(y4l0Var2);
                            u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            k8l0.m(y4l0Var2);
                            u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                        }
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("Debug-level message logging enabled");
                        i2 = k8l0Var5.A;
                        atomicInteger = k8l0Var5.C;
                        if (i2 != atomicInteger.get()) {
                            k8l0.m(y4l0Var2);
                            u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                        }
                        k8l0Var5.v = true;
                        j = k8l0Var5.D;
                        nfl0Var = k8l0Var5.m;
                        k8l0.m(p7l0Var);
                        p7l0Var.g();
                        k8l0.j(k8l0Var5.u);
                        iL = k8l0Var5.u.l();
                        kql0.a();
                        zQ = wok0Var.q(null, v2l0.Q0);
                        if (iL == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zQ) {
                            yol0Var4.g();
                            if (yol0Var4.C() == 1) {
                                z2 = z;
                            } else if (z) {
                                z2 = true;
                            }
                            yol0Var4.g();
                            IntentFilter intentFilter3 = new IntentFilter();
                            intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z3 = z2;
                            o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter3);
                            y4l0 y4l0Var15 = k8l0Var6.f;
                            k8l0.m(y4l0Var15);
                            y4l0Var15.m.a("Registered app receiver");
                            if (z3) {
                                k8l0.j(k8l0Var5.u);
                                k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z2 = true;
                            yol0Var4.g();
                            IntentFilter intentFilter4 = new IntentFilter();
                            intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z3 = z2;
                            o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter4);
                            y4l0 y4l0Var16 = k8l0Var6.f;
                            k8l0.m(y4l0Var16);
                            y4l0Var16.m.a("Registered app receiver");
                            if (z3) {
                                k8l0.j(k8l0Var5.u);
                                k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                            }
                        }
                        h6l0Var = j6l0Var.g;
                        jbl0VarN = j6l0Var.n();
                        i3 = jbl0VarN.b;
                        dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
                        dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
                        dbl0Var = dbl0.UNINITIALIZED;
                        hbl0Var = hbl0.ANALYTICS_STORAGE;
                        if (dbl0VarV == dbl0Var) {
                            u4l0Var5 = u4l0Var4;
                            yol0Var = yol0Var4;
                            if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                                if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (i3 == 0) {
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.C(new jbl0(-10), false);
                                }
                                jbl0Var = null;
                                if (jbl0Var != null) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.C(jbl0Var, true);
                                    jbl0Var2 = jbl0Var;
                                } else {
                                    jbl0Var2 = jbl0VarN;
                                }
                                k8l0.l(nfl0Var);
                                k8l0Var3 = nfl0Var.a;
                                nfl0Var.k(jbl0Var2);
                                j6l0Var.g();
                                int i7 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                                if (dbl0VarV3 != dbl0Var) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                                }
                                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                                if (dbl0VarV4 == dbl0Var) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                            crk0VarC = crk0.c(30, bundle);
                                            it = crk0VarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((dbl0) it.next()) != dbl0Var) {
                                                    k8l0.l(nfl0Var);
                                                    nfl0Var.B(crk0VarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                                if (boolS != null) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var.a("TCF client enabled.");
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    y4l0 y4l0Var17 = k8l0Var3.f;
                                    k8l0.m(y4l0Var17);
                                    y4l0Var17.m.a("Register tcfPrefChangeListener.");
                                    if (nfl0Var.u == null) {
                                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                nfl0 nfl0Var2 = nfl0Var;
                                                k8l0 k8l0Var8 = nfl0Var2.a;
                                                wok0 wok0Var3 = k8l0Var8.d;
                                                y4l0 y4l0Var18 = k8l0Var8.f;
                                                if (!wok0Var3.q(null, v2l0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        k8l0.m(y4l0Var18);
                                                        y4l0Var18.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var = nfl0Var2.v;
                                                        hm20.h(vcl0Var);
                                                        vcl0Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    k8l0.m(y4l0Var18);
                                                    y4l0Var18.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                                    hm20.h(vcl0Var2);
                                                    vcl0Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    j6l0 j6l0Var10 = k8l0Var3.e;
                                    k8l0.k(j6l0Var10);
                                    j6l0Var10.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                    k8l0.l(nfl0Var);
                                    nfl0Var.m();
                                } else {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var.a("TCF client enabled.");
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    y4l0 y4l0Var18 = k8l0Var3.f;
                                    k8l0.m(y4l0Var18);
                                    y4l0Var18.m.a("Register tcfPrefChangeListener.");
                                    if (nfl0Var.u == null) {
                                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                nfl0 nfl0Var2 = nfl0Var;
                                                k8l0 k8l0Var8 = nfl0Var2.a;
                                                wok0 wok0Var3 = k8l0Var8.d;
                                                y4l0 y4l0Var19 = k8l0Var8.f;
                                                if (!wok0Var3.q(null, v2l0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        k8l0.m(y4l0Var19);
                                                        y4l0Var19.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var = nfl0Var2.v;
                                                        hm20.h(vcl0Var);
                                                        vcl0Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    k8l0.m(y4l0Var19);
                                                    y4l0Var19.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                                    hm20.h(vcl0Var2);
                                                    vcl0Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    j6l0 j6l0Var11 = k8l0Var3.e;
                                    k8l0.k(j6l0Var11);
                                    j6l0Var11.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                    k8l0.l(nfl0Var);
                                    nfl0Var.m();
                                }
                                d6l0Var = j6l0Var.f;
                                if (d6l0Var.a() == 0) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                    d6l0Var.b(j);
                                }
                                k8l0.l(nfl0Var);
                                utl0Var = nfl0Var.r;
                                if (utl0Var.c()) {
                                    j6l0 j6l0Var12 = utl0Var.a.e;
                                    k8l0.k(j6l0Var12);
                                    j6l0Var12.w.b(null);
                                }
                                if (k8l0Var5.h()) {
                                    if (k8l0Var5.f()) {
                                        yol0Var2 = yol0Var;
                                        if (yol0Var2.E("android.permission.INTERNET")) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6 = u4l0Var5;
                                            u4l0Var6.a("App is missing INTERNET permission");
                                        } else {
                                            u4l0Var6 = u4l0Var5;
                                        }
                                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        k8l0Var4 = k8l0Var5;
                                        context = k8l0Var4.a;
                                        if (!r7k0.a(context).c()) {
                                            if (!yol0.X(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!yol0.z(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        k8l0Var4 = k8l0Var5;
                                        yol0Var2 = yol0Var;
                                    }
                                    y4l0Var = y4l0Var2;
                                } else {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        String strN7 = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        String string5 = j6l0Var.k().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN7);
                                        boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                                        if (zIsEmpty) {
                                            h6l0Var2 = h6l0Var;
                                        } else {
                                            h6l0Var2 = h6l0Var;
                                        }
                                        String strN8 = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        SharedPreferences.Editor editorEdit7 = j6l0Var.k().edit();
                                        editorEdit7.putString("gmp_app_id", strN8);
                                        editorEdit7.apply();
                                    } else {
                                        h6l0Var2 = h6l0Var;
                                    }
                                    if (!j6l0Var.n().i(hbl0Var)) {
                                        h6l0Var2.b(null);
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g.set(h6l0Var2.a());
                                    k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    y4l0Var = y4l0Var2;
                                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        zF = k8l0Var4.f();
                                        sharedPreferences = j6l0Var.c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            j6l0Var.p(!zF);
                                        }
                                        if (zF) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.s();
                                        }
                                        wll0 wll0Var5 = k8l0Var4.h;
                                        k8l0.l(wll0Var5);
                                        wll0Var5.e.a();
                                        k8l0Var4.o().k(new AtomicReference());
                                        k8l0Var4.o().l(j6l0Var.y.a());
                                    }
                                }
                                kql0.a();
                                if (wok0Var.q(null, v2l0.Q0)) {
                                    yol0Var2.g();
                                    if (yol0Var2.C() == 1) {
                                        long jIntValue5 = ((Integer) v2l0.x0.a(null)).intValue();
                                        long jNextInt5 = new Random().nextInt(5000);
                                        k8l0Var4.k.getClass();
                                        jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            k8l0.m(y4l0Var);
                                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g();
                                        zbl0Var = nfl0Var.l;
                                        if (zbl0Var == null) {
                                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                            nfl0Var.l = zbl0Var;
                                        }
                                        zbl0Var.b(jMax);
                                    }
                                }
                                j6l0Var.o.b(true);
                            }
                            EnumMap enumMap3 = new EnumMap(hbl0.class);
                            enumMap3.put(hbl0.AD_STORAGE, dbl0VarV);
                            enumMap3.put(hbl0Var, dbl0VarV2);
                            jbl0Var = new jbl0(enumMap3, -10);
                        } else {
                            u4l0Var5 = u4l0Var4;
                            yol0Var = yol0Var4;
                            if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                                if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (i3 == 0) {
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.C(new jbl0(-10), false);
                                }
                                jbl0Var = null;
                                if (jbl0Var != null) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.C(jbl0Var, true);
                                    jbl0Var2 = jbl0Var;
                                } else {
                                    jbl0Var2 = jbl0VarN;
                                }
                                k8l0.l(nfl0Var);
                                k8l0Var3 = nfl0Var.a;
                                nfl0Var.k(jbl0Var2);
                                j6l0Var.g();
                                int i8 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                                if (dbl0VarV3 != dbl0Var) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                                }
                                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                                if (dbl0VarV4 == dbl0Var) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                            crk0VarC = crk0.c(30, bundle);
                                            it = crk0VarC.e.values().iterator();
                                            while (it.hasNext()) {
                                                if (((dbl0) it.next()) != dbl0Var) {
                                                    k8l0.l(nfl0Var);
                                                    nfl0Var.B(crk0VarC, true);
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                                if (boolS != null) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var.a("TCF client enabled.");
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    y4l0 y4l0Var19 = k8l0Var3.f;
                                    k8l0.m(y4l0Var19);
                                    y4l0Var19.m.a("Register tcfPrefChangeListener.");
                                    if (nfl0Var.u == null) {
                                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                nfl0 nfl0Var2 = nfl0Var;
                                                k8l0 k8l0Var8 = nfl0Var2.a;
                                                wok0 wok0Var3 = k8l0Var8.d;
                                                y4l0 y4l0Var110 = k8l0Var8.f;
                                                if (!wok0Var3.q(null, v2l0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        k8l0.m(y4l0Var110);
                                                        y4l0Var110.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var = nfl0Var2.v;
                                                        hm20.h(vcl0Var);
                                                        vcl0Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    k8l0.m(y4l0Var110);
                                                    y4l0Var110.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                                    hm20.h(vcl0Var2);
                                                    vcl0Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    j6l0 j6l0Var13 = k8l0Var3.e;
                                    k8l0.k(j6l0Var13);
                                    j6l0Var13.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                    k8l0.l(nfl0Var);
                                    nfl0Var.m();
                                } else {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var.a("TCF client enabled.");
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    y4l0 y4l0Var110 = k8l0Var3.f;
                                    k8l0.m(y4l0Var110);
                                    y4l0Var110.m.a("Register tcfPrefChangeListener.");
                                    if (nfl0Var.u == null) {
                                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                                nfl0 nfl0Var2 = nfl0Var;
                                                k8l0 k8l0Var8 = nfl0Var2.a;
                                                wok0 wok0Var3 = k8l0Var8.d;
                                                y4l0 y4l0Var111 = k8l0Var8.f;
                                                if (!wok0Var3.q(null, v2l0.Z0)) {
                                                    if (Objects.equals(str8, "IABTCF_TCString")) {
                                                        k8l0.m(y4l0Var111);
                                                        y4l0Var111.n.a("IABTCF_TCString change picked up in listener.");
                                                        vcl0 vcl0Var = nfl0Var2.v;
                                                        hm20.h(vcl0Var);
                                                        vcl0Var.b(500L);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    k8l0.m(y4l0Var111);
                                                    y4l0Var111.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                                    hm20.h(vcl0Var2);
                                                    vcl0Var2.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    j6l0 j6l0Var14 = k8l0Var3.e;
                                    k8l0.k(j6l0Var14);
                                    j6l0Var14.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                    k8l0.l(nfl0Var);
                                    nfl0Var.m();
                                }
                                d6l0Var = j6l0Var.f;
                                if (d6l0Var.a() == 0) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                    d6l0Var.b(j);
                                }
                                k8l0.l(nfl0Var);
                                utl0Var = nfl0Var.r;
                                if (utl0Var.c()) {
                                    j6l0 j6l0Var15 = utl0Var.a.e;
                                    k8l0.k(j6l0Var15);
                                    j6l0Var15.w.b(null);
                                }
                                if (k8l0Var5.h()) {
                                    if (k8l0Var5.f()) {
                                        yol0Var2 = yol0Var;
                                        if (yol0Var2.E("android.permission.INTERNET")) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6 = u4l0Var5;
                                            u4l0Var6.a("App is missing INTERNET permission");
                                        } else {
                                            u4l0Var6 = u4l0Var5;
                                        }
                                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        k8l0Var4 = k8l0Var5;
                                        context = k8l0Var4.a;
                                        if (!r7k0.a(context).c()) {
                                            if (!yol0.X(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!yol0.z(context)) {
                                                k8l0.m(y4l0Var2);
                                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        k8l0Var4 = k8l0Var5;
                                        yol0Var2 = yol0Var;
                                    }
                                    y4l0Var = y4l0Var2;
                                } else {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        String strN9 = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        String string6 = j6l0Var.k().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strN9);
                                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                                        if (zIsEmpty) {
                                            h6l0Var2 = h6l0Var;
                                        } else {
                                            h6l0Var2 = h6l0Var;
                                        }
                                        String strN10 = k8l0Var4.q().n();
                                        j6l0Var.g();
                                        SharedPreferences.Editor editorEdit8 = j6l0Var.k().edit();
                                        editorEdit8.putString("gmp_app_id", strN10);
                                        editorEdit8.apply();
                                    } else {
                                        h6l0Var2 = h6l0Var;
                                    }
                                    if (!j6l0Var.n().i(hbl0Var)) {
                                        h6l0Var2.b(null);
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g.set(h6l0Var2.a());
                                    k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    y4l0Var = y4l0Var2;
                                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                        zF = k8l0Var4.f();
                                        sharedPreferences = j6l0Var.c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains) {
                                            j6l0Var.p(!zF);
                                        }
                                        if (zF) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.s();
                                        }
                                        wll0 wll0Var6 = k8l0Var4.h;
                                        k8l0.l(wll0Var6);
                                        wll0Var6.e.a();
                                        k8l0Var4.o().k(new AtomicReference());
                                        k8l0Var4.o().l(j6l0Var.y.a());
                                    }
                                }
                                kql0.a();
                                if (wok0Var.q(null, v2l0.Q0)) {
                                    yol0Var2.g();
                                    if (yol0Var2.C() == 1) {
                                        long jIntValue6 = ((Integer) v2l0.x0.a(null)).intValue();
                                        long jNextInt6 = new Random().nextInt(5000);
                                        k8l0Var4.k.getClass();
                                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            k8l0.m(y4l0Var);
                                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        k8l0.l(nfl0Var);
                                        nfl0Var.g();
                                        zbl0Var = nfl0Var.l;
                                        if (zbl0Var == null) {
                                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                            nfl0Var.l = zbl0Var;
                                        }
                                        zbl0Var.b(jMax);
                                    }
                                }
                                j6l0Var.o.b(true);
                            }
                            EnumMap enumMap4 = new EnumMap(hbl0.class);
                            enumMap4.put(hbl0.AD_STORAGE, dbl0VarV);
                            enumMap4.put(hbl0Var, dbl0VarV2);
                            jbl0Var = new jbl0(enumMap4, -10);
                        }
                        if (jbl0Var != null) {
                            k8l0.l(nfl0Var);
                            nfl0Var.C(jbl0Var, true);
                            jbl0Var2 = jbl0Var;
                        } else {
                            jbl0Var2 = jbl0VarN;
                        }
                        k8l0.l(nfl0Var);
                        k8l0Var3 = nfl0Var.a;
                        nfl0Var.k(jbl0Var2);
                        j6l0Var.g();
                        int i9 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                        dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                        if (dbl0VarV3 != dbl0Var) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                        }
                        dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                        if (dbl0VarV4 == dbl0Var) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                        boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                        if (boolS != null) {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var111 = k8l0Var3.f;
                            k8l0.m(y4l0Var111);
                            y4l0Var111.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var3 = k8l0Var8.d;
                                        y4l0 y4l0Var112 = k8l0Var8.f;
                                        if (!wok0Var3.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var112);
                                                y4l0Var112.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var112);
                                            y4l0Var112.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var16 = k8l0Var3.e;
                            k8l0.k(j6l0Var16);
                            j6l0Var16.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        } else {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var112 = k8l0Var3.f;
                            k8l0.m(y4l0Var112);
                            y4l0Var112.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var3 = k8l0Var8.d;
                                        y4l0 y4l0Var113 = k8l0Var8.f;
                                        if (!wok0Var3.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str8, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var113);
                                                y4l0Var113.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var113);
                                            y4l0Var113.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var17 = k8l0Var3.e;
                            k8l0.k(j6l0Var17);
                            j6l0Var17.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        }
                        d6l0Var = j6l0Var.f;
                        if (d6l0Var.a() == 0) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                            d6l0Var.b(j);
                        }
                        k8l0.l(nfl0Var);
                        utl0Var = nfl0Var.r;
                        if (utl0Var.c()) {
                            j6l0 j6l0Var18 = utl0Var.a.e;
                            k8l0.k(j6l0Var18);
                            j6l0Var18.w.b(null);
                        }
                        if (k8l0Var5.h()) {
                            if (k8l0Var5.f()) {
                                yol0Var2 = yol0Var;
                                if (yol0Var2.E("android.permission.INTERNET")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6 = u4l0Var5;
                                    u4l0Var6.a("App is missing INTERNET permission");
                                } else {
                                    u4l0Var6 = u4l0Var5;
                                }
                                if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                k8l0Var4 = k8l0Var5;
                                context = k8l0Var4.a;
                                if (!r7k0.a(context).c()) {
                                    if (!yol0.X(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!yol0.z(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                            }
                            y4l0Var = y4l0Var2;
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                            if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                String strN11 = k8l0Var4.q().n();
                                j6l0Var.g();
                                String string7 = j6l0Var.k().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN11);
                                boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                                if (zIsEmpty) {
                                    h6l0Var2 = h6l0Var;
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                String strN12 = k8l0Var4.q().n();
                                j6l0Var.g();
                                SharedPreferences.Editor editorEdit9 = j6l0Var.k().edit();
                                editorEdit9.putString("gmp_app_id", strN12);
                                editorEdit9.apply();
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            if (!j6l0Var.n().i(hbl0Var)) {
                                h6l0Var2.b(null);
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g.set(h6l0Var2.a());
                            k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            y4l0Var = y4l0Var2;
                            if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                zF = k8l0Var4.f();
                                sharedPreferences = j6l0Var.c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    j6l0Var.p(!zF);
                                }
                                if (zF) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.s();
                                }
                                wll0 wll0Var7 = k8l0Var4.h;
                                k8l0.l(wll0Var7);
                                wll0Var7.e.a();
                                k8l0Var4.o().k(new AtomicReference());
                                k8l0Var4.o().l(j6l0Var.y.a());
                            }
                        }
                        kql0.a();
                        if (wok0Var.q(null, v2l0.Q0)) {
                            yol0Var2.g();
                            if (yol0Var2.C() == 1) {
                                long jIntValue7 = ((Integer) v2l0.x0.a(null)).intValue();
                                long jNextInt7 = new Random().nextInt(5000);
                                k8l0Var4.k.getClass();
                                jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    k8l0.m(y4l0Var);
                                    u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                zbl0Var = nfl0Var.l;
                                if (zbl0Var == null) {
                                    zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                    nfl0Var.l = zbl0Var;
                                }
                                zbl0Var.b(jMax);
                            }
                        }
                        j6l0Var.o.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str2 = packageInfo.versionName;
                        i = packageInfo.versionCode;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                String str8 = installerPackageName;
                b4l0Var3.c = packageName;
                b4l0Var3.f = str8;
                b4l0Var3.d = str2;
                b4l0Var3.e = i;
                b4l0Var3.g = string;
                b4l0Var3.h = 0L;
                iG = k8l0Var7.g();
                if (iG == 0) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.n.a("App measurement collection enabled");
                } else if (iG == 1) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement deactivated via the manifest");
                } else if (iG == 3) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iG == 4) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement disabled via the manifest");
                } else if (iG == 6) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iG == 7) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement disabled via the global data collection setting");
                } else if (iG != 8) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement disabled");
                    k8l0.m(y4l0Var5);
                    y4l0Var5.g.a("Invalid scion state in identity");
                } else {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.l.a("App measurement disabled due to denied storage consent");
                }
                b4l0Var3.n = "";
                strA = ggl0.a(context2, k8l0Var7.p);
                if (!TextUtils.isEmpty(strA)) {
                    str4 = strA;
                }
                b4l0Var3.n = str4;
                if (iG == 0) {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.n.c(b4l0Var3.c, "App measurement enabled for app package, google app id", b4l0Var3.n);
                }
                b4l0Var3.k = null;
                wok0 wok0Var3 = k8l0Var7.d;
                k8l0Var = wok0Var3.a;
                hm20.e("analytics.safelisted_events");
                bundleR = wok0Var3.r();
                if (bundleR != null) {
                    if (bundleR.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleR.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = null;
                        } else {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        b4l0Var3.k = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it2 = listAsList.iterator();
                        do {
                            if (it2.hasNext()) {
                                b4l0Var3.k = listAsList;
                                break;
                            } else {
                                str3 = (String) it2.next();
                                yol0Var3 = k8l0Var7.i;
                                k8l0.k(yol0Var3);
                            }
                        } while (yol0Var3.i0("safelisted event", str3));
                    } else {
                        k8l0.m(y4l0Var5);
                        y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        b4l0Var3.m = bon.a(context2) ? 1 : 0;
                    } else {
                        b4l0Var3.m = 0;
                    }
                    b4l0Var3.a.C.incrementAndGet();
                    b4l0Var3.b = true;
                    agl0Var = new agl0(k8l0Var5);
                    k8l0Var2 = agl0Var.a;
                    k8l0Var2.A++;
                    agl0Var.i();
                    k8l0Var5.u = agl0Var;
                    if (!agl0Var.b) {
                        ib5.a(str);
                        return;
                    }
                    agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
                    k8l0Var2.C.incrementAndGet();
                    agl0Var.b = true;
                    k8l0.m(y4l0Var2);
                    u4l0Var = y4l0Var2.m;
                    u4l0Var2 = y4l0Var2.l;
                    u4l0Var3 = y4l0Var2.n;
                    u4l0Var4 = y4l0Var2.f;
                    wok0Var.l();
                    u4l0Var2.b(133005L, "App measurement initialized, version");
                    k8l0.m(y4l0Var2);
                    u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM = b4l0Var.m();
                    if (yol0Var4.H(strM, wok0Var.c)) {
                        k8l0.m(y4l0Var2);
                        u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        k8l0.m(y4l0Var2);
                        u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                    }
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("Debug-level message logging enabled");
                    i2 = k8l0Var5.A;
                    atomicInteger = k8l0Var5.C;
                    if (i2 != atomicInteger.get()) {
                        k8l0.m(y4l0Var2);
                        u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                    }
                    k8l0Var5.v = true;
                    j = k8l0Var5.D;
                    nfl0Var = k8l0Var5.m;
                    k8l0.m(p7l0Var);
                    p7l0Var.g();
                    k8l0.j(k8l0Var5.u);
                    iL = k8l0Var5.u.l();
                    kql0.a();
                    zQ = wok0Var.q(null, v2l0.Q0);
                    if (iL == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zQ) {
                        yol0Var4.g();
                        if (yol0Var4.C() == 1) {
                            z2 = z;
                        } else if (z) {
                            z2 = true;
                        }
                        yol0Var4.g();
                        IntentFilter intentFilter5 = new IntentFilter();
                        intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z3 = z2;
                        o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter5);
                        y4l0 y4l0Var113 = k8l0Var6.f;
                        k8l0.m(y4l0Var113);
                        y4l0Var113.m.a("Registered app receiver");
                        if (z3) {
                            k8l0.j(k8l0Var5.u);
                            k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z2 = true;
                        yol0Var4.g();
                        IntentFilter intentFilter6 = new IntentFilter();
                        intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z3 = z2;
                        o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter6);
                        y4l0 y4l0Var114 = k8l0Var6.f;
                        k8l0.m(y4l0Var114);
                        y4l0Var114.m.a("Registered app receiver");
                        if (z3) {
                            k8l0.j(k8l0Var5.u);
                            k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                        }
                    }
                    h6l0Var = j6l0Var.g;
                    jbl0VarN = j6l0Var.n();
                    i3 = jbl0VarN.b;
                    dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
                    dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
                    dbl0Var = dbl0.UNINITIALIZED;
                    hbl0Var = hbl0.ANALYTICS_STORAGE;
                    if (dbl0VarV == dbl0Var) {
                        u4l0Var5 = u4l0Var4;
                        yol0Var = yol0Var4;
                        if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                            if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (i3 == 0) {
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.C(new jbl0(-10), false);
                            }
                            jbl0Var = null;
                            if (jbl0Var != null) {
                                k8l0.l(nfl0Var);
                                nfl0Var.C(jbl0Var, true);
                                jbl0Var2 = jbl0Var;
                            } else {
                                jbl0Var2 = jbl0VarN;
                            }
                            k8l0.l(nfl0Var);
                            k8l0Var3 = nfl0Var.a;
                            nfl0Var.k(jbl0Var2);
                            j6l0Var.g();
                            int i10 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                            dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                            if (dbl0VarV3 != dbl0Var) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                            }
                            dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                            if (dbl0VarV4 == dbl0Var) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                            boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                            if (boolS != null) {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var115 = k8l0Var3.f;
                                k8l0.m(y4l0Var115);
                                y4l0Var115.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var4 = k8l0Var8.d;
                                            y4l0 y4l0Var116 = k8l0Var8.f;
                                            if (!wok0Var4.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var116);
                                                    y4l0Var116.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var116);
                                                y4l0Var116.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var19 = k8l0Var3.e;
                                k8l0.k(j6l0Var19);
                                j6l0Var19.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            } else {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var116 = k8l0Var3.f;
                                k8l0.m(y4l0Var116);
                                y4l0Var116.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var4 = k8l0Var8.d;
                                            y4l0 y4l0Var117 = k8l0Var8.f;
                                            if (!wok0Var4.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var117);
                                                    y4l0Var117.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var117);
                                                y4l0Var117.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var110 = k8l0Var3.e;
                                k8l0.k(j6l0Var110);
                                j6l0Var110.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            }
                            d6l0Var = j6l0Var.f;
                            if (d6l0Var.a() == 0) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                d6l0Var.b(j);
                            }
                            k8l0.l(nfl0Var);
                            utl0Var = nfl0Var.r;
                            if (utl0Var.c()) {
                                j6l0 j6l0Var111 = utl0Var.a.e;
                                k8l0.k(j6l0Var111);
                                j6l0Var111.w.b(null);
                            }
                            if (k8l0Var5.h()) {
                                if (k8l0Var5.f()) {
                                    yol0Var2 = yol0Var;
                                    if (yol0Var2.E("android.permission.INTERNET")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6 = u4l0Var5;
                                        u4l0Var6.a("App is missing INTERNET permission");
                                    } else {
                                        u4l0Var6 = u4l0Var5;
                                    }
                                    if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    k8l0Var4 = k8l0Var5;
                                    context = k8l0Var4.a;
                                    if (!r7k0.a(context).c()) {
                                        if (!yol0.X(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!yol0.z(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                }
                                y4l0Var = y4l0Var2;
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                                if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    String strN13 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    String string8 = j6l0Var.k().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN13);
                                    boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                                    if (zIsEmpty) {
                                        h6l0Var2 = h6l0Var;
                                    } else {
                                        h6l0Var2 = h6l0Var;
                                    }
                                    String strN14 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    SharedPreferences.Editor editorEdit10 = j6l0Var.k().edit();
                                    editorEdit10.putString("gmp_app_id", strN14);
                                    editorEdit10.apply();
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                if (!j6l0Var.n().i(hbl0Var)) {
                                    h6l0Var2.b(null);
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g.set(h6l0Var2.a());
                                k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                y4l0Var = y4l0Var2;
                                if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    zF = k8l0Var4.f();
                                    sharedPreferences = j6l0Var.c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        j6l0Var.p(!zF);
                                    }
                                    if (zF) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.s();
                                    }
                                    wll0 wll0Var8 = k8l0Var4.h;
                                    k8l0.l(wll0Var8);
                                    wll0Var8.e.a();
                                    k8l0Var4.o().k(new AtomicReference());
                                    k8l0Var4.o().l(j6l0Var.y.a());
                                }
                            }
                            kql0.a();
                            if (wok0Var.q(null, v2l0.Q0)) {
                                yol0Var2.g();
                                if (yol0Var2.C() == 1) {
                                    long jIntValue8 = ((Integer) v2l0.x0.a(null)).intValue();
                                    long jNextInt8 = new Random().nextInt(5000);
                                    k8l0Var4.k.getClass();
                                    jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        k8l0.m(y4l0Var);
                                        u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    zbl0Var = nfl0Var.l;
                                    if (zbl0Var == null) {
                                        zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                        nfl0Var.l = zbl0Var;
                                    }
                                    zbl0Var.b(jMax);
                                }
                            }
                            j6l0Var.o.b(true);
                        }
                        EnumMap enumMap5 = new EnumMap(hbl0.class);
                        enumMap5.put(hbl0.AD_STORAGE, dbl0VarV);
                        enumMap5.put(hbl0Var, dbl0VarV2);
                        jbl0Var = new jbl0(enumMap5, -10);
                    } else {
                        u4l0Var5 = u4l0Var4;
                        yol0Var = yol0Var4;
                        if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                            if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (i3 == 0) {
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.C(new jbl0(-10), false);
                            }
                            jbl0Var = null;
                            if (jbl0Var != null) {
                                k8l0.l(nfl0Var);
                                nfl0Var.C(jbl0Var, true);
                                jbl0Var2 = jbl0Var;
                            } else {
                                jbl0Var2 = jbl0VarN;
                            }
                            k8l0.l(nfl0Var);
                            k8l0Var3 = nfl0Var.a;
                            nfl0Var.k(jbl0Var2);
                            j6l0Var.g();
                            int i11 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                            dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                            if (dbl0VarV3 != dbl0Var) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                            }
                            dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                            if (dbl0VarV4 == dbl0Var) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                        crk0VarC = crk0.c(30, bundle);
                                        it = crk0VarC.e.values().iterator();
                                        while (it.hasNext()) {
                                            if (((dbl0) it.next()) != dbl0Var) {
                                                k8l0.l(nfl0Var);
                                                nfl0Var.B(crk0VarC, true);
                                                break;
                                            }
                                        }
                                    }
                                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                            boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                            if (boolS != null) {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var117 = k8l0Var3.f;
                                k8l0.m(y4l0Var117);
                                y4l0Var117.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var4 = k8l0Var8.d;
                                            y4l0 y4l0Var118 = k8l0Var8.f;
                                            if (!wok0Var4.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var118);
                                                    y4l0Var118.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var118);
                                                y4l0Var118.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var112 = k8l0Var3.e;
                                k8l0.k(j6l0Var112);
                                j6l0Var112.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            } else {
                                k8l0.m(y4l0Var2);
                                u4l0Var.a("TCF client enabled.");
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                y4l0 y4l0Var118 = k8l0Var3.f;
                                k8l0.m(y4l0Var118);
                                y4l0Var118.m.a("Register tcfPrefChangeListener.");
                                if (nfl0Var.u == null) {
                                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                            nfl0 nfl0Var2 = nfl0Var;
                                            k8l0 k8l0Var8 = nfl0Var2.a;
                                            wok0 wok0Var4 = k8l0Var8.d;
                                            y4l0 y4l0Var119 = k8l0Var8.f;
                                            if (!wok0Var4.q(null, v2l0.Z0)) {
                                                if (Objects.equals(str9, "IABTCF_TCString")) {
                                                    k8l0.m(y4l0Var119);
                                                    y4l0Var119.n.a("IABTCF_TCString change picked up in listener.");
                                                    vcl0 vcl0Var = nfl0Var2.v;
                                                    hm20.h(vcl0Var);
                                                    vcl0Var.b(500L);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                                k8l0.m(y4l0Var119);
                                                y4l0Var119.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var2 = nfl0Var2.v;
                                                hm20.h(vcl0Var2);
                                                vcl0Var2.b(500L);
                                            }
                                        }
                                    };
                                }
                                j6l0 j6l0Var113 = k8l0Var3.e;
                                k8l0.k(j6l0Var113);
                                j6l0Var113.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                                k8l0.l(nfl0Var);
                                nfl0Var.m();
                            }
                            d6l0Var = j6l0Var.f;
                            if (d6l0Var.a() == 0) {
                                k8l0.m(y4l0Var2);
                                u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                                d6l0Var.b(j);
                            }
                            k8l0.l(nfl0Var);
                            utl0Var = nfl0Var.r;
                            if (utl0Var.c()) {
                                j6l0 j6l0Var114 = utl0Var.a.e;
                                k8l0.k(j6l0Var114);
                                j6l0Var114.w.b(null);
                            }
                            if (k8l0Var5.h()) {
                                if (k8l0Var5.f()) {
                                    yol0Var2 = yol0Var;
                                    if (yol0Var2.E("android.permission.INTERNET")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6 = u4l0Var5;
                                        u4l0Var6.a("App is missing INTERNET permission");
                                    } else {
                                        u4l0Var6 = u4l0Var5;
                                    }
                                    if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    k8l0Var4 = k8l0Var5;
                                    context = k8l0Var4.a;
                                    if (!r7k0.a(context).c()) {
                                        if (!yol0.X(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!yol0.z(context)) {
                                            k8l0.m(y4l0Var2);
                                            u4l0Var6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    k8l0Var4 = k8l0Var5;
                                    yol0Var2 = yol0Var;
                                }
                                y4l0Var = y4l0Var2;
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                                if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    String strN15 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    String string9 = j6l0Var.k().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strN15);
                                    boolean zIsEmpty9 = TextUtils.isEmpty(string9);
                                    if (zIsEmpty) {
                                        h6l0Var2 = h6l0Var;
                                    } else {
                                        h6l0Var2 = h6l0Var;
                                    }
                                    String strN16 = k8l0Var4.q().n();
                                    j6l0Var.g();
                                    SharedPreferences.Editor editorEdit11 = j6l0Var.k().edit();
                                    editorEdit11.putString("gmp_app_id", strN16);
                                    editorEdit11.apply();
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                if (!j6l0Var.n().i(hbl0Var)) {
                                    h6l0Var2.b(null);
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g.set(h6l0Var2.a());
                                k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                y4l0Var = y4l0Var2;
                                if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                    zF = k8l0Var4.f();
                                    sharedPreferences = j6l0Var.c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        j6l0Var.p(!zF);
                                    }
                                    if (zF) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.s();
                                    }
                                    wll0 wll0Var9 = k8l0Var4.h;
                                    k8l0.l(wll0Var9);
                                    wll0Var9.e.a();
                                    k8l0Var4.o().k(new AtomicReference());
                                    k8l0Var4.o().l(j6l0Var.y.a());
                                }
                            }
                            kql0.a();
                            if (wok0Var.q(null, v2l0.Q0)) {
                                yol0Var2.g();
                                if (yol0Var2.C() == 1) {
                                    long jIntValue9 = ((Integer) v2l0.x0.a(null)).intValue();
                                    long jNextInt9 = new Random().nextInt(5000);
                                    k8l0Var4.k.getClass();
                                    jMax = Math.max(500L, ((jIntValue9 * 1000) + jNextInt9) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        k8l0.m(y4l0Var);
                                        u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    k8l0.l(nfl0Var);
                                    nfl0Var.g();
                                    zbl0Var = nfl0Var.l;
                                    if (zbl0Var == null) {
                                        zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                        nfl0Var.l = zbl0Var;
                                    }
                                    zbl0Var.b(jMax);
                                }
                            }
                            j6l0Var.o.b(true);
                        }
                        EnumMap enumMap6 = new EnumMap(hbl0.class);
                        enumMap6.put(hbl0.AD_STORAGE, dbl0VarV);
                        enumMap6.put(hbl0Var, dbl0VarV2);
                        jbl0Var = new jbl0(enumMap6, -10);
                    }
                    if (jbl0Var != null) {
                        k8l0.l(nfl0Var);
                        nfl0Var.C(jbl0Var, true);
                        jbl0Var2 = jbl0Var;
                    } else {
                        jbl0Var2 = jbl0VarN;
                    }
                    k8l0.l(nfl0Var);
                    k8l0Var3 = nfl0Var.a;
                    nfl0Var.k(jbl0Var2);
                    j6l0Var.g();
                    int i12 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                    dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                    if (dbl0VarV3 != dbl0Var) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                    }
                    dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                    if (dbl0VarV4 == dbl0Var) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                    boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                    if (boolS != null) {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var119 = k8l0Var3.f;
                        k8l0.m(y4l0Var119);
                        y4l0Var119.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var4 = k8l0Var8.d;
                                    y4l0 y4l0Var1110 = k8l0Var8.f;
                                    if (!wok0Var4.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var1110);
                                            y4l0Var1110.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var1110);
                                        y4l0Var1110.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var115 = k8l0Var3.e;
                        k8l0.k(j6l0Var115);
                        j6l0Var115.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    } else {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var1110 = k8l0Var3.f;
                        k8l0.m(y4l0Var1110);
                        y4l0Var1110.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var4 = k8l0Var8.d;
                                    y4l0 y4l0Var1111 = k8l0Var8.f;
                                    if (!wok0Var4.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str9, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var1111);
                                            y4l0Var1111.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var1111);
                                        y4l0Var1111.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var116 = k8l0Var3.e;
                        k8l0.k(j6l0Var116);
                        j6l0Var116.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    }
                    d6l0Var = j6l0Var.f;
                    if (d6l0Var.a() == 0) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                        d6l0Var.b(j);
                    }
                    k8l0.l(nfl0Var);
                    utl0Var = nfl0Var.r;
                    if (utl0Var.c()) {
                        j6l0 j6l0Var117 = utl0Var.a.e;
                        k8l0.k(j6l0Var117);
                        j6l0Var117.w.b(null);
                    }
                    if (k8l0Var5.h()) {
                        if (k8l0Var5.f()) {
                            yol0Var2 = yol0Var;
                            if (yol0Var2.E("android.permission.INTERNET")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6 = u4l0Var5;
                                u4l0Var6.a("App is missing INTERNET permission");
                            } else {
                                u4l0Var6 = u4l0Var5;
                            }
                            if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            k8l0Var4 = k8l0Var5;
                            context = k8l0Var4.a;
                            if (!r7k0.a(context).c()) {
                                if (!yol0.X(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!yol0.z(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                        }
                        y4l0Var = y4l0Var2;
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                        if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                            String strN17 = k8l0Var4.q().n();
                            j6l0Var.g();
                            String string10 = j6l0Var.k().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN17);
                            boolean zIsEmpty10 = TextUtils.isEmpty(string10);
                            if (zIsEmpty) {
                                h6l0Var2 = h6l0Var;
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            String strN18 = k8l0Var4.q().n();
                            j6l0Var.g();
                            SharedPreferences.Editor editorEdit12 = j6l0Var.k().edit();
                            editorEdit12.putString("gmp_app_id", strN18);
                            editorEdit12.apply();
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        if (!j6l0Var.n().i(hbl0Var)) {
                            h6l0Var2.b(null);
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g.set(h6l0Var2.a());
                        k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        y4l0Var = y4l0Var2;
                        if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                            zF = k8l0Var4.f();
                            sharedPreferences = j6l0Var.c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                j6l0Var.p(!zF);
                            }
                            if (zF) {
                                k8l0.l(nfl0Var);
                                nfl0Var.s();
                            }
                            wll0 wll0Var10 = k8l0Var4.h;
                            k8l0.l(wll0Var10);
                            wll0Var10.e.a();
                            k8l0Var4.o().k(new AtomicReference());
                            k8l0Var4.o().l(j6l0Var.y.a());
                        }
                    }
                    kql0.a();
                    if (wok0Var.q(null, v2l0.Q0)) {
                        yol0Var2.g();
                        if (yol0Var2.C() == 1) {
                            long jIntValue10 = ((Integer) v2l0.x0.a(null)).intValue();
                            long jNextInt10 = new Random().nextInt(5000);
                            k8l0Var4.k.getClass();
                            jMax = Math.max(500L, ((jIntValue10 * 1000) + jNextInt10) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                k8l0.m(y4l0Var);
                                u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            zbl0Var = nfl0Var.l;
                            if (zbl0Var == null) {
                                zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                nfl0Var.l = zbl0Var;
                            }
                            zbl0Var.b(jMax);
                        }
                    }
                    j6l0Var.o.b(true);
                }
                y4l0 y4l0Var120 = k8l0Var.f;
                k8l0.m(y4l0Var120);
                y4l0Var120.f.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    b4l0Var3.k = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it2 = listAsList.iterator();
                    do {
                        if (it2.hasNext()) {
                            b4l0Var3.k = listAsList;
                            break;
                        } else {
                            str3 = (String) it2.next();
                            yol0Var3 = k8l0Var7.i;
                            k8l0.k(yol0Var3);
                        }
                    } while (yol0Var3.i0("safelisted event", str3));
                } else {
                    k8l0.m(y4l0Var5);
                    y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    b4l0Var3.m = bon.a(context2) ? 1 : 0;
                } else {
                    b4l0Var3.m = 0;
                }
                b4l0Var3.a.C.incrementAndGet();
                b4l0Var3.b = true;
                agl0Var = new agl0(k8l0Var5);
                k8l0Var2 = agl0Var.a;
                k8l0Var2.A++;
                agl0Var.i();
                k8l0Var5.u = agl0Var;
                if (!agl0Var.b) {
                    ib5.a(str);
                    return;
                }
                agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
                k8l0Var2.C.incrementAndGet();
                agl0Var.b = true;
                k8l0.m(y4l0Var2);
                u4l0Var = y4l0Var2.m;
                u4l0Var2 = y4l0Var2.l;
                u4l0Var3 = y4l0Var2.n;
                u4l0Var4 = y4l0Var2.f;
                wok0Var.l();
                u4l0Var2.b(133005L, "App measurement initialized, version");
                k8l0.m(y4l0Var2);
                u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM = b4l0Var.m();
                if (yol0Var4.H(strM, wok0Var.c)) {
                    k8l0.m(y4l0Var2);
                    u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    k8l0.m(y4l0Var2);
                    u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
                }
                k8l0.m(y4l0Var2);
                u4l0Var.a("Debug-level message logging enabled");
                i2 = k8l0Var5.A;
                atomicInteger = k8l0Var5.C;
                if (i2 != atomicInteger.get()) {
                    k8l0.m(y4l0Var2);
                    u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
                }
                k8l0Var5.v = true;
                j = k8l0Var5.D;
                nfl0Var = k8l0Var5.m;
                k8l0.m(p7l0Var);
                p7l0Var.g();
                k8l0.j(k8l0Var5.u);
                iL = k8l0Var5.u.l();
                kql0.a();
                zQ = wok0Var.q(null, v2l0.Q0);
                if (iL == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zQ) {
                    yol0Var4.g();
                    if (yol0Var4.C() == 1) {
                        z2 = z;
                    } else if (z) {
                        z2 = true;
                    }
                    yol0Var4.g();
                    IntentFilter intentFilter7 = new IntentFilter();
                    intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z3 = z2;
                    o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter7);
                    y4l0 y4l0Var1111 = k8l0Var6.f;
                    k8l0.m(y4l0Var1111);
                    y4l0Var1111.m.a("Registered app receiver");
                    if (z3) {
                        k8l0.j(k8l0Var5.u);
                        k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                    }
                } else if (z) {
                    z2 = true;
                    yol0Var4.g();
                    IntentFilter intentFilter8 = new IntentFilter();
                    intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z3 = z2;
                    o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter8);
                    y4l0 y4l0Var1112 = k8l0Var6.f;
                    k8l0.m(y4l0Var1112);
                    y4l0Var1112.m.a("Registered app receiver");
                    if (z3) {
                        k8l0.j(k8l0Var5.u);
                        k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                    }
                }
                h6l0Var = j6l0Var.g;
                jbl0VarN = j6l0Var.n();
                i3 = jbl0VarN.b;
                dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
                dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
                dbl0Var = dbl0.UNINITIALIZED;
                hbl0Var = hbl0.ANALYTICS_STORAGE;
                if (dbl0VarV == dbl0Var) {
                    u4l0Var5 = u4l0Var4;
                    yol0Var = yol0Var4;
                    if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                        if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (i3 == 0) {
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.C(new jbl0(-10), false);
                        }
                        jbl0Var = null;
                        if (jbl0Var != null) {
                            k8l0.l(nfl0Var);
                            nfl0Var.C(jbl0Var, true);
                            jbl0Var2 = jbl0Var;
                        } else {
                            jbl0Var2 = jbl0VarN;
                        }
                        k8l0.l(nfl0Var);
                        k8l0Var3 = nfl0Var.a;
                        nfl0Var.k(jbl0Var2);
                        j6l0Var.g();
                        int i13 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                        dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                        if (dbl0VarV3 != dbl0Var) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                        }
                        dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                        if (dbl0VarV4 == dbl0Var) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                        boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                        if (boolS != null) {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var1113 = k8l0Var3.f;
                            k8l0.m(y4l0Var1113);
                            y4l0Var1113.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var4 = k8l0Var8.d;
                                        y4l0 y4l0Var1114 = k8l0Var8.f;
                                        if (!wok0Var4.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var1114);
                                                y4l0Var1114.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var1114);
                                            y4l0Var1114.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var118 = k8l0Var3.e;
                            k8l0.k(j6l0Var118);
                            j6l0Var118.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        } else {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var1114 = k8l0Var3.f;
                            k8l0.m(y4l0Var1114);
                            y4l0Var1114.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var4 = k8l0Var8.d;
                                        y4l0 y4l0Var1115 = k8l0Var8.f;
                                        if (!wok0Var4.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var1115);
                                                y4l0Var1115.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var1115);
                                            y4l0Var1115.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var119 = k8l0Var3.e;
                            k8l0.k(j6l0Var119);
                            j6l0Var119.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        }
                        d6l0Var = j6l0Var.f;
                        if (d6l0Var.a() == 0) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                            d6l0Var.b(j);
                        }
                        k8l0.l(nfl0Var);
                        utl0Var = nfl0Var.r;
                        if (utl0Var.c()) {
                            j6l0 j6l0Var1110 = utl0Var.a.e;
                            k8l0.k(j6l0Var1110);
                            j6l0Var1110.w.b(null);
                        }
                        if (k8l0Var5.h()) {
                            if (k8l0Var5.f()) {
                                yol0Var2 = yol0Var;
                                if (yol0Var2.E("android.permission.INTERNET")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6 = u4l0Var5;
                                    u4l0Var6.a("App is missing INTERNET permission");
                                } else {
                                    u4l0Var6 = u4l0Var5;
                                }
                                if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                k8l0Var4 = k8l0Var5;
                                context = k8l0Var4.a;
                                if (!r7k0.a(context).c()) {
                                    if (!yol0.X(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!yol0.z(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                            }
                            y4l0Var = y4l0Var2;
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                            if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                String strN19 = k8l0Var4.q().n();
                                j6l0Var.g();
                                String string11 = j6l0Var.k().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN19);
                                boolean zIsEmpty11 = TextUtils.isEmpty(string11);
                                if (zIsEmpty) {
                                    h6l0Var2 = h6l0Var;
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                String strN110 = k8l0Var4.q().n();
                                j6l0Var.g();
                                SharedPreferences.Editor editorEdit13 = j6l0Var.k().edit();
                                editorEdit13.putString("gmp_app_id", strN110);
                                editorEdit13.apply();
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            if (!j6l0Var.n().i(hbl0Var)) {
                                h6l0Var2.b(null);
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g.set(h6l0Var2.a());
                            k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            y4l0Var = y4l0Var2;
                            if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                zF = k8l0Var4.f();
                                sharedPreferences = j6l0Var.c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    j6l0Var.p(!zF);
                                }
                                if (zF) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.s();
                                }
                                wll0 wll0Var11 = k8l0Var4.h;
                                k8l0.l(wll0Var11);
                                wll0Var11.e.a();
                                k8l0Var4.o().k(new AtomicReference());
                                k8l0Var4.o().l(j6l0Var.y.a());
                            }
                        }
                        kql0.a();
                        if (wok0Var.q(null, v2l0.Q0)) {
                            yol0Var2.g();
                            if (yol0Var2.C() == 1) {
                                long jIntValue11 = ((Integer) v2l0.x0.a(null)).intValue();
                                long jNextInt11 = new Random().nextInt(5000);
                                k8l0Var4.k.getClass();
                                jMax = Math.max(500L, ((jIntValue11 * 1000) + jNextInt11) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    k8l0.m(y4l0Var);
                                    u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                zbl0Var = nfl0Var.l;
                                if (zbl0Var == null) {
                                    zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                    nfl0Var.l = zbl0Var;
                                }
                                zbl0Var.b(jMax);
                            }
                        }
                        j6l0Var.o.b(true);
                    }
                    EnumMap enumMap7 = new EnumMap(hbl0.class);
                    enumMap7.put(hbl0.AD_STORAGE, dbl0VarV);
                    enumMap7.put(hbl0Var, dbl0VarV2);
                    jbl0Var = new jbl0(enumMap7, -10);
                } else {
                    u4l0Var5 = u4l0Var4;
                    yol0Var = yol0Var4;
                    if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                        if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (i3 == 0) {
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.C(new jbl0(-10), false);
                        }
                        jbl0Var = null;
                        if (jbl0Var != null) {
                            k8l0.l(nfl0Var);
                            nfl0Var.C(jbl0Var, true);
                            jbl0Var2 = jbl0Var;
                        } else {
                            jbl0Var2 = jbl0VarN;
                        }
                        k8l0.l(nfl0Var);
                        k8l0Var3 = nfl0Var.a;
                        nfl0Var.k(jbl0Var2);
                        j6l0Var.g();
                        int i14 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                        dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                        if (dbl0VarV3 != dbl0Var) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                        }
                        dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                        if (dbl0VarV4 == dbl0Var) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                    crk0VarC = crk0.c(30, bundle);
                                    it = crk0VarC.e.values().iterator();
                                    while (it.hasNext()) {
                                        if (((dbl0) it.next()) != dbl0Var) {
                                            k8l0.l(nfl0Var);
                                            nfl0Var.B(crk0VarC, true);
                                            break;
                                        }
                                    }
                                }
                            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                        boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                        if (boolS != null) {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var1115 = k8l0Var3.f;
                            k8l0.m(y4l0Var1115);
                            y4l0Var1115.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var4 = k8l0Var8.d;
                                        y4l0 y4l0Var1116 = k8l0Var8.f;
                                        if (!wok0Var4.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var1116);
                                                y4l0Var1116.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var1116);
                                            y4l0Var1116.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var1111 = k8l0Var3.e;
                            k8l0.k(j6l0Var1111);
                            j6l0Var1111.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        } else {
                            k8l0.m(y4l0Var2);
                            u4l0Var.a("TCF client enabled.");
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            y4l0 y4l0Var1116 = k8l0Var3.f;
                            k8l0.m(y4l0Var1116);
                            y4l0Var1116.m.a("Register tcfPrefChangeListener.");
                            if (nfl0Var.u == null) {
                                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                        nfl0 nfl0Var2 = nfl0Var;
                                        k8l0 k8l0Var8 = nfl0Var2.a;
                                        wok0 wok0Var4 = k8l0Var8.d;
                                        y4l0 y4l0Var1117 = k8l0Var8.f;
                                        if (!wok0Var4.q(null, v2l0.Z0)) {
                                            if (Objects.equals(str9, "IABTCF_TCString")) {
                                                k8l0.m(y4l0Var1117);
                                                y4l0Var1117.n.a("IABTCF_TCString change picked up in listener.");
                                                vcl0 vcl0Var = nfl0Var2.v;
                                                hm20.h(vcl0Var);
                                                vcl0Var.b(500L);
                                                return;
                                            }
                                            return;
                                        }
                                        if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                            k8l0.m(y4l0Var1117);
                                            y4l0Var1117.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var2 = nfl0Var2.v;
                                            hm20.h(vcl0Var2);
                                            vcl0Var2.b(500L);
                                        }
                                    }
                                };
                            }
                            j6l0 j6l0Var1112 = k8l0Var3.e;
                            k8l0.k(j6l0Var1112);
                            j6l0Var1112.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                            k8l0.l(nfl0Var);
                            nfl0Var.m();
                        }
                        d6l0Var = j6l0Var.f;
                        if (d6l0Var.a() == 0) {
                            k8l0.m(y4l0Var2);
                            u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                            d6l0Var.b(j);
                        }
                        k8l0.l(nfl0Var);
                        utl0Var = nfl0Var.r;
                        if (utl0Var.c()) {
                            j6l0 j6l0Var1113 = utl0Var.a.e;
                            k8l0.k(j6l0Var1113);
                            j6l0Var1113.w.b(null);
                        }
                        if (k8l0Var5.h()) {
                            if (k8l0Var5.f()) {
                                yol0Var2 = yol0Var;
                                if (yol0Var2.E("android.permission.INTERNET")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6 = u4l0Var5;
                                    u4l0Var6.a("App is missing INTERNET permission");
                                } else {
                                    u4l0Var6 = u4l0Var5;
                                }
                                if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                k8l0Var4 = k8l0Var5;
                                context = k8l0Var4.a;
                                if (!r7k0.a(context).c()) {
                                    if (!yol0.X(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!yol0.z(context)) {
                                        k8l0.m(y4l0Var2);
                                        u4l0Var6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                k8l0Var4 = k8l0Var5;
                                yol0Var2 = yol0Var;
                            }
                            y4l0Var = y4l0Var2;
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                            if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                                String strN111 = k8l0Var4.q().n();
                                j6l0Var.g();
                                String string12 = j6l0Var.k().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strN111);
                                boolean zIsEmpty12 = TextUtils.isEmpty(string12);
                                if (zIsEmpty) {
                                    h6l0Var2 = h6l0Var;
                                } else {
                                    h6l0Var2 = h6l0Var;
                                }
                                String strN112 = k8l0Var4.q().n();
                                j6l0Var.g();
                                SharedPreferences.Editor editorEdit14 = j6l0Var.k().edit();
                                editorEdit14.putString("gmp_app_id", strN112);
                                editorEdit14.apply();
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            if (!j6l0Var.n().i(hbl0Var)) {
                                h6l0Var2.b(null);
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g.set(h6l0Var2.a());
                            k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            y4l0Var = y4l0Var2;
                            if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                                zF = k8l0Var4.f();
                                sharedPreferences = j6l0Var.c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    j6l0Var.p(!zF);
                                }
                                if (zF) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.s();
                                }
                                wll0 wll0Var12 = k8l0Var4.h;
                                k8l0.l(wll0Var12);
                                wll0Var12.e.a();
                                k8l0Var4.o().k(new AtomicReference());
                                k8l0Var4.o().l(j6l0Var.y.a());
                            }
                        }
                        kql0.a();
                        if (wok0Var.q(null, v2l0.Q0)) {
                            yol0Var2.g();
                            if (yol0Var2.C() == 1) {
                                long jIntValue12 = ((Integer) v2l0.x0.a(null)).intValue();
                                long jNextInt12 = new Random().nextInt(5000);
                                k8l0Var4.k.getClass();
                                jMax = Math.max(500L, ((jIntValue12 * 1000) + jNextInt12) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    k8l0.m(y4l0Var);
                                    u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                k8l0.l(nfl0Var);
                                nfl0Var.g();
                                zbl0Var = nfl0Var.l;
                                if (zbl0Var == null) {
                                    zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                    nfl0Var.l = zbl0Var;
                                }
                                zbl0Var.b(jMax);
                            }
                        }
                        j6l0Var.o.b(true);
                    }
                    EnumMap enumMap8 = new EnumMap(hbl0.class);
                    enumMap8.put(hbl0.AD_STORAGE, dbl0VarV);
                    enumMap8.put(hbl0Var, dbl0VarV2);
                    jbl0Var = new jbl0(enumMap8, -10);
                }
                if (jbl0Var != null) {
                    k8l0.l(nfl0Var);
                    nfl0Var.C(jbl0Var, true);
                    jbl0Var2 = jbl0Var;
                } else {
                    jbl0Var2 = jbl0VarN;
                }
                k8l0.l(nfl0Var);
                k8l0Var3 = nfl0Var.a;
                nfl0Var.k(jbl0Var2);
                j6l0Var.g();
                int i15 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                if (dbl0VarV3 != dbl0Var) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                }
                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                if (dbl0VarV4 == dbl0Var) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                if (boolS != null) {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var1117 = k8l0Var3.f;
                    k8l0.m(y4l0Var1117);
                    y4l0Var1117.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var4 = k8l0Var8.d;
                                y4l0 y4l0Var1118 = k8l0Var8.f;
                                if (!wok0Var4.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var1118);
                                        y4l0Var1118.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var1118);
                                    y4l0Var1118.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var1114 = k8l0Var3.e;
                    k8l0.k(j6l0Var1114);
                    j6l0Var1114.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                } else {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var1118 = k8l0Var3.f;
                    k8l0.m(y4l0Var1118);
                    y4l0Var1118.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str9) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var4 = k8l0Var8.d;
                                y4l0 y4l0Var1119 = k8l0Var8.f;
                                if (!wok0Var4.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str9, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var1119);
                                        y4l0Var1119.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str9, "IABTCF_TCString") || Objects.equals(str9, "IABTCF_gdprApplies") || Objects.equals(str9, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var1119);
                                    y4l0Var1119.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var1115 = k8l0Var3.e;
                    k8l0.k(j6l0Var1115);
                    j6l0Var1115.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                }
                d6l0Var = j6l0Var.f;
                if (d6l0Var.a() == 0) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                    d6l0Var.b(j);
                }
                k8l0.l(nfl0Var);
                utl0Var = nfl0Var.r;
                if (utl0Var.c()) {
                    j6l0 j6l0Var1116 = utl0Var.a.e;
                    k8l0.k(j6l0Var1116);
                    j6l0Var1116.w.b(null);
                }
                if (k8l0Var5.h()) {
                    if (k8l0Var5.f()) {
                        yol0Var2 = yol0Var;
                        if (yol0Var2.E("android.permission.INTERNET")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6 = u4l0Var5;
                            u4l0Var6.a("App is missing INTERNET permission");
                        } else {
                            u4l0Var6 = u4l0Var5;
                        }
                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        k8l0Var4 = k8l0Var5;
                        context = k8l0Var4.a;
                        if (!r7k0.a(context).c()) {
                            if (!yol0.X(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!yol0.z(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                    }
                    y4l0Var = y4l0Var2;
                } else {
                    k8l0Var4 = k8l0Var5;
                    yol0Var2 = yol0Var;
                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                        String strN113 = k8l0Var4.q().n();
                        j6l0Var.g();
                        String string13 = j6l0Var.k().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN113);
                        boolean zIsEmpty13 = TextUtils.isEmpty(string13);
                        if (zIsEmpty) {
                            h6l0Var2 = h6l0Var;
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        String strN114 = k8l0Var4.q().n();
                        j6l0Var.g();
                        SharedPreferences.Editor editorEdit15 = j6l0Var.k().edit();
                        editorEdit15.putString("gmp_app_id", strN114);
                        editorEdit15.apply();
                    } else {
                        h6l0Var2 = h6l0Var;
                    }
                    if (!j6l0Var.n().i(hbl0Var)) {
                        h6l0Var2.b(null);
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.g.set(h6l0Var2.a());
                    k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    y4l0Var = y4l0Var2;
                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                        zF = k8l0Var4.f();
                        sharedPreferences = j6l0Var.c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            j6l0Var.p(!zF);
                        }
                        if (zF) {
                            k8l0.l(nfl0Var);
                            nfl0Var.s();
                        }
                        wll0 wll0Var13 = k8l0Var4.h;
                        k8l0.l(wll0Var13);
                        wll0Var13.e.a();
                        k8l0Var4.o().k(new AtomicReference());
                        k8l0Var4.o().l(j6l0Var.y.a());
                    }
                }
                kql0.a();
                if (wok0Var.q(null, v2l0.Q0)) {
                    yol0Var2.g();
                    if (yol0Var2.C() == 1) {
                        long jIntValue13 = ((Integer) v2l0.x0.a(null)).intValue();
                        long jNextInt13 = new Random().nextInt(5000);
                        k8l0Var4.k.getClass();
                        jMax = Math.max(500L, ((jIntValue13 * 1000) + jNextInt13) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            k8l0.m(y4l0Var);
                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        zbl0Var = nfl0Var.l;
                        if (zbl0Var == null) {
                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                            nfl0Var.l = zbl0Var;
                        }
                        zbl0Var.b(jMax);
                    }
                }
                j6l0Var.o.b(true);
            }
            k8l0.m(y4l0Var5);
            b4l0Var = b4l0Var2;
            str = "Can't initialize twice";
            y4l0Var5.f.b(y4l0.k(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strA = ggl0.a(context2, k8l0Var7.p);
            if (!TextUtils.isEmpty(strA)) {
                str4 = strA;
            }
            b4l0Var3.n = str4;
            if (iG == 0) {
                k8l0.m(y4l0Var5);
                y4l0Var5.n.c(b4l0Var3.c, "App measurement enabled for app package, google app id", b4l0Var3.n);
            }
        } catch (IllegalStateException e2) {
            k8l0.m(y4l0Var5);
            y4l0Var5.f.c(y4l0.k(packageName), "Fetching Google App Id failed with exception. appId", e2);
        }
        i = Integer.MIN_VALUE;
        string = "Unknown";
        str2 = string;
        String str9 = installerPackageName;
        b4l0Var3.c = packageName;
        b4l0Var3.f = str9;
        b4l0Var3.d = str2;
        b4l0Var3.e = i;
        b4l0Var3.g = string;
        b4l0Var3.h = 0L;
        iG = k8l0Var7.g();
        if (iG == 0) {
            k8l0.m(y4l0Var5);
            y4l0Var5.n.a("App measurement collection enabled");
        } else if (iG == 1) {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement deactivated via the manifest");
        } else if (iG == 3) {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iG == 4) {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement disabled via the manifest");
        } else if (iG == 6) {
            k8l0.m(y4l0Var5);
            y4l0Var5.k.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iG == 7) {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement disabled via the global data collection setting");
        } else if (iG != 8) {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement disabled");
            k8l0.m(y4l0Var5);
            y4l0Var5.g.a("Invalid scion state in identity");
        } else {
            k8l0.m(y4l0Var5);
            y4l0Var5.l.a("App measurement disabled due to denied storage consent");
        }
        b4l0Var3.n = "";
        b4l0Var3.k = null;
        wok0 wok0Var4 = k8l0Var7.d;
        k8l0Var = wok0Var4.a;
        hm20.e("analytics.safelisted_events");
        bundleR = wok0Var4.r();
        if (bundleR != null) {
            if (bundleR.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleR.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                b4l0Var3.k = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it2 = listAsList.iterator();
                do {
                    if (it2.hasNext()) {
                        b4l0Var3.k = listAsList;
                        break;
                    } else {
                        str3 = (String) it2.next();
                        yol0Var3 = k8l0Var7.i;
                        k8l0.k(yol0Var3);
                    }
                } while (yol0Var3.i0("safelisted event", str3));
            } else {
                k8l0.m(y4l0Var5);
                y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                b4l0Var3.m = bon.a(context2) ? 1 : 0;
            } else {
                b4l0Var3.m = 0;
            }
            b4l0Var3.a.C.incrementAndGet();
            b4l0Var3.b = true;
            agl0Var = new agl0(k8l0Var5);
            k8l0Var2 = agl0Var.a;
            k8l0Var2.A++;
            agl0Var.i();
            k8l0Var5.u = agl0Var;
            if (!agl0Var.b) {
                ib5.a(str);
                return;
            }
            agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
            k8l0Var2.C.incrementAndGet();
            agl0Var.b = true;
            k8l0.m(y4l0Var2);
            u4l0Var = y4l0Var2.m;
            u4l0Var2 = y4l0Var2.l;
            u4l0Var3 = y4l0Var2.n;
            u4l0Var4 = y4l0Var2.f;
            wok0Var.l();
            u4l0Var2.b(133005L, "App measurement initialized, version");
            k8l0.m(y4l0Var2);
            u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM = b4l0Var.m();
            if (yol0Var4.H(strM, wok0Var.c)) {
                k8l0.m(y4l0Var2);
                u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                k8l0.m(y4l0Var2);
                u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
            }
            k8l0.m(y4l0Var2);
            u4l0Var.a("Debug-level message logging enabled");
            i2 = k8l0Var5.A;
            atomicInteger = k8l0Var5.C;
            if (i2 != atomicInteger.get()) {
                k8l0.m(y4l0Var2);
                u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
            }
            k8l0Var5.v = true;
            j = k8l0Var5.D;
            nfl0Var = k8l0Var5.m;
            k8l0.m(p7l0Var);
            p7l0Var.g();
            k8l0.j(k8l0Var5.u);
            iL = k8l0Var5.u.l();
            kql0.a();
            zQ = wok0Var.q(null, v2l0.Q0);
            if (iL == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zQ) {
                yol0Var4.g();
                if (yol0Var4.C() == 1) {
                    z2 = z;
                } else if (z) {
                    z2 = true;
                }
                yol0Var4.g();
                IntentFilter intentFilter9 = new IntentFilter();
                intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z3 = z2;
                o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter9);
                y4l0 y4l0Var1119 = k8l0Var6.f;
                k8l0.m(y4l0Var1119);
                y4l0Var1119.m.a("Registered app receiver");
                if (z3) {
                    k8l0.j(k8l0Var5.u);
                    k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                }
            } else if (z) {
                z2 = true;
                yol0Var4.g();
                IntentFilter intentFilter10 = new IntentFilter();
                intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z3 = z2;
                o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter10);
                y4l0 y4l0Var11110 = k8l0Var6.f;
                k8l0.m(y4l0Var11110);
                y4l0Var11110.m.a("Registered app receiver");
                if (z3) {
                    k8l0.j(k8l0Var5.u);
                    k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
                }
            }
            h6l0Var = j6l0Var.g;
            jbl0VarN = j6l0Var.n();
            i3 = jbl0VarN.b;
            dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
            dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
            dbl0Var = dbl0.UNINITIALIZED;
            hbl0Var = hbl0.ANALYTICS_STORAGE;
            if (dbl0VarV == dbl0Var) {
                u4l0Var5 = u4l0Var4;
                yol0Var = yol0Var4;
                if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                    if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (i3 == 0) {
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.C(new jbl0(-10), false);
                    }
                    jbl0Var = null;
                    if (jbl0Var != null) {
                        k8l0.l(nfl0Var);
                        nfl0Var.C(jbl0Var, true);
                        jbl0Var2 = jbl0Var;
                    } else {
                        jbl0Var2 = jbl0VarN;
                    }
                    k8l0.l(nfl0Var);
                    k8l0Var3 = nfl0Var.a;
                    nfl0Var.k(jbl0Var2);
                    j6l0Var.g();
                    int i16 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                    dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                    if (dbl0VarV3 != dbl0Var) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                    }
                    dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                    if (dbl0VarV4 == dbl0Var) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                    boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                    if (boolS != null) {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var11111 = k8l0Var3.f;
                        k8l0.m(y4l0Var11111);
                        y4l0Var11111.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var5 = k8l0Var8.d;
                                    y4l0 y4l0Var11112 = k8l0Var8.f;
                                    if (!wok0Var5.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var11112);
                                            y4l0Var11112.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var11112);
                                        y4l0Var11112.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var1117 = k8l0Var3.e;
                        k8l0.k(j6l0Var1117);
                        j6l0Var1117.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    } else {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var11112 = k8l0Var3.f;
                        k8l0.m(y4l0Var11112);
                        y4l0Var11112.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var5 = k8l0Var8.d;
                                    y4l0 y4l0Var11113 = k8l0Var8.f;
                                    if (!wok0Var5.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var11113);
                                            y4l0Var11113.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var11113);
                                        y4l0Var11113.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var1118 = k8l0Var3.e;
                        k8l0.k(j6l0Var1118);
                        j6l0Var1118.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    }
                    d6l0Var = j6l0Var.f;
                    if (d6l0Var.a() == 0) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                        d6l0Var.b(j);
                    }
                    k8l0.l(nfl0Var);
                    utl0Var = nfl0Var.r;
                    if (utl0Var.c()) {
                        j6l0 j6l0Var1119 = utl0Var.a.e;
                        k8l0.k(j6l0Var1119);
                        j6l0Var1119.w.b(null);
                    }
                    if (k8l0Var5.h()) {
                        if (k8l0Var5.f()) {
                            yol0Var2 = yol0Var;
                            if (yol0Var2.E("android.permission.INTERNET")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6 = u4l0Var5;
                                u4l0Var6.a("App is missing INTERNET permission");
                            } else {
                                u4l0Var6 = u4l0Var5;
                            }
                            if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            k8l0Var4 = k8l0Var5;
                            context = k8l0Var4.a;
                            if (!r7k0.a(context).c()) {
                                if (!yol0.X(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!yol0.z(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                        }
                        y4l0Var = y4l0Var2;
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                        if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                            String strN115 = k8l0Var4.q().n();
                            j6l0Var.g();
                            String string14 = j6l0Var.k().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN115);
                            boolean zIsEmpty14 = TextUtils.isEmpty(string14);
                            if (zIsEmpty) {
                                h6l0Var2 = h6l0Var;
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            String strN116 = k8l0Var4.q().n();
                            j6l0Var.g();
                            SharedPreferences.Editor editorEdit16 = j6l0Var.k().edit();
                            editorEdit16.putString("gmp_app_id", strN116);
                            editorEdit16.apply();
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        if (!j6l0Var.n().i(hbl0Var)) {
                            h6l0Var2.b(null);
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g.set(h6l0Var2.a());
                        k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        y4l0Var = y4l0Var2;
                        if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                            zF = k8l0Var4.f();
                            sharedPreferences = j6l0Var.c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                j6l0Var.p(!zF);
                            }
                            if (zF) {
                                k8l0.l(nfl0Var);
                                nfl0Var.s();
                            }
                            wll0 wll0Var14 = k8l0Var4.h;
                            k8l0.l(wll0Var14);
                            wll0Var14.e.a();
                            k8l0Var4.o().k(new AtomicReference());
                            k8l0Var4.o().l(j6l0Var.y.a());
                        }
                    }
                    kql0.a();
                    if (wok0Var.q(null, v2l0.Q0)) {
                        yol0Var2.g();
                        if (yol0Var2.C() == 1) {
                            long jIntValue14 = ((Integer) v2l0.x0.a(null)).intValue();
                            long jNextInt14 = new Random().nextInt(5000);
                            k8l0Var4.k.getClass();
                            jMax = Math.max(500L, ((jIntValue14 * 1000) + jNextInt14) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                k8l0.m(y4l0Var);
                                u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            zbl0Var = nfl0Var.l;
                            if (zbl0Var == null) {
                                zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                nfl0Var.l = zbl0Var;
                            }
                            zbl0Var.b(jMax);
                        }
                    }
                    j6l0Var.o.b(true);
                }
                EnumMap enumMap9 = new EnumMap(hbl0.class);
                enumMap9.put(hbl0.AD_STORAGE, dbl0VarV);
                enumMap9.put(hbl0Var, dbl0VarV2);
                jbl0Var = new jbl0(enumMap9, -10);
            } else {
                u4l0Var5 = u4l0Var4;
                yol0Var = yol0Var4;
                if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                    if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (i3 == 0) {
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.C(new jbl0(-10), false);
                    }
                    jbl0Var = null;
                    if (jbl0Var != null) {
                        k8l0.l(nfl0Var);
                        nfl0Var.C(jbl0Var, true);
                        jbl0Var2 = jbl0Var;
                    } else {
                        jbl0Var2 = jbl0VarN;
                    }
                    k8l0.l(nfl0Var);
                    k8l0Var3 = nfl0Var.a;
                    nfl0Var.k(jbl0Var2);
                    j6l0Var.g();
                    int i17 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                    dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                    if (dbl0VarV3 != dbl0Var) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                    }
                    dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                    if (dbl0VarV4 == dbl0Var) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                                crk0VarC = crk0.c(30, bundle);
                                it = crk0VarC.e.values().iterator();
                                while (it.hasNext()) {
                                    if (((dbl0) it.next()) != dbl0Var) {
                                        k8l0.l(nfl0Var);
                                        nfl0Var.B(crk0VarC, true);
                                        break;
                                    }
                                }
                            }
                        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                    boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                    if (boolS != null) {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var11113 = k8l0Var3.f;
                        k8l0.m(y4l0Var11113);
                        y4l0Var11113.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var5 = k8l0Var8.d;
                                    y4l0 y4l0Var11114 = k8l0Var8.f;
                                    if (!wok0Var5.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var11114);
                                            y4l0Var11114.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var11114);
                                        y4l0Var11114.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var11110 = k8l0Var3.e;
                        k8l0.k(j6l0Var11110);
                        j6l0Var11110.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    } else {
                        k8l0.m(y4l0Var2);
                        u4l0Var.a("TCF client enabled.");
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        y4l0 y4l0Var11114 = k8l0Var3.f;
                        k8l0.m(y4l0Var11114);
                        y4l0Var11114.m.a("Register tcfPrefChangeListener.");
                        if (nfl0Var.u == null) {
                            nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                            nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                    nfl0 nfl0Var2 = nfl0Var;
                                    k8l0 k8l0Var8 = nfl0Var2.a;
                                    wok0 wok0Var5 = k8l0Var8.d;
                                    y4l0 y4l0Var11115 = k8l0Var8.f;
                                    if (!wok0Var5.q(null, v2l0.Z0)) {
                                        if (Objects.equals(str10, "IABTCF_TCString")) {
                                            k8l0.m(y4l0Var11115);
                                            y4l0Var11115.n.a("IABTCF_TCString change picked up in listener.");
                                            vcl0 vcl0Var = nfl0Var2.v;
                                            hm20.h(vcl0Var);
                                            vcl0Var.b(500L);
                                            return;
                                        }
                                        return;
                                    }
                                    if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                        k8l0.m(y4l0Var11115);
                                        y4l0Var11115.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var2 = nfl0Var2.v;
                                        hm20.h(vcl0Var2);
                                        vcl0Var2.b(500L);
                                    }
                                }
                            };
                        }
                        j6l0 j6l0Var11111 = k8l0Var3.e;
                        k8l0.k(j6l0Var11111);
                        j6l0Var11111.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                        k8l0.l(nfl0Var);
                        nfl0Var.m();
                    }
                    d6l0Var = j6l0Var.f;
                    if (d6l0Var.a() == 0) {
                        k8l0.m(y4l0Var2);
                        u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                        d6l0Var.b(j);
                    }
                    k8l0.l(nfl0Var);
                    utl0Var = nfl0Var.r;
                    if (utl0Var.c()) {
                        j6l0 j6l0Var11112 = utl0Var.a.e;
                        k8l0.k(j6l0Var11112);
                        j6l0Var11112.w.b(null);
                    }
                    if (k8l0Var5.h()) {
                        if (k8l0Var5.f()) {
                            yol0Var2 = yol0Var;
                            if (yol0Var2.E("android.permission.INTERNET")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6 = u4l0Var5;
                                u4l0Var6.a("App is missing INTERNET permission");
                            } else {
                                u4l0Var6 = u4l0Var5;
                            }
                            if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            k8l0Var4 = k8l0Var5;
                            context = k8l0Var4.a;
                            if (!r7k0.a(context).c()) {
                                if (!yol0.X(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!yol0.z(context)) {
                                    k8l0.m(y4l0Var2);
                                    u4l0Var6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            k8l0Var4 = k8l0Var5;
                            yol0Var2 = yol0Var;
                        }
                        y4l0Var = y4l0Var2;
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                        if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                            String strN117 = k8l0Var4.q().n();
                            j6l0Var.g();
                            String string15 = j6l0Var.k().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strN117);
                            boolean zIsEmpty15 = TextUtils.isEmpty(string15);
                            if (zIsEmpty) {
                                h6l0Var2 = h6l0Var;
                            } else {
                                h6l0Var2 = h6l0Var;
                            }
                            String strN118 = k8l0Var4.q().n();
                            j6l0Var.g();
                            SharedPreferences.Editor editorEdit17 = j6l0Var.k().edit();
                            editorEdit17.putString("gmp_app_id", strN118);
                            editorEdit17.apply();
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        if (!j6l0Var.n().i(hbl0Var)) {
                            h6l0Var2.b(null);
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g.set(h6l0Var2.a());
                        k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        y4l0Var = y4l0Var2;
                        if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                            zF = k8l0Var4.f();
                            sharedPreferences = j6l0Var.c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                j6l0Var.p(!zF);
                            }
                            if (zF) {
                                k8l0.l(nfl0Var);
                                nfl0Var.s();
                            }
                            wll0 wll0Var15 = k8l0Var4.h;
                            k8l0.l(wll0Var15);
                            wll0Var15.e.a();
                            k8l0Var4.o().k(new AtomicReference());
                            k8l0Var4.o().l(j6l0Var.y.a());
                        }
                    }
                    kql0.a();
                    if (wok0Var.q(null, v2l0.Q0)) {
                        yol0Var2.g();
                        if (yol0Var2.C() == 1) {
                            long jIntValue15 = ((Integer) v2l0.x0.a(null)).intValue();
                            long jNextInt15 = new Random().nextInt(5000);
                            k8l0Var4.k.getClass();
                            jMax = Math.max(500L, ((jIntValue15 * 1000) + jNextInt15) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                k8l0.m(y4l0Var);
                                u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            k8l0.l(nfl0Var);
                            nfl0Var.g();
                            zbl0Var = nfl0Var.l;
                            if (zbl0Var == null) {
                                zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                                nfl0Var.l = zbl0Var;
                            }
                            zbl0Var.b(jMax);
                        }
                    }
                    j6l0Var.o.b(true);
                }
                EnumMap enumMap10 = new EnumMap(hbl0.class);
                enumMap10.put(hbl0.AD_STORAGE, dbl0VarV);
                enumMap10.put(hbl0Var, dbl0VarV2);
                jbl0Var = new jbl0(enumMap10, -10);
            }
            if (jbl0Var != null) {
                k8l0.l(nfl0Var);
                nfl0Var.C(jbl0Var, true);
                jbl0Var2 = jbl0Var;
            } else {
                jbl0Var2 = jbl0VarN;
            }
            k8l0.l(nfl0Var);
            k8l0Var3 = nfl0Var.a;
            nfl0Var.k(jbl0Var2);
            j6l0Var.g();
            int i18 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
            dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
            if (dbl0VarV3 != dbl0Var) {
                k8l0.m(y4l0Var2);
                u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
            }
            dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
            if (dbl0VarV4 == dbl0Var) {
                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                crk0VarC = crk0.c(30, bundle);
                it = crk0VarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((dbl0) it.next()) != dbl0Var) {
                        k8l0.l(nfl0Var);
                        nfl0Var.B(crk0VarC, true);
                        break;
                    }
                }
            }
            boolS = wok0Var.s("google_analytics_tcf_data_enabled");
            if (boolS != null) {
                k8l0.m(y4l0Var2);
                u4l0Var.a("TCF client enabled.");
                k8l0.l(nfl0Var);
                nfl0Var.g();
                y4l0 y4l0Var11115 = k8l0Var3.f;
                k8l0.m(y4l0Var11115);
                y4l0Var11115.m.a("Register tcfPrefChangeListener.");
                if (nfl0Var.u == null) {
                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            nfl0 nfl0Var2 = nfl0Var;
                            k8l0 k8l0Var8 = nfl0Var2.a;
                            wok0 wok0Var5 = k8l0Var8.d;
                            y4l0 y4l0Var11116 = k8l0Var8.f;
                            if (!wok0Var5.q(null, v2l0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    k8l0.m(y4l0Var11116);
                                    y4l0Var11116.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var = nfl0Var2.v;
                                    hm20.h(vcl0Var);
                                    vcl0Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                k8l0.m(y4l0Var11116);
                                y4l0Var11116.n.a("IABTCF_TCString change picked up in listener.");
                                vcl0 vcl0Var2 = nfl0Var2.v;
                                hm20.h(vcl0Var2);
                                vcl0Var2.b(500L);
                            }
                        }
                    };
                }
                j6l0 j6l0Var11113 = k8l0Var3.e;
                k8l0.k(j6l0Var11113);
                j6l0Var11113.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                k8l0.l(nfl0Var);
                nfl0Var.m();
            } else {
                k8l0.m(y4l0Var2);
                u4l0Var.a("TCF client enabled.");
                k8l0.l(nfl0Var);
                nfl0Var.g();
                y4l0 y4l0Var11116 = k8l0Var3.f;
                k8l0.m(y4l0Var11116);
                y4l0Var11116.m.a("Register tcfPrefChangeListener.");
                if (nfl0Var.u == null) {
                    nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                    nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                            nfl0 nfl0Var2 = nfl0Var;
                            k8l0 k8l0Var8 = nfl0Var2.a;
                            wok0 wok0Var5 = k8l0Var8.d;
                            y4l0 y4l0Var11117 = k8l0Var8.f;
                            if (!wok0Var5.q(null, v2l0.Z0)) {
                                if (Objects.equals(str10, "IABTCF_TCString")) {
                                    k8l0.m(y4l0Var11117);
                                    y4l0Var11117.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var = nfl0Var2.v;
                                    hm20.h(vcl0Var);
                                    vcl0Var.b(500L);
                                    return;
                                }
                                return;
                            }
                            if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                k8l0.m(y4l0Var11117);
                                y4l0Var11117.n.a("IABTCF_TCString change picked up in listener.");
                                vcl0 vcl0Var2 = nfl0Var2.v;
                                hm20.h(vcl0Var2);
                                vcl0Var2.b(500L);
                            }
                        }
                    };
                }
                j6l0 j6l0Var11114 = k8l0Var3.e;
                k8l0.k(j6l0Var11114);
                j6l0Var11114.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                k8l0.l(nfl0Var);
                nfl0Var.m();
            }
            d6l0Var = j6l0Var.f;
            if (d6l0Var.a() == 0) {
                k8l0.m(y4l0Var2);
                u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                d6l0Var.b(j);
            }
            k8l0.l(nfl0Var);
            utl0Var = nfl0Var.r;
            if (utl0Var.c()) {
                j6l0 j6l0Var11115 = utl0Var.a.e;
                k8l0.k(j6l0Var11115);
                j6l0Var11115.w.b(null);
            }
            if (k8l0Var5.h()) {
                if (k8l0Var5.f()) {
                    yol0Var2 = yol0Var;
                    if (yol0Var2.E("android.permission.INTERNET")) {
                        k8l0.m(y4l0Var2);
                        u4l0Var6 = u4l0Var5;
                        u4l0Var6.a("App is missing INTERNET permission");
                    } else {
                        u4l0Var6 = u4l0Var5;
                    }
                    if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    k8l0Var4 = k8l0Var5;
                    context = k8l0Var4.a;
                    if (!r7k0.a(context).c()) {
                        if (!yol0.X(context)) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!yol0.z(context)) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    k8l0.m(y4l0Var2);
                    u4l0Var6.a("Uploading is not possible. App measurement disabled");
                } else {
                    k8l0Var4 = k8l0Var5;
                    yol0Var2 = yol0Var;
                }
                y4l0Var = y4l0Var2;
            } else {
                k8l0Var4 = k8l0Var5;
                yol0Var2 = yol0Var;
                if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                    String strN119 = k8l0Var4.q().n();
                    j6l0Var.g();
                    String string16 = j6l0Var.k().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strN119);
                    boolean zIsEmpty16 = TextUtils.isEmpty(string16);
                    if (zIsEmpty) {
                        h6l0Var2 = h6l0Var;
                    } else {
                        h6l0Var2 = h6l0Var;
                    }
                    String strN1110 = k8l0Var4.q().n();
                    j6l0Var.g();
                    SharedPreferences.Editor editorEdit18 = j6l0Var.k().edit();
                    editorEdit18.putString("gmp_app_id", strN1110);
                    editorEdit18.apply();
                } else {
                    h6l0Var2 = h6l0Var;
                }
                if (!j6l0Var.n().i(hbl0Var)) {
                    h6l0Var2.b(null);
                }
                k8l0.l(nfl0Var);
                nfl0Var.g.set(h6l0Var2.a());
                k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                y4l0Var = y4l0Var2;
                if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                    zF = k8l0Var4.f();
                    sharedPreferences = j6l0Var.c;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        j6l0Var.p(!zF);
                    }
                    if (zF) {
                        k8l0.l(nfl0Var);
                        nfl0Var.s();
                    }
                    wll0 wll0Var16 = k8l0Var4.h;
                    k8l0.l(wll0Var16);
                    wll0Var16.e.a();
                    k8l0Var4.o().k(new AtomicReference());
                    k8l0Var4.o().l(j6l0Var.y.a());
                }
            }
            kql0.a();
            if (wok0Var.q(null, v2l0.Q0)) {
                yol0Var2.g();
                if (yol0Var2.C() == 1) {
                    long jIntValue16 = ((Integer) v2l0.x0.a(null)).intValue();
                    long jNextInt16 = new Random().nextInt(5000);
                    k8l0Var4.k.getClass();
                    jMax = Math.max(500L, ((jIntValue16 * 1000) + jNextInt16) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        k8l0.m(y4l0Var);
                        u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    zbl0Var = nfl0Var.l;
                    if (zbl0Var == null) {
                        zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                        nfl0Var.l = zbl0Var;
                    }
                    zbl0Var.b(jMax);
                }
            }
            j6l0Var.o.b(true);
        }
        y4l0 y4l0Var121 = k8l0Var.f;
        k8l0.m(y4l0Var121);
        y4l0Var121.f.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = k8l0Var.a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            b4l0Var3.k = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it2 = listAsList.iterator();
            do {
                if (it2.hasNext()) {
                    b4l0Var3.k = listAsList;
                    break;
                } else {
                    str3 = (String) it2.next();
                    yol0Var3 = k8l0Var7.i;
                    k8l0.k(yol0Var3);
                }
            } while (yol0Var3.i0("safelisted event", str3));
        } else {
            k8l0.m(y4l0Var5);
            y4l0Var5.k.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            b4l0Var3.m = bon.a(context2) ? 1 : 0;
        } else {
            b4l0Var3.m = 0;
        }
        b4l0Var3.a.C.incrementAndGet();
        b4l0Var3.b = true;
        agl0Var = new agl0(k8l0Var5);
        k8l0Var2 = agl0Var.a;
        k8l0Var2.A++;
        agl0Var.i();
        k8l0Var5.u = agl0Var;
        if (!agl0Var.b) {
            ib5.a(str);
            return;
        }
        agl0Var.c = (JobScheduler) k8l0Var2.a.getSystemService("jobscheduler");
        k8l0Var2.C.incrementAndGet();
        agl0Var.b = true;
        k8l0.m(y4l0Var2);
        u4l0Var = y4l0Var2.m;
        u4l0Var2 = y4l0Var2.l;
        u4l0Var3 = y4l0Var2.n;
        u4l0Var4 = y4l0Var2.f;
        wok0Var.l();
        u4l0Var2.b(133005L, "App measurement initialized, version");
        k8l0.m(y4l0Var2);
        u4l0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM = b4l0Var.m();
        if (yol0Var4.H(strM, wok0Var.c)) {
            k8l0.m(y4l0Var2);
            u4l0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            k8l0.m(y4l0Var2);
            u4l0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM)));
        }
        k8l0.m(y4l0Var2);
        u4l0Var.a("Debug-level message logging enabled");
        i2 = k8l0Var5.A;
        atomicInteger = k8l0Var5.C;
        if (i2 != atomicInteger.get()) {
            k8l0.m(y4l0Var2);
            u4l0Var4.c(Integer.valueOf(k8l0Var5.A), "Not all components initialized", Integer.valueOf(atomicInteger.get()));
        }
        k8l0Var5.v = true;
        j = k8l0Var5.D;
        nfl0Var = k8l0Var5.m;
        k8l0.m(p7l0Var);
        p7l0Var.g();
        k8l0.j(k8l0Var5.u);
        iL = k8l0Var5.u.l();
        kql0.a();
        zQ = wok0Var.q(null, v2l0.Q0);
        if (iL == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zQ) {
            yol0Var4.g();
            if (yol0Var4.C() == 1) {
                z2 = z;
            } else if (z) {
                z2 = true;
            }
            yol0Var4.g();
            IntentFilter intentFilter11 = new IntentFilter();
            intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z3 = z2;
            o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter11);
            y4l0 y4l0Var11117 = k8l0Var6.f;
            k8l0.m(y4l0Var11117);
            y4l0Var11117.m.a("Registered app receiver");
            if (z3) {
                k8l0.j(k8l0Var5.u);
                k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
            }
        } else if (z) {
            z2 = true;
            yol0Var4.g();
            IntentFilter intentFilter12 = new IntentFilter();
            intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z3 = z2;
            o0b.d(k8l0Var6.a, new ltl0(k8l0Var6), intentFilter12);
            y4l0 y4l0Var11118 = k8l0Var6.f;
            k8l0.m(y4l0Var11118);
            y4l0Var11118.m.a("Registered app receiver");
            if (z3) {
                k8l0.j(k8l0Var5.u);
                k8l0Var5.u.k(((Long) v2l0.C.a(null)).longValue());
            }
        }
        h6l0Var = j6l0Var.g;
        jbl0VarN = j6l0Var.n();
        i3 = jbl0VarN.b;
        dbl0VarV = wok0Var.v("google_analytics_default_allow_ad_storage", false);
        dbl0VarV2 = wok0Var.v("google_analytics_default_allow_analytics_storage", false);
        dbl0Var = dbl0.UNINITIALIZED;
        hbl0Var = hbl0.ANALYTICS_STORAGE;
        if (dbl0VarV == dbl0Var) {
            u4l0Var5 = u4l0Var4;
            yol0Var = yol0Var4;
            if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (i3 == 0) {
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.C(new jbl0(-10), false);
                }
                jbl0Var = null;
                if (jbl0Var != null) {
                    k8l0.l(nfl0Var);
                    nfl0Var.C(jbl0Var, true);
                    jbl0Var2 = jbl0Var;
                } else {
                    jbl0Var2 = jbl0VarN;
                }
                k8l0.l(nfl0Var);
                k8l0Var3 = nfl0Var.a;
                nfl0Var.k(jbl0Var2);
                j6l0Var.g();
                int i19 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                if (dbl0VarV3 != dbl0Var) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                }
                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                if (dbl0VarV4 == dbl0Var) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                if (boolS != null) {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var11119 = k8l0Var3.f;
                    k8l0.m(y4l0Var11119);
                    y4l0Var11119.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var5 = k8l0Var8.d;
                                y4l0 y4l0Var111110 = k8l0Var8.f;
                                if (!wok0Var5.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var111110);
                                        y4l0Var111110.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var111110);
                                    y4l0Var111110.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var11116 = k8l0Var3.e;
                    k8l0.k(j6l0Var11116);
                    j6l0Var11116.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                } else {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var111110 = k8l0Var3.f;
                    k8l0.m(y4l0Var111110);
                    y4l0Var111110.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var5 = k8l0Var8.d;
                                y4l0 y4l0Var111111 = k8l0Var8.f;
                                if (!wok0Var5.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var111111);
                                        y4l0Var111111.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var111111);
                                    y4l0Var111111.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var11117 = k8l0Var3.e;
                    k8l0.k(j6l0Var11117);
                    j6l0Var11117.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                }
                d6l0Var = j6l0Var.f;
                if (d6l0Var.a() == 0) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                    d6l0Var.b(j);
                }
                k8l0.l(nfl0Var);
                utl0Var = nfl0Var.r;
                if (utl0Var.c()) {
                    j6l0 j6l0Var11118 = utl0Var.a.e;
                    k8l0.k(j6l0Var11118);
                    j6l0Var11118.w.b(null);
                }
                if (k8l0Var5.h()) {
                    if (k8l0Var5.f()) {
                        yol0Var2 = yol0Var;
                        if (yol0Var2.E("android.permission.INTERNET")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6 = u4l0Var5;
                            u4l0Var6.a("App is missing INTERNET permission");
                        } else {
                            u4l0Var6 = u4l0Var5;
                        }
                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        k8l0Var4 = k8l0Var5;
                        context = k8l0Var4.a;
                        if (!r7k0.a(context).c()) {
                            if (!yol0.X(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!yol0.z(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                    }
                    y4l0Var = y4l0Var2;
                } else {
                    k8l0Var4 = k8l0Var5;
                    yol0Var2 = yol0Var;
                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                        String strN1111 = k8l0Var4.q().n();
                        j6l0Var.g();
                        String string17 = j6l0Var.k().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN1111);
                        boolean zIsEmpty17 = TextUtils.isEmpty(string17);
                        if (zIsEmpty) {
                            h6l0Var2 = h6l0Var;
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        String strN1112 = k8l0Var4.q().n();
                        j6l0Var.g();
                        SharedPreferences.Editor editorEdit19 = j6l0Var.k().edit();
                        editorEdit19.putString("gmp_app_id", strN1112);
                        editorEdit19.apply();
                    } else {
                        h6l0Var2 = h6l0Var;
                    }
                    if (!j6l0Var.n().i(hbl0Var)) {
                        h6l0Var2.b(null);
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.g.set(h6l0Var2.a());
                    k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    y4l0Var = y4l0Var2;
                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                        zF = k8l0Var4.f();
                        sharedPreferences = j6l0Var.c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            j6l0Var.p(!zF);
                        }
                        if (zF) {
                            k8l0.l(nfl0Var);
                            nfl0Var.s();
                        }
                        wll0 wll0Var17 = k8l0Var4.h;
                        k8l0.l(wll0Var17);
                        wll0Var17.e.a();
                        k8l0Var4.o().k(new AtomicReference());
                        k8l0Var4.o().l(j6l0Var.y.a());
                    }
                }
                kql0.a();
                if (wok0Var.q(null, v2l0.Q0)) {
                    yol0Var2.g();
                    if (yol0Var2.C() == 1) {
                        long jIntValue17 = ((Integer) v2l0.x0.a(null)).intValue();
                        long jNextInt17 = new Random().nextInt(5000);
                        k8l0Var4.k.getClass();
                        jMax = Math.max(500L, ((jIntValue17 * 1000) + jNextInt17) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            k8l0.m(y4l0Var);
                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        zbl0Var = nfl0Var.l;
                        if (zbl0Var == null) {
                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                            nfl0Var.l = zbl0Var;
                        }
                        zbl0Var.b(jMax);
                    }
                }
                j6l0Var.o.b(true);
            }
            EnumMap enumMap11 = new EnumMap(hbl0.class);
            enumMap11.put(hbl0.AD_STORAGE, dbl0VarV);
            enumMap11.put(hbl0Var, dbl0VarV2);
            jbl0Var = new jbl0(enumMap11, -10);
        } else {
            u4l0Var5 = u4l0Var4;
            yol0Var = yol0Var4;
            if (jbl0.l(-10, j6l0Var.k().getInt("consent_source", 100))) {
                if (!TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (i3 == 0) {
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.C(new jbl0(-10), false);
                }
                jbl0Var = null;
                if (jbl0Var != null) {
                    k8l0.l(nfl0Var);
                    nfl0Var.C(jbl0Var, true);
                    jbl0Var2 = jbl0Var;
                } else {
                    jbl0Var2 = jbl0VarN;
                }
                k8l0.l(nfl0Var);
                k8l0Var3 = nfl0Var.a;
                nfl0Var.k(jbl0Var2);
                j6l0Var.g();
                int i110 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
                dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
                if (dbl0VarV3 != dbl0Var) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
                }
                dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
                if (dbl0VarV4 == dbl0Var) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                            crk0VarC = crk0.c(30, bundle);
                            it = crk0VarC.e.values().iterator();
                            while (it.hasNext()) {
                                if (((dbl0) it.next()) != dbl0Var) {
                                    k8l0.l(nfl0Var);
                                    nfl0Var.B(crk0VarC, true);
                                    break;
                                }
                            }
                        }
                    } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                        crk0VarC = crk0.c(30, bundle);
                        it = crk0VarC.e.values().iterator();
                        while (it.hasNext()) {
                            if (((dbl0) it.next()) != dbl0Var) {
                                k8l0.l(nfl0Var);
                                nfl0Var.B(crk0VarC, true);
                                break;
                            }
                        }
                    }
                } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
                boolS = wok0Var.s("google_analytics_tcf_data_enabled");
                if (boolS != null) {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var111111 = k8l0Var3.f;
                    k8l0.m(y4l0Var111111);
                    y4l0Var111111.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var5 = k8l0Var8.d;
                                y4l0 y4l0Var111112 = k8l0Var8.f;
                                if (!wok0Var5.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var111112);
                                        y4l0Var111112.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var111112);
                                    y4l0Var111112.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var11119 = k8l0Var3.e;
                    k8l0.k(j6l0Var11119);
                    j6l0Var11119.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                } else {
                    k8l0.m(y4l0Var2);
                    u4l0Var.a("TCF client enabled.");
                    k8l0.l(nfl0Var);
                    nfl0Var.g();
                    y4l0 y4l0Var111112 = k8l0Var3.f;
                    k8l0.m(y4l0Var111112);
                    y4l0Var111112.m.a("Register tcfPrefChangeListener.");
                    if (nfl0Var.u == null) {
                        nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                        nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                                nfl0 nfl0Var2 = nfl0Var;
                                k8l0 k8l0Var8 = nfl0Var2.a;
                                wok0 wok0Var5 = k8l0Var8.d;
                                y4l0 y4l0Var111113 = k8l0Var8.f;
                                if (!wok0Var5.q(null, v2l0.Z0)) {
                                    if (Objects.equals(str10, "IABTCF_TCString")) {
                                        k8l0.m(y4l0Var111113);
                                        y4l0Var111113.n.a("IABTCF_TCString change picked up in listener.");
                                        vcl0 vcl0Var = nfl0Var2.v;
                                        hm20.h(vcl0Var);
                                        vcl0Var.b(500L);
                                        return;
                                    }
                                    return;
                                }
                                if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                                    k8l0.m(y4l0Var111113);
                                    y4l0Var111113.n.a("IABTCF_TCString change picked up in listener.");
                                    vcl0 vcl0Var2 = nfl0Var2.v;
                                    hm20.h(vcl0Var2);
                                    vcl0Var2.b(500L);
                                }
                            }
                        };
                    }
                    j6l0 j6l0Var111110 = k8l0Var3.e;
                    k8l0.k(j6l0Var111110);
                    j6l0Var111110.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
                    k8l0.l(nfl0Var);
                    nfl0Var.m();
                }
                d6l0Var = j6l0Var.f;
                if (d6l0Var.a() == 0) {
                    k8l0.m(y4l0Var2);
                    u4l0Var3.b(Long.valueOf(j), "Persisting first open");
                    d6l0Var.b(j);
                }
                k8l0.l(nfl0Var);
                utl0Var = nfl0Var.r;
                if (utl0Var.c()) {
                    j6l0 j6l0Var111111 = utl0Var.a.e;
                    k8l0.k(j6l0Var111111);
                    j6l0Var111111.w.b(null);
                }
                if (k8l0Var5.h()) {
                    if (k8l0Var5.f()) {
                        yol0Var2 = yol0Var;
                        if (yol0Var2.E("android.permission.INTERNET")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6 = u4l0Var5;
                            u4l0Var6.a("App is missing INTERNET permission");
                        } else {
                            u4l0Var6 = u4l0Var5;
                        }
                        if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                            k8l0.m(y4l0Var2);
                            u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        k8l0Var4 = k8l0Var5;
                        context = k8l0Var4.a;
                        if (!r7k0.a(context).c()) {
                            if (!yol0.X(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!yol0.z(context)) {
                                k8l0.m(y4l0Var2);
                                u4l0Var6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        k8l0Var4 = k8l0Var5;
                        yol0Var2 = yol0Var;
                    }
                    y4l0Var = y4l0Var2;
                } else {
                    k8l0Var4 = k8l0Var5;
                    yol0Var2 = yol0Var;
                    if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                        String strN1113 = k8l0Var4.q().n();
                        j6l0Var.g();
                        String string18 = j6l0Var.k().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strN1113);
                        boolean zIsEmpty18 = TextUtils.isEmpty(string18);
                        if (zIsEmpty) {
                            h6l0Var2 = h6l0Var;
                        } else {
                            h6l0Var2 = h6l0Var;
                        }
                        String strN1114 = k8l0Var4.q().n();
                        j6l0Var.g();
                        SharedPreferences.Editor editorEdit110 = j6l0Var.k().edit();
                        editorEdit110.putString("gmp_app_id", strN1114);
                        editorEdit110.apply();
                    } else {
                        h6l0Var2 = h6l0Var;
                    }
                    if (!j6l0Var.n().i(hbl0Var)) {
                        h6l0Var2.b(null);
                    }
                    k8l0.l(nfl0Var);
                    nfl0Var.g.set(h6l0Var2.a());
                    k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    y4l0Var = y4l0Var2;
                    if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                        zF = k8l0Var4.f();
                        sharedPreferences = j6l0Var.c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            j6l0Var.p(!zF);
                        }
                        if (zF) {
                            k8l0.l(nfl0Var);
                            nfl0Var.s();
                        }
                        wll0 wll0Var18 = k8l0Var4.h;
                        k8l0.l(wll0Var18);
                        wll0Var18.e.a();
                        k8l0Var4.o().k(new AtomicReference());
                        k8l0Var4.o().l(j6l0Var.y.a());
                    }
                }
                kql0.a();
                if (wok0Var.q(null, v2l0.Q0)) {
                    yol0Var2.g();
                    if (yol0Var2.C() == 1) {
                        long jIntValue18 = ((Integer) v2l0.x0.a(null)).intValue();
                        long jNextInt18 = new Random().nextInt(5000);
                        k8l0Var4.k.getClass();
                        jMax = Math.max(500L, ((jIntValue18 * 1000) + jNextInt18) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            k8l0.m(y4l0Var);
                            u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        k8l0.l(nfl0Var);
                        nfl0Var.g();
                        zbl0Var = nfl0Var.l;
                        if (zbl0Var == null) {
                            zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                            nfl0Var.l = zbl0Var;
                        }
                        zbl0Var.b(jMax);
                    }
                }
                j6l0Var.o.b(true);
            }
            EnumMap enumMap12 = new EnumMap(hbl0.class);
            enumMap12.put(hbl0.AD_STORAGE, dbl0VarV);
            enumMap12.put(hbl0Var, dbl0VarV2);
            jbl0Var = new jbl0(enumMap12, -10);
        }
        if (jbl0Var != null) {
            k8l0.l(nfl0Var);
            nfl0Var.C(jbl0Var, true);
            jbl0Var2 = jbl0Var;
        } else {
            jbl0Var2 = jbl0VarN;
        }
        k8l0.l(nfl0Var);
        k8l0Var3 = nfl0Var.a;
        nfl0Var.k(jbl0Var2);
        j6l0Var.g();
        int i111 = crk0.b(j6l0Var.k().getString("dma_consent_settings", null)).a;
        dbl0VarV3 = wok0Var.v("google_analytics_default_allow_ad_personalization_signals", true);
        if (dbl0VarV3 != dbl0Var) {
            k8l0.m(y4l0Var2);
            u4l0Var3.b(dbl0VarV3, "Default ad personalization consent from Manifest");
        }
        dbl0VarV4 = wok0Var.v("google_analytics_default_allow_ad_user_data", true);
        if (dbl0VarV4 == dbl0Var) {
            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                    crk0VarC = crk0.c(30, bundle);
                    it = crk0VarC.e.values().iterator();
                    while (it.hasNext()) {
                        if (((dbl0) it.next()) != dbl0Var) {
                            k8l0.l(nfl0Var);
                            nfl0Var.B(crk0VarC, true);
                            break;
                        }
                    }
                }
            } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                crk0VarC = crk0.c(30, bundle);
                it = crk0VarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((dbl0) it.next()) != dbl0Var) {
                        k8l0.l(nfl0Var);
                        nfl0Var.B(crk0VarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
            if (TextUtils.isEmpty(k8l0Var5.q().n())) {
                crk0VarC = crk0.c(30, bundle);
                it = crk0VarC.e.values().iterator();
                while (it.hasNext()) {
                    if (((dbl0) it.next()) != dbl0Var) {
                        k8l0.l(nfl0Var);
                        nfl0Var.B(crk0VarC, true);
                        break;
                    }
                }
            }
        } else if (TextUtils.isEmpty(k8l0Var5.q().n())) {
            crk0VarC = crk0.c(30, bundle);
            it = crk0VarC.e.values().iterator();
            while (it.hasNext()) {
                if (((dbl0) it.next()) != dbl0Var) {
                    k8l0.l(nfl0Var);
                    nfl0Var.B(crk0VarC, true);
                    break;
                }
            }
        }
        boolS = wok0Var.s("google_analytics_tcf_data_enabled");
        if (boolS != null) {
            k8l0.m(y4l0Var2);
            u4l0Var.a("TCF client enabled.");
            k8l0.l(nfl0Var);
            nfl0Var.g();
            y4l0 y4l0Var111113 = k8l0Var3.f;
            k8l0.m(y4l0Var111113);
            y4l0Var111113.m.a("Register tcfPrefChangeListener.");
            if (nfl0Var.u == null) {
                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        nfl0 nfl0Var2 = nfl0Var;
                        k8l0 k8l0Var8 = nfl0Var2.a;
                        wok0 wok0Var5 = k8l0Var8.d;
                        y4l0 y4l0Var111114 = k8l0Var8.f;
                        if (!wok0Var5.q(null, v2l0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                k8l0.m(y4l0Var111114);
                                y4l0Var111114.n.a("IABTCF_TCString change picked up in listener.");
                                vcl0 vcl0Var = nfl0Var2.v;
                                hm20.h(vcl0Var);
                                vcl0Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            k8l0.m(y4l0Var111114);
                            y4l0Var111114.n.a("IABTCF_TCString change picked up in listener.");
                            vcl0 vcl0Var2 = nfl0Var2.v;
                            hm20.h(vcl0Var2);
                            vcl0Var2.b(500L);
                        }
                    }
                };
            }
            j6l0 j6l0Var111112 = k8l0Var3.e;
            k8l0.k(j6l0Var111112);
            j6l0Var111112.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
            k8l0.l(nfl0Var);
            nfl0Var.m();
        } else {
            k8l0.m(y4l0Var2);
            u4l0Var.a("TCF client enabled.");
            k8l0.l(nfl0Var);
            nfl0Var.g();
            y4l0 y4l0Var111114 = k8l0Var3.f;
            k8l0.m(y4l0Var111114);
            y4l0Var111114.m.a("Register tcfPrefChangeListener.");
            if (nfl0Var.u == null) {
                nfl0Var.v = new vcl0(nfl0Var, k8l0Var3);
                nfl0Var.u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: ffl0
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str10) {
                        nfl0 nfl0Var2 = nfl0Var;
                        k8l0 k8l0Var8 = nfl0Var2.a;
                        wok0 wok0Var5 = k8l0Var8.d;
                        y4l0 y4l0Var111115 = k8l0Var8.f;
                        if (!wok0Var5.q(null, v2l0.Z0)) {
                            if (Objects.equals(str10, "IABTCF_TCString")) {
                                k8l0.m(y4l0Var111115);
                                y4l0Var111115.n.a("IABTCF_TCString change picked up in listener.");
                                vcl0 vcl0Var = nfl0Var2.v;
                                hm20.h(vcl0Var);
                                vcl0Var.b(500L);
                                return;
                            }
                            return;
                        }
                        if (Objects.equals(str10, "IABTCF_TCString") || Objects.equals(str10, "IABTCF_gdprApplies") || Objects.equals(str10, "IABTCF_EnableAdvertiserConsentMode")) {
                            k8l0.m(y4l0Var111115);
                            y4l0Var111115.n.a("IABTCF_TCString change picked up in listener.");
                            vcl0 vcl0Var2 = nfl0Var2.v;
                            hm20.h(vcl0Var2);
                            vcl0Var2.b(500L);
                        }
                    }
                };
            }
            j6l0 j6l0Var111113 = k8l0Var3.e;
            k8l0.k(j6l0Var111113);
            j6l0Var111113.l().registerOnSharedPreferenceChangeListener(nfl0Var.u);
            k8l0.l(nfl0Var);
            nfl0Var.m();
        }
        d6l0Var = j6l0Var.f;
        if (d6l0Var.a() == 0) {
            k8l0.m(y4l0Var2);
            u4l0Var3.b(Long.valueOf(j), "Persisting first open");
            d6l0Var.b(j);
        }
        k8l0.l(nfl0Var);
        utl0Var = nfl0Var.r;
        if (utl0Var.c()) {
            j6l0 j6l0Var111114 = utl0Var.a.e;
            k8l0.k(j6l0Var111114);
            j6l0Var111114.w.b(null);
        }
        if (k8l0Var5.h()) {
            if (k8l0Var5.f()) {
                yol0Var2 = yol0Var;
                if (yol0Var2.E("android.permission.INTERNET")) {
                    k8l0.m(y4l0Var2);
                    u4l0Var6 = u4l0Var5;
                    u4l0Var6.a("App is missing INTERNET permission");
                } else {
                    u4l0Var6 = u4l0Var5;
                }
                if (!yol0Var2.E("android.permission.ACCESS_NETWORK_STATE")) {
                    k8l0.m(y4l0Var2);
                    u4l0Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                k8l0Var4 = k8l0Var5;
                context = k8l0Var4.a;
                if (!r7k0.a(context).c()) {
                    if (!yol0.X(context)) {
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!yol0.z(context)) {
                        k8l0.m(y4l0Var2);
                        u4l0Var6.a("AppMeasurementService not registered/enabled");
                    }
                }
                k8l0.m(y4l0Var2);
                u4l0Var6.a("Uploading is not possible. App measurement disabled");
            } else {
                k8l0Var4 = k8l0Var5;
                yol0Var2 = yol0Var;
            }
            y4l0Var = y4l0Var2;
        } else {
            k8l0Var4 = k8l0Var5;
            yol0Var2 = yol0Var;
            if (TextUtils.isEmpty(k8l0Var4.q().n())) {
                String strN1115 = k8l0Var4.q().n();
                j6l0Var.g();
                String string19 = j6l0Var.k().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strN1115);
                boolean zIsEmpty19 = TextUtils.isEmpty(string19);
                if (zIsEmpty) {
                    h6l0Var2 = h6l0Var;
                } else {
                    h6l0Var2 = h6l0Var;
                }
                String strN1116 = k8l0Var4.q().n();
                j6l0Var.g();
                SharedPreferences.Editor editorEdit111 = j6l0Var.k().edit();
                editorEdit111.putString("gmp_app_id", strN1116);
                editorEdit111.apply();
            } else {
                h6l0Var2 = h6l0Var;
            }
            if (!j6l0Var.n().i(hbl0Var)) {
                h6l0Var2.b(null);
            }
            k8l0.l(nfl0Var);
            nfl0Var.g.set(h6l0Var2.a());
            k8l0Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            y4l0Var = y4l0Var2;
            if (!TextUtils.isEmpty(k8l0Var4.q().n())) {
                zF = k8l0Var4.f();
                sharedPreferences = j6l0Var.c;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    j6l0Var.p(!zF);
                }
                if (zF) {
                    k8l0.l(nfl0Var);
                    nfl0Var.s();
                }
                wll0 wll0Var19 = k8l0Var4.h;
                k8l0.l(wll0Var19);
                wll0Var19.e.a();
                k8l0Var4.o().k(new AtomicReference());
                k8l0Var4.o().l(j6l0Var.y.a());
            }
        }
        kql0.a();
        if (wok0Var.q(null, v2l0.Q0)) {
            yol0Var2.g();
            if (yol0Var2.C() == 1) {
                long jIntValue19 = ((Integer) v2l0.x0.a(null)).intValue();
                long jNextInt19 = new Random().nextInt(5000);
                k8l0Var4.k.getClass();
                jMax = Math.max(500L, ((jIntValue19 * 1000) + jNextInt19) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    k8l0.m(y4l0Var);
                    u4l0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                k8l0.l(nfl0Var);
                nfl0Var.g();
                zbl0Var = nfl0Var.l;
                if (zbl0Var == null) {
                    zbl0Var = new zbl0(nfl0Var, k8l0Var3);
                    nfl0Var.l = zbl0Var;
                }
                zbl0Var.b(jMax);
            }
        }
        j6l0Var.o.b(true);
    }
}
