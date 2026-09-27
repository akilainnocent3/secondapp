package com.startapp.sdk.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class we {
    /* JADX WARN: Code duplicated, block: B:104:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0174  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2 A[LOOP:5: B:80:0x019f->B:85:0x01b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dc A[PHI: r4
      0x01dc: PHI (r4v2 java.lang.Process) = (r4v1 java.lang.Process), (r4v4 java.lang.Process) binds: [B:94:0x01df, B:90:0x01d8] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(Context context) {
        boolean z10;
        String str;
        boolean z11;
        String[] strArr;
        int i10;
        boolean z12;
        Process processExec;
        boolean z13;
        boolean zExists;
        Process processExec2;
        boolean z14;
        PackageManager packageManager = context.getPackageManager();
        char c10 = 1;
        if (ue.a(packageManager, ve.f75702a)) {
            z10 = true;
        } else if ((ue.a(packageManager, new String[]{"com.noshufou.android.su", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.zachspong.temprootremovejb", "com.ramdroid.appquarantine"}) ? true : ue.a(packageManager, ve.f75703b)) || ue.a("su") || ue.a("busybox")) {
            z10 = true;
        } else {
            HashMap map = new HashMap();
            map.put("ro.debuggable", "1");
            map.put("ro.secure", "0");
            String[] strArrSplit = new String[0];
            try {
                strArrSplit = new Scanner(Runtime.getRuntime().exec("getprop").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
            } catch (IOException | NoSuchElementException unused) {
            }
            boolean z15 = false;
            for (String str2 : strArrSplit) {
                for (String str3 : map.keySet()) {
                    if (str2.contains(str3)) {
                        if (str2.contains(C4235d4.j.f61460d + ((String) map.get(str3)) + C4235d4.j.f61462e)) {
                            z15 = true;
                        }
                    }
                }
            }
            if (z15) {
                z10 = true;
            } else {
                String[] strArrSplit2 = new String[0];
                try {
                    strArrSplit2 = new Scanner(Runtime.getRuntime().exec("mount").getInputStream()).useDelimiter("\\A").next().split(IOUtils.LINE_SEPARATOR_UNIX);
                } catch (IOException | NoSuchElementException unused2) {
                }
                int length = strArrSplit2.length;
                int i11 = 0;
                boolean z16 = false;
                while (i11 < length) {
                    String[] strArrSplit3 = strArrSplit2[i11].split(" ");
                    if (strArrSplit3.length >= 4) {
                        String str4 = strArrSplit3[c10];
                        String str5 = strArrSplit3[3];
                        String[] strArr2 = ve.f75705d;
                        for (int i12 = 0; i12 < 7; i12++) {
                            if (str4.equalsIgnoreCase(strArr2[i12])) {
                                for (String str6 : str5.split(",")) {
                                    if (str6.equalsIgnoreCase("rw")) {
                                        z16 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    i11++;
                    c10 = 1;
                }
                if (z16) {
                    z10 = true;
                } else {
                    String str7 = Build.TAGS;
                    if (str7 != null && str7.contains("test-keys")) {
                        z10 = true;
                    } else {
                        try {
                            processExec2 = Runtime.getRuntime().exec(new String[]{"which", "su"});
                            try {
                                z14 = new BufferedReader(new InputStreamReader(processExec2.getInputStream())).readLine() != null;
                            } catch (Throwable unused3) {
                                if (processExec2 == null) {
                                    z14 = false;
                                }
                                if (z14) {
                                    z10 = true;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    str = Build.TAGS;
                                    if (str == null) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z11) {
                                        strArr = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                                        i10 = 0;
                                        while (true) {
                                            if (i10 < 10) {
                                                z12 = false;
                                                break;
                                            }
                                            if (new File(strArr[i10]).exists()) {
                                                z12 = true;
                                                break;
                                            }
                                            i10++;
                                        }
                                        if (!z12) {
                                            try {
                                                processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                                                try {
                                                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                } catch (Throwable unused4) {
                                                    if (processExec == null) {
                                                        z13 = false;
                                                    }
                                                    if (!z13) {
                                                        try {
                                                            zExists = new File("/system/app/Superuser.apk").exists();
                                                        } catch (Throwable unused5) {
                                                            zExists = false;
                                                        }
                                                        if (!zExists) {
                                                            return false;
                                                        }
                                                    }
                                                    return true;
                                                }
                                            } catch (Throwable unused6) {
                                                processExec = null;
                                            }
                                            processExec.destroy();
                                            if (!z13) {
                                                zExists = new File("/system/app/Superuser.apk").exists();
                                                if (!zExists) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } catch (Throwable unused7) {
                            processExec2 = null;
                        }
                        processExec2.destroy();
                        if (z14 || ue.a("magisk")) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                }
            }
        }
        if (!z10) {
            str = Build.TAGS;
            if (str == null && str.contains("test-keys")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                strArr = new String[]{"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
                i10 = 0;
                while (true) {
                    if (i10 < 10) {
                        z12 = false;
                        break;
                    }
                    if (new File(strArr[i10]).exists()) {
                        z12 = true;
                        break;
                    }
                    i10++;
                }
                if (!z12) {
                    processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
                    if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() != null) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    processExec.destroy();
                    if (!z13) {
                        zExists = new File("/system/app/Superuser.apk").exists();
                        if (!zExists) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
