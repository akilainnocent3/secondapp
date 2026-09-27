package com.pgl.ssdk;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaTrack;
import com.ironsource.C4593xa;
import com.ironsource.Q6;
import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile String f72093a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile String f72094b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f72095c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f72096d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f72097e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f72098f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f72099g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f72100h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static long f72101i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static volatile long f72102j = -1;

    public static void a(File file, boolean z10) throws Throwable {
        e eVarA;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
                try {
                    if (TextUtils.isEmpty(f72093a) && (eVarA = a(file)) != null) {
                        f72093a = a(eVarA.a());
                        f72096d = eVarA.b();
                        if (z10) {
                            a();
                            try {
                                randomAccessFile2.close();
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    }
                    if (TextUtils.isEmpty(f72097e)) {
                        f72097e = a(randomAccessFile2);
                    }
                    if (f72100h == 0) {
                        f72100h = randomAccessFile2.length() / 1024;
                    }
                    if (f72101i == 0) {
                        f72101i = b(file);
                    }
                    randomAccessFile2.close();
                } catch (FileNotFoundException unused2) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException unused3) {
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            }
        } catch (FileNotFoundException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String b() throws Throwable {
        long j10;
        boolean z10;
        String string;
        String string2;
        String string3;
        String string4;
        long j11;
        long j12;
        int i10;
        String str;
        if (TextUtils.isEmpty(f72093a) || TextUtils.isEmpty(f72097e) || f72099g == -1) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            long j13 = -1;
            if (sharedPreferencesA != null) {
                j13 = sharedPreferencesA.getLong(Q6.f59853a1, -1L);
                string2 = sharedPreferencesA.getString("sa", null);
                string3 = sharedPreferencesA.getString("sj", null);
                string4 = sharedPreferencesA.getString("md5", null);
                j11 = sharedPreferencesA.getLong("as", 0L);
                j12 = sharedPreferencesA.getLong("ds", 0L);
                z10 = true;
                i10 = sharedPreferencesA.getInt("cpc", -1);
                j10 = 0;
                string = sharedPreferencesA.getString(C4593xa.f64437c, null);
            } else {
                j10 = 0;
                z10 = true;
                string = null;
                string2 = null;
                string3 = null;
                string4 = null;
                j11 = 0;
                j12 = 0;
                i10 = 0;
            }
            String strC = c();
            if (strC == null) {
                return null;
            }
            File file = new File(strC);
            str = null;
            Object[] objArr = (Object[]) com.pgl.ssdk.ces.a.meta(158, z.a(), strC);
            Integer num = (Integer) objArr[0];
            String str2 = (String) objArr[z10 ? 1 : 0];
            long jLastModified = file.lastModified();
            if (jLastModified != j13 || string2 == null || i10 == -1) {
                f72102j = jLastModified;
                if (str2 != null) {
                    f72098f = str2;
                }
                if (num != null) {
                    f72099g = num.intValue();
                }
                a(file, false);
                a();
            } else {
                f72093a = string2;
                f72096d = string3;
                f72100h = j11;
                f72101i = j12;
                f72097e = string4;
                f72099g = i10;
                f72098f = string;
            }
        } else {
            j10 = 0;
            str = null;
            z10 = true;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(f72093a)) {
                jSONObject.put(MediaTrack.ROLE_SIGN, f72093a);
            }
            if (!TextUtils.isEmpty(f72096d)) {
                jSONObject.put(t1.c.f135982h, f72096d);
            }
            if (!TextUtils.isEmpty(f72097e)) {
                jSONObject.put("md5", f72097e);
            }
            if (!TextUtils.isEmpty(f72098f)) {
                jSONObject.put("path", f72098f);
            }
            long j14 = f72100h;
            if (j14 != j10) {
                jSONObject.put("apkSize", j14);
            }
            long j15 = f72101i;
            if (j15 != j10) {
                jSONObject.put("dexSize", j15);
            }
            int i11 = f72099g;
            if (i11 != -1) {
                jSONObject.put(gp.e.f87280s, i11);
            }
            e();
            jSONObject.put("signpm", f72094b);
            if (!TextUtils.isEmpty(f72094b) && !TextUtils.isEmpty(f72093a)) {
                if (!f72094b.equals(f72093a)) {
                    f72095c = z10;
                }
                jSONObject.put("rebud", f72095c);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String c() {
        if (z.a() == null) {
            return null;
        }
        String packageCodePath = z.a().getPackageCodePath();
        if (TextUtils.isEmpty(packageCodePath)) {
            return null;
        }
        File file = new File(packageCodePath);
        if (file.exists() && file.canRead()) {
            return packageCodePath;
        }
        return null;
    }

    public static void d() throws Throwable {
        if (TextUtils.isEmpty(f72093a)) {
            SharedPreferences sharedPreferencesA = ax.a(z.a());
            String string = null;
            long j10 = -1;
            if (sharedPreferencesA != null) {
                j10 = sharedPreferencesA.getLong(Q6.f59853a1, -1L);
                string = sharedPreferencesA.getString("sa", null);
            }
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            File file = new File(strC);
            long jLastModified = file.lastModified();
            if (jLastModified != j10 || string == null) {
                f72102j = jLastModified;
                a(file, true);
                a();
            } else {
                f72093a = string;
            }
        }
        e();
        if (TextUtils.isEmpty(f72094b) || TextUtils.isEmpty(f72093a) || f72094b.equals(f72093a)) {
            return;
        }
        f72095c = true;
    }

    public static String e() {
        if (!TextUtils.isEmpty(f72094b)) {
            return f72094b;
        }
        try {
            String strA = a(z.a().getPackageManager().getPackageInfo(z.a().getPackageName(), 64).signatures[0].toByteArray());
            f72094b = strA;
            return strA;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean f() throws Throwable {
        d();
        return f72095c;
    }

    public static void a() {
        SharedPreferences sharedPreferencesA = ax.a(z.a());
        if (sharedPreferencesA != null) {
            if (!TextUtils.isEmpty(f72093a)) {
                sharedPreferencesA.edit().putString("sa", f72093a).apply();
            }
            if (!TextUtils.isEmpty(f72097e)) {
                sharedPreferencesA.edit().putString("md5", f72097e).apply();
            }
            if (!TextUtils.isEmpty(f72096d)) {
                sharedPreferencesA.edit().putString("sj", f72096d).apply();
            }
            if (f72100h != 0) {
                sharedPreferencesA.edit().putLong("as", f72100h).apply();
            }
            if (f72101i != 0) {
                sharedPreferencesA.edit().putLong("ds", f72101i).apply();
            }
            if (f72102j != -1) {
                sharedPreferencesA.edit().putLong(Q6.f59853a1, f72102j).apply();
            }
            if (f72099g != -1) {
                sharedPreferencesA.edit().putInt("cpc", f72099g).apply();
            }
            if (TextUtils.isEmpty(f72098f)) {
                return;
            }
            sharedPreferencesA.edit().putString(C4593xa.f64437c, f72098f).apply();
        }
    }

    public static String a(byte[] bArr) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(bArr);
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(Integer.toHexString((b10 & 255) | 256).substring(1, 3).toUpperCase());
                sb2.append(":");
            }
            return sb2.substring(0, sb2.length() - 1);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @DungeonFlag
    private static e a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        List<e> listA;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    q qVarA = r.a(randomAccessFile, 0L, randomAccessFile.length());
                    listA = l.a(qVarA, c.a(qVarA));
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                } catch (g.a unused2) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                } catch (Throwable unused3) {
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                    listA = null;
                }
            } catch (IOException unused4) {
                listA = null;
            }
        } catch (g.a unused5) {
            randomAccessFile = null;
        } catch (Throwable unused6) {
            randomAccessFile = null;
        }
        if (listA == null || listA.isEmpty()) {
            listA = k.a(file);
        }
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        return listA.get(0);
    }

    public static long b(File file) throws Throwable {
        String str;
        ZipFile zipFile = null;
        try {
            try {
                ZipFile zipFile2 = new ZipFile(file);
                int i10 = 0;
                int size = 0;
                while (true) {
                    if (i10 == 0) {
                        str = "classes.dex";
                    } else {
                        str = String.format(Locale.getDefault(), "classes%d.dex", Integer.valueOf(i10));
                    }
                    try {
                        ZipEntry entry = zipFile2.getEntry(str);
                        if (entry == null) {
                            break;
                        }
                        size = (int) (((long) size) + entry.getSize());
                        i10++;
                    } catch (ZipException unused) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (IOException unused2) {
                        zipFile = zipFile2;
                        if (zipFile == null) {
                            return 0L;
                        }
                        zipFile.close();
                        return 0L;
                    } catch (Throwable th2) {
                        th = th2;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
                long j10 = size / 1000;
                try {
                    zipFile2.close();
                } catch (IOException unused4) {
                }
                return j10;
            } catch (IOException unused5) {
                return 0L;
            }
        } catch (ZipException unused6) {
        } catch (IOException unused7) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String a(RandomAccessFile randomAccessFile) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i10 = randomAccessFile.read(bArr);
                if (i10 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i10);
            }
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            while (string.length() < 32) {
                string = "0".concat(string);
            }
            return string;
        } catch (FileNotFoundException | IOException | NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
