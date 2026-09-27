package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C4235d4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f45444p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f45445q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f45446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f45447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f45448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f45449d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f45451f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f45454i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f45456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f45457l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45453h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f45455j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f45458m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f45459n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f45460o = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f45450e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f45452g = 1;

    public g(File file, long j10) {
        this.f45446a = file;
        this.f45447b = new File(file, pb.b.f120607p);
        this.f45448c = new File(file, pb.b.f120608q);
        this.f45449d = new File(file, pb.b.f120609r);
        this.f45451f = j10;
    }

    public static void a(g gVar, d dVar, boolean z10) {
        int i10;
        synchronized (gVar) {
            e eVar = dVar.f45435a;
            if (eVar.f45442d != dVar) {
                throw new IllegalStateException();
            }
            if (z10 && !eVar.f45441c) {
                for (int i11 = 0; i11 < gVar.f45452g; i11++) {
                    if (!dVar.f45436b[i11]) {
                        a(dVar.f45438d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!eVar.b(i11).exists()) {
                        a(dVar.f45438d, dVar, false);
                        return;
                    }
                }
            }
            for (int i12 = 0; i12 < gVar.f45452g; i12++) {
                File fileB = eVar.b(i12);
                if (!z10) {
                    a(fileB);
                } else if (fileB.exists()) {
                    File fileA = eVar.a(i12);
                    fileB.renameTo(fileA);
                    long j10 = eVar.f45440b[i12];
                    long length = fileA.length();
                    eVar.f45440b[i12] = length;
                    gVar.f45453h = (gVar.f45453h - j10) + length;
                }
            }
            gVar.f45456k++;
            eVar.f45442d = null;
            if (eVar.f45441c || z10) {
                eVar.f45441c = true;
                BufferedWriter bufferedWriter = gVar.f45454i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(eVar.f45439a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : eVar.f45440b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    gVar.f45458m++;
                }
            } else {
                gVar.f45455j.remove(eVar.f45439a);
                gVar.f45454i.write("REMOVE " + eVar.f45439a + '\n');
            }
            gVar.f45454i.flush();
            if (gVar.f45453h > gVar.f45451f || ((i10 = gVar.f45456k) >= 2000 && i10 >= gVar.f45455j.size())) {
                gVar.f45459n.submit(gVar.f45460o);
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f45447b);
        Charset charset = l.f45468a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!pb.b.f120610s.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f45450e).equals(strA3) || !Integer.toString(this.f45452g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C4235d4.j.f61462e);
            }
            int i10 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f45456k = i10 - this.f45455j.size();
                    if (kVar.f45467e == -1) {
                        c();
                    } else {
                        this.f45454i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f45447b, true), l.f45468a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                kVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f45454i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f45448c), l.f45468a));
            try {
                bufferedWriter2.write(pb.b.f120610s);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write("1");
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f45450e));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(Integer.toString(this.f45452g));
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                bufferedWriter2.write(IOUtils.LINE_SEPARATOR_UNIX);
                for (e eVar : this.f45455j.values()) {
                    if (eVar.f45442d != null) {
                        bufferedWriter2.write("DIRTY " + eVar.f45439a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(eVar.f45439a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : eVar.f45440b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f45447b.exists()) {
                    File file = this.f45447b;
                    File file2 = this.f45449d;
                    a(file2);
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f45448c.renameTo(this.f45447b)) {
                    throw new IOException();
                }
                this.f45449d.delete();
                this.f45454i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f45447b, true), l.f45468a));
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f45454i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f45455j.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).f45442d;
                if (dVar != null) {
                    a(dVar.f45438d, dVar, false);
                }
            }
            d();
            this.f45454i.close();
            this.f45454i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        while (this.f45453h > this.f45451f) {
            String str = (String) ((Map.Entry) this.f45455j.entrySet().iterator().next()).getKey();
            f fVar = this.f45457l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC = false;
                for (String str2 : this.f45455j.keySet()) {
                    if (this.f45457l.a(str2)) {
                        zC |= c(str2);
                    }
                }
                if (!zC) {
                    return;
                }
            }
        }
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith(pb.b.f120615x)) {
                    this.f45455j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            e eVar = (e) this.f45455j.get(strSubstring);
            if (eVar == null) {
                eVar = new e(this, strSubstring);
                this.f45455j.put(strSubstring, eVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(pb.b.f120613v)) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                eVar.f45441c = true;
                eVar.f45442d = null;
                if (strArrSplit.length == eVar.f45443e.f45452g) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            eVar.f45440b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(pb.b.f120614w)) {
                eVar.f45442d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith(pb.b.f120616y)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        try {
            IAlog.e("DiskLruCache remove %s", str);
            if (this.f45454i != null) {
                if (f45444p.matcher(str).matches()) {
                    e eVar = (e) this.f45455j.get(str);
                    if (eVar != null && eVar.f45442d == null) {
                        for (int i10 = 0; i10 < this.f45452g; i10++) {
                            File fileA = eVar.a(i10);
                            if (fileA.exists() && !fileA.delete()) {
                                throw new IOException("failed to delete " + fileA);
                            }
                            long j10 = this.f45453h;
                            long[] jArr = eVar.f45440b;
                            this.f45453h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f45456k++;
                        this.f45454i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f45455j.remove(str);
                        int i11 = this.f45456k;
                        if (i11 >= 2000 && i11 >= this.f45455j.size()) {
                            this.f45459n.submit(this.f45460o);
                        }
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static g a(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, pb.b.f120609r);
            if (file2.exists()) {
                File file3 = new File(file, pb.b.f120607p);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j10);
            if (gVar.f45447b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.f45446a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j10);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() throws IOException {
        a(this.f45448c);
        Iterator it = this.f45455j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = 0;
            if (eVar.f45442d == null) {
                while (i10 < this.f45452g) {
                    this.f45453h += eVar.f45440b[i10];
                    i10++;
                }
            } else {
                eVar.f45442d = null;
                while (i10 < this.f45452g) {
                    a(eVar.a(i10));
                    a(eVar.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f45454i != null) {
                    if (f45444p.matcher(str).matches()) {
                        e eVar = (e) this.f45455j.get(str);
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.f45455j.put(str, eVar);
                        } else if (eVar.f45442d != null) {
                            return null;
                        }
                        d dVar = new d(this, eVar);
                        eVar.f45442d = dVar;
                        this.f45454i.write("DIRTY " + str + '\n');
                        this.f45454i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
