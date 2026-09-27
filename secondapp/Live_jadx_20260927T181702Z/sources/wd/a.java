package wd;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f142825a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f142826b = 4096;

    /* JADX INFO: renamed from: wd.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1503a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipFile f142827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f142828b;

        public C1503a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f142827a = zipFile;
            this.f142828b = zipEntry;
        }
    }

    @Override // wd.e.a
    @SuppressLint({"SetWorldReadable"})
    public void a(Context context, String[] strArr, String str, File file, f fVar) throws Throwable {
        String[] strArrE;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        C1503a c1503a = null;
        Closeable closeable = null;
        try {
            C1503a c1503aD = d(context, strArr, str, fVar);
            try {
                if (c1503aD == null) {
                    try {
                        strArrE = e(context, str);
                    } catch (Exception e10) {
                        strArrE = new String[]{e10.toString()};
                    }
                    throw new c(str, strArr, strArrE);
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        if (i10 >= 5) {
                            fVar.l("FATAL! Couldn't extract the library from the APK!");
                            zipFile = c1503aD.f142827a;
                            if (zipFile != null) {
                                break;
                            } else {
                                return;
                            }
                        }
                        fVar.m("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = c1503aD.f142827a.getInputStream(c1503aD.f142828b);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            long jC = c(inputStream, fileOutputStream);
                                            fileOutputStream.getFD().sync();
                                            if (jC == file.length()) {
                                                b(inputStream);
                                                b(fileOutputStream);
                                                file.setReadable(true, false);
                                                file.setExecutable(true, false);
                                                file.setWritable(true);
                                                zipFile = c1503aD.f142827a;
                                                if (zipFile != null) {
                                                    break;
                                                } else {
                                                    return;
                                                }
                                            }
                                        } catch (FileNotFoundException | IOException unused) {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            closeable = inputStream;
                                            b(closeable);
                                            b(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused2) {
                                        fileOutputStream = null;
                                    } catch (IOException unused3) {
                                        fileOutputStream = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused4) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                }
                                b(inputStream);
                                b(fileOutputStream);
                            }
                        } catch (IOException unused6) {
                        }
                        i10 = i11;
                    } catch (IOException unused7) {
                        return;
                    }
                }
                zipFile.close();
            } catch (Throwable th5) {
                th = th5;
                c1503a = c1503aD;
                if (c1503a != null) {
                    try {
                        ZipFile zipFile2 = c1503a.f142827a;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused8) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final void b(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream in2, OutputStream out) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = in2.read(bArr);
            if (i10 == -1) {
                out.flush();
                return j10;
            }
            out.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    public final C1503a d(final Context context, final String[] abis, final String mappedLibraryName, final f instance) {
        String[] strArrF = f(context);
        int length = strArrF.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str = strArrF[i11];
            int i12 = i10;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile != null) {
                int i14 = i10;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 >= 5) {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                            break;
                        }
                    }
                    int length2 = abis.length;
                    int i16 = i10;
                    while (i16 < length2) {
                        String str2 = abis[i16];
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f.f142832g);
                        char c10 = File.separatorChar;
                        sb2.append(c10);
                        sb2.append(str2);
                        sb2.append(c10);
                        sb2.append(mappedLibraryName);
                        String string = sb2.toString();
                        Object[] objArr = new Object[2];
                        objArr[i10] = string;
                        objArr[1] = str;
                        instance.m("Looking for %s in APK %s...", objArr);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            return new C1503a(zipFile, entry);
                        }
                        i16++;
                        i10 = 0;
                    }
                    i14 = i15;
                    i10 = 0;
                }
            }
            i11++;
            i10 = 0;
        }
    }

    public final String[] e(Context context, String mappedLibraryName) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.f142832g);
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(mappedLibraryName);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        for (String str : f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(final Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
