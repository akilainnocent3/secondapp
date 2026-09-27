package s7;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.ironsource.C4235d4;
import gi.j;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f129677h = "MultiDex";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f129678i = "classes";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f129679j = ".dex";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f129680k = ".classes";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f129681l = ".zip";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f129682m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f129683n = "multidex.version";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f129684o = "timestamp";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f129685p = "crc";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f129686q = "dex.number";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f129687r = "dex.crc.";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f129688s = "dex.time.";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f129689t = 16384;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f129690u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f129691v = "MultiDex.lock";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f129692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f129693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f129694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RandomAccessFile f129695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FileChannel f129696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FileLock f129697g;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(d.f129691v);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends File {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f129699b;

        public b(File file, String str) {
            super(file, str);
            this.f129699b = -1L;
        }
    }

    public d(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + j.f86771d);
        this.f129692b = file;
        this.f129694d = file2;
        this.f129693c = m(file);
        File file3 = new File(file2, f129691v);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f129695e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f129696f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f129697g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e10) {
                e = e10;
                h(this.f129696f);
                throw e;
            } catch (Error e11) {
                e = e11;
                h(this.f129696f);
                throw e;
            } catch (RuntimeException e12) {
                e = e12;
                h(this.f129696f);
                throw e;
            }
        } catch (IOException e13) {
            e = e13;
            h(this.f129695e);
            throw e;
        } catch (Error e14) {
            e = e14;
            h(this.f129695e);
            throw e;
        } catch (RuntimeException e15) {
            e = e15;
            h(this.f129695e);
            throw e;
        }
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("MultiDex", "Failed to close resource", e10);
        }
    }

    public static void i(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, f129681l, file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    h(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            h(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    public static SharedPreferences k(Context context) {
        return context.getSharedPreferences(f129683n, 4);
    }

    public static long l(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    public static long m(File file) throws IOException {
        long jC = f.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    public static boolean n(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesK = k(context);
        if (sharedPreferencesK.getLong(str + "timestamp", -1L) != l(file)) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(f129685p);
        return sharedPreferencesK.getLong(sb2.toString(), -1L) != j10;
    }

    public static void r(Context context, String str, long j10, long j11, List<b> list) {
        SharedPreferences.Editor editorEdit = k(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + f129685p, j11);
        editorEdit.putInt(str + f129686q, list.size() + 1);
        int i10 = 2;
        for (b bVar : list) {
            editorEdit.putLong(str + f129687r + i10, bVar.f129699b);
            editorEdit.putLong(str + f129688s + i10, bVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f129697g.release();
        this.f129696f.close();
        this.f129695e.close();
    }

    public final void d() {
        File[] fileArrListFiles = this.f129694d.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f129694d.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    public List<? extends File> o(Context context, String str, boolean z10) throws IOException {
        List<b> listQ;
        List<b> listP;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f129692b.getPath() + ", " + z10 + ", " + str + j.f86771d);
        if (!this.f129697g.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !n(context, this.f129692b, this.f129693c, str)) {
            try {
                listP = p(context, str);
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e10);
                listQ = q();
                r(context, str, l(this.f129692b), this.f129693c, listQ);
                listP = listQ;
            }
            Log.i("MultiDex", "load found " + listP.size() + " secondary dex files");
            return listP;
        }
        if (z10) {
            Log.i("MultiDex", "Forced extraction must be performed.");
        } else {
            Log.i("MultiDex", "Detected that extraction must be performed.");
        }
        listQ = q();
        r(context, str, l(this.f129692b), this.f129693c, listQ);
        listP = listQ;
        Log.i("MultiDex", "load found " + listP.size() + " secondary dex files");
        return listP;
    }

    public final List<b> p(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f129692b.getName() + f129680k;
        SharedPreferences sharedPreferencesK = k(context);
        int i10 = sharedPreferencesK.getInt(str + f129686q, 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f129694d, str2 + i11 + f129681l);
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f129699b = m(bVar);
            long j10 = sharedPreferencesK.getLong(str + f129687r + i11, -1L);
            long j11 = sharedPreferencesK.getLong(str + f129688s + i11, -1L);
            long jLastModified = bVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesK;
                if (j10 == bVar.f129699b) {
                    arrayList.add(bVar);
                    i11++;
                    sharedPreferencesK = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f129699b);
        }
        return arrayList;
    }

    public final List<b> q() throws IOException {
        boolean z10;
        String str = this.f129692b.getName() + f129680k;
        d();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f129692b);
        try {
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry(f129678i + 2 + f129679j);
            while (entry != null) {
                b bVar = new b(this.f129694d, str + i10 + f129681l);
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    i(zipFile, entry, bVar, str);
                    try {
                        bVar.f129699b = m(bVar);
                        z10 = true;
                    } catch (IOException e10) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e10);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : C4235d4.i.f61440t);
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f129699b);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + j.f86771d);
                }
                i10++;
                entry = zipFile.getEntry(f129678i + i10 + f129679j);
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                Log.w("MultiDex", "Failed to close resource", e11);
            }
            return arrayList;
        } catch (Throwable th2) {
            try {
                zipFile.close();
                throw th2;
            } catch (IOException e12) {
                Log.w("MultiDex", "Failed to close resource", e12);
                throw th2;
            }
        }
    }
}
