package fk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f84793a = "SHA-1";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f84794b = "goldfish";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f84795c = "ranchu";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f84796d = "sdk";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f84797e = "com.google.firebase.crashlytics";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f84798f = "com.crashlytics.prefs";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char[] f84799g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f84800h = "com.google.firebase.crashlytics.mapping_file_id";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f84801i = "com.crashlytics.android.build_id";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f84802j = "com.google.firebase.crashlytics.build_ids_lib";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f84803k = "com.google.firebase.crashlytics.build_ids_arch";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f84804l = "com.google.firebase.crashlytics.build_ids_build_id";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f84805m = "com.google.firebase.crashlytics.version_control_info";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f84806n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f84807o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f84808p = 4;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f84809q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f84810r = 16;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f84811s = 32;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 fk.i$a, still in use, count: 1, list:
      (r0v0 fk.i$a) from 0x0084: INVOKE (r5v5 java.util.HashMap), ("x86"), (r0v0 fk.i$a) INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:133)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;


        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final Map<String, a> f84822l;

        static {
            HashMap map = new HashMap(4);
            f84822l = map;
            map.put("armeabi-v7a", new a());
            map.put("armeabi", new a());
            map.put("arm64-v8a", new a());
            map.put("x86", new a());
        }

        public a() {
            super(str, i);
        }

        public static a g() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                ck.g.f().k("Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            a aVar = f84822l.get(str.toLowerCase(Locale.US));
            return aVar == null ? UNKNOWN : aVar;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f84823m.clone();
        }
    }

    public static boolean A() {
        boolean zY = y();
        String str = Build.TAGS;
        if ((zY || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zY && new File("/system/xbin/su").exists();
        }
        return true;
    }

    public static boolean B(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static String C(int i10) {
        if (i10 >= 0) {
            return String.format(Locale.US, "%1$10s", Integer.valueOf(i10)).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    public static String D(String str) {
        return t(str, "SHA-1");
    }

    public static String E(InputStream inputStream) {
        Scanner scannerUseDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th2) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static long a(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r)).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static synchronized long b(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f6970r)).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    public static long c(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    @SuppressLint({"MissingPermission"})
    public static boolean d(Context context) {
        if (!e(context, com.bumptech.glide.manager.e.f31484b)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    public static boolean e(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    public static void f(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e10) {
                ck.g.f().e(str, e10);
            }
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static String h(String... strArr) {
        if (strArr != null && strArr.length != 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace(TokenBuilder.TOKEN_DELIMITER, "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
            }
            String string = sb2.toString();
            if (string.length() > 0) {
                return D(string);
            }
        }
        return null;
    }

    public static boolean i(Context context, String str, boolean z10) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            int iQ = q(context, str, "bool");
            if (iQ > 0) {
                return resources.getBoolean(iQ);
            }
            int iQ2 = q(context, str, "string");
            if (iQ2 > 0) {
                return Boolean.parseBoolean(context.getString(iQ2));
            }
        }
        return z10;
    }

    public static List<f> j(Context context) {
        ArrayList arrayList = new ArrayList();
        int iQ = q(context, f84802j, "array");
        int iQ2 = q(context, f84803k, "array");
        int iQ3 = q(context, f84804l, "array");
        if (iQ == 0 || iQ2 == 0 || iQ3 == 0) {
            ck.g.f().b(String.format("Could not find resources: %d %d %d", Integer.valueOf(iQ), Integer.valueOf(iQ2), Integer.valueOf(iQ3)));
            return arrayList;
        }
        String[] stringArray = context.getResources().getStringArray(iQ);
        String[] stringArray2 = context.getResources().getStringArray(iQ2);
        String[] stringArray3 = context.getResources().getStringArray(iQ3);
        if (stringArray.length != stringArray3.length || stringArray2.length != stringArray3.length) {
            ck.g.f().b(String.format("Lengths did not match: %d %d %d", Integer.valueOf(stringArray.length), Integer.valueOf(stringArray2.length), Integer.valueOf(stringArray3.length)));
            return arrayList;
        }
        for (int i10 = 0; i10 < stringArray3.length; i10++) {
            arrayList.add(new f(stringArray[i10], stringArray2[i10], stringArray3[i10]));
        }
        return arrayList;
    }

    public static int k() {
        return a.g().ordinal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int l() {
        boolean zY = y();
        ?? r10 = zY;
        if (A()) {
            r10 = (zY ? 1 : 0) | 2;
        }
        return x() ? r10 | 4 : r10;
    }

    public static SharedPreferences m(Context context) {
        return context.getSharedPreferences(f84798f, 0);
    }

    public static String n(Context context) {
        int iQ = q(context, f84800h, "string");
        if (iQ == 0) {
            iQ = q(context, f84801i, "string");
        }
        if (iQ != 0) {
            return context.getResources().getString(iQ);
        }
        return null;
    }

    public static boolean o(Context context) {
        return (y() || ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) ? false : true;
    }

    public static String p(Context context) {
        int i10 = context.getApplicationContext().getApplicationInfo().icon;
        if (i10 <= 0) {
            return context.getPackageName();
        }
        try {
            String resourcePackageName = context.getResources().getResourcePackageName(i10);
            return "android".equals(resourcePackageName) ? context.getPackageName() : resourcePackageName;
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static int q(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, p(context));
    }

    public static SharedPreferences r(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    @Nullable
    public static String s(Context context) {
        int iQ = q(context, f84805m, "string");
        if (iQ == 0) {
            return null;
        }
        return context.getResources().getString(iQ);
    }

    public static String t(String str, String str2) {
        return u(str.getBytes(), str2);
    }

    public static String u(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return v(messageDigest.digest());
        } catch (NoSuchAlgorithmException e10) {
            ck.g.f().e("Could not create hashing algorithm: " + str + ", returning empty string.", e10);
            return "";
        }
    }

    public static String v(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f84799g;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & zi.c.f161639q];
        }
        return new String(cArr);
    }

    public static boolean w(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean x() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    public static boolean y() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains(f84794b) || str.contains(f84795c);
    }

    @Deprecated
    public static boolean z(Context context) {
        return false;
    }
}
