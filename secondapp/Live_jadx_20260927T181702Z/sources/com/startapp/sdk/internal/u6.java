package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class u6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f75593c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f75594d = {fk.i.f84794b};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f75595e = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f75596f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f75597g = {"fstab.andy", "ueventd.andy.rc"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f75598h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final pe[] f75599i = {new pe("init.svc.qemud", null), new pe("init.svc.qemu-props", null), new pe("qemu.hw.mainkeys", null), new pe("qemu.sf.fake_camera", null), new pe("qemu.sf.lcd_density", null), new pe("ro.bootloader", "unknown"), new pe("ro.bootmode", "unknown"), new pe("ro.hardware", fk.i.f84794b), new pe("ro.kernel.android.qemud", null), new pe("ro.kernel.qemu.gles", null), new pe("ro.kernel.qemu", "1"), new pe("ro.product.device", "generic"), new pe("ro.product.model", "sdk"), new pe("ro.product.name", "sdk"), new pe("ro.serialno", null), new pe("ro.build.description", "72656C656173652D6B657973"), new pe("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new pe("net.eth0.dns1", null), new pe("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new pe("ro.radio.use-ppp", null), new pe("gsm.version.baseband", null), new pe("ro.build.tags", "72656C656173652D6B65"), new pe("ro.build.display.id", "746573742D"), new pe("init.svc.console", null)};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static u6 f75600j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Boolean f75601k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f75602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75603b;

    public u6(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f75603b = arrayList;
        this.f75602a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        arrayList.add("com.bluestacks");
        arrayList.add("com.bignox.app");
        arrayList.add("com.vphone.launcher");
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e0 A[Catch: Exception -> 0x01ec, LOOP:2: B:110:0x01da->B:112:0x01e0, LOOP_END, TryCatch #0 {Exception -> 0x01ec, blocks: (B:109:0x01be, B:110:0x01da, B:112:0x01e0, B:113:0x01e9), top: B:175:0x01be }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0200  */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:131:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x026b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:140:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:147:0x0281  */
    /* JADX WARN: Code duplicated, block: B:151:0x028e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0291  */
    /* JADX WARN: Code duplicated, block: B:156:0x029a  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:164:0x02c5 A[EDGE_INSN: B:164:0x02c5->B:166:0x02c8 BREAK  A[LOOP:5: B:157:0x02a6->B:210:0x02a6]] */
    /* JADX WARN: Code duplicated, block: B:165:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x027b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    public static boolean a(Context context) throws Throwable {
        boolean z10;
        PackageManager packageManager;
        Iterator it;
        Intent launchIntentForPackage;
        pe[] peVarArr;
        int i10;
        int i11;
        String str;
        String str2;
        StringBuilder sb2;
        String string;
        String[] strArrSplit;
        int length;
        int i12;
        String str3;
        InputStream inputStream;
        byte[] bArr;
        BufferedReader bufferedReader;
        if (f75601k == null) {
            if (f75600j == null) {
                Context contextA = w0.a(context);
                if (contextA != null) {
                    context = contextA;
                }
                f75600j = new u6(context);
            }
            u6 u6Var = f75600j;
            u6Var.getClass();
            String str4 = Build.FINGERPRINT;
            boolean z11 = true;
            if (str4.startsWith("generic")) {
                z10 = true;
            } else {
                String str5 = Build.MODEL;
                if (str5.contains("google_sdk")) {
                    z10 = true;
                } else {
                    Locale locale = Locale.ROOT;
                    if (str5.toLowerCase(locale).contains("droid4x") || str5.contains("Emulator") || str5.contains("Android SDK built for") || Build.MANUFACTURER.contains("Genymotion")) {
                        z10 = true;
                    } else {
                        String str6 = Build.HARDWARE;
                        if (str6.equals(fk.i.f84794b) || str6.equals("vbox86")) {
                            z10 = true;
                        } else {
                            String str7 = Build.PRODUCT;
                            if (str7.equals("sdk") || str7.equals("google_sdk") || str7.equals("sdk_x86") || str7.equals("vbox86p") || Build.BOARD.toLowerCase(locale).contains("nox") || Build.BOOTLOADER.toLowerCase(locale).contains("nox") || str6.toLowerCase(locale).contains("nox") || str7.toLowerCase(locale).contains("nox") || str4.startsWith("unknown") || str4.contains("Andy") || str4.contains("ttVM_Hdragon") || str4.contains("vbox86p") || str6.contains("ttVM_x86") || str5.equals("sdk") || str5.contains("Droid4X") || str5.contains("TiantianVM") || str5.contains("Andy") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                    }
                }
            }
            if (!z10) {
                if (u6Var.a(f75593c, "Geny") || u6Var.a(f75597g, "Andy") || u6Var.a(f75598h, "Nox")) {
                    z10 = true;
                } else {
                    File[] fileArr = {new File("/proc/tty/drivers"), new File("/proc/cpuinfo")};
                    int i13 = 0;
                    while (true) {
                        BufferedReader bufferedReader2 = null;
                        if (i13 < 2) {
                            File file = fileArr[i13];
                            if (file.exists() && file.canRead()) {
                                char[] cArr = new char[1024];
                                StringBuilder sb3 = new StringBuilder();
                                try {
                                    bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                                    while (true) {
                                        try {
                                            int i14 = bufferedReader.read(cArr);
                                            if (i14 != -1) {
                                                sb3.append(cArr, 0, i14);
                                            } else {
                                                try {
                                                    break;
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Exception unused2) {
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (IOException unused3) {
                                                }
                                            }
                                            if (u6Var.a(f75595e, "Pipes")) {
                                                try {
                                                    if (u6Var.f75602a.checkSelfPermission("android.permission.INTERNET") == 0) {
                                                        String[] strArr = {"/system/bin/netcfg"};
                                                        sb2 = new StringBuilder();
                                                        try {
                                                            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
                                                            processBuilder.directory(new File("/system/bin/"));
                                                            processBuilder.redirectErrorStream(true);
                                                            inputStream = processBuilder.start().getInputStream();
                                                            bArr = new byte[1024];
                                                            while (inputStream.read(bArr) != -1) {
                                                                sb2.append(new String(bArr));
                                                            }
                                                            inputStream.close();
                                                        } catch (Exception unused4) {
                                                        }
                                                        string = sb2.toString();
                                                        if (TextUtils.isEmpty(string)) {
                                                            peVarArr = f75599i;
                                                            i11 = 0;
                                                            for (i10 = 0; i10 < 24; i10++) {
                                                                pe peVar = peVarArr[i10];
                                                                Context context2 = u6Var.f75602a;
                                                                String str8 = peVar.f75373a;
                                                                Class<?> clsLoadClass = context2.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                                                str = (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, str8);
                                                                str2 = peVar.f75374b;
                                                                if (str2 == null) {
                                                                    i11++;
                                                                }
                                                                if (str2 == null) {
                                                                }
                                                            }
                                                            if (i11 >= 5) {
                                                            }
                                                            z10 = false;
                                                        } else {
                                                            strArrSplit = string.split(IOUtils.LINE_SEPARATOR_UNIX);
                                                            length = strArrSplit.length;
                                                            i12 = 0;
                                                            while (true) {
                                                                if (i12 < length) {
                                                                    str3 = strArrSplit[i12];
                                                                    if (str3.contains("wlan0")) {
                                                                    }
                                                                    i12++;
                                                                } else {
                                                                    peVarArr = f75599i;
                                                                    i11 = 0;
                                                                    while (i10 < 24) {
                                                                        pe peVar2 = peVarArr[i10];
                                                                        Context context3 = u6Var.f75602a;
                                                                        String str9 = peVar2.f75373a;
                                                                        try {
                                                                            Class<?> clsLoadClass2 = context3.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                                                            str = (String) clsLoadClass2.getMethod("get", String.class).invoke(clsLoadClass2, str9);
                                                                        } catch (Exception unused5) {
                                                                            str = null;
                                                                        }
                                                                        str2 = peVar2.f75374b;
                                                                        if (str2 == null) {
                                                                            i11++;
                                                                        }
                                                                        if (str2 == null) {
                                                                        }
                                                                    }
                                                                    if (i11 >= 5) {
                                                                    }
                                                                    z10 = false;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        peVarArr = f75599i;
                                                        i11 = 0;
                                                        while (i10 < 24) {
                                                            pe peVar3 = peVarArr[i10];
                                                            Context context4 = u6Var.f75602a;
                                                            String str10 = peVar3.f75373a;
                                                            Class<?> clsLoadClass3 = context4.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                                            str = (String) clsLoadClass3.getMethod("get", String.class).invoke(clsLoadClass3, str10);
                                                            str2 = peVar3.f75374b;
                                                            if (str2 == null) {
                                                                i11++;
                                                            }
                                                            if (str2 == null) {
                                                            }
                                                        }
                                                        if (i11 >= 5) {
                                                        }
                                                        z10 = false;
                                                    }
                                                } catch (Throwable unused6) {
                                                }
                                            }
                                            if (z10) {
                                                z11 = z10;
                                            } else {
                                                if (u6Var.f75603b.isEmpty()) {
                                                    z11 = false;
                                                    break;
                                                }
                                                packageManager = u6Var.f75602a.getPackageManager();
                                                it = u6Var.f75603b.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        z11 = false;
                                                        break;
                                                    }
                                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
                                                    if (launchIntentForPackage == null) {
                                                    }
                                                }
                                            }
                                            f75601k = Boolean.valueOf(z11);
                                            return f75601k.booleanValue();
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedReader2 = bufferedReader;
                                            if (bufferedReader2 != null) {
                                                try {
                                                    bufferedReader2.close();
                                                } catch (IOException unused7) {
                                                }
                                            }
                                            throw th;
                                        }
                                    }
                                    bufferedReader.close();
                                    if (sb3.toString().contains(f75594d[0])) {
                                        z10 = true;
                                    }
                                } catch (Exception unused8) {
                                    bufferedReader = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                            i13++;
                        }
                        if (u6Var.a(f75595e, "Pipes")) {
                            z10 = true;
                        } else if (u6Var.f75602a.checkSelfPermission("android.permission.INTERNET") == 0) {
                            String[] strArr2 = {"/system/bin/netcfg"};
                            sb2 = new StringBuilder();
                            ProcessBuilder processBuilder2 = new ProcessBuilder(strArr2);
                            processBuilder2.directory(new File("/system/bin/"));
                            processBuilder2.redirectErrorStream(true);
                            inputStream = processBuilder2.start().getInputStream();
                            bArr = new byte[1024];
                            while (inputStream.read(bArr) != -1) {
                                sb2.append(new String(bArr));
                            }
                            inputStream.close();
                            string = sb2.toString();
                            if (TextUtils.isEmpty(string)) {
                                strArrSplit = string.split(IOUtils.LINE_SEPARATOR_UNIX);
                                length = strArrSplit.length;
                                i12 = 0;
                                while (true) {
                                    if (i12 < length) {
                                        str3 = strArrSplit[i12];
                                        if ((str3.contains("wlan0") && !str3.contains("tunl0") && !str3.contains("eth0")) || !str3.contains("10.0.2.15")) {
                                            i12++;
                                        }
                                    } else {
                                        peVarArr = f75599i;
                                        i11 = 0;
                                        while (i10 < 24) {
                                            pe peVar4 = peVarArr[i10];
                                            Context context5 = u6Var.f75602a;
                                            String str11 = peVar4.f75373a;
                                            Class<?> clsLoadClass4 = context5.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                            str = (String) clsLoadClass4.getMethod("get", String.class).invoke(clsLoadClass4, str11);
                                            str2 = peVar4.f75374b;
                                            if (str2 == null && str != null) {
                                                i11++;
                                            }
                                            if (str2 == null && str != null && str.contains(str2)) {
                                                i11++;
                                            }
                                        }
                                        if (i11 >= 5 || !u6Var.a(f75596f, "X86")) {
                                            z10 = false;
                                        }
                                    }
                                    z10 = true;
                                }
                            } else {
                                peVarArr = f75599i;
                                i11 = 0;
                                while (i10 < 24) {
                                    pe peVar5 = peVarArr[i10];
                                    Context context6 = u6Var.f75602a;
                                    String str12 = peVar5.f75373a;
                                    Class<?> clsLoadClass5 = context6.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                    str = (String) clsLoadClass5.getMethod("get", String.class).invoke(clsLoadClass5, str12);
                                    str2 = peVar5.f75374b;
                                    if (str2 == null) {
                                        i11++;
                                    }
                                    if (str2 == null) {
                                    }
                                }
                                if (i11 >= 5) {
                                }
                                z10 = false;
                            }
                        } else {
                            peVarArr = f75599i;
                            i11 = 0;
                            while (i10 < 24) {
                                pe peVar6 = peVarArr[i10];
                                Context context7 = u6Var.f75602a;
                                String str13 = peVar6.f75373a;
                                Class<?> clsLoadClass6 = context7.getClassLoader().loadClass(new String(new char[]{'a', 'n', 'd', 'r', 'o', 'i', 'd', kj.e.f102543c, 'o', 's', kj.e.f102543c}).concat("SystemProperties"));
                                str = (String) clsLoadClass6.getMethod("get", String.class).invoke(clsLoadClass6, str13);
                                str2 = peVar6.f75374b;
                                if (str2 == null) {
                                    i11++;
                                }
                                if (str2 == null) {
                                }
                            }
                            if (i11 >= 5) {
                            }
                            z10 = false;
                        }
                    }
                }
            }
            if (z10) {
                if (u6Var.f75603b.isEmpty()) {
                    z11 = false;
                    break;
                }
                packageManager = u6Var.f75602a.getPackageManager();
                it = u6Var.f75603b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) it.next());
                    if (launchIntentForPackage == null && !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty()) {
                        break;
                    }
                }
            } else {
                z11 = z10;
            }
            f75601k = Boolean.valueOf(z11);
        }
        return f75601k.booleanValue();
    }

    public final boolean a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            try {
                if (this.f75602a.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && str2.contains(to.c.userBaseDel) && str.equals("Nox")) {
                    file = new File(Environment.getExternalStorageDirectory() + str2);
                } else {
                    file = new File(str2);
                }
            } catch (Throwable unused) {
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }
}
