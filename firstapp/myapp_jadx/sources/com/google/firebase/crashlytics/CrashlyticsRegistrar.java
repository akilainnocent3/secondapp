package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import defpackage.bb30;
import defpackage.ch80;
import defpackage.do8;
import defpackage.dtb;
import defpackage.gph;
import defpackage.is1;
import defpackage.kn8;
import defpackage.nrh;
import defpackage.q9s;
import defpackage.rmd;
import defpackage.sph;
import defpackage.ssh;
import defpackage.tuw;
import defpackage.ubs;
import defpackage.vf4;
import defpackage.yoh;
import defpackage.yz;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    public static final /* synthetic */ int d = 0;
    public final bb30<ExecutorService> a = new bb30<>(is1.class, ExecutorService.class);
    public final bb30<ExecutorService> b = new bb30<>(vf4.class, ExecutorService.class);
    public final bb30<ExecutorService> c = new bb30<>(ubs.class, ExecutorService.class);

    static {
        ch80.a aVar = ch80.a.a;
        Map<ch80.a, ssh.a> map = ssh.b;
        if (map.containsKey(aVar)) {
            Log.d("FirebaseSessions", "Dependency " + aVar + " already added.");
            return;
        }
        map.put(aVar, new ssh.a(new tuw(true)));
        Log.d("FirebaseSessions", "Dependency to " + aVar + " added.");
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<kn8<?>> getComponents() {
        kn8.a aVarB = kn8.b(gph.class);
        aVarB.a = "fire-cls";
        aVarB.a(rmd.c(yoh.class));
        aVarB.a(rmd.c(sph.class));
        aVarB.a(new rmd(this.a, 1, 0));
        aVarB.a(new rmd(this.b, 1, 0));
        aVarB.a(new rmd(this.c, 1, 0));
        aVarB.a(new rmd(0, 2, dtb.class));
        aVarB.a(new rmd(0, 2, yz.class));
        aVarB.a(new rmd(0, 2, nrh.class));
        aVarB.f = new do8() { // from class: itb
            /* JADX WARN: Code duplicated, block: B:100:0x03f5  */
            /* JADX WARN: Code duplicated, block: B:102:0x03fe  */
            /* JADX WARN: Code duplicated, block: B:103:0x0403  */
            /* JADX WARN: Code duplicated, block: B:124:0x052e  */
            /* JADX WARN: Code duplicated, block: B:126:0x0537  */
            /* JADX WARN: Code duplicated, block: B:130:0x0554  */
            /* JADX WARN: Code duplicated, block: B:139:0x05ba  */
            /* JADX WARN: Code duplicated, block: B:141:0x05c9  */
            /* JADX WARN: Code duplicated, block: B:146:0x03a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:155:0x0220 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:158:0x02ea A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:38:0x01ea  */
            /* JADX WARN: Code duplicated, block: B:41:0x01f4  */
            /* JADX WARN: Code duplicated, block: B:43:0x021c  */
            /* JADX WARN: Code duplicated, block: B:49:0x024f  */
            /* JADX WARN: Code duplicated, block: B:52:0x02b6  */
            /* JADX WARN: Code duplicated, block: B:54:0x02be  */
            /* JADX WARN: Code duplicated, block: B:55:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:59:0x02d5  */
            /* JADX WARN: Code duplicated, block: B:61:0x02db  */
            /* JADX WARN: Code duplicated, block: B:65:0x02fe A[LOOP:3: B:64:0x02fc->B:65:0x02fe, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:68:0x031a  */
            /* JADX WARN: Code duplicated, block: B:69:0x0321  */
            /* JADX WARN: Code duplicated, block: B:72:0x0326  */
            /* JADX WARN: Code duplicated, block: B:73:0x0328  */
            /* JADX WARN: Code duplicated, block: B:79:0x0381  */
            /* JADX WARN: Code duplicated, block: B:81:0x0389  */
            /* JADX WARN: Code duplicated, block: B:97:0x03ec  */
            @Override // defpackage.do8
            public final Object a(hi50 hi50Var) throws Throwable {
                String str;
                mub mubVar;
                String str2;
                int i;
                Throwable th;
                String strA;
                int size;
                int i2;
                gph gphVar;
                long jCurrentTimeMillis;
                String strA2;
                String str3;
                String strD;
                int iC;
                String string;
                String[] strArr;
                ArrayList arrayList;
                int i3;
                StringBuilder sb;
                int size2;
                int i4;
                String string2;
                String strG;
                int i5;
                final fk80 fk80Var;
                AtomicReference<TaskCompletionSource<aj80>> atomicReference;
                AtomicReference<aj80> atomicReference2;
                aj80 aj80VarA;
                toc tocVar;
                Task taskOnSuccessTask;
                Context context;
                boolean z;
                String str4;
                mub mubVar2;
                boolean zExists;
                NetworkInfo activeNetworkInfo;
                Resources resources;
                aj80 aj80VarA2;
                String str5;
                String string3;
                CrashlyticsRegistrar crashlyticsRegistrar = this.a;
                int i6 = CrashlyticsRegistrar.d;
                mub.d.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                yoh yohVar = (yoh) hi50Var.a(yoh.class);
                sph sphVar = (sph) hi50Var.a(sph.class);
                njd njdVarH = hi50Var.h(dtb.class);
                njd njdVarH2 = hi50Var.h(yz.class);
                njd njdVarH3 = hi50Var.h(nrh.class);
                ExecutorService executorService = (ExecutorService) hi50Var.d(crashlyticsRegistrar.a);
                ExecutorService executorService2 = (ExecutorService) hi50Var.d(crashlyticsRegistrar.b);
                ExecutorService executorService3 = (ExecutorService) hi50Var.d(crashlyticsRegistrar.c);
                yohVar.a();
                Context context2 = yohVar.a;
                String packageName = context2.getPackageName();
                Log.i("FirebaseCrashlytics", "Initializing Firebase Crashlytics 20.0.1 for " + packageName, null);
                mub mubVar3 = new mub(executorService, executorService2);
                xkh xkhVar = new xkh(context2);
                toc tocVar2 = new toc(yohVar);
                x6n x6nVar = new x6n(context2, packageName, sphVar, tocVar2);
                gtb gtbVar = new gtb(njdVarH);
                e00 e00Var = new e00(njdVarH2);
                wrb wrbVar = new wrb(tocVar2, xkhVar);
                ssh sshVar = ssh.a;
                ch80.a aVar = ch80.a.a;
                ssh sshVar2 = ssh.a;
                ssh.a aVarA = ssh.a(aVar);
                if (aVarA.b != null) {
                    Log.d("FirebaseSessions", "Subscriber " + aVar + " already registered.");
                    str = null;
                } else {
                    aVarA.b = wrbVar;
                    Log.d("FirebaseSessions", "Subscriber " + aVar + " registered.");
                    str = null;
                    aVarA.a.f(null);
                }
                final qsb qsbVar = new qsb(yohVar, x6nVar, gtbVar, tocVar2, new b00(e00Var), new c00(e00Var), xkhVar, wrbVar, new f650(njdVarH3), mubVar3);
                mub mubVar4 = qsbVar.o;
                yohVar.a();
                String str6 = yohVar.c.b;
                int iC2 = ti8.c(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                if (iC2 == 0) {
                    iC2 = ti8.c(context2, "com.crashlytics.android.build_id", "string");
                }
                String string4 = iC2 != 0 ? context2.getResources().getString(iC2) : str;
                ArrayList arrayList2 = new ArrayList();
                int iC3 = ti8.c(context2, "com.google.firebase.crashlytics.build_ids_lib", "array");
                int iC4 = ti8.c(context2, "com.google.firebase.crashlytics.build_ids_arch", "array");
                int iC5 = ti8.c(context2, "com.google.firebase.crashlytics.build_ids_build_id", "array");
                try {
                    try {
                        try {
                            if (iC3 == 0 || iC4 == 0 || iC5 == 0) {
                                mubVar = mubVar4;
                                str2 = str6;
                                String str7 = String.format("Could not find resources: %d %d %d", Integer.valueOf(iC3), Integer.valueOf(iC4), Integer.valueOf(iC5));
                                i = 3;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    th = null;
                                    Log.d("FirebaseCrashlytics", str7, null);
                                }
                                strA = inm.a("Mapping file ID is: ", string4);
                                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                                    Log.d("FirebaseCrashlytics", strA, th);
                                }
                                size = arrayList2.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj = arrayList2.get(i2);
                                    i2++;
                                    bj5 bj5Var = (bj5) obj;
                                    String str8 = bj5Var.a;
                                    String str9 = bj5Var.b;
                                    String str10 = bj5Var.c;
                                    int i7 = size;
                                    StringBuilder sbA = ux5.a("Build id for ", str8, " on ", str9, ": ");
                                    sbA.append(str10);
                                    string3 = sbA.toString();
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", string3, null);
                                    }
                                    size = i7;
                                }
                                String str11 = str2;
                                rr0 rr0VarA = rr0.a(context2, x6nVar, str11, string4, arrayList2, new lbe(context2));
                                str3 = "Installer package name is: " + rr0VarA.d;
                                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", str3, null);
                                }
                                t19 t19Var = new t19();
                                String str12 = rr0VarA.f;
                                String str13 = rr0VarA.g;
                                strD = x6nVar.d();
                                ls6 ls6Var = new ls6();
                                wl80 wl80Var = new wl80(ls6Var);
                                it5 it5Var = new it5(xkhVar);
                                Locale locale = Locale.US;
                                ufd ufdVar = new ufd(tug.a("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str11, "/settings"), t19Var);
                                String str14 = Build.MANUFACTURER;
                                String str15 = x6n.h;
                                String strA3 = oxc.a(str14.replaceAll(str15, ""), "/", Build.MODEL.replaceAll(str15, ""));
                                String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str15, "");
                                String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str15, "");
                                iC = ti8.c(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                                if (iC == 0) {
                                    iC = ti8.c(context2, "com.crashlytics.android.build_id", "string");
                                }
                                if (iC != 0) {
                                    string = context2.getResources().getString(iC);
                                } else {
                                    string = null;
                                }
                                strArr = new String[]{string, str11, str13, str12};
                                arrayList = new ArrayList();
                                i3 = 0;
                                while (i3 < 4) {
                                    str5 = strArr[i3];
                                    String[] strArr2 = strArr;
                                    if (str5 != null) {
                                        arrayList.add(str5.replace("-", "").toLowerCase(Locale.US));
                                    }
                                    i3++;
                                    strArr = strArr2;
                                }
                                Collections.sort(arrayList);
                                sb = new StringBuilder();
                                size2 = arrayList.size();
                                i4 = 0;
                                while (i4 < size2) {
                                    Object obj2 = arrayList.get(i4);
                                    i4++;
                                    sb.append((String) obj2);
                                    arrayList = arrayList;
                                }
                                string2 = sb.toString();
                                if (string2.length() > 0) {
                                    strG = ti8.g(string2);
                                } else {
                                    strG = null;
                                }
                                if (strD != null) {
                                    i5 = 4;
                                } else {
                                    i5 = 1;
                                }
                                fk80Var = new fk80(context2, new am80(str11, strA3, strReplaceAll, strReplaceAll2, x6nVar, strG, str13, str12, imd.a(i5)), ls6Var, wl80Var, it5Var, ufdVar, tocVar2);
                                gj80 gj80Var = gj80.a;
                                atomicReference = fk80Var.h;
                                atomicReference2 = fk80Var.g;
                                if (fk80Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(fk80Var.b.f) || (aj80VarA2 = fk80Var.a(gj80Var)) == null) {
                                    aj80VarA = fk80Var.a(gj80.c);
                                    if (aj80VarA != null) {
                                        atomicReference2.set(aj80VarA);
                                        atomicReference.get().trySetResult(aj80VarA);
                                    }
                                    tocVar = fk80Var.f;
                                    Task<Void> task = tocVar.h.getTask();
                                    synchronized (tocVar.c) {
                                        Task<Void> task2 = tocVar.d.getTask();
                                    }
                                    taskOnSuccessTask = cub.a(task, task2).onSuccessTask(mubVar3.a, new ek80(fk80Var, mubVar3));
                                } else {
                                    atomicReference2.set(aj80VarA2);
                                    atomicReference.get().trySetResult(aj80VarA2);
                                    taskOnSuccessTask = Tasks.forResult(null);
                                }
                                taskOnSuccessTask.addOnFailureListener(executorService3, new fph());
                                xkh xkhVar2 = qsbVar.i;
                                context = qsbVar.a;
                                if (context != null || (resources = context.getResources()) == null) {
                                    z = true;
                                } else {
                                    int iC6 = ti8.c(context, "com.crashlytics.RequireBuildId", "bool");
                                    if (iC6 > 0) {
                                        z = resources.getBoolean(iC6);
                                    } else {
                                        int iC7 = ti8.c(context, "com.crashlytics.RequireBuildId", "string");
                                        if (iC7 > 0) {
                                            z = Boolean.parseBoolean(context.getString(iC7));
                                        } else {
                                            z = true;
                                        }
                                    }
                                }
                                str4 = rr0VarA.b;
                                if (z) {
                                    if (TextUtils.isEmpty(str4)) {
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".     |  | ");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                                        Log.e("FirebaseCrashlytics", ".    \\    /");
                                        Log.e("FirebaseCrashlytics", ".     \\  /");
                                        Log.e("FirebaseCrashlytics", ".      \\/");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        Log.e("FirebaseCrashlytics", ".");
                                        Log.e("FirebaseCrashlytics", ".      /\\");
                                        Log.e("FirebaseCrashlytics", ".     /  \\");
                                        Log.e("FirebaseCrashlytics", ".    /    \\");
                                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".     |  |");
                                        Log.e("FirebaseCrashlytics", ".");
                                        ib5.a("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                                        return null;
                                    }
                                } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                    Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                                }
                                String str16 = new km5().a;
                                qsbVar.f = new vsb("crash_marker", xkhVar2);
                                qsbVar.e = new vsb("initialization_marker", xkhVar2);
                                mubVar2 = mubVar;
                                oph0 oph0Var = new oph0(str16, xkhVar2, mubVar2);
                                ift iftVar = new ift(xkhVar2);
                                spv spvVar = new spv(new rl9());
                                ((q2z) qsbVar.n.a).a(new e650(new jtb(oph0Var)));
                                qsbVar.g = new esb(qsbVar.a, qsbVar.h, qsbVar.b, qsbVar.i, qsbVar.f, rr0VarA, oph0Var, iftVar, ah80.d(qsbVar.a, qsbVar.h, qsbVar.i, rr0VarA, iftVar, oph0Var, spvVar, fk80Var, qsbVar.c, qsbVar.l, qsbVar.o), qsbVar.m, qsbVar.k, qsbVar.l, qsbVar.o);
                                vsb vsbVar = qsbVar.e;
                                zExists = new File(vsbVar.b.c, vsbVar.a).exists();
                                Boolean.TRUE.equals((Boolean) mubVar2.a.a.submit(new Callable() { // from class: ksb
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        esb esbVar = qsbVar.g;
                                        esbVar.getClass();
                                        mub.a();
                                        vsb vsbVar2 = esbVar.c;
                                        xkh xkhVar3 = vsbVar2.b;
                                        String str17 = vsbVar2.a;
                                        boolean z2 = true;
                                        if (new File(xkhVar3.c, str17).exists()) {
                                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                                            }
                                            new File(vsbVar2.b.c, str17).delete();
                                        } else {
                                            String strD2 = esbVar.d();
                                            if (strD2 == null || !esbVar.j.d(strD2)) {
                                                z2 = false;
                                            }
                                        }
                                        return Boolean.valueOf(z2);
                                    }
                                }).get(3L, TimeUnit.SECONDS));
                                esb esbVar = qsbVar.g;
                                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                                esbVar.e.a.a(new xrb(0, esbVar, str16));
                                fub fubVar = new fub(new zrb(esbVar), fk80Var, defaultUncaughtExceptionHandler, esbVar.j);
                                esbVar.n = fubVar;
                                Thread.setDefaultUncaughtExceptionHandler(fubVar);
                                if (zExists || (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && ((activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()))) {
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                                    }
                                    mubVar2.a.a(new Runnable() { // from class: gsb
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            qsbVar.a(fk80Var);
                                        }
                                    });
                                } else {
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", "Crashlytics did not finish previous background initialization. Initializing synchronously.", null);
                                    }
                                    qsbVar.b(fk80Var);
                                }
                                gphVar = new gph(qsbVar);
                                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                                if (jCurrentTimeMillis > 16) {
                                    strA2 = d020.a(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                        Log.d("FirebaseCrashlytics", strA2, null);
                                    }
                                }
                                return gphVar;
                            }
                            String[] stringArray = context2.getResources().getStringArray(iC3);
                            String[] stringArray2 = context2.getResources().getStringArray(iC4);
                            String[] stringArray3 = context2.getResources().getStringArray(iC5);
                            if (stringArray.length == stringArray3.length && stringArray2.length == stringArray3.length) {
                                int i8 = 0;
                                while (i8 < stringArray3.length) {
                                    int i9 = i8;
                                    arrayList2.add(new bj5(stringArray[i9], stringArray2[i9], stringArray3[i9]));
                                    i8 = i9 + 1;
                                    str6 = str6;
                                    mubVar4 = mubVar4;
                                }
                                mubVar = mubVar4;
                                str2 = str6;
                            } else {
                                mubVar = mubVar4;
                                str2 = str6;
                                String str17 = String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length));
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str17, null);
                                }
                            }
                            i = 3;
                            Boolean.TRUE.equals((Boolean) mubVar2.a.a.submit(new Callable() { // from class: ksb
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    esb esbVar2 = qsbVar.g;
                                    esbVar2.getClass();
                                    mub.a();
                                    vsb vsbVar2 = esbVar2.c;
                                    xkh xkhVar3 = vsbVar2.b;
                                    String str18 = vsbVar2.a;
                                    boolean z2 = true;
                                    if (new File(xkhVar3.c, str18).exists()) {
                                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                                        }
                                        new File(vsbVar2.b.c, str18).delete();
                                    } else {
                                        String strD2 = esbVar2.d();
                                        if (strD2 == null || !esbVar2.j.d(strD2)) {
                                            z2 = false;
                                        }
                                    }
                                    return Boolean.valueOf(z2);
                                }
                            }).get(3L, TimeUnit.SECONDS));
                        } catch (Exception unused) {
                        }
                        qsbVar.f = new vsb("crash_marker", xkhVar2);
                        qsbVar.e = new vsb("initialization_marker", xkhVar2);
                        mubVar2 = mubVar;
                        oph0 oph0Var2 = new oph0(str16, xkhVar2, mubVar2);
                        ift iftVar2 = new ift(xkhVar2);
                        spv spvVar2 = new spv(new rl9());
                        ((q2z) qsbVar.n.a).a(new e650(new jtb(oph0Var2)));
                        qsbVar.g = new esb(qsbVar.a, qsbVar.h, qsbVar.b, qsbVar.i, qsbVar.f, rr0VarA, oph0Var2, iftVar2, ah80.d(qsbVar.a, qsbVar.h, qsbVar.i, rr0VarA, iftVar2, oph0Var2, spvVar2, fk80Var, qsbVar.c, qsbVar.l, qsbVar.o), qsbVar.m, qsbVar.k, qsbVar.l, qsbVar.o);
                        vsb vsbVar2 = qsbVar.e;
                        zExists = new File(vsbVar2.b.c, vsbVar2.a).exists();
                        esb esbVar2 = qsbVar.g;
                        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler2 = Thread.getDefaultUncaughtExceptionHandler();
                        esbVar2.e.a.a(new xrb(0, esbVar2, str16));
                        fub fubVar2 = new fub(new zrb(esbVar2), fk80Var, defaultUncaughtExceptionHandler2, esbVar2.j);
                        esbVar2.n = fubVar2;
                        Thread.setDefaultUncaughtExceptionHandler(fubVar2);
                        if (zExists) {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            mubVar2.a.a(new Runnable() { // from class: gsb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qsbVar.a(fk80Var);
                                }
                            });
                        } else {
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", "Successfully configured exception handler.", null);
                            }
                            mubVar2.a.a(new Runnable() { // from class: gsb
                                @Override // java.lang.Runnable
                                public final void run() {
                                    qsbVar.a(fk80Var);
                                }
                            });
                        }
                    } catch (Exception e) {
                        Log.e("FirebaseCrashlytics", "Crashlytics was not started due to an exception during initialization", e);
                        qsbVar.g = null;
                    }
                    rr0 rr0VarA2 = rr0.a(context2, x6nVar, str11, string4, arrayList2, new lbe(context2));
                    str3 = "Installer package name is: " + rr0VarA2.d;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    t19 t19Var2 = new t19();
                    String str18 = rr0VarA2.f;
                    String str19 = rr0VarA2.g;
                    strD = x6nVar.d();
                    ls6 ls6Var2 = new ls6();
                    wl80 wl80Var2 = new wl80(ls6Var2);
                    it5 it5Var2 = new it5(xkhVar);
                    Locale locale2 = Locale.US;
                    ufd ufdVar2 = new ufd(tug.a("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str11, "/settings"), t19Var2);
                    String str110 = Build.MANUFACTURER;
                    String str111 = x6n.h;
                    String strA4 = oxc.a(str110.replaceAll(str111, ""), "/", Build.MODEL.replaceAll(str111, ""));
                    String strReplaceAll3 = Build.VERSION.INCREMENTAL.replaceAll(str111, "");
                    String strReplaceAll4 = Build.VERSION.RELEASE.replaceAll(str111, "");
                    iC = ti8.c(context2, "com.google.firebase.crashlytics.mapping_file_id", "string");
                    if (iC == 0) {
                        iC = ti8.c(context2, "com.crashlytics.android.build_id", "string");
                    }
                    if (iC != 0) {
                        string = context2.getResources().getString(iC);
                    } else {
                        string = null;
                    }
                    strArr = new String[]{string, str11, str19, str18};
                    arrayList = new ArrayList();
                    i3 = 0;
                    while (i3 < 4) {
                        str5 = strArr[i3];
                        String[] strArr3 = strArr;
                        if (str5 != null) {
                            arrayList.add(str5.replace("-", "").toLowerCase(Locale.US));
                        }
                        i3++;
                        strArr = strArr3;
                    }
                    Collections.sort(arrayList);
                    sb = new StringBuilder();
                    size2 = arrayList.size();
                    i4 = 0;
                    while (i4 < size2) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        sb.append((String) obj3);
                        arrayList = arrayList;
                    }
                    string2 = sb.toString();
                    if (string2.length() > 0) {
                        strG = ti8.g(string2);
                    } else {
                        strG = null;
                    }
                    if (strD != null) {
                        i5 = 4;
                    } else {
                        i5 = 1;
                    }
                    fk80Var = new fk80(context2, new am80(str11, strA4, strReplaceAll3, strReplaceAll4, x6nVar, strG, str19, str18, imd.a(i5)), ls6Var2, wl80Var2, it5Var2, ufdVar2, tocVar2);
                    gj80 gj80Var2 = gj80.a;
                    atomicReference = fk80Var.h;
                    atomicReference2 = fk80Var.g;
                    if (fk80Var.a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(fk80Var.b.f)) {
                        aj80VarA = fk80Var.a(gj80.c);
                        if (aj80VarA != null) {
                            atomicReference2.set(aj80VarA);
                            atomicReference.get().trySetResult(aj80VarA);
                        }
                        tocVar = fk80Var.f;
                        Task<Void> task3 = tocVar.h.getTask();
                        synchronized (tocVar.c) {
                            Task<Void> task4 = tocVar.d.getTask();
                            taskOnSuccessTask = cub.a(task3, task4).onSuccessTask(mubVar3.a, new ek80(fk80Var, mubVar3));
                        }
                    } else {
                        aj80VarA = fk80Var.a(gj80.c);
                        if (aj80VarA != null) {
                            atomicReference2.set(aj80VarA);
                            atomicReference.get().trySetResult(aj80VarA);
                        }
                        tocVar = fk80Var.f;
                        Task<Void> task5 = tocVar.h.getTask();
                        synchronized (tocVar.c) {
                            Task<Void> task6 = tocVar.d.getTask();
                            taskOnSuccessTask = cub.a(task5, task6).onSuccessTask(mubVar3.a, new ek80(fk80Var, mubVar3));
                        }
                    }
                    taskOnSuccessTask.addOnFailureListener(executorService3, new fph());
                    xkh xkhVar3 = qsbVar.i;
                    context = qsbVar.a;
                    if (context != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    str4 = rr0VarA2.b;
                    if (z) {
                        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                            Log.v("FirebaseCrashlytics", "Configured not to require a build ID.", null);
                        }
                    } else if (TextUtils.isEmpty(str4)) {
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".     |  | ");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
                        Log.e("FirebaseCrashlytics", ".    \\    /");
                        Log.e("FirebaseCrashlytics", ".     \\  /");
                        Log.e("FirebaseCrashlytics", ".      \\/");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        Log.e("FirebaseCrashlytics", ".");
                        Log.e("FirebaseCrashlytics", ".      /\\");
                        Log.e("FirebaseCrashlytics", ".     /  \\");
                        Log.e("FirebaseCrashlytics", ".    /    \\");
                        Log.e("FirebaseCrashlytics", ".   / |  | \\");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".     |  |");
                        Log.e("FirebaseCrashlytics", ".");
                        ib5.a("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
                        return null;
                    }
                    String str112 = new km5().a;
                    gphVar = new gph(qsbVar);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("FirebaseCrashlytics", "Error retrieving app package info.", e2);
                    gphVar = null;
                }
                th = null;
                strA = inm.a("Mapping file ID is: ", string4);
                if (Log.isLoggable("FirebaseCrashlytics", i)) {
                    Log.d("FirebaseCrashlytics", strA, th);
                }
                size = arrayList2.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    bj5 bj5Var2 = (bj5) obj4;
                    String str20 = bj5Var2.a;
                    String str21 = bj5Var2.b;
                    String str113 = bj5Var2.c;
                    int i10 = size;
                    StringBuilder sbA2 = ux5.a("Build id for ", str20, " on ", str21, ": ");
                    sbA2.append(str113);
                    string3 = sbA2.toString();
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", string3, null);
                    }
                    size = i10;
                }
                String str114 = str2;
                jCurrentTimeMillis = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (jCurrentTimeMillis > 16) {
                    strA2 = d020.a(jCurrentTimeMillis, "Initializing Crashlytics blocked main for ", " ms");
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", strA2, null);
                    }
                }
                return gphVar;
            }
        };
        aVarB.c(2);
        return Arrays.asList(aVarB.b(), q9s.a("fire-cls", "20.0.1"));
    }
}
