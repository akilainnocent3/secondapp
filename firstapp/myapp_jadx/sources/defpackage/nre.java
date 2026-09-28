package defpackage;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class nre implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter w;
    public int z;
    public long v = 0;
    public final LinkedHashMap<String, d> y = new LinkedHashMap<>(0, 0.75f, true);
    public long A = 0;
    public final ThreadPoolExecutor B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final a C = new a();
    public final int e = 1;
    public final int i = 1;

    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() {
            synchronized (nre.this) {
                try {
                    nre nreVar = nre.this;
                    if (nreVar.w == null) {
                        return null;
                    }
                    nreVar.Y();
                    if (nre.this.u()) {
                        nre.this.P();
                        nre.this.z = 0;
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[nre.this.i];
        }

        public final void a() {
            nre.this.f(this, false);
        }

        public final File b() {
            File file;
            synchronized (nre.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    nre.this.a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = nre.this.i;
            File file = nre.this.a;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public nre(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static nre F(File file, long j) throws IOException {
        if (j <= 0) {
            hb5.a("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                V(file2, file3, false);
            }
        }
        nre nreVar = new nre(file, j);
        if (nreVar.b.exists()) {
            try {
                nreVar.H();
                nreVar.G();
                return nreVar;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                nreVar.close();
                drh0.a(nreVar.a);
            }
        }
        file.mkdirs();
        nre nreVar2 = new nre(file, j);
        nreVar2.P();
        return nreVar2;
    }

    public static void V(File file, File file2, boolean z) throws IOException {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void d(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void m(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void G() throws IOException {
        g(this.c);
        Iterator<d> it = this.y.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.i;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.v += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    g(next.c[i2]);
                    g(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void H() {
        File file = this.b;
        b9e0 b9e0Var = new b9e0(new FileInputStream(file), drh0.a);
        try {
            String strD = b9e0Var.d();
            String strD2 = b9e0Var.d();
            String strD3 = b9e0Var.d();
            String strD4 = b9e0Var.d();
            String strD5 = b9e0Var.d();
            if (!"libcore.io.DiskLruCache".equals(strD) || !"1".equals(strD2) || !Integer.toString(this.e).equals(strD3) || !Integer.toString(this.i).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    J(b9e0Var.d());
                    i++;
                } catch (EOFException unused) {
                    this.z = i - this.y.size();
                    if (b9e0Var.e == -1) {
                        P();
                    } else {
                        this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), drh0.a));
                    }
                    try {
                        b9e0Var.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                b9e0Var.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void J(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            i08.a("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.y;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        d dVar = linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                i08.a("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (strArrSplit.length != nre.this.i) {
            wnm.a(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                wnm.a(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    public final synchronized void P() {
        try {
            BufferedWriter bufferedWriter = this.w;
            if (bufferedWriter != null) {
                d(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), drh0.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.y.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                d(bufferedWriter2);
                if (this.b.exists()) {
                    V(this.b, this.d, true);
                }
                V(this.c, this.b, false);
                this.d.delete();
                this.w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), drh0.a));
            } catch (Throwable th) {
                d(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void Y() {
        while (this.v > this.f) {
            String key = this.y.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.w == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.y.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.i; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.v;
                            long[] jArr = dVar.b;
                            this.v = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.z++;
                        this.w.append((CharSequence) "REMOVE");
                        this.w.append(' ');
                        this.w.append((CharSequence) key);
                        this.w.append('\n');
                        this.y.remove(key);
                        if (u()) {
                            this.B.submit(this.C);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.w == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.y.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                c cVar = ((d) obj).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            Y();
            d(this.w);
            this.w = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(c cVar, boolean z) {
        d dVar = cVar.a;
        if (dVar.f != cVar) {
            throw new IllegalStateException();
        }
        if (z && !dVar.e) {
            for (int i = 0; i < this.i; i++) {
                if (!cVar.b[i]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                }
                if (!dVar.d[i].exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i2 = 0; i2 < this.i; i2++) {
            File file = dVar.d[i2];
            if (!z) {
                g(file);
            } else if (file.exists()) {
                File file2 = dVar.c[i2];
                file.renameTo(file2);
                long j = dVar.b[i2];
                long length = file2.length();
                dVar.b[i2] = length;
                this.v = (this.v - j) + length;
            }
        }
        this.z++;
        dVar.f = null;
        if (dVar.e || z) {
            dVar.e = true;
            this.w.append((CharSequence) "CLEAN");
            this.w.append(' ');
            this.w.append((CharSequence) dVar.a);
            this.w.append((CharSequence) dVar.a());
            this.w.append('\n');
            if (z) {
                this.A++;
            }
        } else {
            this.y.remove(dVar.a);
            this.w.append((CharSequence) "REMOVE");
            this.w.append(' ');
            this.w.append((CharSequence) dVar.a);
            this.w.append('\n');
        }
        m(this.w);
        if (this.v > this.f || u()) {
            this.B.submit(this.C);
        }
    }

    public final c l(String str) {
        synchronized (this) {
            try {
                if (this.w == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.y.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.y.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.w.append((CharSequence) "DIRTY");
                this.w.append(' ');
                this.w.append((CharSequence) str);
                this.w.append('\n');
                m(this.w);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e o(String str) {
        if (this.w == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.y.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.z++;
        this.w.append((CharSequence) "READ");
        this.w.append(' ');
        this.w.append((CharSequence) str);
        this.w.append('\n');
        if (u()) {
            this.B.submit(this.C);
        }
        return new e(dVar.c);
    }

    public final boolean u() {
        int i = this.z;
        return i >= 2000 && i >= this.y.size();
    }
}
