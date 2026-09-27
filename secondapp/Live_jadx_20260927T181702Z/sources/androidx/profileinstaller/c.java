package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import k.i1;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c {
    public static final int A = 14;
    public static final int B = 15;
    public static final int C = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18395a = "dexopt/baseline.prof";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f18396b = "ProfileInstaller";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f18397c = "/data/misc/profiles/cur/0";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f18398d = "primary.prof";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18399e = "dexopt/baseline.profm";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f18400f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f18401g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public static final d f18402h = new b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f18403i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f18404j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f18405k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f18406l = 4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f18407m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f18408n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f18409o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f18410p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f18411q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f18412r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f18413s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f18414t = 7;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f18415u = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f18416v = 9;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f18417w = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f18418x = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f18419y = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f18420z = 13;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f18421a = "ProfileInstaller";

        @Override // androidx.profileinstaller.c.d
        public void a(int i10, @Nullable Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i10, @Nullable Object obj) {
            String str;
            if (i10 == 1) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
            } else if (i10 == 2) {
                str = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
            } else if (i10 == 3) {
                str = "DIAGNOSTIC_REF_PROFILE_EXISTS";
            } else if (i10 != 4) {
                str = i10 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED";
            } else {
                str = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
            }
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface InterfaceC0146c {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(int i10, @Nullable Object obj);

        void b(int i10, @Nullable Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface e {
    }

    @y0({y0.a.LIBRARY})
    public static boolean c(@NonNull File file) {
        return new File(file, f18400f).delete();
    }

    @i1
    public static void d(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        c(context.getFilesDir());
        h(executor, dVar, 11, null);
    }

    public static void e(@NonNull Executor executor, @NonNull final d dVar, final int i10, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: y8.g
            @Override // java.lang.Runnable
            public final void run() {
                dVar.b(i10, obj);
            }
        });
    }

    @i1
    @y0({y0.a.LIBRARY})
    public static boolean f(PackageInfo packageInfo, File file, d dVar) {
        File file2 = new File(file, f18400f);
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long j10 = dataInputStream.readLong();
                dataInputStream.close();
                boolean z10 = j10 == packageInfo.lastUpdateTime;
                if (z10) {
                    dVar.a(2, null);
                }
                return z10;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @y0({y0.a.LIBRARY})
    public static void g(@NonNull PackageInfo packageInfo, @NonNull File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f18400f)));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    public static void h(@NonNull Executor executor, @NonNull final d dVar, final int i10, @Nullable final Object obj) {
        executor.execute(new Runnable() { // from class: y8.f
            @Override // java.lang.Runnable
            public final void run() {
                dVar.a(i10, obj);
            }
        });
    }

    public static boolean i(@NonNull AssetManager assetManager, @NonNull String str, @NonNull PackageInfo packageInfo, @NonNull File file, @NonNull String str2, @NonNull Executor executor, @NonNull d dVar) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, dVar, str2, f18395a, f18399e, new File(new File(f18397c, str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean zM = bVar.h().l().m();
        if (zM) {
            g(packageInfo, file);
        }
        return zM;
    }

    @i1
    public static void j(@NonNull Context context) {
        k(context, new i5.b(), f18401g);
    }

    @i1
    public static void k(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        l(context, executor, dVar, false);
    }

    @i1
    public static void l(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z11 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10 && f(packageInfo, filesDir, dVar)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                androidx.profileinstaller.d.e(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (i(assets, packageName, packageInfo, filesDir, name, executor, dVar) && z10) {
                z11 = true;
            }
            androidx.profileinstaller.d.e(context, z11);
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.a(7, e10);
            androidx.profileinstaller.d.e(context, false);
        }
    }

    @i1
    public static void m(@NonNull Context context, @NonNull Executor executor, @NonNull d dVar) {
        try {
            g(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            h(executor, dVar, 10, null);
        } catch (PackageManager.NameNotFoundException e10) {
            h(executor, dVar, 7, e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements d {
        @Override // androidx.profileinstaller.c.d
        public void a(int i10, @Nullable Object obj) {
        }

        @Override // androidx.profileinstaller.c.d
        public void b(int i10, @Nullable Object obj) {
        }
    }
}
