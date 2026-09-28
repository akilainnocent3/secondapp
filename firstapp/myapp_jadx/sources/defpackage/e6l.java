package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes4.dex */
public final class e6l {
    public static e6l c;
    public final Context a;
    public volatile String b;

    public e6l(Context context) {
        this.a = context.getApplicationContext();
    }

    public static e6l a(Context context) {
        e6l e6lVar;
        hm20.h(context);
        synchronized (e6l.class) {
            e6lVar = c;
            if (e6lVar == null) {
                l5l0 l5l0Var = djl0.a;
                synchronized (djl0.class) {
                    if (djl0.e == null) {
                        djl0.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                e6lVar = new e6l(context);
                c = e6lVar;
            }
        }
        return e6lVar;
    }

    public static final eal0 c(PackageInfo packageInfo, eal0... eal0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            jcl0 jcl0Var = new jcl0(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < eal0VarArr.length; i++) {
                if (eal0VarArr[i].equals(jcl0Var)) {
                    return eal0VarArr[i];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z) {
        PackageInfo packageInfo2;
        if (!z) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z ? c(packageInfo2, zgl0.a) : c(packageInfo2, zgl0.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0148  */
    public final boolean b(int i) {
        htl0 htl0Var;
        int length;
        boolean zZzi;
        htl0 htl0Var2;
        ApplicationInfo applicationInfo;
        htl0 htl0Var3;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            htl0Var = new htl0(false, "no pkgs", null);
        } else {
            htl0Var = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    hm20.h(htl0Var);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    htl0Var = new htl0(false, "null pkg", null);
                } else if (str.equals(this.b)) {
                    htl0Var = htl0.d;
                } else {
                    l5l0 l5l0Var = djl0.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            djl0.b();
                            zZzi = djl0.c.zzi();
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    } catch (RemoteException | DynamiteModule.a e) {
                        Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                        zZzi = false;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    Context context = this.a;
                    if (zZzi) {
                        boolean zA = m5l.a(context);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            hm20.h(djl0.e);
                            try {
                                djl0.b();
                                try {
                                    zzq zzqVarG = djl0.c.G(new zzo(str, zA, false, new rcy(djl0.e), false, true));
                                    if (zzqVarG.a) {
                                        owk0.a(zzqVarG.d);
                                        htl0Var2 = new htl0(true, null, null);
                                    } else {
                                        String str2 = zzqVarG.b;
                                        PackageManager.NameNotFoundException nameNotFoundException = f010.a(zzqVarG.c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        owk0.a(zzqVarG.d);
                                        f010.a(zzqVarG.c);
                                        htl0Var2 = new htl0(false, str2, nameNotFoundException);
                                    }
                                } catch (RemoteException e2) {
                                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                    htl0Var3 = new htl0(false, "module call", e2);
                                    htl0Var2 = htl0Var3;
                                }
                            } catch (DynamiteModule.a e3) {
                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                                htl0Var3 = new htl0(false, "module init: ".concat(String.valueOf(e3.getMessage())), e3);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
                            boolean zA2 = m5l.a(this.a);
                            if (packageInfo == null) {
                                htl0Var2 = new htl0(false, "null pkg", null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    htl0Var2 = new htl0(false, "single cert required", null);
                                } else {
                                    jcl0 jcl0Var = new jcl0(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        htl0 htl0VarA = djl0.a(str3, jcl0Var, zA2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!htl0VarA.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            htl0Var2 = htl0VarA;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                htl0 htl0VarA2 = djl0.a(str3, jcl0Var, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (htl0VarA2.a) {
                                                    htl0Var2 = new htl0(false, "debuggable release cert app rejected", null);
                                                } else {
                                                    htl0Var2 = htl0VarA;
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e4) {
                            htl0Var = new htl0(false, "no pkg ".concat(str), e4);
                        }
                    }
                    if (htl0Var2.a) {
                        this.b = str;
                    }
                    htl0Var = htl0Var2;
                }
                if (htl0Var.a) {
                    break;
                }
                i2++;
            }
        }
        Throwable th5 = htl0Var.c;
        if (!htl0Var.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", htl0Var.a(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", htl0Var.a());
            }
        }
        return htl0Var.a;
    }
}
