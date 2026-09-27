package pb;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f120607p = "journal";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f120608q = "journal.tmp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f120609r = "journal.bkp";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f120610s = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f120611t = "1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final long f120612u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f120613v = "CLEAN";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f120614w = "DIRTY";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f120615x = "REMOVE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f120616y = "READ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f120617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f120618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f120619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f120620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f120621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f120622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f120623h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Writer f120625j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f120627l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f120624i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f120626k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f120628m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f120629n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1153b(null));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable<Void> f120630o = new a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                try {
                    if (b.this.f120625j == null) {
                        return null;
                    }
                    b.this.f0();
                    if (b.this.L()) {
                        b.this.W();
                        b.this.f120627l = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: pb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class ThreadFactoryC1153b implements ThreadFactory {
        public ThreadFactoryC1153b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ ThreadFactoryC1153b(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f120632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f120633b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f120634c;

        public /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        public void a() throws IOException {
            b.this.q(this, false);
        }

        public void b() {
            if (this.f120634c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.q(this, true);
            this.f120634c = true;
        }

        public File f(int i10) throws IOException {
            File fileK;
            synchronized (b.this) {
                try {
                    if (this.f120632a.f120641f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f120632a.f120640e) {
                        this.f120633b[i10] = true;
                    }
                    fileK = this.f120632a.k(i10);
                    b.this.f120617b.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        public String g(int i10) throws IOException {
            InputStream inputStreamH = h(i10);
            if (inputStreamH != null) {
                return b.I(inputStreamH);
            }
            return null;
        }

        public final InputStream h(int i10) throws IOException {
            synchronized (b.this) {
                if (this.f120632a.f120641f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f120632a.f120640e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f120632a.j(i10));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void i(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i10)), pb.d.f120658b);
                try {
                    outputStreamWriter2.write(str);
                    pb.d.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    pb.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public c(d dVar) {
            this.f120632a = dVar;
            this.f120633b = dVar.f120640e ? null : new boolean[b.this.f120623h];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f120636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f120637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public File[] f120638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File[] f120639d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f120640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c f120641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f120642g;

        public /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        public File j(int i10) {
            return this.f120638c[i10];
        }

        public File k(int i10) {
            return this.f120639d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f120637b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f120623h) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f120637b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public d(String str) {
            this.f120636a = str;
            this.f120637b = new long[b.this.f120623h];
            this.f120638c = new File[b.this.f120623h];
            this.f120639d = new File[b.this.f120623h];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(kj.e.f102543c);
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f120623h; i10++) {
                sb2.append(i10);
                this.f120638c[i10] = new File(b.this.f120617b, sb2.toString());
                sb2.append(".tmp");
                this.f120639d[i10] = new File(b.this.f120617b, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f120644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f120645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long[] f120646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final File[] f120647d;

        public /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.D(this.f120644a, this.f120645b);
        }

        public File b(int i10) {
            return this.f120647d[i10];
        }

        public long c(int i10) {
            return this.f120646c[i10];
        }

        public String d(int i10) throws IOException {
            return b.I(new FileInputStream(this.f120647d[i10]));
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f120644a = str;
            this.f120645b = j10;
            this.f120647d = fileArr;
            this.f120646c = jArr;
        }
    }

    public b(File file, int i10, int i11, long j10) {
        this.f120617b = file;
        this.f120621f = i10;
        this.f120618c = new File(file, f120607p);
        this.f120619d = new File(file, f120608q);
        this.f120620e = new File(file, f120609r);
        this.f120623h = i11;
        this.f120622g = j10;
    }

    @TargetApi(26)
    public static void E(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static String I(InputStream inputStream) throws IOException {
        return pb.d.c(new InputStreamReader(inputStream, pb.d.f120658b));
    }

    public static b N(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f120609r);
        if (file2.exists()) {
            File file3 = new File(file, f120607p);
            if (file3.exists()) {
                file2.delete();
            } else {
                d0(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f120618c.exists()) {
            try {
                bVar.S();
                bVar.O();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.r();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.W();
        return bVar2;
    }

    public static void d0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            t(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void p(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void t(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final synchronized c D(String str, long j10) throws IOException {
        o();
        d dVar = this.f120626k.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f120642g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f120626k.put(str, dVar);
        } else if (dVar.f120641f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f120641f = cVar;
        this.f120625j.append((CharSequence) f120614w);
        this.f120625j.append(' ');
        this.f120625j.append((CharSequence) str);
        this.f120625j.append('\n');
        E(this.f120625j);
        return cVar;
    }

    public synchronized e F(String str) throws IOException {
        Throwable th2;
        try {
            try {
                o();
                d dVar = this.f120626k.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f120640e) {
                    return null;
                }
                for (File file : dVar.f120638c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f120627l++;
                this.f120625j.append((CharSequence) f120616y);
                this.f120625j.append(' ');
                this.f120625j.append((CharSequence) str);
                this.f120625j.append('\n');
                if (L()) {
                    this.f120629n.submit(this.f120630o);
                }
                return new e(this, str, dVar.f120642g, dVar.f120638c, dVar.f120637b, null);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public File G() {
        return this.f120617b;
    }

    public synchronized long H() {
        return this.f120622g;
    }

    public final boolean L() {
        int i10 = this.f120627l;
        return i10 >= 2000 && i10 >= this.f120626k.size();
    }

    public final void O() throws IOException {
        t(this.f120619d);
        Iterator<d> it = this.f120626k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f120641f == null) {
                while (i10 < this.f120623h) {
                    this.f120624i += next.f120637b[i10];
                    i10++;
                }
            } else {
                next.f120641f = null;
                while (i10 < this.f120623h) {
                    t(next.j(i10));
                    t(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void S() throws IOException {
        pb.c cVar = new pb.c(new FileInputStream(this.f120618c), pb.d.f120657a);
        try {
            String strK = cVar.k();
            String strK2 = cVar.k();
            String strK3 = cVar.k();
            String strK4 = cVar.k();
            String strK5 = cVar.k();
            if (!f120610s.equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f120621f).equals(strK3) || !Integer.toString(this.f120623h).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + C4235d4.j.f61462e);
            }
            int i10 = 0;
            while (true) {
                try {
                    U(cVar.k());
                    i10++;
                } catch (EOFException unused) {
                    this.f120627l = i10 - this.f120626k.size();
                    if (cVar.h()) {
                        W();
                    } else {
                        this.f120625j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f120618c, true), pb.d.f120657a));
                    }
                    pb.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            pb.d.a(cVar);
            throw th2;
        }
    }

    public final void U(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f120615x)) {
                this.f120626k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f120626k.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f120626k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f120613v)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f120640e = true;
            dVar.f120641f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f120614w)) {
            dVar.f120641f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f120616y)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void W() throws IOException {
        try {
            Writer writer = this.f120625j;
            if (writer != null) {
                p(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f120619d), pb.d.f120657a));
            try {
                bufferedWriter.write(f120610s);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write("1");
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f120621f));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(Integer.toString(this.f120623h));
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (d dVar : this.f120626k.values()) {
                    if (dVar.f120641f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f120636a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f120636a + dVar.l() + '\n');
                    }
                }
                p(bufferedWriter);
                if (this.f120618c.exists()) {
                    d0(this.f120618c, this.f120620e, true);
                }
                d0(this.f120619d, this.f120618c, false);
                this.f120620e.delete();
                this.f120625j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f120618c, true), pb.d.f120657a));
            } catch (Throwable th2) {
                p(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean Y(String str) throws IOException {
        try {
            o();
            d dVar = this.f120626k.get(str);
            if (dVar != null && dVar.f120641f == null) {
                for (int i10 = 0; i10 < this.f120623h; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f120624i -= dVar.f120637b[i10];
                    dVar.f120637b[i10] = 0;
                }
                this.f120627l++;
                this.f120625j.append((CharSequence) f120615x);
                this.f120625j.append(' ');
                this.f120625j.append((CharSequence) str);
                this.f120625j.append('\n');
                this.f120626k.remove(str);
                if (L()) {
                    this.f120629n.submit(this.f120630o);
                }
                return true;
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f120625j == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f120626k.values())) {
                if (dVar.f120641f != null) {
                    dVar.f120641f.a();
                }
            }
            f0();
            p(this.f120625j);
            this.f120625j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e0(long j10) {
        this.f120622g = j10;
        this.f120629n.submit(this.f120630o);
    }

    public final void f0() throws IOException {
        while (this.f120624i > this.f120622g) {
            Y(this.f120626k.entrySet().iterator().next().getKey());
        }
    }

    public synchronized void flush() throws IOException {
        o();
        f0();
        E(this.f120625j);
    }

    public synchronized boolean isClosed() {
        return this.f120625j == null;
    }

    public final void o() {
        if (this.f120625j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void q(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f120632a;
        if (dVar.f120641f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f120640e) {
            for (int i10 = 0; i10 < this.f120623h; i10++) {
                if (!cVar.f120633b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f120623h; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                t(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f120637b[i11];
                long length = fileJ.length();
                dVar.f120637b[i11] = length;
                this.f120624i = (this.f120624i - j10) + length;
            }
        }
        this.f120627l++;
        dVar.f120641f = null;
        if (dVar.f120640e || z10) {
            dVar.f120640e = true;
            this.f120625j.append((CharSequence) f120613v);
            this.f120625j.append(' ');
            this.f120625j.append((CharSequence) dVar.f120636a);
            this.f120625j.append((CharSequence) dVar.l());
            this.f120625j.append('\n');
            if (z10) {
                long j11 = this.f120628m;
                this.f120628m = 1 + j11;
                dVar.f120642g = j11;
            }
        } else {
            this.f120626k.remove(dVar.f120636a);
            this.f120625j.append((CharSequence) f120615x);
            this.f120625j.append(' ');
            this.f120625j.append((CharSequence) dVar.f120636a);
            this.f120625j.append('\n');
        }
        E(this.f120625j);
        if (this.f120624i > this.f120622g || L()) {
            this.f120629n.submit(this.f120630o);
        }
    }

    public void r() throws IOException {
        close();
        pb.d.b(this.f120617b);
    }

    public synchronized long size() {
        return this.f120624i;
    }

    public c y(String str) throws IOException {
        return D(str, -1L);
    }
}
